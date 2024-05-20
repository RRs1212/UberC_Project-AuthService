package com.UAuthService.Auth.authController;

import com.UAuthService.Auth.Dto.PassengerDto;
import com.UAuthService.Auth.Dto.PassengerRequestSignUpDto;

import com.UAuthService.Auth.Service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class authController {

    private PassengerDto passengerDto;

    private AuthService authService;

    authController(PassengerDto passengerDto,AuthService authService){
        this.passengerDto=passengerDto;
        this.authService=authService;
    }




    @PostMapping("/signup/passenger")
    public ResponseEntity<?> SignUp(@RequestBody PassengerRequestSignUpDto passengerRequestSignUpDto){
        PassengerDto passengerdto=authService.PassengerSignup(passengerRequestSignUpDto);


        return new ResponseEntity<>(passengerdto, HttpStatus.OK);




    }





}
