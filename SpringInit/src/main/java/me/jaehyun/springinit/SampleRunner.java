package me.jaehyun.springinit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    //resources/application.properties에 있는 값 가져오기 (우선순위 하)
    @Value("${jaehyun.fullName}")
    private String name;

    @Value("${jaehyun.age}")
    private int age;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============");
        System.out.println(name);
        System.out.println(age);
        System.out.println("==============");
    }
}
