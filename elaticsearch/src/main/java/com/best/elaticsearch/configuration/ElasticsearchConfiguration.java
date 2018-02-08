package com.best.elaticsearch.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * Created by hungnguyen on 12/16/14.
// */
@Configuration
@PropertySource(value = "classpath:application.properties")
@EnableElasticsearchRepositories(basePackages = "com.best.elaticsearch.reposities")
public class ElasticsearchConfiguration {

    @Value("${elasticsearch.host}")
    private String host;

    @Value("${elasticsearch.port}")
    private String port;

//    @Bean
//    public Client client() {
//        TransportAddress address = null;
//        try {
//            address = new InetSocketTransportAddress(
//                    new InetSocketAddress( host, Integer.parseInt(port) ));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return TransportClient.build().addTransportAddress(address);
//    }



//    @Bean
//    public ElasticsearchTemplate elasticsearchTemplate() {
////        TransportClientFactoryBean factory = new TransportClientFactoryBean();
////        return new ElasticsearchTemplate( new NodesOperationRequestBuilder<>().local(true).node().client());
//    }



}