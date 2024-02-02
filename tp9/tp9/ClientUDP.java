import java.io.*;
import java.net.*; 

fonction main():
	InetAddress addr = InetAddress.getLocalHost();
	System.out.println( "adresse=" +addr.getHostname() );
...
	DatagramPacket packet = new DatagramPacket( data, data.length, addr, 1234 );
	DatagramSocket sock = new DatagramSocket();
	sock.send(packet);
	sock.close();
