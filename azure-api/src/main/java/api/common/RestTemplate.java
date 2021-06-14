package api.common;

import org.springframework.context.annotation.Bean;

/**
 * @Author dy20c
 * @Create 6/8/21 3:00 PM , South Korea
 * @Package api.common
 * @Content
 */
public class RestTemplate {
    @Bean
    RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
