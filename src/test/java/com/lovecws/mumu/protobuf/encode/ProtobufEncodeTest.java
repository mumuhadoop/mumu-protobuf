package com.lovecws.mumu.protobuf.encode;

import org.junit.Test;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: TODO
 * @date 2017-10-20 10:53
 */
public class ProtobufEncodeTest {

    private ProtobufEncode protobufEncode = new ProtobufEncode();

    @Test
    public void encode() {
        byte[] encode = protobufEncode.encode();
        System.out.println(encode);
    }
}
