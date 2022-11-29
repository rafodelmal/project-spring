package org.fundacionview.projectspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping(value = "/")
    public String getIndex(){
        return "Hello World";
    }
}
