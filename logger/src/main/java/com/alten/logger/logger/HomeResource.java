package com.alten.logger.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

   final static Logger logger = LoggerFactory.getLogger(HomeResource.class);  //the class whos actually loggin


    @RequestMapping("/")
    public  String home(){

        /*logger.error("ERROR HAPPENED");
        logger.info("LOGGER INFO");*/

        logger.trace("Home method accessed");
        return "hello logger";
    }





}
