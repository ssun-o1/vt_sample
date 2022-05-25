package com.sunsc.webflux.controller;

import com.sunsc.webflux.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, WebFlux !";
    }

    @GetMapping("/mono")
    public Mono<User> monoUser() {
        User user = new User();
        user.setId("1234567890");
        user.setName("张三");
        user.setNameEn("zhangsan");
        return Mono.just(user);
    }

    @GetMapping("/flux")
    public Flux<User> fluxList(){
//        List<String> list = new ArrayList<>() {{
//            add("1");
//            add("2");
//            add("3");
//            add("4");
//        }};
        User user = new User();
        user.setId("1234567890");
        user.setName("张三");
        user.setNameEn("zhangsan");
        return Flux.just(user);
    }
}
