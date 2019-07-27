package com.tension.cloud.study.config;

import config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangli
 */
@Configuration
@RibbonClient(name = "microservice-provider-usr",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
