package com.bupt.zhidian.controller;

import com.bupt.zhidian.service.AnalysisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;

@Api(tags = "自选股票")
@RestController
@RequestMapping(value = "/select", method = RequestMethod.GET)
public class AnalysisController {
    @Autowired
    AnalysisService analysisService;

    @ApiOperation("基本面分析/公司概况/公司简介 sh 600000")
    @RequestMapping(value = "general/1/{market}/{code}")
    public String getCompanyIntroduce(@PathVariable("market")String market, @PathVariable("code")String code) throws IOException {
        return analysisService.getCompanyCS(market, code);
    }

    @ApiOperation("基本面分析/公司概况/所属板块 SH 600000")
    @RequestMapping(value = "general/2/{market}/{code}")
    public String getSsbk(@PathVariable("market")String market, @PathVariable("code")String code) throws IOException {
        return analysisService.getSsbk(market, code);
    }


    @ApiOperation("基本面分析/公司概况/主营构成 sh 600000")
    @RequestMapping(value = "general/3/{market}/{code}")
    public String getComposition(@PathVariable("market")String market, @PathVariable("code")String code) throws IOException {
        return analysisService.getComposition(market, code);
    }

    @ApiOperation("基本面分析/公司概况/业绩趋势 sh 600000")
    @RequestMapping(value = "general/4/{market}/{code}")
    public String getAchievement(@PathVariable("market")String market, @PathVariable("code")String code) throws IOException {
        return analysisService.getAchievement(market, code);
    }

    @ApiOperation("基本面分析/公司概况/股东股本 SH 600000")
    @RequestMapping(value = "general/7/{market}/{code}")
    public String getGdgb(@PathVariable("market")String market, @PathVariable("code")String code) throws IOException {
        return analysisService.getGdgb(market, code);
    }

    @ApiOperation("基本面分析/公司概况/机构持仓 SH 600000")
    @RequestMapping(value = "general/8/{market}/{code}")
    public String getJgcc(@PathVariable("market")String market, @PathVariable("code")String code) throws IOException, ParseException {
        return analysisService.getJgcc(market, code);
    }

    @ApiOperation("基本面分析/公司概况/十大流通股东变动 SH 600000")
    @RequestMapping(value = "general/9/{market}/{code}")
    public String getSdltgd(@PathVariable("market")String market, @PathVariable("code")String code) throws IOException {
        return analysisService.getSdltgdbd(market, code);
    }

    @ApiOperation("基本面分析/公司概况/基金持仓 SH 600000")
    @RequestMapping(value = "general/10/{market}/{code}")
    public String getJjcg(@PathVariable("market")String market, @PathVariable("code")String code) throws IOException, ParseException {
        return analysisService.getQsccjj(market, code);
    }

    @ApiOperation("基本面分析/公司概况/公司高管 SH 600000")
    @RequestMapping(value = "general/11/{market}/{code}")
    public String getCEO(@PathVariable("market")String market, @PathVariable("code")String code) throws IOException {
        return analysisService.getCEO(market, code);
    }

    @ApiOperation("基本面分析/公司概况/分红送配 SH 600000")
    @RequestMapping(value = "general/12/{market}/{code}")
    public String getFhsp(@PathVariable("market")String market, @PathVariable("code")String code) throws IOException {
        return analysisService.getFhsp(market, code);
    }


}
