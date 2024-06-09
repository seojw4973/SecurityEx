package com.example.springsecurityex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

// 메인 패키지 외부에 엔티티나 레포지터리 작성시 다음과 같이 어노테이션을 추가해주어야함
//@EnableJpaRepositories("com.example.springsecurityex.repository")
//@EntityScan("com.example.springsecurityex.model")
// @EnableWebSecurity      // spring boot 없이 spring 개발시 언급해주어야 시큐리티의 모든 기능이 활성화됨
@SpringBootApplication
public class SpringsecurityExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityExApplication.class, args);
    }

}
