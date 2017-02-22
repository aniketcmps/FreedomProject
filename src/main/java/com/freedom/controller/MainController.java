package com.freedom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Main controller
 */

@RestController
public class MainController {

  @RequestMapping("/rest/")
  public String index() {
    return "Freedom RESTful API Project";
  }

}
