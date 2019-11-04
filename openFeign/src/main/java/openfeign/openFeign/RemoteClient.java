package openfeign.openFeign;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "AMS1",fallback = RemoteHystrix.class)
public interface RemoteClient {

    @GetMapping("/ams1/open")
    String openFeign();
}
