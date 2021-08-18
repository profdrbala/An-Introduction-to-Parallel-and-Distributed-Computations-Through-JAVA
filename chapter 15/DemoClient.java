// DemoClient.java
import java.io.*;
import java.net.*;
public class DemoClient{
public static void main(String arg[])throws Exception	{
		boolean f;
		Socket socket;
		socket=new Socket ("127.0.0.1",75);
		DataInputStream input;
		PrintStream output;
		f=true;
	input=new DataInputStream(socket.getInputStream());
		output=new PrintStream(socket.getOutputStream());
		String data,temp;			
	DataInputStream user_input=new DataInputStream(System.in);
		temp=user_input.readLine();
		output.println(temp);
		 data=input.readLine();
		System.out.println(data);
	output.close();
	input.close();	}}
