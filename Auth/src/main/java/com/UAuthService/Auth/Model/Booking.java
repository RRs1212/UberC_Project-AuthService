package com.UAuthService.Auth.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking extends BaseModel{
    @Enumerated(value = EnumType.STRING)
    private  Booking_Status bookingStatus;


    @Temporal(value = TemporalType.TIMESTAMP)
    private Date start;


    @Temporal(value = TemporalType.TIMESTAMP)
    private Date End;

    private long distance;



    @ManyToOne (fetch = FetchType.LAZY)
    private Passenger passenger;

    @ManyToOne (fetch = FetchType.LAZY)
    private Driver driver;
}
