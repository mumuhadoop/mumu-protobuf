package com.lovecws.mumu.protobuf.decode;

import org.junit.Test;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: TODO
 * @date 2017-10-20 10:53
 */
public class ProtobufDecodeTest {

    private ProtobufDecode protobufDecode = new ProtobufDecode();

    @Test
    public void decode() {
        Object decode = protobufDecode.decode();
        System.out.println(decode);
    }

    @Test
    public void protobuf2JSON() {
        Object decode = protobufDecode.protobuf2JSON();
        System.out.println(decode);
    }
}
