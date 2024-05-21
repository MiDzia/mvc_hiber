package com.midzia.hib_mvc.controller;

import com.midzia.hib_mvc.entity.Student;
import com.midzia.hib_mvc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/")
    public String showAllStudents(Model model) {
        List<Student> students = studentService.getAllStudent();
        model.addAttribute("allStudents", students);
        return "all-students";
    }

    @RequestMapping("/addNewStudent")
    public String addNewStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "student-info";
    }

    @RequestMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateStudent(@RequestParam("studentId") int id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "student-info";
    }
    @RequestMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("studentId") int id){
        studentService.deleteStudent(id);
        return "redirect:/";
    }
}
