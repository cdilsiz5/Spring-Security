package com.example.demo.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping
    public  String registration (@RequestBody RegistrationRequest registrationRequest){
        return  registrationService.register(registrationRequest);

    }
    @GetMapping(path = "confirm")
    private String confirm(@RequestParam ("token") String token){
         registrationService.confirmToken(token);
         return "confirmed";
    }

}
