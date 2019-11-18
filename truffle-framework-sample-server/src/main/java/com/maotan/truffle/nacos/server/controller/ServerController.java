package com.maotan.truffle.nacos.server.controller;

import com.maotan.framework.autoconfigure.web.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "nacos server控制器")
@RestController
@RequestMapping("")
@Validated
@Slf4j
public class ServerController {

    @RequestMapping(value = "/server/test", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "server", notes = "接口测试", httpMethod = "POST", response = BaseResult.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BaseResult<String> serverTest() {
        return BaseResult.success("12345, 上山打老虎");
    }

}
