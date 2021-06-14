package api.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.Filter;


/**
 * @Author dy20c
 * @Create 6/7/21 10:25 AM , South Korea
 * @Package api.common
 * @Content HTTP 요청을 처리하는 부분에 필터를 삽입해 요청 처리 이전과 이후에 로그메세지를 작성하는 필터
 */
@Configuration
public class SubscriberApplication {

    @Bean
    public Filter logFilter(){
        CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();

        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true);
        filter.setMaxPayloadLength(5120);
        return filter;
    }
}
