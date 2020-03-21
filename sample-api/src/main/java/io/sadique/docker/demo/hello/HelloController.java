package io.sadique.docker.demo.hello;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/hello",
  produces = "application/json",
  consumes = "application/json")
public class HelloController {

	@GetMapping("")
	public Map<String, String> index() {
    return Collections.singletonMap("message", "hello");
	}

}
