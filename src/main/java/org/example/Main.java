package org.example;
public class Main {
    public static void main(String[] args) {
        AgentDirector director = new AgentDirector();
        AiAgentBuilder builder = new AiAgentBuilder();

        director.constructCustomerSupportBot(builder);
        AiAgent supportBot = builder.build();
        System.out.println("Director Built: " + supportBot);

        AiAgent customBot = new AiAgentBuilder()
                .setBotName("MathTutor")
                .setLanguageModel("Llama-3")
                .setTemperature(0.0)
                .enableMemory(true)
                .setSystemPrompt("Solve math problems step by step.")
                .build();
        System.out.println("Custom Built: " + customBot);
    }
}
