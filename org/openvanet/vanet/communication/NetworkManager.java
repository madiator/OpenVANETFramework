/**
 *
 */
package org.openvanet.vanet.communication;

import java.util.ArrayList;
import java.util.List;

import org.openvanet.vanet.Node;
import org.openvanet.vanet.communication.PacketManager.Packet;

/**
 * Should be able to handle multiple connections to nodes
 * Has a notion of nodes
 *
 */
public class NetworkManager {
  Node self;
  List<Packet> sendQueue;
  private final String TAG = "NetworkManager";
  private final int SENDQUEUE_MAXSIZE = 1000;
  public NetworkManager() {
   sendQueue = new ArrayList<Packet>();
   Thread sendThread = new Thread(new SenderGuru());
   sendThread.start();

  }

  public void send(Packet packet) {
    if(sendQueue.size()<SENDQUEUE_MAXSIZE) {
      sendQueue.add(packet);
      //Log.d(TAG,"Adding an element, so now the number of elements are "+sendQueue.size());
    }
    sendQueue.notifyAll();
  }

  //Send thread
  private class SenderGuru implements Runnable {
    @Override
    public void run() {

      synchronized(sendQueue) {
        while(sendQueue.size()==0) {
          //sleep if there is nothing in the queue
          try {
            sendQueue.wait();
          }catch(InterruptedException e) {
            e.printStackTrace();
          }
        }
        // there is some packet to be sent!
        if(sendQueue.size() > 0) {
          // check who the destination is
          // and use the TransmissionManager to send.
        }
      }
    }
  }
}
