/**
 *
 */
package org.openvanet;




import org.openvanet.vanet.VanetManager;
import org.openvanet.vanet.support.File;

/**
 * @author Maheswaran Sathiamoorthy
 *
 */
public class SampleApp {
  public static void main(String args[]) {
    Configuration config = new Configuration();
    VanetManager vanetManager = new VanetManager(config);
    StorageManager storageManager = new StorageManager(config);
    File file1 = new File(1);
    File file2 = storageManager.getFileToDownload();
    storageManager.downloadFile(file2);

  }
}
