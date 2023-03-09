package org.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSlider extends DriverSetup{


        @Test
    public void testSlider(){
            driver.navigate().to("https://demoqa.com/slider");
            WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
            Assert.assertTrue(slider.isDisplayed());
            String getValueSlider = driver.findElement(By.id("sliderValue")).getAttribute("value");

            Actions moveSlider = new Actions(driver);
            Action action = moveSlider.dragAndDropBy(slider, 3, 0).build();
            //       Assert.assertEquals(getValueSlider, "50", "Wrong Value Slider");
            Action action2 = moveSlider.dragAndDropBy(slider, 130, 0).build();
            Action action3 = moveSlider.dragAndDropBy(slider, 260, 0).build();

            action.perform();
            action2.perform();
            action3.perform();
 //     Assert.assertEquals(getValueSlider, "100", "Wrong Value Slider");
        }



}
