package API.APItesting;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Hello world!
 *
 */

public class APIMethods 
{ 
	
    static RESTMessages Message = new RESTMessages();

    public static void main( String[] args ) throws IOException
      {
        System.out.println( "Hello World!" );
       //createUser("https://reqres.in/api/users"); 
       //retrieveUser("https://reqres.in/api/users/2");
       //updateUser("https://reqres.in/api/users/2");
       //retrieveUser("https://reqres.in/api/users/2");
       //deleteUser("https://reqres.in/api/users/2");
       //retrieveUser("https://reqres.in/api/users/2");

      }
    
    
    public static boolean createUser(String urlstr) throws IOException
    { 
    	Message.postMessage(urlstr);
    	System.out.println("Response Code"+Message.responseCode);
    	if (Message.responseCode == HttpURLConnection.HTTP_CREATED) { //success
    		BufferedReader in = new BufferedReader(new InputStreamReader(
                Message.connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();
            // print result
            System.out.println(response.toString());
            return (true);
        } else {
            System.out.println("POST NOT WORKED");
            return (false);
        }
     
       
    }
    
  public static boolean retrieveUserList(String urlstr) throws IOException
    { 
     	Message.getMessage(urlstr);
  	    if (Message.responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(Message.connection.getInputStream()));
            String readLine = null;
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + response.toString());
            return (true);
        } else {
            System.out.println("GET NOT WORKED");
            return (false);
        }
    	
    }
    
   public static boolean retrieveUser(String urlstr) throws IOException
    {  	
    	Message.getMessage(urlstr);
         if (Message.responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(Message.connection.getInputStream()));
            String readLine = null;
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + response.toString());
            return (true);
        } else {
            System.out.println("GET NOT WORKED");
            return (false);
        }
    }
    
    public static boolean retrieveUserNotFound(String urlstr) throws IOException
    { 
    	Message.getMessage(urlstr);
        if (Message.responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(Message.connection.getInputStream()));
            String readLine = null;
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + response.toString());
            return (false);
        } else {
            System.out.println("GET NOT WORKED");
            return (true);
        }
    }
      
    public static boolean updateUser(String urlstr) throws IOException
    { 
    	Message.updateMessage(urlstr);
        if (Message.responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(Message.connection.getInputStream()));
            String readLine = null;
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + response.toString());
            return (true);
        } else {
            System.out.println("UPDATE NOT WORKED");
            return (false);
        }
    }
    
    public static boolean deleteUser(String urlstr) throws IOException
    { 
    	Message.deleteMessage(urlstr);
        if (Message.responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(Message.connection.getInputStream()));
            String readLine = null;
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + response.toString());
            return (true);
        } else {
            System.out.println("DELETE NOT WORKED");
            return (false);
        }
    }
}
