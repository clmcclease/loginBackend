package dev.mcclease.loginbackend.registration.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {
    private final ConfirmationTokenRepository ConfirmationTokenRepository;

    public void saveConfirmationToken(ConfirmationToken confirmationToken){
        ConfirmationTokenRepository.save(confirmationToken);
    }
}
