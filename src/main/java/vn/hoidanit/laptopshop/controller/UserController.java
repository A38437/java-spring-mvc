package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.hoidanit.laptopshop.HelloController;
import vn.hoidanit.laptopshop.service.UserService;

// @Controller
// public class UserController {
//     @RequestMapping("/")
//     public String getHomePage() {
//         return "hello form controller";
//     }
// }

@RestController
public class UserController {

    private final HelloController helloController;

    private UserService userService;

    public UserController(UserService userService, HelloController helloController) {
        this.userService = userService;
        this.helloController = helloController;
    }

    @GetMapping("")
    public String getHomePage() {
        return this.userService.handleHello();
    }
}
