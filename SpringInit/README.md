## 로깅

### 로깅 퍼사드 vs 로거
* **Commons Logging**, SLF4j 는 실제 로깅을 하는 애들이 아니고, 로거 api들을 추상화 해놓은 인터페이스
* 주로 프레임워크는 로깅 퍼사드를 사용한다.
* 로깅 퍼사드를 사용하면 장점은 로거(JUL, Log4J2, **Logback**)를 바꿔 사용가능하다는 점
* spring 프레임워큰 Commons Logging을 사용하고 있다.
* spring 5의 로거 관련 변경 사항
    * Spring-JCL
        * Commons Logging -> SLF4j or Log4j2
        * pom.xml에 exclusion 안해도 됨.