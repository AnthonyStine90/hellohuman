package com.anthony.hellohuman;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")

public class MainController<Int> {

  @RequestMapping("")
  public String index(@RequestParam(value = "name", required = false, defaultValue = "human") String searchQuery, @RequestParam(value = "last_name", required = false, defaultValue = "") String searchLast) {
  
    return "Hello " + searchQuery + " " + searchLast;
  }

}

// , @RequestParam(value = "times", required = false, defaultValue="") String searchMult