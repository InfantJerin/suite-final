package com.crm.registration;

import com.crm.appuser.AppUser;
import com.crm.appuser.AppUserRole;
import com.crm.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RegistrationService {
    /*
    * Register a user
    * confirm the existing token
    * */
    private AppUserService appUserService;

    public Boolean confirmToken(String token){
        //Confirm the token in token Table
        return true;
    }

    public String register(RegistrationRequest request) {
        String token = appUserService.createAppUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );

        return token;
    }

}
