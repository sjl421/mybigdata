package com.dt.mig.sync.extract;

/**
 * Created by abel.chan on 16/12/23.
 */
public class SelfContentExtractor {
    public static final String ZFWB = "转发微博";

    public static String extract(String text) {
        if (text == null || ZFWB.equals(text)) return null;

        int index = text.indexOf("//@");
        String selfContent;
        if (index > 0) {
            selfContent = text.substring(0, index);
        } else {
            selfContent = text;
        }
        return selfContent;
    }

    public static void main(String[] args) {
        System.out.println("[PROGRAM] Program started.");
        System.out.println(extract("秀恩爱[二哈]//@罗晋:你美了[害羞]我哭了[笑cry][哈哈]//@唐嫣:本宝宝受到了惊吓[吃惊][吃惊][吃惊][污][污][污]你们这是要搞事情[抓狂][抓狂][抓狂][抓狂][抓狂][抓狂] http://t.cn/RI7j1Oq"));
        System.out.println(extract("http://t.cn/RI7j1Oq"));
        System.out.println("[PROGRAM] Program exited.");
    }
}
