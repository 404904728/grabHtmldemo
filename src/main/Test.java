package main;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Test {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://www.cdqzsy.com").userAgent("Mozilla/5.0 (Windows NT 6.1; rv:22.0) Gecko/20100101 Firefox/22.0").timeout(50000).get();
		//System.out.println(doc.html());
		System.out.println(doc.select("#Module_22 .template_box_1").html()); 
		//System.out.println(doc.getElementById("Module_22").getElementsByClass("template_box_1").html()); 
		
		
		Document doc2 = Jsoup.connect("http://www.baidu.com").userAgent("Mozilla/5.0 (Windows NT 6.1; rv:22.0) Gecko/20100101 Firefox/22.0").timeout(50000).get();	
		System.out.println(doc2.select("#conent#m#nv").html());
	}
		
}
