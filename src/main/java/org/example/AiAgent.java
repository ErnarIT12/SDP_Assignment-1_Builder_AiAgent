package org.example;

public class AiAgent {
    private final String botName;
    private final String languageModel;
    private final double temperature;
    private final boolean memoryEnabled;
    private final String systemPrompt;

    // Конструктор доступен только внутри пакета, принимает Builder
    AiAgent(AiAgentBuilder builder) {
        this.botName = builder.botName;
        this.languageModel = builder.languageModel;
        this.temperature = builder.temperature;
        this.memoryEnabled = builder.memoryEnabled;
        this.systemPrompt = builder.systemPrompt;
    }

    @Override
    public String toString() {
        return "AiAgent {" +
                "Name='" + botName + '\'' +
                ", Model='" + languageModel + '\'' +
                ", Temp=" + temperature +
                ", Memory=" + memoryEnabled +
                ", Prompt='" + systemPrompt + '\'' +
                '}';
    }
}