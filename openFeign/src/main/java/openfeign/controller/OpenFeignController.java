package openfeign.controller;

import openfeign.openFeign.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/openfeign")
public class OpenFeignController {

    @Resource
    private RemoteClient remoteClient;

    @GetMapping("/feign")
    public String test() {
        return remoteClient.openFeign();
    }

}
