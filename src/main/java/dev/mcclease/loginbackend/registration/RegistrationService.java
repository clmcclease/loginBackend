package dev.mcclease.loginbackend.registration;


import dev.mcclease.loginbackend.appuser.AppUser;
import dev.mcclease.loginbackend.appuser.AppUserRole;
import dev.mcclease.loginbackend.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator
                .test(request.getEmail());
        if(!isValidEmail){
            //TODO: fix this
            throw new IllegalStateException("email not valid");
        }
        return appUserService.signUpUser(new AppUser(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                AppUserRole.USER
                ));
    }
}
