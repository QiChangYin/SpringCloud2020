package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther zzyy
 * @create 2020-02-19 19:00
 */
//注意，官方文档明确给出警告：
//这个自定义配置类不能放在@Configuration所扫描的当前包及子包下，否则我们自定义的这个配置类就会被所有Ribbon客户端共享，达不到特殊化定制的目的了
@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机
    }
}
