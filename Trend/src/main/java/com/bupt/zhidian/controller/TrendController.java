package com.bupt.zhidian.controller;

import com.bupt.zhidian.service.TrendService;
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
public class TrendController {
    @Autowired
    TrendService trendService;

    @ApiOperation("获取走势页面的1个月部分信息，第一个参数是市场，第二个是六位股票代码 1 600000")
    @RequestMapping(value = "/trend1/{market}/{code}")
    public String trend1(@PathVariable("market")int market, @PathVariable("code")String code) throws Exception {
        return trendService.getPageOfTrend1(market, code);
    }

    @ApiOperation("获取走势页面的3个月部分信息，第一个参数是市场，第二个是六位股票代码 1 600000")
    @RequestMapping(value = "/trend3/{market}/{code}")
    public String trend3(@PathVariable("market")int market, @PathVariable("code")String code) throws Exception {
        return trendService.getPageOfTrend3(market, code);
    }

    @ApiOperation("获取日k线的压力位和支撑位，对应的value是在日k线那个点的索引 1 600000")
    @RequestMapping(value = "/getPoints/{market}/{code}")
    public String points(@PathVariable("market")int market, @PathVariable("code")String code) throws Exception {
        return trendService.getPoints(market, code);
    }
}
