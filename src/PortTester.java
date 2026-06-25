import java.security.Provider;
import java.util.*;
import java.net.*;

public class PortTester implements Runnable{

    // Private variables
    // These are final because they are not going to be changed
    final int PORT;
    // InetAddress can handle IPv4 and IPv6 or domain name
    final private InetAddress IPADDRESS;

    public PortTester(int port, Inet4Address ipAddress){
        this.PORT = port;
        this.IPADDRESS = ipAddress;
    }


    @Override
    public void run() {
        Socket socket = new Socket(); // Create a socket object
        InetSocketAddress address = new InetSocketAddress(IPADDRESS, PORT); // Create an address object
        try {
            socket.connect(address, 500); // Attempt to Connect to the address - 2000ms is the timeout
            System.out.println("Port " + PORT + " is open");
        }
        catch (Exception e) {
            System.out.println("Port " + PORT + " is closed");
        }


        }
    }


