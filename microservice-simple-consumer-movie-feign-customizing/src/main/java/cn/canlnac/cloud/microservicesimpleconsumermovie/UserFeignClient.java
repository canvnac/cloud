package cn.canlnac.cloud.microservicesimpleconsumermovie;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 使用@FeignClient的configuration属性，指定feign的配置类
 * Created by can on 2018/6/13 15:29.
 */
@FeignClient(name = "microservice-provide-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {

    /**
     * 使用feign的注解@RequestLine
     * @see https://github.com/OpenFeign/feign
     * @param id 用户id
     * @return  用户信息
     */
    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);
}
