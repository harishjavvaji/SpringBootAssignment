package com.mypackage.springbootassignment.repositories;

import com.mypackage.springbootassignment.models.Appointment;
import com.mypackage.springbootassignment.models.Course;
import com.mypackage.springbootassignment.models.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AppointmentRepository {

    public List<Appointment> getAppointments() {

        List<Appointment> list = new ArrayList<Appointment>();

        list.add(new Appointment(1234, "5/9/2018", "Patel", "Cardiology"));
        list.add(new Appointment(3456, "6/9/2018", "Mahesh", "Ortho"));

        return list;
    }

    public List<Doctor> getDoctors() {

        List<Doctor> list = new ArrayList<Doctor>();

        list.add(new Doctor(123, "Patel", "Cardiology"));
        list.add(new Doctor(345, "Mahesh", "Ortho"));

        return list;

    }

    public List<Course> getCourses() {

        List<Course> list = new ArrayList<Course>();

        list.add(new Course(101, "Spring", "Spring MVC"));
        list.add(new Course(102, "Hibernate", "ORM"));

        return list;
    }
}
