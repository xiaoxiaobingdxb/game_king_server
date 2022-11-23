package com.tencent.wxcloudrun.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Msg {
    private String ToUserName;
    private String FromUserName;
    private Long  CreateTime;
    private String MsgType;
    private String Content;
    private Long MsgId;

}
