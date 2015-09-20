package edu.spring.messageProvider;

public class ExternalizedHelloWorldMessageProvider implements MessageProvider {

	private String mesage;

	public String getMessage() {
		return mesage;
	}
	
	public void setMessage(String mesage){
		this.mesage = mesage;
	}

}
