package com.example.jwt_test.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    // application.yml(또는 properties)에 설정된 server.port 값을 가져옵니다.
    // 설정이 없으면 기본값으로 8080을 사용합니다
    @Value("${server.port:8080}")
    private String port;

    @Bean
    public OpenAPI openAPI() {
        SecurityScheme securityScheme = new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer");

        return new OpenAPI()
                .info(new Info()
                        .title("QUIZ OpenAPI")
                        .description("스웨거 실습 입니다")
                        .version("v1.0.0")
                )
                .servers(List.of(
                        new Server().url("http://localhost:" + port)
                                .description("개발용 서버 주소")
                ))
                .components(
                        new Components().addSecuritySchemes("JWT", securityScheme)
                );
    }
}
