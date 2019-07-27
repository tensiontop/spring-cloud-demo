package config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangli
 * @date 2019/7/26 15:05
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
