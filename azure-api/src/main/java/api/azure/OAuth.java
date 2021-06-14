package api.azure;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dy20c
 * @Create 6/4/21 10:43 AM , South Korea
 * @Package api.azure
 * @Content OAuth
 */
@RestController
public class OAuth {


    @GetMapping(value="test", produces = "application/json")
    public String test(){

        return "healthcheck";
    }
}
