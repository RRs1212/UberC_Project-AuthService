package com.UAuthService.Auth.Dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class PassengerRequestSignUpDto {


    private String email;

    private String name;

    private String password;

    private String Phone;
}
