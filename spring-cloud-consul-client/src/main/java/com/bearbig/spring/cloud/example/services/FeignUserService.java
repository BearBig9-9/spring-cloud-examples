package com.bearbig.spring.cloud.example.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.cloud.example.services 2017/1/28 06:14 xiongyu $
 */
// 指定需要绑定的服务端的serviceName, 如果服务端的application.properties中未指定serviceName,默认使用服务端的spring.application.name作为serviceName
@FeignClient("Consul-Server-1")
public interface FeignUserService {

    /**
     * 此接口的定义需要跟服务端的保持一致，包括：RequestMapping, 请求参数
     * 方法名可以不同
     * @param id
     * @return
     */
    @RequestMapping(value = "/findUserById", method = RequestMethod.GET)
    String getUserNameById(@RequestParam(value = "id") String id);
}
