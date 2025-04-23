package com.alok.ai.mcp.host.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatBotService {

    private final ChatClient chatClient;

    public ChatBotService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String chat(String question) {
        return chatClient
                .prompt()
                .user(question)
                .call()
                .content();
    }
}
