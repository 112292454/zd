package com.bupt.zhidian.controller;

import com.bupt.zhidian.service.FinancialService;
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
public class FinancialController {
    @Autowired
    FinancialService financialService;
}
