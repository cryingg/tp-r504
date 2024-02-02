import java.io.*;
import java.net.*;

public class Main {
	public static void main(String[] args) {
		do {
			try {
				Socket socket = new Socket( "localhost", 2016 );
				DataOutputStream dOut = new DataOutputStream( socket.getOutputStream() );
				dOut.writeUTF( args[0] );
				socket.close();
			}
			catch(Exception e) {
			}
		}
		while (true);
	}
}
