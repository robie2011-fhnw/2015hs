package edu.spring.domain.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.spring.domain.MessageProvider;
import edu.spring.domain.MessageRenderer;

public class StandardOutRenderer implements MessageRenderer {
	private MessageProvider messageProvider;

	@Override
	public void setMessageProvider(MessageProvider mp) {
		this.messageProvider = mp;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

	@Override
	public void render() {
		System.out.println(messageProvider.getMessage());;
	}

}
