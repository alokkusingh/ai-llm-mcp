package com.alok.ai.mcp.server.realworld.tools;

import com.alok.ai.mcp.server.realworld.service.DateTimeService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolCallbackProviderConfiguration {

    @Bean
    public ToolCallbackProvider realWorldTools(DateTimeService dateTimeService) {
        return MethodToolCallbackProvider
                .builder()
                .toolObjects(dateTimeService)
                .build();
    }
}
