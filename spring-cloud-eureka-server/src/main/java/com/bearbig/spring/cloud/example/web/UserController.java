package com.bearbig.spring.cloud.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.cloud.example.web 2017/1/27 10:16 xiongyu $
 */
@RestController
public class UserController {

    private static Map<String, String> users = new HashMap<>();

    static {
        users.put("1", "张三");
        users.put("2", "李思");
        users.put("3", "万物");
    }

    @RequestMapping(value = "/findUserById", method = RequestMethod.GET)
    public String getUserName(@RequestParam String id){
        return users.get(id);
    }

}
