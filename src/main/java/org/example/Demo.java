package org.example;

import com.microsoft.playwright.*;

import java.nio.file.*;

import static java.nio.file.Path.*;
import com.microsoft.playwright.options.*;

import javax.naming.Context.*;
import javax.swing.text.Element;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static java.util.Arrays.fill;

import java.util.*;




public class Demo {

        public static void main(String[] args) {
//            Playwright playwright = Playwright.create();
            try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch((new BrowserType.LaunchOptions()).setHeadless(false));
            Page page = browser.newPage();
//            page.navigate("https://www.google.com/");
                //Hit URL
            page.navigate ("https://www.lufthansa.com/in/en/homepage");
//                Context.tracing().start(new Tracing.StartOptions()
//                        .setScreenshots (true)
//                        .setSnapshots (true));
                //    public static void main(String[] args){
//
//    Playwright playwright = Playwright.create();
//
//        BrowserType.LaunchOptions lp = new BrowserType.LaunchOptions ();
//        lp.setChannel("chrome");
//        lp.setHeadless(false);
////    Browser browser = playwright.chromium().launch ();
////     Browser browser = playwright.webkit().launch (new BrowserType.LaunchOptions().setHeadless(false));
//    Browser browser = playwright.chromium().launch(lp);
//        Page page  = browser.newPage();
//    page.navigate ("https://www.lufthansa.com/in/en/homepage");
//
//    String title = page.title ();
//    System.out.println("page title is : "+ title);
//
//    String url = page.url ();
//    System.out.println ("url is : " + url);
//
//    browser.close();
//    playwright.close ();
//
//
//


//                page.pause();
//            page.waitForTimeout(3000.0);
            //System.out.println(page.title());
//            page.type("//textarea[@name='q']", "https://www.lufthansa.com/in/en/homepage");
//            page.click("(//div[@class='wM6W7d'])[2]");
            //page.click("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]");
                //click agree button
            page.click("(//button[@class='button-primary'])[2]");
            //page.screenshot((new Page.ScreenshotOptions()).setPath(Paths.get("example.png")));
            page.waitForTimeout (3000);
                //page.locator('#item-to-be-dragged').hover();
//                page.mouse.down();
//                ElementHandle element = page.locator("(//span[@class='overlay-header-text display-alignment'])[1]").first();
                System.out.println (1);

                //ElementHandle element = (ElementHandle) page.locator ("(//span[@class='overlay-header-text display-alignment'])[1]");



                System.out.println (2);
                page.waitForTimeout (3000);
                System.out.println (3);

                // Scroll the element into view.
//                Element element.scrollIntoViewIfNeeded ();
                System.out.println (4);
//
                page.click("//div[@class='input mw-100 flma-origin-and-destination-input-mb mb-0 has-value']");
                page.locator ("(//div[@class='icons-container'])[1]").click ();
                page.waitForTimeout (3000);
                System.out.println (5);
                page.evaluate("window.scrollBy(0, window.innerHeight)");
                page.waitForTimeout(3000);
                page.evaluate("window.scrollBy(0, -window.innerHeight)");


//            public class Example {
//                public static void main(String[] args) {
//                    try (Playwright playwright = Playwright.create()) {
//                        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
//                                .setHeadless(false));
                        //BrowserContext context = browser.newContext();
                        //page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Agree").setExact(true)).click();
                        //page.locator(".input-icon > .icon").first().click();
                //page.getByText("Round tripRound tripEconomy, 1 traveller").click();
                //page.locator ("//input[@name='flightQuery.flightSegments[0].originCode']").click ();

//                page.locator(".input-icon > .icon").first().click();
                page.getByPlaceholder("From").fill("London");

                //page.locator ("//div[@class='input mw-100 flma-origin-and-destination-input-mb mb-0 show-feedback is-touched has-value']").click ();
                      page.waitForTimeout (3000);
                        //page.getByPlaceholder("From").press("Enter");
                page.locator ("//input[@name='flightQuery.flightSegments[0].destinationCode']").click ();
                page.waitForTimeout (3000);
                page.getByPlaceholder("To").fill("Frankfurt");
                page.waitForTimeout (3000);
////                        page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^To$"))).nth(1).click();
////                        page.getByPlaceholder("To").click();
////                        page.getByPlaceholder("Departure - return").click();
//                page.locator("div:nth-child(3) > .input > .input-wrapper > .icons-container").first().click();
//                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search flights")).click();
//                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" My Bookings ")).click();
//                Context.tracing().stop(new Tracing.StartOptions ()
//                        .setName(Paths.get("trace.zip")));

                page.close ();
                browser.close();
            playwright.close ();
                    }
                }
            }

            //page.click("(//div[@class='icons-container'])[1]");
            //page.waitForTimeout (3000);
//            page.close ();
//            browser.close();
//            playwright.close ();
//        }
//    }
//}
