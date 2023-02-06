package com.SpringCrud.Crud.Service;
import com.SpringCrud.Crud.Domain.LoginForm;
import com.SpringCrud.Crud.Domain.Student;
import com.SpringCrud.Crud.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LoginService {
    @Autowired
    private LoginRepository repo;

    public LoginService() {
    }

    public LoginForm login(String username, String password) {
        LoginForm login = this.repo.findByUsernameAndPassword(username, password);
        return login;
    }

}
