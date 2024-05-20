package com.UAuthService.Auth.Dto;

import com.UAuthService.Auth.Model.Passenger;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {

    private String id;

    private String email;

    private String name;

    private String password;

    private String phonenumber;

    private Date createdAt;

    public static PassengerDto from (Passenger p){

        return PassengerDto.builder()
                .id(p.getId().toString())
                .email(p.getEmail())
                .name(p.getName())
                .phonenumber(p.getPhoneNumber())
                .password(p.getPassword())
                .createdAt(p.getCreatedAt()).build();

    }






}
