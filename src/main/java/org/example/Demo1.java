package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.*;

import java.nio.file.Paths;


public class Demo1 {

    public static void main(String[] args){
                try(Playwright playwright = Playwright.create()){
                    Browser browser = playwright.chromium().launch();
                    Page page = browser.newPage();
                    page.navigate("http://playwright.dev/");

                    System.out.println (page.title());
                    page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
                }
    }


}

