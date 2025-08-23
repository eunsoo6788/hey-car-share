//package kafka.config.config;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RequiredArgsConstructor
//public class ListenerFactoryBuilder {
//
//    private final DefaultKafkaConsumerFactory<String, String> baseFactory;
//
//    public ConcurrentKafkaListenerContainerFactory<String, String> build(Map<String, Object> overrides, int concurrency) {
//        var props = new HashMap<>(baseFactory.getConfigurationProperties());
//        props.putAll(overrides);
//
//        var factory = new ConcurrentKafkaListenerContainerFactory<String, String>();
//        factory.setConsumerFactory(new DefaultKafkaConsumerFactory<>(props));
//        factory.setConcurrency(concurrency);
//        return factory;
//    }
//}
