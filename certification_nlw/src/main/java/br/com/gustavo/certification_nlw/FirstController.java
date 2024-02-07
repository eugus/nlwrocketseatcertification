package br.com.gustavo.certification_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class FirstController {

    @GetMapping
    public String ola(){
        return "ola";
    }
    
}
