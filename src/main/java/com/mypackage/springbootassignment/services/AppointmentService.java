package com.mypackage.springbootassignment.services;

import com.mypackage.springbootassignment.models.Appointment;
import com.mypackage.springbootassignment.models.Course;
import com.mypackage.springbootassignment.models.Doctor;
import com.mypackage.springbootassignment.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository  appointmentRepository;


    public List<Appointment> getAppointments() {
        return appointmentRepository.getAppointments();

    }


    public List<Doctor> getDoctors() {
        return appointmentRepository.getDoctors();

    }

    public List<Course> getCourses() {
        return appointmentRepository.getCourses();
    }

}
