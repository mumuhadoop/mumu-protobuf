package com.lovecws.mumu.protobuf.encode;

import com.lovecws.mumu.protobuf.entity.ChatRespBody;
import com.lovecws.mumu.protobuf.entity.ChatType;

import static com.lovecws.mumu.protobuf.entity.ChatRespBody.newBuilder;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: TODO
 * @date 2017-10-20 10:53
 */
public class ProtobufEncode {

    public byte[] encode() {
        ChatRespBody.Builder builder = newBuilder();
        builder.setType(ChatType.CHAT_TYPE_PRIVATE);
        builder.setText("lovecws");
        builder.setFromId(1);
        builder.setFromNick("10");
        builder.setToId(2);
        builder.setToNick("3");
        builder.setGroup("lovecws");
        builder.setTime(System.currentTimeMillis());
        ChatRespBody chatRespBody = builder.build();
        byte[] bodybyte = chatRespBody.toByteArray();
        return bodybyte;
    }
}
