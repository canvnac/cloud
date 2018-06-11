package cn.canlnac.cloud.microservicesimpleconsumermovie;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该类为Ribbon的配置类
 * 注意：该类不应该在主应用程序上下文的@ComponentScan 中，否则该类中的配置信息就被所有的@RibbonClient共享
 *      所以，@Configuration注解的类所在的包与@ComponentScan扫描的包不能重叠；
 *          或者显示指定@ComponentScan不扫描@Configuration注解的类所在的包。
 * Created by can on 2018/6/11 15:17.
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule() {
        // 负载均衡规则，改为随机
        return new RandomRule();
    }
}
