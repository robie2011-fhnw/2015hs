package edu.spring.renderer;

import edu.spring.messageProvider.MessageProvider;

public interface Renderer {
	void render();
	void setMessageProvider(MessageProvider p);
}
