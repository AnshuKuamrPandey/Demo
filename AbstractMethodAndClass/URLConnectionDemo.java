package network;
import java.net.*;
import java.util.Date;
import java.io.*;
 class URLConnectionDemo {

	public static void main(String[] args) throws IOException,MalformedURLException {
		
		int c;
		URL hp = new URL("http://www.internic.net");
		
		URLConnection hpCon = hp.openConnection();
		
		// get date 
		
		long d = hpCon.getDate();
		
		if(d == 0)
			System.out.println("No Date Information");
		else 
			System.out.println("Date: "+ new Date(d));
		
		// get content type
		System.out.println("content type: "+hpCon.getContentType());
		
		//get expiration date.
		
		d = hpCon.getExpiration();
		
		if(d == 0)
			System.out.println("No expiration information");
		else 
			System.out.println("Expires: "+new Date(d));
		
		// get last modified date 
		
		d = hpCon.getLastModified();
		if(d==0)
			System.out.println("No Last-modified");
		else 
			System.out.println("Last-modified: "+new Date(d));
		
		
		// get content length.
		
		long len = hpCon.getContentLengthLong();
		if(len == -1)
			System.out.println("Content length Unavailable");
		else 
			System.out.println("Content-length: "+len);
		
		
		if(len!=0) {
			System.out.println("=== Content ===");
			InputStream input = hpCon.getInputStream();
			while((c = input.read()) != -1) {
				System.out.print((char)c);
			}
			input.close();
		}
		else {
			System.out.println("No Content Available");
		}

	}

}