package com.sportClub.web.config;

import com.sportClub.common.constant.SystemConstant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //创建文档说明
    public ApiInfo createAI(){
        ApiInfo apiInfo=new ApiInfoBuilder().title("SportClub后端接口文档").
                description("SportClub项目的所有接口信息，可以查看对应的接口信息和对接口进行测试").
                contact(new Contact("SportClub","http://www.baidu.com","1437903686@qq.com")).build();
        return apiInfo;
    }

    //创建Swagger扫描信息
    @Bean
    public Docket createD(){
        //添加header参数配置start
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name(SystemConstant.TOKEN_HEADER).description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false);
        pars.add(tokenPar.build());
        //添加header参数配置end
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createAI())
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.sportClub.web.controller"))
                .build()
                .globalOperationParameters(pars);//配置全局参数
    }
}
