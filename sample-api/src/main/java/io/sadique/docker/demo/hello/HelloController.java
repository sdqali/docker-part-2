package io.sadique.docker.demo.hello;

import java.util.Collections;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/hello",
  produces = "application/json",
  consumes = "application/json")
public class HelloController {
  static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

  @GetMapping("")
  public Map<String, String> index(@RequestParam("name") String name) {
    LOGGER
      .info("Producing message for {}", name);
    return Collections
      .singletonMap("message", String.format("hello, %s!", name));
  }
}
