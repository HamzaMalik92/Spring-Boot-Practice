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
    @RequestMapping("/courses/id/{courseId}")
    public Course getCourseById(@PathVariable long courseId) {
        for (Course course : courses) {
            if (course.getCourseCode() == courseId) {
                return course;
            }
        }
        // Return null if no course found with the given courseId
        return null;
    }

    @RequestMapping("/courses/name/{courseName}")
    public Course getCourseByName(@PathVariable String courseName) {
        for (Course course : courses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                return course;
            }
        }
        return null;
    }
    @RequestMapping("/courses/{courseName}/{courseId}")
    public Course getCourseByNameAndId(@PathVariable String courseName, @PathVariable int courseId) {
        for (Course course : courses) {
            if (course.getCourseCode() == courseId && course.getCourseName().equalsIgnoreCase(courseName)) {
                return course;
            }
        }
        return null;
    }

}
