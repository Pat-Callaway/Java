
import java.util.*;
import java.net.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InetAddress IPADDRESS = null;



        System.out.println("Enter the IP Address");
        String IP = scanner.nextLine();
        System.out.println("Please enter the port number");
        int port = scanner.nextInt();

       if (port < 0 || port >= 65535){
           System.out.println("Invalid port number");
           port = scanner.nextInt();
       }
       else {
           System.out.println("Port is valid, checking...");
       }

        try {
            IPADDRESS = InetAddress.getByName(IP);
            System.out.println(IPADDRESS + " is valid");
        }
        catch (UnknownHostException e) {
            System.out.println("Invalid IP address");
            System.exit(0);
        }
        PortTester tester = new PortTester(port, (Inet4Address) IPADDRESS);

        tester.run();
        System.out.println("Done");









    }
    }
