package App;

public class InputUsr {
	
	
	private String origin;
	private String destination;
	int compansation;
	
	

	public InputUsr(String o, String d) {
		this.origin = o;
		this.destination = d;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}

	
	public int getCompansation() {
		return compansation;
	}


	public void setCompansation(int compansation) {
		this.compansation = compansation;
	}
	

}
