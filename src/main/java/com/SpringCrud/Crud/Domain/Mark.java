package com.SpringCrud.Crud.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import javax.persistence.Entity;

@Entity
@Table(
        name = "mark"
)
public class Mark {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id"
    )
    private int id;
    @Column(
            name = "mark"
    )
    private int mrk;
    @Column(
            name = "CourseCode"
    )
    private String code;
    @ManyToOne
    @JoinColumn(
            name = "Studentid"
    )
    private Student student;

    public Mark() {
    }

    public Mark(int mrk) {
        this.mrk = mrk;
    }

    public Mark(String code) {
        this.code = code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMrk(int mrk) {
        this.mrk = mrk;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return this.id;
    }

    public int getMrk() {
        return this.mrk;
    }

    public String getCode() {
        return this.code;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Mark)) {
            return false;
        } else {
            Mark other = (Mark)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getId() != other.getId()) {
                return false;
            } else if (this.getMrk() != other.getMrk()) {
                return false;
            } else {
                label40: {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label40;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label40;
                    }

                    return false;
                }

                Object this$student = this.getStudent();
                Object other$student = other.getStudent();
                if (this$student == null) {
                    if (other$student != null) {
                        return false;
                    }
                } else if (!this$student.equals(other$student)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Mark;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getMrk();
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $student = this.getStudent();
        result = result * 59 + ($student == null ? 43 : $student.hashCode());
        return result;
    }

    public String toString() {
        int var10000 = this.getId();
        return "Mark(id=" + var10000 + ", mrk=" + this.getMrk() + ", code=" + this.getCode() + ", student=" + this.getStudent() + ")";
    }
}
