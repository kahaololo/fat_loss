package ua.pp.kaha.fatloss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @GetMapping
    public String test() {
        return "Hello World";
    }
}
