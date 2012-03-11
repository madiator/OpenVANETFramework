/**
 *
 */
package org.openvanet.vanet.communication;

import org.openvanet.vanet.Node;
import org.openvanet.vanet.communication.PacketManager.Packet;

/**
 * A class to manage the transmissions
 * The higher layer will send a packet and a destination to
 * this class, which will in turn store these packets in
 * appropriate queues and will tell the NetworkManager to transmit
 * from those queues.
 * Note that the NetworkManager has to decide how exactly to communicate
 * with the other nodes (it will just open sockets etc.) whereas
 * the TransmissionManager does not have a notion of sockets.
 * @author Maheswaran Sathiamoorthy
 *
 */
public class TransmissionManager {
  public TransmissionManager() {
    // Initialize queues.
    // Start thread(s) - may be no need of threads.
  }
  public void sendPacket(Packet packet, Node destination) {
    //add to queue
    //notify the NetworkManager
  }
}
