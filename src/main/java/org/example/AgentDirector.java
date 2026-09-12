package org.example;
public class AgentDirector {
    public void constructCustomerSupportBot(AiAgentBuilder builder) {
        builder.setBotName("SupportBot")
                .setLanguageModel("GPT-4")
                .setTemperature(0.2)
                .enableMemory(true)
                .setSystemPrompt("You are a helpful customer support assistant.");
    }

    public void constructCreativeWriterBot(AiAgentBuilder builder) {
        builder.setBotName("StoryWeaver")
                .setLanguageModel("Claude-3")
                .setTemperature(1.5)
                .enableMemory(false)
                .setSystemPrompt("You are an expert storyteller and creative writer.");
    }
}
