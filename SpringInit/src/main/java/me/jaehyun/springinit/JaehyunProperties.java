package me.jaehyun.springinit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

// 프로퍼티들을 하나로 묶어서 빈으로 등록
@Component
// 해당 prefix에 해당하는 프로퍼티를 바인딩 받는다.
@ConfigurationProperties("jaehyun")
@Validated
public class JaehyunProperties {

    @NotEmpty
    private String name;

    private int age;

    private String fullName;

// @DureationUnit() 어노테이션 없이 프로퍼티값에 surfixf를 붙여주면 자동으로 convert해준다.
//    @DurationUnit(ChronoUnit.SECONDS)
    private Duration sessionTimeout = Duration.ofSeconds(30);

    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Duration sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
