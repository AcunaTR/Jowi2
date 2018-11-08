package Examples.Basic;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;

import Server.IContext;
import Server.IPipelineMiddleware;

public class CronCurl implements IPipelineMiddleware {

	@Override
	public Boolean Invoke(IContext context)  {
		context.setResponseStatus(200);
		context.addResponseHeader("Content-type", "text/plain");
		context.setResponseBody(doGetRequest());
		return true;
		
	}

	private String doGetRequest() {
		URL url = null;
		String output = "drat";
		try {
			url = new URL("http://10.10.108.110:6543/rest/appliance/progress/timetest");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		try {
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();

			conn.setRequestMethod( "GET" );
			int responseCode = conn.getResponseCode();
			
			
			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						conn.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
				output = response.toString();
				// print result
				System.out.println(response.toString());
			} else {
				output = "GET request not worked, this is actually working";
				System.out.println("GET request not worked, this is actually working");
			}
			
			
//			DataOutputStream wr = new DataOutputStream( conn.getOutputStream());
//			output = wr.toString();
//			conn.disconnect();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return output;
		
	}

}
