package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.dto.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KefuController {
    @PostMapping(value = "/kefu/transfer")
    public Msg transfer(@RequestBody Msg msg) {
        Logger logger = LoggerFactory.getLogger(KefuController.class);
        logger.info("get msg: {}", msg);
        msg.setFromUserName(msg.getToUserName());
        msg.setToUserName("oug-y5N0YNx5gREiOTO7sBciML-s");
        msg.setMsgType("transfer_customer_service");
        return msg;
    }
}
