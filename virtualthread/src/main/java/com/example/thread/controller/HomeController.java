package com.example.thread.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  private final static Logger log = LoggerFactory.getLogger(HomeController.class);

  @GetMapping("/")
  public String hello(){
    log.info("Using: " + Thread.currentThread().toString());
    return Thread.currentThread().toString();
  }


}
