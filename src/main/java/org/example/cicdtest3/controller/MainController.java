package org.example.cicdtest3.controller;

import lombok.RequiredArgsConstructor;
import org.example.cicdtest3.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
  private final UserRepository userRepository;
  @GetMapping("/")
  public String main() {
    return "This is container 기반 CICD-----update";
  }
}