package com.atguigu.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zzyy
 * @create 2020-02-23 14:45
 */
@Configuration
public class ApplicationContextConfig
{

// 8     @Bean
// 9   标注此注解后，RestTemplate就具有了客户端负载均衡能力
// 10     // 负载均衡技术依赖于的是Ribbon组件~
// 11     // RestTemplate都塞入一个loadBalancerInterceptor 让其具备有负载均衡的能力
// 12     @LoadBalanced
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
