package API.APItesting;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RESTMessages{ 
	int responseCode; 
	String responseMessage;
	HttpURLConnection connection;
	URL url;
	
	public void getMessage(String urlstring) throws IOException
	{ 
		url = new URL(urlstring);
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
        responseCode = connection.getResponseCode();
        System.out.println("POST Response Code :  " + responseCode);
        System.out.println("POST Response Message : " + connection.getResponseMessage());
	}
	
	public void postMessage(String urlstring) throws IOException
	{
		url =  new URL(urlstring);
		final String POST_PARAMS = "{\n" + "\"name\": \"mk\"," +
			        "\n\"job\": \"leader\"\n}";
		connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream();
        os.write(POST_PARAMS.getBytes());
        os.flush();
        os.close();
        responseCode = connection.getResponseCode();
        System.out.println("POST Response Code :  " + responseCode);
        System.out.println("POST Response Message : " + connection.getResponseMessage());
           
	}
	
	public void updateMessage(String urlstring) throws IOException
	{
		url =  new URL(urlstring);
		final String POST_PARAMS = "{\n" + "\"name\": \"mk\"," +
		        "\n\"job\": \"Big Leader\"\n}";
    	connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream();
        os.write(POST_PARAMS.getBytes());
        os.flush();
        os.close();
        responseCode = connection.getResponseCode();
        System.out.println("POST Response Code :  " + responseCode);
        System.out.println("POST Response Message : " + connection.getResponseMessage());
           
	}
	
	public void deleteMessage(String urlstring) throws IOException
	{
		url =  new URL(urlstring);
    	connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
        connection.setDoOutput(true);
        responseCode = connection.getResponseCode();
        System.out.println("POST Response Code :  " + responseCode);
        System.out.println("POST Response Message : " + connection.getResponseMessage());
           
	}
}