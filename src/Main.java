//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PortTester portTester = new PortTester(); // This is creating an object of the class PortTester
        PortTester portTester2 = new PortTester(); // This is creating another object of the class PortTester

        portTester.testPortAndIPaddress("80", "127.0.0.1"); // This is calling the method testPortAndIPaddress()
        portTester2.testPort("443"); // This is calling the method testPort()
        portTester2.testIPaddress("127.0.0.1"); // This is calling the method testIPaddress()

        portTester.printPortAndIPaddress("80", "127.0.0.1");

        }
    }
