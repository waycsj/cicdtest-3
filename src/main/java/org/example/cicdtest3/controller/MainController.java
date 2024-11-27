package org.example.cicdtest3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @GetMapping("/")
  public String main() {
    return "This is container 기반 CICD";
  }
}
//주석
