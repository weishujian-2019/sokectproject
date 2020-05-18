package org.azhell.nettyLearn.web.controller.common;

import org.azhell.nettyLearn.util.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/redis")
public class RedisController {

    @Resource
    private RedisUtil redisUtil;

    @ResponseBody
    @RequestMapping(value = "/setRedis",method = RequestMethod.POST)
    public boolean setRedis(String id, String date){
        return redisUtil.set(id,date);
    }
    @ResponseBody
    @RequestMapping(value = "/getRedis",method = RequestMethod.POST)
    public String getRedis(String did){

      return redisUtil.get(did).toString();
    }
}
