package com.bupt.zhidian.controller;

import com.bupt.zhidian.Service.VLService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "自选股票")
@RestController
@RequestMapping(value = "/select", method = RequestMethod.GET)
public class VLController {
    @Autowired
    VLService vlService;

    @ApiOperation("获取当前股票的估值 1 600000")
    @RequestMapping(value = "/getVL/{market}/{code}")
    public String points(@PathVariable("market")int market, @PathVariable("code")String code) throws Exception {
        return vlService.getPage(market, code);
    }
}
