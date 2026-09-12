# Builder Pattern - AI Agent Configuration

## 1. Product Description
The chosen domain for this Builder pattern implementation is an **AI Agent Configuration System**. Creating an AI Agent requires configuring multiple parameters such as the bot's name, the underlying language model, the creativity level (temperature), memory settings, and the system prompt. Since an AI agent can have various configurations (e.g., a highly creative storyteller vs. a strict, low-temperature customer support bot) and benefits from step-by-step construction, the Builder pattern is the perfect fit.

## 2. Clean Code Principles Applied
Below are the 5 Clean Code principles explicitly identified and justified in this implementation:

### 1. Meaningful, intention-revealing names
Variables and methods are named clearly to indicate their exact purpose, avoiding vague abbreviations.
* **Before:** `double t;` and `public AiAgentBuilder setTemp(double t)`
* **After:** `double temperature;` and `public AiAgentBuilder setTemperature(double temperature)`

### 2. Validated construction
The object is protected from being created in an invalid state. The `build()` method throws a clear exception if the parameters are incorrect.
* **Before:** `return new AiAgent(this);` (Creates the object even with invalid data)
* **After:**
  ```java
  if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
      throw new IllegalStateException("Temperature must be between " + MIN_TEMPERATURE + " and " + MAX_TEMPERATURE);
  }
  return new AiAgent(this);