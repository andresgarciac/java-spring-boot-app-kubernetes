package co.com.k8stutorial.jsbk.controllers.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class BasicController {
    @GetMapping("/id")
    public ResponseEntity<String> getMovie(@RequestParam(name = "id") String id) {
        return ResponseEntity.ok().body("recived id: " + id);
    }
}
