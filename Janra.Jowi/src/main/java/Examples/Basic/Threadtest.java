package Examples.Basic;

import Protocol.Models.HttpMethod;
import Server.IContext;
import Server.IPipelineMiddleware;
import Utilities.ThreadLauncher;

public class Threadtest implements IPipelineMiddleware {
	
	private TestTimer testTimer = new TestTimer(); 

	@Override
	public Boolean Invoke(IContext context) {
		
		Boolean started = testTimer.getStarted();
		Boolean finished = testTimer.getFinished();
		
		if (context.Request().method() == HttpMethod.GET) {
			ThreadLauncher threadlauncher = new ThreadLauncher(1);
			
			
		
		
			if (!started && !finished) {
				context.setResponseStatus(503);
				threadlauncher.launch(testTimer);
				return true;
			} else if ((started == true) && (finished ==false)) {
				context.setResponseStatus(503);
				context.setResponseBody("Not working yet");
				return true;
			} else if ((started == true) && (finished ==true)) {
				context.setResponseStatus(200);
				context.addResponseHeader("Content-type", "text/plain");
				context.setResponseBody("\"instance\": \"workingProperley\"");
				testTimer.setFinished(false);
				testTimer.setStarted(false);
				return true;
			} else {
				testTimer.setFinished(false);
				testTimer.setStarted(false);
				context.setResponseStatus(500);
				context.setResponseBody("Started = " + started + ", finished = " + finished );
				return true;
			}
		}		
		else {
			context.setResponseStatus(404);
			context.setResponseBody("Wrong method " + context.Request().method().toString()+ ", Started = \" + started + \", finished = \" + finished");
		}	
		return true; 
	}


	
}

