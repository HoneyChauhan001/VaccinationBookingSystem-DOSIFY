package com.example.Dosify.model;

import com.example.Dosify.Enum.DoseNo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "appointment_no")
    String appointmentNo;//UUID
    @Column(name = "date_of_appointment")
    @CreationTimestamp
    Date dateOfAppointment;
    @Column(name = "dose_no")
    @Enumerated(EnumType.STRING)
    DoseNo doseNo;
    @ManyToOne
    @JoinColumn(name = "user")
    User user;
    @ManyToOne
    @JoinColumn(name = "doctor")
    Doctor doctor;
}
