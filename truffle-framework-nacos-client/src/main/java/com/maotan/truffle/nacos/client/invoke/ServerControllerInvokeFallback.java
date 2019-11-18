package com.maotan.truffle.nacos.client.invoke;

import com.maotan.framework.autoconfigure.web.BaseResult;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServerControllerInvokeFallback implements FallbackFactory<ServerControllerInvoke> {

    @Override
    public ServerControllerInvoke create(Throwable cause) {
        return new ServerControllerInvoke() {

            @Override
            public BaseResult<String> func() {
                return BaseResult.fail(500, "11111");
            }
        };
    }

}
