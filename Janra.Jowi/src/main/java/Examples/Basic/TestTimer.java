package Examples.Basic;

public class TestTimer implements Runnable  {

	
	public Boolean started = false;
	public Boolean finished = false;
	
	@Override
	public void run() {
		started = true;
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		finished = true;
	}

	public Boolean getStarted() {
		return started;
	}

	public void setStarted(Boolean started) {
		this.started = started;
	}

	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
	
	
}



