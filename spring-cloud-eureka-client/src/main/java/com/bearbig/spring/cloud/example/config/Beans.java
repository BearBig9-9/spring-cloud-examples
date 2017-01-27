package com.bearbig.spring.cloud.example.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.cloud.example.config 2017/1/27 11:09 xiongyu $
 */
@Component
public class Beans {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
