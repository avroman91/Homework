package com.lesson14.task2;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

/*
2*) Есть документ со списком URL:
https://drive.google.com/open?id=1wVBKKxpTKvWwuCzqY1cVXCQZYCsdCXTl
Вывести топ 10 доменов которые встречаются чаще всего.
В документе могут встречатся пустые и недопустимые строки.
Например для URL m.youtube.com/watch?v=SHH_EMeRjGA
доменом будет m.youtube.com

Задание на 100 баллов:
сделать дз 14.2 (вывести 10 доменов которые встречаются чаще всего), но при этом файл не хранить в файловой системе а зпгружать по прямой ссылке ссылке программно:
https://dl.dropboxusercontent.com/s/21rtgfdmlp6wycx/urls.txt
*/
public class HW14Task2 {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://dl.dropboxusercontent.com/s/21rtgfdmlp6wycx/urls.txt");
        BufferedReader read = new BufferedReader(
                new InputStreamReader(url.openStream()));
        String tmp;
        List<String> urlList = new ArrayList<>();
        while ((tmp = read.readLine()) != null) {
            tmp = tmp.replaceAll("\\s+", "");
            urlList.add(UrlSeparator.getUrl(tmp).toLowerCase(Locale.ROOT));
        }
        read.close();

        Map<String, Integer> map = createMap(urlList);

        List<Helper> helpers = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            helpers.add(new Helper(entry.getKey(), entry.getValue()));
        }

        Collections.sort(helpers, new Comparator<Helper>() {
            @Override
            public int compare(Helper o1, Helper o2) {
                return Integer.compare(o2.getCount(), o1.getCount());
            }
        });

        for (int i = 0; i < 10; i++) {
            System.out.println(helpers.get(i));
        }

    }

    public static Map<String, Integer> createMap(List<String> wordList) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : wordList) {
            if (result.containsKey(word)) {
                int oldCount = result.get(word);
                oldCount++;
                result.put(word, oldCount);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }

    private static String readFromFile(String fileName) {
        try {
            File f = new File(fileName);
            return FileUtils.readFileToString(f, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
