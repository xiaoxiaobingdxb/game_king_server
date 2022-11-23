package com.tencent.wxcloudrun.controller;

import lombok.Data;

@Data
public class Msg {
    private String ToUserName;
    private String FromUserName;
    private Long  CreateTime;
    private String MsgType;
    private String Content;
    private Long MsgId;

}
