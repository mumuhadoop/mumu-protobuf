package com.lovecws.mumu.protobuf.news;

import com.alibaba.fastjson.JSON;
import com.google.protobuf.InvalidProtocolBufferException;




import java.io.*;
import java.util.Map;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: TODO
 * @date 2017-10-20 11:13
 */
public class SinaFinanceNewsBenchmark {

    private static String CLASS_PATH = SinaFinanceNewsBenchmark.class.getResource("/").getPath();

    public void serialize() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(CLASS_PATH + "financeNews.json"))));
            File file = new File(CLASS_PATH + "financeNews.proto");
            if (!file.exists()) file.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            String readline = null;
            while ((readline = bufferedReader.readLine()) != null) {
                Map map = JSON.parseObject(readline, Map.class);
                SinaFinanceNews financeNews = SinaFinanceNews
                        .newBuilder()
                        .setHtitle(String.valueOf(map.get("htitle")))
                        .setKeywords(String.valueOf(map.get("keywords")))
                        .setDescription(String.valueOf(map.get("description")))
                        .setUrl(String.valueOf(map.get("url")))
                        .setSumary(String.valueOf(map.get("sumary")))
                        .setContent(String.valueOf(map.get("content")))
                        .setLogo(String.valueOf(map.get("logo")))
                        .setTitle(String.valueOf(map.get("title")))
                        .setPubDate(String.valueOf(map.get("pubDate")))
                        .setMediaName(String.valueOf(map.get("mediaName")))
                        .setMediaUrl(String.valueOf(map.get("mediaUrl")))
                        .setCategory(String.valueOf(map.get("category")))
                        .setType(String.valueOf(map.get("type")))
                        .build();
                byte[] byteArray = financeNews.toByteArray();
                outputStream.write(byteArray);

                deserialize(byteArray);
            }
            bufferedReader.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserialize(byte[] bs) {
        try {
            SinaFinanceNews financeNews = SinaFinanceNews.parseFrom(bs);
            System.out.println(financeNews);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SinaFinanceNewsBenchmark().serialize();
    }
}
