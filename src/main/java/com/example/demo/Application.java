package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
              private Map<String,Object> cache=new HashMap <String,Object>()

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
           
             //HIS-301 changes
             public void loadDataToCache(){
              //logic
	}

}
