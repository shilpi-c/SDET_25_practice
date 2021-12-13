package model3_sample;

import org.testng.annotations.Test;

public class ReadDataFromCommandLineTest {
	@Test
	public void readDataFromCmd() {
		 String url = System.getProperty("url");
		 String browser= System.getProperty("browser");
         String username = System.getProperty("username");
  
         System.out.println(url);
         
         System.out.println(browser);

         System.out.println(username);

		
	}

}
