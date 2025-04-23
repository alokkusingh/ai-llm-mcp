package com.alok.ai.mcp.server.accounting.tools;

import com.alok.ai.mcp.server.accounting.service.ExpenseService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolCallbackProviderConfiguration {

    @Bean
    public ToolCallbackProvider accountingTool(ExpenseService expenseService) {
        return MethodToolCallbackProvider
                .builder()
                .toolObjects(expenseService)
                .build();
    }
}
