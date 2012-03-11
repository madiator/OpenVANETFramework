/**
 *
 */
package org.openvanet.vanet.routing;

import org.openvanet.vanet.Node;

/**
 * @author Maheswaran Sathiamoorthy
 *
 */
public abstract class RoutingManager {
  public abstract Node findNextHop(Node destination);
}
