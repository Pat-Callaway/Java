public class PortTester {

    // Private variables
    private String port = "No port specified";
    private String ipAddress = "No IP address specified";


    public void printPortAndIPaddress(String port, String ipAddress) {
        System.out.println("Port: " + port + " IP Address: " + ipAddress + ", to be scanned");
    }
    // setters and getters
    public void setPort(String port) {
        port = port;
    }
    public void setIpAddress(String ipAddress) {
        ipAddress = ipAddress;
    }
    public String getPort() {
        return port;
    }
    public String getIpAddress() {
        return ipAddress;
    }

}
