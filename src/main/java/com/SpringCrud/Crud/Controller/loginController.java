package com.SpringCrud.Crud.Controller;

import com.SpringCrud.Crud.Domain.Student;
import com.SpringCrud.Crud.Domain.LoginForm;
import com.SpringCrud.Crud.Service.LoginService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {
    @Autowired
    private LoginService userService;

    public void LoginController() {
    }

    @GetMapping({"/"})
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("student", new Student());
        return mav;
    }

}




