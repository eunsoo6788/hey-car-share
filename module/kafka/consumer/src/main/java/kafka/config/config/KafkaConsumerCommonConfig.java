//package kafka.config.config;
//
//import com.fasterxml.jackson.databind.JsonDeserializer;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.listener.DefaultErrorHandler;
//import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//@EnableKafka
//public class KafkaConsumerCommonConfig {
//
//    @Bean
//    @ConfigurationProperties(prefix = "app.kafka.consumer")
//    public Map<String, Object> baseConsumerProps() {
//        return new HashMap<>();
//    }
//
//    @Bean
//    public DefaultKafkaConsumerFactory<String, String> baseConsumerFactory(
//            @Qualifier("baseConsumerProps") Map<String, Object> baseProps) {
//
//        var props = new HashMap<>(baseProps);
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ErrorHandlingDeserializer.class);
//        props.put(ErrorHandlingDeserializer.VALUE_DESERIALIZER_CLASS, JsonDeserializer.class);
//        props.put(org.springframework.kafka.support.serializer.JsonDeserializer.TRUSTED_PACKAGES, "*");
//
//        return new DefaultKafkaConsumerFactory<>(props);
//    }
//
//    @Bean
//    public ListenerFactoryBuilder listenerFactoryBuilder(
//            DefaultKafkaConsumerFactory<String, String> baseFactory
//    ) {
//        return new ListenerFactoryBuilder(baseFactory);
//    }
//
//}
