public class PortTester {

    // Private variables
    private String port;
    private String ipAddress;

    public void testPort(String port) {
        port = port;

    }
    // Access modifier is public, Return type is void, Name is testIPaddress, Parameter is String ipAddress
    public void testIPaddress(String ipAddress) {
        ipAddress = ipAddress;

    }

    public void testPortAndIPaddress(String port, String ipAddress) {
        testPort(port);
        testIPaddress(ipAddress);
    }

    public void printPortAndIPaddress() {
        System.out.println("Port: " + port + " IP Address: " + ipAddress + ", to be scanned");
    }

}
