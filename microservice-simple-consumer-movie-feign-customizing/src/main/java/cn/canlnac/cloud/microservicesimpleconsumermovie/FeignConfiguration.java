package cn.canlnac.cloud.microservicesimpleconsumermovie;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义Feign配置类
 * 注意：该类不应该在主应用程序上下文的@ComponentScan中
 * Created by can on 2018/6/13 16:29.
 */
@Configuration
public class FeignConfiguration {

    /**
     * 将契约改为feign原生的默认契约。这样就可以使用feign自带的注解了。
     * @return 默认的feign契约
     */
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
