package com.mypackage.springbootassignment.controllers;

import com.mypackage.springbootassignment.models.Appointment;
import com.mypackage.springbootassignment.models.Course;
import com.mypackage.springbootassignment.models.Doctor;
import com.mypackage.springbootassignment.repositories.AppointmentRepository;
import com.mypackage.springbootassignment.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @RequestMapping(value = "/appointments")
    public List<Appointment> getAppointments() {
        return appointmentService.getAppointments();

    }


    @RequestMapping(value = "/doctors")
    public List<Doctor> getDoctors() {
        return appointmentService.getDoctors();

    }

    @RequestMapping(value = "/courses")
    public List<Course> getCourses() {
        return appointmentService.getCourses();
    }
}
