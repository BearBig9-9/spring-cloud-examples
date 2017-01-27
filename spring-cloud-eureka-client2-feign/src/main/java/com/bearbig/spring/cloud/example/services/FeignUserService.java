package com.bearbig.spring.cloud.example.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.cloud.example.services 2017/1/28 07:04 xiongyu $
 */
@FeignClient("user-service")
public interface FeignUserService {

    @RequestMapping(value = "/findUserById", method = RequestMethod.GET)
    String getUserNameById(@RequestParam(value = "id") String id);
}
