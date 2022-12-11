package com.bupt.zhidian.service;


import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;
import io.swagger.models.auth.In;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FinancialServiceImpl implements FinancialService {
    @Override
    public String getZcfzb(String market, String code) throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.FIREFOX_78);
        Page page1 = webClient.getPage("https://xueqiu.com/people");
        String url = "https://stock.xueqiu.com/v5/stock/finance/cn/balance.json?symbol=" + market + code
                + "&type=all&is_detail=true&count=5&timestamp=";
        Page page = webClient.getPage(url);
        WebResponse response = page.getWebResponse();
        String jsonString = response.getContentAsString();
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("list");

        JSONObject bigObject = new JSONObject();
        JSONArray data = new JSONArray();


        return null;
    }
}
