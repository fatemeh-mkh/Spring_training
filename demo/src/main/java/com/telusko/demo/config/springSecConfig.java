//package com.telusko.demo.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.web.client.RestTemplateBuilderConfigurer;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEnc oder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.util.DefaultUriBuilderFactory;
//
//@Configuration
//public class springSecConfig {
//
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
//                .authorizeHttpRequests((authz) -> authz
//                        .anyRequest().authenticated()
//                )
//                .httpBasic(Customizer.withDefaults());
//        return httpSecurity.build();
//    }
//
////
////    @Value("http://localhost:1234")
////    String rootUrl;
////    @Bean
////    RestTemplateBuilder restTemplateBuilder(RestTemplateBuilderConfigurer configurer){
////        assert rootUrl !=null;
////        RestTemplateBuilder builder=configurer.configure(new RestTemplateBuilder());
////        DefaultUriBuilderFactory uriBuilderFactory= new
////                DefaultUriBuilderFactory(rootUrl);
////
////        builder.basicAuthentication("me","1234");
////        return builder.uriTemplateHandler(uriBuilderFactory);
////    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        var userDetailsManager = new InMemoryUserDetailsManager();
//        userDetailsManager.createUser(User.withUsername("me")
//                .password(passwordEncoder().encode("1234"))
//                .roles("USER")
//                .build());
//        return userDetailsManager;
//    }
//
//    // تنظیم رمز عبور با استفاده از BCrypt
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//}
