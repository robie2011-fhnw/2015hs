package edu.spring.domain;

import edu.spring.domain.impl.ExternalizedHelloWorldMessageProvider;
import edu.spring.domain.impl.StandardOutRenderer;
import org.omg.CORBA.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:app.properties")
public class MessageConfig {

    @Bean
    public MessageProvider getMessageProvider(){
        return new ExternalizedHelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer getMessageRenderer(){
        StandardOutRenderer renderer = new StandardOutRenderer();
        renderer.setMessageProvider(getMessageProvider());
        return renderer;
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
