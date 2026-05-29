package com.itbaizhan.farm_system.controller;

import com.itbaizhan.farm_common.result.BaseResult;
import com.itbaizhan.farm_system.entity.User;
import com.itbaizhan.farm_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUserById")
    public BaseResult<User> findById(@RequestParam("id") Long id){
        User user = userService.findById(id);
        return BaseResult.ok(user);
    }
}
