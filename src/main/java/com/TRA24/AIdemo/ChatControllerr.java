package com.TRA24.AIdemo;


import lombok.Data;
import org.springframework.ai.chat.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
public class ChatControllerr {

    private final ChatClient chatClient;

    @GetMapping("m")
    public String generateMessage(@RequestParam(value = "message", defaultValue = "tell me a night life joke!") String message){
        return chatClient.call(message);
    }
}