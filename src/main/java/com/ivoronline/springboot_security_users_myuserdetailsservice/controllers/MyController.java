package com.ivoronline.springboot_security_users_myuserdetailsservice.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //==============================================================================
  // HELLO (Secured Resource)
  //==============================================================================
  @Secured("ROLE_USER")
  @RequestMapping("Hello")
   String hello() {
    return "Hello from Controller";
  }

}
