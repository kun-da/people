package org.example.people.controller;


import org.example.people.pojo.User;
import org.example.people.service.UserService;
import org.example.people.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

//    访问登录页面
    @GetMapping("/login")
    public String showLoginForm() {
        // 在这里返回登录页面的视图名称
        return "login";
    }

    @GetMapping("/pass")
    public String showPassForm() {
        return "pass";
    }

    @GetMapping("/end")
    public String showEndForm() {
        return "end";
    }

//    表单提交，比对数据库中的密码
    @PostMapping("/login")
    public String loginSubmit(@RequestParam String username, @RequestParam String password) {
        //打印账号密码
        System.out.println("表单中的信息-----------------");
        System.out.println("username = " + username);
        System.out.println("password = " + password);

//         根据用户名从数据库中获取用户信息
        User user = userService.getByUsername(username);
//        打印
        if (user != null){
            System.out.println("数据库中的信息----------------");
            System.out.println("username = " + user.getUsername());
            System.out.println("password = " + user.getPassword());
        }
        else {
            System.out.println("用户名有误");
        }

        // 验证用户是否存在以及密码是否匹配
        if (user != null && user.getPassword().equals(password)) {
            // 登录成功，重定向到主页，并带上成功登录的提示信息
            return "redirect:/home?success";
        } else {
            // 登录失败，重定向回登录页面并显示错误消息
            return "redirect:/login?error";
        }
    }

//    跳过登录
    @GetMapping("/home")
    public String showHomePage() {
        // 返回主页的视图名称
        return "home";
    }
    @PostMapping("/changePassword")
    public String changePassword(@RequestParam String username, @RequestParam String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        userService.updatePasswordByUsername(user);

        return "login";
    }
}

