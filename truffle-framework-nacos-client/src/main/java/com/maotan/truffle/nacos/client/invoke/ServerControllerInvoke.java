package com.maotan.truffle.nacos.client.invoke;
import com.maotan.framework.autoconfigure.web.BaseResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "nacos-server", fallbackFactory = ServerControllerInvokeFallback.class)
public interface ServerControllerInvoke  {
    @ApiOperation(value = "测试接口", notes = "测试接口", httpMethod = "POST",  produces =
            MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aa", value = "字符串aa", paramType = "query", required = true, dataType =
                    "String")
    })
    @RequestMapping(value = "/server/test", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    BaseResult<String> func();
}
