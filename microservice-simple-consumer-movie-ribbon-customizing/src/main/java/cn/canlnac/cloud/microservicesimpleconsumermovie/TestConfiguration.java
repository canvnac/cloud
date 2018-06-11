package cn.canlnac.cloud.microservicesimpleconsumermovie;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 使用RibbonClient，为特定name的Ribbon Client 自定义配置。
 * 使用@RibbonClient的configuration属性，指定Ribbon的配置类。
 * 可参考示例
 * http://spring.io/guides/gs/client-side-load-balancing/
 * Created by can on 2018/6/11 15:21.
 */
@Configuration
@RibbonClient(name = "microservice-provide-user", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
