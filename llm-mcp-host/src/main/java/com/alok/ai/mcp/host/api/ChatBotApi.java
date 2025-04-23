package com.alok.ai.mcp.host.api;

import com.alok.ai.mcp.host.dto.ChatRequest;
import com.alok.ai.mcp.host.dto.ChatResponse;
import com.alok.ai.mcp.host.service.ChatBotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/chatbot")
@RestController
public class ChatBotApi {

    private final ChatBotService chatBotService;

    public ChatBotApi(ChatBotService chatBotService) {
        this.chatBotService = chatBotService;
    }

    @PostMapping("/chat")
    ResponseEntity<ChatResponse> chat(@RequestBody ChatRequest chatRequest) {
        return ResponseEntity.ok(new ChatResponse(chatBotService.chat(chatRequest.question())));
    }
}
