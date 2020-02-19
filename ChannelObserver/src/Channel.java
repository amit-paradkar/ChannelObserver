import java.util.ArrayList;

public class Channel implements Subject{
	
	ArrayList<Observer> viewers = new ArrayList<Observer>();
	String channelName;
	private String status;

	@Override
	public void registerObserver(Observer o) {
		viewers.add(o);
	}

	@Override
	public void deregisterObserver(Observer o) {
		viewers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for  (Observer viewer: viewers) {
			viewer.update(status);// TODO Auto-generated method stub
		}	
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
