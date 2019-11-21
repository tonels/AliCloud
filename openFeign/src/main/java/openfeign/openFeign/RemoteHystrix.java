package openfeign.openFeign;

import org.springframework.stereotype.Component;

@Component
public class RemoteHystrix implements RemoteClient {

    @Override
    public String openFeign() {
        return "请求超时了";
    }
}
