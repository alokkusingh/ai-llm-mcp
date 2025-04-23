package com.alok.ai.mcp.server.realworld.service;

import com.alok.ai.mcp.server.realworld.dto.YearMonthResponse;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.YearMonth;

@Service
public class DateTimeService {
    @Tool(description = "Get The current date and time")
    public LocalDateTime getCurrentDateTime() {
        System.out.println("Fetching current date and time...");
        return LocalDateTime.now();
    }

    @Tool(description = "Get The current year month")
    public YearMonthResponse getCurrentYearMonth() {
        System.out.println("Fetching current year month...");
        return new YearMonthResponse(
                new com.alok.ai.mcp.server.realworld.dto.YearMonth(YearMonth.now().getYear(), YearMonth.now().getMonth().name()),
                new com.alok.ai.mcp.server.realworld.dto.YearMonth(YearMonth.now().plusMonths(1).getYear(), YearMonth.now().plusMonths(1).getMonth().name()),
                new com.alok.ai.mcp.server.realworld.dto.YearMonth(YearMonth.now().minusMonths(1).getYear(), YearMonth.now().minusMonths(1).getMonth().name())
                );
    }
}
