package gateway.common.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author dy20c
 * @Create 6/17/21 11:00 AM , South Korea
 * @Package gateway.common.routes
 * @Content RouteCommon
 */
@Component
public class RouteCommon {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route", r -> r.path("/test")
                        .uri("http://localhost:2020"))
                .build();
    }
}
