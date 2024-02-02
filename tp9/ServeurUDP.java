import java.io.*;
import java.net.*;

public void main() {
	DatagramSocket sock = new DatagramSocket(1234);
	while(true)
	{
		System.out.println( "-Waiting data" );
		DatagramPacket packet = new DatagramPacket (new byte[1024], 1024);
		sock.receive(packet);
		String str = new String(packet.getData() );
		System.out.println( "str=" + str );
	}
}

