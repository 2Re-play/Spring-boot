package me.jaehyun.springinit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    //resources/application.properties에 있는 값 가져오기 (우선순위 하)
//    @Value("${jaehyun.fullName}")
//    private String name;
//
//    @Value("${jaehyun.age}")
//    private int age;

    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    // 프로퍼티 설정 클래스를 빈으로 등록 후 DI
    @Autowired
    JaehyunProperties jaehyunProperties;

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============");
        System.out.println(jaehyunProperties.getName());
        System.out.println(jaehyunProperties.getAge());
        System.out.println(jaehyunProperties.getSessionTimeout());
        System.out.println("==============");
        System.out.println("==============");
        System.out.println(hello);
        System.out.println("==============");
        logger.debug("******************");
        logger.debug(hello);
        logger.debug(jaehyunProperties.getFullName());
        logger.debug(jaehyunProperties.getName());
    }
}
