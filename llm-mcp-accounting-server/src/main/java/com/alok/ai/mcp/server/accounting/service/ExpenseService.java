package com.alok.ai.mcp.server.accounting.service;

import com.alok.ai.mcp.server.accounting.dto.Spend;
import com.alok.ai.mcp.server.accounting.dto.TotalSpend;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.time.YearMonth;

@Service
public class ExpenseService {
    @Tool(description = "Get the total expense for a given month")
    public TotalSpend getTotalExpenseForGivenMonth(Integer year, String month) {
        System.out.println("Fetching total expense for Year: " + year + ", Month: " + month);
        return new TotalSpend(new Spend(45000.0, "INR"));
    }
}
