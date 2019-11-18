package com.maotan.truffle.nacos.client.controller;

import com.maotan.framework.autoconfigure.web.BaseResult;
import com.maotan.truffle.nacos.client.invoke.ServerControllerInvoke;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "nacos client 控制器")
@RestController
@RequestMapping("")
@Validated
@Slf4j
public class ClientController {
    @Autowired
    private ServerControllerInvoke serverControllerInvoke;

    @RequestMapping(value = "/client/test", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "client", notes = "接口测试", httpMethod = "POST", response = BaseResult.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResult<String> clientTest() {
        return serverControllerInvoke.func();
    }

}
