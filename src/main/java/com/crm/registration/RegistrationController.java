package com.crm.registration;

import com.crm.registration.RegistrationRequest;
import com.crm.registration.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
    /*
    * TODO
    * create an AppUser
    * Create a token for the appUser
    * Confirm the token
    * */
    private final RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        System.out.println("This is to test");
        return registrationService.register(request);
    }


}
