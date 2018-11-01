package Examples.Basic;

import Protocol.Models.HttpMethod;
import Server.IContext;
import Server.IPipelineMiddleware;

public class Gettest implements IPipelineMiddleware {

	@Override
	public Boolean Invoke(IContext context) {
			
		if (context.Request().method() == HttpMethod.GET) {
			context.setResponseStatus(200);
			context.addResponseHeader("Content-type", "text/plain");
			context.setResponseBody("\"type\": \"ItIsWorkingGoddammit\"");
		}
		else {
			context.setResponseStatus(404);
			
		}
		
		return false;
	}

}
