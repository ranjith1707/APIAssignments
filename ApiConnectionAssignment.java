package apiconnection;
import java.io.*;
import java.net.*;

public class ApiConnectionAssignment {
    public static void main(String[] args) {
    	ApiConnectionAssignment apiCall=new ApiConnectionAssignment();
    	apiCall.getResult();
    }
    
    private void getResult() {
       try {
		URL url= new URL( "https://reqres.in/api/unknown ");
		URLConnection connect=url.openConnection();
		InputStreamReader streamReader=new InputStreamReader(connect.getInputStream());
		BufferedReader bufferRead=new BufferedReader(streamReader);
		String datas=bufferRead.readLine();
		while(datas!=null) {
			System.out.println(datas);
			datas=bufferRead.readLine();
			
			
		}
		bufferRead.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
    }
}
