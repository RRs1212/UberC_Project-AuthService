package com.UAuthService.Auth.Service;

import com.UAuthService.Auth.Dto.PassengerDto;
import com.UAuthService.Auth.Dto.PassengerRequestSignUpDto;
import com.UAuthService.Auth.Model.Passenger;
import com.UAuthService.Auth.Repository.PassengerRepository;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {


    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final PassengerRepository passengerRepository;


    public AuthService(BCryptPasswordEncoder bCryptPasswordEncoder, PassengerRepository passengerRepository) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;

        this.passengerRepository=passengerRepository;

    }


    public PassengerDto PassengerSignup(PassengerRequestSignUpDto passengerRequestSignUpDto){

        Passenger passenger=Passenger.builder().email(passengerRequestSignUpDto.getEmail())
                .name(passengerRequestSignUpDto.getName())
                .password(bCryptPasswordEncoder.encode(passengerRequestSignUpDto.getPassword()))
                .phoneNumber(passengerRequestSignUpDto.getPhone())
                .build();

        Passenger newPassenger=passengerRepository.save(passenger);

        return PassengerDto.from(newPassenger);








    }
}
