package edu.spring.domain.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import edu.spring.domain.MessageProvider;

public class ExternalizedHelloWorldMessageProvider implements MessageProvider {
	@Value("${helloworld.message}")
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
