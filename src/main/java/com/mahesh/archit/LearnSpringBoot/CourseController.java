package com.mahesh.archit.LearnSpringBoot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28min"),
                new Course(2, "Learn Azure", "in28min")
        );
    }

}
