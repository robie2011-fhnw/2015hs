package edu.spring.renderer;

import edu.spring.messageProvider.MessageProvider;

public class ConsoleRenderer implements Renderer {
	private MessageProvider p;
	
	public void render() {
		System.out.println(p.getMessage());
	}

	public void setMessageProvider(MessageProvider p) {
		this.p = p;
	}
}
