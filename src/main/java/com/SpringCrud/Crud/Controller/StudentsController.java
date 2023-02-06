package com.SpringCrud.Crud.Controller;

import com.SpringCrud.Crud.Domain.Student;
import com.SpringCrud.Crud.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentsController {
    @Autowired
    private StudentRepository repo;

    public void StudentController() {
    }

    @GetMapping({"/students"})
    public String listStudents(Model model) {
        List<Student> listStudents = this.repo.findAll();
        model.addAttribute("listStudents", listStudents);
        return "students";
    }

    @GetMapping({"/students/new"})
    public String showNewStudent(Model model) {
        model.addAttribute("student", new Student());
        return "st_new";
    }

    @PostMapping({"/students/save"})
    public String saveStudent(Student student) {
        this.repo.save(student);
        return "redirect:/students";
    }

    @GetMapping({"students/edit/{reg_no}"})
    public String showEditStudent(@PathVariable(name = "reg_no") Long reg_no, Model model) {
        Student student = (Student)this.repo.findById(Math.toIntExact(reg_no)).get();
        model.addAttribute("student", student);
        return "st_new";
    }

    @GetMapping({"students/delete/{reg_no}"})
    public String deleteStudent(@PathVariable(name = "id") Long reg_no, Model model) {
        this.repo.deleteById(Math.toIntExact(reg_no));
        return "redirect:/students";
    }

}
