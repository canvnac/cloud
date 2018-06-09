package cn.canlnac.cloud.microservicesimpleconsumermovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by can on 2018/5/28 17:27.
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://localhost:8000/" + id, User.class);
    }

    /**
     * 获取microservice-provide-user的服务信息
     * @return
     */
    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo() {
        return discoveryClient.getInstances("microservice-provide-user");
    }
}
