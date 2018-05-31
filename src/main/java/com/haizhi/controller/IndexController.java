package com.haizhi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author youfeng
 * @date 2018/5/31
 */
@Log4j2
@RestController
@Api(value = "首页链接")
public class IndexController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "访问首页", notes = "访问首页", httpMethod = "GET")
    public String index() {
        log.info("访问首页...");
        return "data-statistics running...";
    }
}
