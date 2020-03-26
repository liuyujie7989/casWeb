package com.liuyujiie.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liuyujiie.AblitUtil.CallAbilityService;
import com.liuyujiie.pojo.IndexRspBo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @program: filelistener
 * @description:
 * @author: liuyishou
 * @create: 2020-01-06 11:19
 **/
@RestController
@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
public class RSJRequestHTTPClient {
    @Resource
    private CallAbilityService callAbilityService;
    @Value("${ablit.appid}")
    private String appId;
    @Value("${ablit.appkey}")
    private String appKey;
    @Value("${ablit.url}")
    private String url;
    @RequestMapping("/do")
    public IndexRspBo invoke() throws IOException {
    /*    System.out.println(appId);
        System.out.println(appKey);
        System.out.println(url);
        JSONObject body = new JSONObject();
        body.put("value", "620123199401080512");
        JSONObject personID = callAbilityService.getPersonId(body);
        System.out.println(personID.toString());*/
/*
        //获取当年第一天
        String curruntYearFirst = DateUtil.getCurruntYearFirst();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //获取今天
        String curruntDay = simpleDateFormat.format(new Date());
        JSONObject sharedCountJson = new JSONObject();
        sharedCountJson.put("startTime", "");
        sharedCountJson.put("endTime", "");
        Map<String, String> classifyInterMap = new HashMap<>();
        Map<String, String> classifyInterCountMap = new HashMap<>();
        JSONObject shareDate =callAbilityService.getShareDate(sharedCountJson);
        System.out.println(curruntYearFirst);
        System.out.println(curruntDay);
        System.out.println(shareDate.toString());*/
        IndexRspBo indexRspBo = new IndexRspBo();
        String  redisIndexData = JSONObject.toJSONString(indexRspBo);
        indexRspBo = JSON.parseObject(redisIndexData, IndexRspBo.class);

        return indexRspBo;
    }
}

