package com.SpringCrud.Crud.Controller;


import com.SpringCrud.Crud.Domain.Mark;
import com.SpringCrud.Crud.Domain.Student;
import com.SpringCrud.Crud.repository.MarkRepository;
import com.SpringCrud.Crud.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class MarksController {
    @Autowired
    private MarkRepository markRepo;
    @Autowired
    private StudentRepository studentRepo;

    public void MarkController() {
    }

    @GetMapping({"/marks/new"})
    public String showNewMark(Model model) {
        List<Student> listStudents = this.studentRepo.findAll();
        model.addAttribute("mark", new Mark());
        model.addAttribute("listStudents", listStudents);
        return "mrk_new";
    }

    @PostMapping({"/marks/save"})
    public String saveMark(Mark mark) {
        this.markRepo.save(mark);
        return "redirect:/marks";
    }

    @GetMapping({"/marks"})
    public String listMarks(Model model) {
        List<Mark> listMarks = this.markRepo.findAll();
        model.addAttribute("listMarks", listMarks);
        return "marks";
    }

    @GetMapping({"marks/edit/{id}"})
    public String showEditMark(@PathVariable(name = "id") int id, Model model) {
        Mark mark = (Mark)this.markRepo.findById(id).get();
        model.addAttribute("mark", mark);
        List<Student> listStudents = this.studentRepo.findAll();
        model.addAttribute("listStudents", listStudents);
        return "mrk_new";
    }

    @GetMapping({"marks/delete/{id}"})
    public String deleteMark(@PathVariable(name = "id") int id, Model model) {
        this.markRepo.deleteById(id);
        return "redirect:/marks";
    }
}


