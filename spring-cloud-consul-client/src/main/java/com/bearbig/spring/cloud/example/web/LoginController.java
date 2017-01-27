package com.bearbig.spring.cloud.example.web;

import com.bearbig.spring.cloud.example.services.FeignUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.cloud.example.web 2017/1/27 16:31 xiongyu $
 */
@RestController
public class LoginController {

    @Autowired
    private FeignUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam String id){
        return userService.getUserNameById(id);
    }
}
