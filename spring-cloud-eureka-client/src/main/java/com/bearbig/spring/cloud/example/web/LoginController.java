package com.bearbig.spring.cloud.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.cloud.example.web 2017/1/27 10:42 xiongyu $
 */
@RestController
public class LoginController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam String id){

        return restTemplate.getForEntity("http://USER-SERVICE/findUserById?id=" + id, String.class).getBody();
    }
}
