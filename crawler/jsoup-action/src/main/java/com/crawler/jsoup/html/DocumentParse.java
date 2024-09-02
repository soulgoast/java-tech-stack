package com.crawler.jsoup.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @Author: Zhongxi Hu
 * @Date: 2024/09/02/10:21
 * @Description: 根据url地址获取dom文档
 */
public class DocumentParse {

    public static void main(String[] args) {
        String url = "https://www.baidu.com/";
        try {
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            System.out.println("网页标题为：" + title);
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                String linkHref = link.attr("href");
                String linkText = link.text();
                System.out.println("链接地址：" + linkHref);
                System.out.println("链接文字：" + linkText);
            }
            select(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 筛选元素
     *
     * @param doc
     */
    private static void select(Document doc) {
        Elements elements = doc.select("p");
        for (Element element : elements) {
            attr(element);
        }
    }

    /**
     * 获取属性
     */
    public static void attr(Element element) {
        Attributes attributes = element.attributes();
        for (Attribute attribute : attributes) {
            log(attribute.getValue());
        }
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

    public static void log(String msg, Object... args) {
        System.out.printf(msg, args);
    }
}
