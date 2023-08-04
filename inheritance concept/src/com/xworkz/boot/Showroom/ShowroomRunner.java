package com.xworkz.boot.Browser;

import com.xworkz.app.Browser.Browser;
import com.xworkz.app.Browser.BrowserUtil;
import com.xworkz.app.Browser.Chrome;
import com.xworkz.app.Browser.Edge;
import com.xworkz.app.Browser.FireFox;
import com.xworkz.app.Browser.Opera;

public class BrowserRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in BrowserRunner");
		System.out.println("----------------------");
		Browser browser=new Browser();
		Chrome chrome=new Chrome();
		Opera opera=new Opera();
		FireFox fireFox=new FireFox();
		Edge edge=new Edge();
		BrowserUtil.speed(browser);


		System.out.println("----------------------");
		BrowserUtil.speed(chrome);


		System.out.println("----------------------");
		BrowserUtil.speed(opera);


		System.out.println("----------------------");
		BrowserUtil.speed(fireFox);


		System.out.println("----------------------");
		BrowserUtil.speed(edge);

	}

}