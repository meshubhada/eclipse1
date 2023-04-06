package com.jiosavan.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactory_jiosavan {

		WebDriver driver;
		
		
		//search by input-search
		@FindBy(className="rbt-input-main")
		WebElement srch;
		
		
		//close banner
		@FindBy(className="c-banner__close")
		WebElement bannerc;
		
		//select podcasts
		@FindBy(linkText="Podcasts")
		WebElement pod;
		
		//select top-playlists option [Top Playlists]
		@FindBy(linkText="Top Playlists")
		WebElement sp;
		
		//play song Tu Jhoothi Main Makkaar
		@FindBy(linkText="Tu Jhoothi Main Makkaar")
		WebElement song;
			
		public void input_search(String itxt)
		{
			srch.sendKeys(itxt);
			srch.click();
			
			
			
		}
		
		public void close_banner()
		{
			bannerc.click();
		}
		
		public void select_podcast()
		{
			pod.click();
		}
		
		public void select_top_playlists()
		{
			sp.click();
		}
		
		public void play_song()
		{
			song.click();
		}
	}

