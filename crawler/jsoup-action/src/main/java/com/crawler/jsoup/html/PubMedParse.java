package com.crawler.jsoup.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * @Author: Zhongxi Hu
 * @Date: 2024/09/02/11:22
 * @Description:
 */
public class PubMedParse {

    public static void main(String[] args) {
        String url = "https://pubmed.ncbi.nlm.nih.gov/";
        try {
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            Element body = doc.body();
            System.out.println(title);
            System.out.println(body);
        } catch (Exception err) {

        }
    }
}
