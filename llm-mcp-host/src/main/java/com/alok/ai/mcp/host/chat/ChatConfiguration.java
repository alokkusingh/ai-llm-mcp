package com.alok.ai.mcp.host.chat;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.mcp.SyncMcpToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatConfiguration {

    @Bean
    public ChatClient ollamaChatClient(ChatModel ollamaChatModel, SyncMcpToolCallbackProvider toolCallbackProvider) {
        return ChatClient
                .builder(ollamaChatModel)
                .defaultTools(toolCallbackProvider.getToolCallbacks())
                .build();
    }
}
