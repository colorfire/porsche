package io.colorfire.spider.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author colorfire on 17/3/28
 */
@Controller
public class IndexController {

  @RequestMapping("/")
  public String home() {
    return "index";
  }

}
