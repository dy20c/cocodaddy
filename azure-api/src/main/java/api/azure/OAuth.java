package api.azure;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dy20c
 * @Create 6/4/21 10:43 AM , South Korea
 * @Package api.azure
 * @Content OAuth
 */
@RestController
public class OAuth {


    @GetMapping(value="get-test", produces = "application/json")
    public String getTest(){

        return "getTest Result";
    }

    @PostMapping(value="post-test", produces = "application/json")
    public String postTest(){
        return "postTest Result";
    }

    @GetMapping(value="yml", produces = "application/json")
    public String azureYml(){

        return "getAzure Result";
    }
}
