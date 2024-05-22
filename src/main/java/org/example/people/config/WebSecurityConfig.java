package org.example.people.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Filter;
//
//@Configuration
//public class SecurityConfig {
//    // 注册UserDetailsService的一个实例
//    @Bean
//    UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager users = new InMemoryUserDetailsManager();
//        users.createUser(User.withUsername("root").password("{noop}123456").roles("admin").build());
//        users.createUser(User.withUsername("cjn").password("{noop}123456").roles("user").build());
//        return users;
//    }
//
//    /**
//     * 配置WebSecurity：注册WebSecurityCustomizer的一个实例
//     * 对应：configure(WebSecurity)
//     */
//    @Bean
//    WebSecurityCustomizer webSecurityCustomizer() {
//        return new WebSecurityCustomizer() {
//            @Override
//            public void customize(WebSecurity web) {
//                web.ignoring().antMatchers("/test");
//            }
//        };
//    }
//
//         /**
//          * 配置过滤器链：注册SecurityFilterChain的一个实例
//          *     对应： configure(HttpSecurity)
//          *           对登录页面等进行配置
//          */
//             @Bean // 新式写法
//             SecurityFilterChain securityFilterChain() {
//                 List<Filter> filters = new ArrayList<>();
//                 return new DefaultSecurityFilterChain(new AntPathRequestMatcher("/**"), filters);
//             }
//
