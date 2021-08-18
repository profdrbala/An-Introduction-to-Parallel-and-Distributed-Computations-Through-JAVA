// DemoServer.java
import java.io.*;
import java.net.*;
public class DemoServer{
public static void main(String args[])throws IOException{
	boolean f;
	Socket client;
	ServerSocket clientsocket;
	clientsocket=new ServerSocket (75);
	f=true;
	client=clientsocket.accept();
	DataInputStream input=new DataInputStream(client.getInputStream());
	PrintStream output;
	String data1,temp1;
	 	  temp1=input.readLine();
	 	  System.out.println(temp1);
  DataInputStream ser_input=new DataInputStream(System.in);
	  data1=ser_input.readLine();
	output=new PrintStream(client.getOutputStream());
		output.println(data1);
         }}
