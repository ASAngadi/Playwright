package org.example;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

public class Demo3 {

        public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
                BrowserContext context = browser.newContext();
                Page page=browser.newPage();
                page.navigate("https://www.lufthansa.com/in/en/homepage");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Agree").setExact(true)).click();
                page.waitForTimeout(3000);
                page.getByPlaceholder("From").click();
                page.locator(".input-icon > .icon").first().click();
                page.evaluate("window.scrollBy(0, window.innerHeight)");
                page.waitForTimeout(3000);
                page.evaluate("window.scrollBy(0, -window.innerHeight)");
                page.waitForTimeout(3000);
                //page.getByPlaceholder("From").fill("London");
                page.fill("//input[@placeholder='From']","London, Canada");
                page.waitForTimeout(3000);
                page.getByPlaceholder("From").press("Tab");
                page.waitForTimeout(3000);
                page.getByPlaceholder("To").click();
                page.waitForTimeout(3000);
                page.fill("//input[@placeholder='To']", "Frankfurt/Main International");
                page.waitForTimeout(3000);
                page.locator("div:nth-child(3) > .input > .input-wrapper > .icons-container").first().click();
                page.waitForTimeout(3000);
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search flights")).click();
                page.waitForTimeout(3000);
//                page.pause();
//                page.locator("(//div[@class='calendar-day-item'])[150]").click();
                page.getByLabel("Choose Monday, 20 November 2023 as your check-in date. It's available.").click();
                page.waitForTimeout(3000);
                page.getByLabel("Choose Thursday, 30 November 2023 as your check-out date. It's available.").click();
                page.waitForTimeout(3000);
                page.locator("//button[@class='btn btn-primary calendar-footer-continue-button']").click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search flights")).click();
                page.waitForTimeout(30000);
                page.close();
                browser.close();
                playwright.close();
            }
        }
}
