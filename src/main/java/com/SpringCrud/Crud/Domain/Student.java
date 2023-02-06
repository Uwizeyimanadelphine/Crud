package com.SpringCrud.Crud.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "student"
)
public class Student {
    @Id
    @Column(
            name = "reg_no"
    )
    private Long reg_no;
    private String name;
    @Column(
            name = "password"
    )
    private String password;
    @Column(
            name = "username"
    )
    private String username;

    public Student() {
    }

    public Student(Long reg_no, String name) {
        this.reg_no = reg_no;
        this.name = name;
    }

    public Long getReg_no() {
        return this.reg_no;
    }

    public void setReg_no(Long reg_no) {
        this.reg_no = reg_no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Student)) {
            return false;
        } else {
            Student other = (Student)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$reg_no = this.getReg_no();
                    Object other$reg_no = other.getReg_no();
                    if (this$reg_no == null) {
                        if (other$reg_no == null) {
                            break label59;
                        }
                    } else if (this$reg_no.equals(other$reg_no)) {
                        break label59;
                    }

                    return false;
                }

                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                Object this$password = this.getPassword();
                Object other$password = other.getPassword();
                if (this$password == null) {
                    if (other$password != null) {
                        return false;
                    }
                } else if (!this$password.equals(other$password)) {
                    return false;
                }

                Object this$username = this.getUsername();
                Object other$username = other.getUsername();
                if (this$username == null) {
                    if (other$username != null) {
                        return false;
                    }
                } else if (!this$username.equals(other$username)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Student;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $reg_no = this.getReg_no();
        result = result * 59 + ($reg_no == null ? 43 : $reg_no.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        Object $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getReg_no();
        return "Student(reg_no=" + var10000 + ", name=" + this.getName() + ", password=" + this.getPassword() + ", username=" + this.getUsername() + ")";
    }

}
