package com.excilys.cdb.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.excilys.cdb.dto.ComputerPage;
import com.excilys.cdb.services.ComputerService;

@Controller
public class DashboardController {

  @Autowired
  private ComputerService computerService;

  @GetMapping("/dashboard")
  public ModelAndView getDashboard(
      @RequestParam(name = "limit", required = false) String limitStr,
      @RequestParam(required = false) String nameToFind,
      @RequestParam(name = "offset", required = false) String offsetStr) {
    ModelAndView modelAndView = new ModelAndView();


    ComputerPage computerPage;

    // First call of this method
    if (StringUtils.isEmpty(limitStr)) {
      computerPage = computerService.getDefaultComputerPage();
    } else {

      nameToFind = Objects.nonNull(nameToFind) ? nameToFind : "";

      modelAndView.addObject("nameToFind", nameToFind);
      int limit = Integer.parseInt(limitStr);
      int offset = Integer.parseInt(offsetStr);
      computerPage = computerService.getComputerPage(nameToFind, limit, offset);

    }

    modelAndView.addObject("page", computerPage);


    modelAndView.setViewName("dashboard");
    return modelAndView;
  }

  @GetMapping("cousin")
  public ModelAndView getCousin() {
    ModelAndView modelAndView = new ModelAndView();
    List<Integer> list = Arrays.asList(1, 2, 3);

    modelAndView.addObject("list", list);
    modelAndView.setViewName("cousin");
    return modelAndView;
  }
}
