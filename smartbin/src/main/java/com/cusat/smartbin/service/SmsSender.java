package com.cusat.smartbin.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SmsSender {

	
	public static void sendSMS (String otpStr) {
		  try {
		   
		   String apiKey = "apiKey=" + "oS7esLHlcBk-KxhJ1yWIr5Cy1wwhaLLVZpshQ633G0";
		   
		   String message = "&message=" + URLEncoder.encode("Your OTP is " + otpStr,
		     "UTF-8");
		   
		   String numbers = "&numbers=" + "8789990819";
		   
		   String apiURL = "https://api.textlocal.in/send/?" + apiKey + message + numbers;
		   
		   URL url = new URL(apiURL);
		   URLConnection connection = url.openConnection();
		   connection.setDoOutput(true);
		   
		   BufferedReader reader = new BufferedReader(new 
		     InputStreamReader(connection.getInputStream()));
		   
		   String line = "";
		   StringBuilder sb = new StringBuilder();
		   
		   while ( (line = reader.readLine()) != null) {
		    sb.append(line).append("\n");
		   }
		   
		   System.out.println(sb.toString());
		   
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		 }

	
}
