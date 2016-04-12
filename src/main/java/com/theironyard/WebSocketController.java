package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * Created by branden on 4/12/16 at 15:32.
 */
@Controller
public class WebSocketController {
    static SimpMessagingTemplate messanger;

    @Autowired
    public WebSocketController(SimpMessagingTemplate template) {
        messanger = template;
    }

    @MessageMapping("/move")
    @SendTo("/move")
    public Message move(Message message) {
        return message;
    }




}