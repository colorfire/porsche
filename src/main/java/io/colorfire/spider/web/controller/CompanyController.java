package io.colorfire.spider.web.controller;

import io.colorfire.spider.dao.CompanyInfo;
import io.colorfire.spider.dao.CompanyInfoDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author colorfire on 17/3/28
 */
@RestController
@RequestMapping("/company")
public class CompanyController {

  @RequestMapping("/list")
  public List<CompanyInfo> list() {
    CompanyInfoDao dao = new CompanyInfoDao();
    return dao.list();
  }

}
