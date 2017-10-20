package com.lovecws.mumu.protobuf.decode;

import com.google.protobuf.InvalidProtocolBufferException;
import com.googlecode.protobuf.format.JsonFormat;
import com.lovecws.mumu.protobuf.encode.ProtobufEncode;
import com.lovecws.mumu.protobuf.entity.ChatRespBody;

import java.io.IOException;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: TODO
 * @date 2017-10-20 10:53
 */
public class ProtobufDecode {

    public Object decode() {
        byte[] encode = new ProtobufEncode().encode();
        try {
            ChatRespBody chatRespBody = ChatRespBody.parseFrom(encode);
            return chatRespBody;
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String protobuf2JSON() {
        //ChatRespBody chatRespBody = ChatRespBody.getDefaultInstance();
        ChatRespBody chatRespBody = (ChatRespBody) decode();
        JsonFormat jsonFormat = new JsonFormat();
        String asJson = jsonFormat.printToString(chatRespBody);
        return asJson;
    }

    public ChatRespBody json2Protobuf() {
        ChatRespBody.Builder builder = ChatRespBody.newBuilder();
        String asJson = "{\"name\":\"tan\"}";
        JsonFormat jsonFormat = new JsonFormat();
        try {
            jsonFormat.merge(null, builder);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
