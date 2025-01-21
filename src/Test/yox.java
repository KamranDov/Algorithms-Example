package Test;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class yox {

    public static void main(String[] args) throws SocketException, UnknownHostException {

        Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaceEnumeration.hasMoreElements()){
            NetworkInterface networkInterface = networkInterfaceEnumeration.nextElement();
            System.out.println("interface name: " + networkInterface.getName());
            System.out.println("display name: " + networkInterface.getDisplayName());
            System.out.println("is up: " + networkInterface.isUp());
            System.out.println("is loopback: " + networkInterface.isLoopback());


            Iterator<InetAddress> addressIterator = networkInterface.getInetAddresses().asIterator();
            while (addressIterator.hasNext()){
                InetAddress inetAddress = addressIterator.next();
                System.out.println("InetAddress: " + inetAddress.getHostAddress());
                System.out.println("HostName: " + inetAddress.getHostName());
            }
            System.out.println();
        }
    }
}
