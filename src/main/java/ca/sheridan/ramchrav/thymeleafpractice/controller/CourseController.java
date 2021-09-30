package ca.sheridan.ramchrav.thymeleafpractice.controller;

import ca.sheridan.ramchrav.thymeleafpractice.beans.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class CourseController {
    List<Course> cList = new CopyOnWriteArrayList<Course>();
    @GetMapping("/")
    public String getIndex(Model model){
        return "index";
    }

    @PostMapping("/addCourse")
    public String addCourse(@RequestParam Long id, @RequestParam String prefix, @RequestParam String code,
                            @RequestParam String name, Model model){
        Course course = new Course(id, prefix, code, name);
        cList.add(course);
        model.addAttribute("cList", cList);
        return "index";
    }
}
