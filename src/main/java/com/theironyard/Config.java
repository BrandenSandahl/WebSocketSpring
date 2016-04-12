package com.theironyard;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by branden on 4/12/16 at 15:29.
 */
@Configuration
@EnableWebSocketMessageBroker
public class Config extends AbstractWebSocketMessageBrokerConfigurer {


    //need this to implement the socket endpoint
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/socket").withSockJS();
    }
}