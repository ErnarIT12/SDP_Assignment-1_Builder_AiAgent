package org.example;

public class AiAgentBuilder {
    String botName;
    String languageModel;
    double temperature;
    boolean memoryEnabled;
    String systemPrompt;

    private static final double MAX_TEMPERATURE = 2.0;
    private static final double MIN_TEMPERATURE = 0.0;

    public AiAgentBuilder setBotName(String name) {
        this.botName = name;
        return this;
    }

    public AiAgentBuilder setLanguageModel(String model) {
        this.languageModel = model;
        return this;
    }

    public AiAgentBuilder setTemperature(double temperature) {
        this.temperature = temperature;
        return this;
    }

    public AiAgentBuilder enableMemory(boolean memory) {
        this.memoryEnabled = memory;
        return this;
    }

    public AiAgentBuilder setSystemPrompt(String prompt) {
        this.systemPrompt = prompt;
        return this;
    }

    public AiAgent build() {
        if (botName == null || botName.trim().isEmpty()) {
            throw new IllegalStateException("Bot name cannot be empty");
        }
        if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
            throw new IllegalStateException("Temperature must be between " + MIN_TEMPERATURE + " and " + MAX_TEMPERATURE);
        }
        return new AiAgent(this);
    }
}
