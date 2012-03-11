/**
 *
 */
package org.openvanet.vanet.communication;

/**
 * A class to manage the packets.
 * When a file needs to be sent over to another node, the
 * NetworkManager will request the PacketManager to packetize
 * the file. The PacketManager then must packetize the file
 * and start filling up a packet queue, which the network manager
 * will read from and transmit.
 * Similarly, when the network manager receives the packets, it
 * will store them in a queue which the PacketManager will then
 * read one by one and store the packets onto a file if the network
 * manager asks so.
 *
 * So we need this to run as a thread. The queues are shared, so we
 * need locks, sleep and wake mechanisms.
 *
 * @author Maheswaran Sathiamoorthy
 *
 */
public class PacketManager {
  public PacketManager() {
    // Start the thread
    // Initialize queues
  }
  public void storePacketToFile() {

  }
  public void getPacketFromFile() {

  }
  public class Packet {
    public int API_TYPE;
  }
}
