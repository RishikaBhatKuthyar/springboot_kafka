# Kafka Project

This project demonstrates a basic Kafka setup with both string and JSON producers and consumers. It includes:

- **String Producer**: Sends string messages to Kafka.
- **String Consumer**: Listens for string messages from Kafka.
- **JSON Producer**: Sends JSON objects (e.g., User model) to Kafka.
- **JSON Consumer**: Listens for JSON messages from Kafka.
- **Topics**: Kafka topics for string and JSON data.

## Getting Started

These instructions will help you get a copy of the project running on your local machine.

### Prerequisites

- **Java 8+**: Ensure you have the latest version of Java installed.
- **Apache Kafka**: Download and install [Apache Kafka](https://kafka.apache.org/downloads).
- **Spring Boot**: The project uses Spring Boot to implement Kafka producers and consumers.

### Starting Zookeeper and Kafka Broker

1. **Start Zookeeper**: Navigate to your Kafka installation directory and start Zookeeper with the following command:

   ```bash
   bin/zookeeper-server-start.sh config/zookeeper.properties
   ```

2. **Start Kafka Broker**: After Zookeeper starts, launch Kafka Broker:

   ```bash
   bin/kafka-server-start.sh config/server.properties
   ```

### Creating Kafka Topics

To create Kafka topics for string and JSON data, use the following commands.

1. **Create a topic for string data**:

   ```bash
   bin/kafka-topics.sh --create --topic topic1 --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
   ```

2. **Create a topic for JSON data**:

   ```bash
   bin/kafka-topics.sh --create --topic topic1_json --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
   ```

### Running the Application

1. **Start the Kafka Consumer for String Data**:
   - This consumer listens to `topic1` for string messages.

   ```bash
   bin/kafka-console-consumer.sh --topic topic1 --from-beginning --bootstrap-server localhost:9092
   ```

2. **Start the Kafka Consumer for JSON Data**:
   - This consumer listens to `topic1_json` for JSON messages.

   ```bash
   bin/kafka-console-consumer.sh --topic topic1_json --from-beginning --bootstrap-server localhost:9092
   ```

3. **Run the Spring Boot Producer Application**:
   - You can run the Spring Boot Kafka Producer by using:

   ```bash
   mvn spring-boot:run
   ```

   Or for Gradle:

   ```bash
   ./gradlew bootRun
   ```


