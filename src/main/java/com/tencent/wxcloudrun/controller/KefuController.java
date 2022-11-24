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
        logger.info("from msg: {}", msg);
        msg.setMsgType("transfer_customer_service");
        String from = msg.getFromUserName();
        String to = msg.getToUserName();
        msg.setFromUserName(to);
        msg.setToUserName(from);
        msg.setContent("change" + msg.getContent());
        logger.info("to msg: {}", msg);
        return msg;
    }
}
