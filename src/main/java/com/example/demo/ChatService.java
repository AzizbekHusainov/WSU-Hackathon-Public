package com.example.demo;

import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class ChatService {
    private final OpenAiChatModel chatModel;

    public ChatService(OpenAiChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String getResponse(String userPrompt) {
        try {
            // Define a prompt template to enforce motivational coaching behavior
            PromptTemplate promptTemplate = new PromptTemplate("""
                You are a motivational coach named Motiv.ai. Your goal is to inspire and uplift users. 
                Keep responses under 200 characters.
                Provide positive reinforcement and encouragement in response to the following input: {prompt}
                """, Map.of("prompt", userPrompt));

            // Call OpenAI with the prompt
            return chatModel.call(promptTemplate.createMessage());
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}