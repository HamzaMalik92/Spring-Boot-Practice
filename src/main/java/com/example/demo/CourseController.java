package com.example.demo;


import com.example.demo.Course.Course;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    private List<Course> courses;

    public CourseController() {
        System.out.println("Hm - CourseController");
        this.courses = Arrays.asList(
                new Course(1, "DSA", 2, "Ahmad"),
                new Course(2, "PL", 3, "Hamza")
        );
    }

    @RequestMapping("/courses")
    public List getAllCourses() {
        return courses;
    }
    @RequestMapping("/courses/id/{courseCode}")
    public Course getCourseById(@PathVariable long courseCode) {
        return courses.stream().filter(course->course.getCourseCode()==courseCode).findFirst().orElse(null);
    }

    @RequestMapping("/courses/name/{courseName}")
    public Course getCourseByName(@PathVariable String courseName) {
        return courses.stream().filter(course->course.getCourseName().equalsIgnoreCase(courseName)).findAny().orElse(null);
    }
    @RequestMapping("/courses/{courseName}/{courseCode}")
    public Course getCourseByNameAndId(@PathVariable String courseName, @PathVariable int courseCode) {
        return courses.stream().filter(course->course.getCourseName().equalsIgnoreCase(courseName)&&course.getCourseCode()==courseCode).findAny().orElse(null);
    }

}
