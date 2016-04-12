package com.theironyard;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import java.util.HashMap;

/**
 * Created by branden on 4/12/16 at 15:47.
 */
@Component
public class SessionDisconnectListener implements ApplicationListener<SessionDisconnectEvent>{
    @Override
    public void onApplicationEvent(SessionDisconnectEvent event) {   //runs on disconnect.
        String sessionId = event.getSessionId();
        HashMap m = new HashMap();
        m.put("id", sessionId);
        WebSocketController.messanger.convertAndSend("/remove-player", m);  //sends wrapped m var to anyone on socket
    }
}