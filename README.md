# AI LLM MCP Demo

## Overview

## Prerequisites
- Java 21
- Ollama is installed

## Build
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
