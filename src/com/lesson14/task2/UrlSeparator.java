package com.lesson14.task2;

public class UrlSeparator {

    public static String getUrl (String str)  {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (sb.length() > 7 && sb.substring(0,7).contentEquals("http://")) {
            sb.delete(0,7);
        }
        if (sb.length() >4 && sb.substring(0,4).contentEquals("www.")) {
            sb.delete(0,4);
        }
        if (str.contains("/")){
            sb.delete(sb.indexOf("/"),sb.length());
        }
        return sb.toString();
    }
}
