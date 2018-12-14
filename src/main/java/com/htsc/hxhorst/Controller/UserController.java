package com.htsc.hxhorst.Controller;


import com.htsc.hxhorst.model.User;
import com.htsc.hxhorst.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "sys/user")
public class UserController {

      private Logger logger= LoggerFactory.getLogger(UserController.class);

      @Autowired
      private UserService userService;

      @GetMapping(value = "")
      public List<User> findList(){
            logger.info("查询用户开始");
         return userService.findList();
      }
}
