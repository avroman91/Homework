package com.lesson14.task2;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args)  {
        String result = readFromFile("urls.txt");
        String[] urls = result.split("\\r?\\n");
        List<String> urlList = new ArrayList<>();
        for (String tmpUrl : urls) {
            tmpUrl = tmpUrl.replaceAll("\\s+", "");
            urlList.add(UrlSeparator.getUrl(tmpUrl).toLowerCase(Locale.ROOT));
        }
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
