package com.bupt.zhidian;

import com.bupt.zhidian.Service.VLService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VLTest {
    @Autowired
    VLService vlService;
    @Test
    public void contextLoads() throws Exception {
        String fuck = vlService.getPage(1, "600000");
        System.out.println(fuck);
    }
}
