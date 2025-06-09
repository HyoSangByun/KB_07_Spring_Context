package org.scoula.config;

import org.scoula.beans.Parrot;
import org.scoula.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) { //매개변수로 빈 주입
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot); // Parrot 빈을 반환하는 메서드 직접 메서드 호출
        return p;
    }
}
