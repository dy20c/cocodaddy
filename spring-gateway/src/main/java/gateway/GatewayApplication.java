package gateway;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @Author dy20c
 * @Create 6/15/21 3:18 PM , South Korea
 * @Package gateway
 * @Content
 */
@CrossOrigin
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
