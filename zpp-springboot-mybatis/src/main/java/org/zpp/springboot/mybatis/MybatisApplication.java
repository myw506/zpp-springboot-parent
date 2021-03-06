package org.zpp.springboot.mybatis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zpp.springboot.mybatis.service.CacheKeyGenerator;
import org.zpp.springboot.mybatis.service.impl.LockKeyGenerator;


@SpringBootApplication
public class MybatisApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}

	@Bean
	public CacheKeyGenerator cacheKeyGenerator() {
		return new LockKeyGenerator();
	}
}