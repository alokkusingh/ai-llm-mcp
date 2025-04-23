# AI LLM MCP Demo

## Overview
This project demonstrates an **MCP (Model Control Plane)** using **Ollama LLM** (a locally hosted LLM) and **Java Spring Boot**.  
The demo features a simple chatbot that can answer questions about:
- The current date, time, and month.
- Expenses for the current month.

---

## Prerequisites
- **Java 21**
- **Ollama** installed on your system

---

## Build Instructions
To build the project, run the following command:

```shell
mvn clean package -DskipTests
```

## Ollama Server
### Start
```shell
ollama serve
```

### Stop
```shell
ps -ef | grep "ollama serve" |grep -v "grep"| awk '{print $2}' | xargs kill -9
```

## MCP Host
### Start
```shell
java -jar llm-mcp-host/target/llm-mcp-host-0.0.1-SNAPSHOT.jar
```
### Stop
```shell
ps -ef | grep "llm-mcp-host" |grep -v "grep"| awk '{print $2}' | xargs kill -9
```

## MCP Realworld Server
### Start
```shell
java -jar llm-mcp-realworld-server/target/llm-mcp-realworld-server-0.0.1-SNAPSHOT.jar
```
### Stop
```shell
ps -ef | grep "llm-mcp-realworld-server" |grep -v "grep"| awk '{print $2}' | xargs kill -9
```

## MCP Accounting Server
### Start
```shell
java -jar llm-mcp-accounting-server/target/llm-mcp-accounting-server-0.0.1-SNAPSHOT.jar
```
### Stop
```shell
ps -ef | grep "llm-mcp-accounting-server" |grep -v "grep"| awk '{print $2}' | xargs kill -9
```

## Chat with llm
```shell
curl -X POST http://localhost:8085/api/v1/chatbot/chat -d '{
  "question": "What is time now?"
}' -H "Content-Type: application/json"
```
```shell
curl -X POST http://localhost:8085/api/v1/chatbot/chat -d '{
  "question": "What date is Today?"
}' -H "Content-Type: application/json"
```
```shell
curl -X POST http://localhost:8085/api/v1/chatbot/chat -d '{
  "question": "What Month and Year is Today?"
}' -H "Content-Type: application/json"
```
```shell
curl -X POST http://localhost:8085/api/v1/chatbot/chat -d '{
  "question": "What is next Month?"
}' -H "Content-Type: application/json"
```
```shell
curl -X POST http://localhost:8085/api/v1/chatbot/chat -d '{
  "question": "What was previous Month?"
}' -H "Content-Type: application/json"
```
```shell
curl -X POST http://localhost:8085/api/v1/chatbot/chat -d '{
  "question": "What Month and Year is Today? And, How much did I spend in the current month?"
}' -H "Content-Type: application/json"
```
