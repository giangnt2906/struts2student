package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentAction extends ActionSupport {
    private StudentService studentService = new StudentService();
    private Student student = new Student();
    private List<Student> students;
    private String id;

    public String createStudent() {
        return INPUT;
    }

    public String update() {
        studentService.updateStudent(student);
        return SUCCESS;
    }

    public String save() {
        studentService.insertStudent(student);
        return SUCCESS;
    }

    public String editStudent() {
        student = studentService.getStudentById(id);
        return INPUT;
    }

    public String deleteConfirm() {
        studentService.deleteStudent(id);
        return SUCCESS;
    }

    public String delete() {
        student = studentService.getStudentById(id);
        return SUCCESS;
    }

    public void validateSave() {
        if (student.getId() == null || student.getId().isEmpty()) {
            addFieldError("student.id", getText("Enter Student Id"));
        } else if (student.getId().length() != 7) {
            addFieldError("student.id", getText("The id must be 7 characters"));
        }
        if (student.getSubjectName() == null || student.getSubjectName().isEmpty()) {
            addFieldError("student.subjectName", getText("Enter Subject Name"));
        }
        if (student.getNameStudent() == null || student.getNameStudent().isEmpty()) {
            addFieldError("student.nameStudent", getText("Enter Student Name"));
        } else if (student.getNameStudent().length() < 10 && student.getNameStudent().length() > 30) {
            addFieldError("student.nameStudent", getText("Student name is between 10 and 30 characters"));
        }
        if (student.getTheory() > 100 || student.getTheory() < 0) {
            addFieldError("student.theory", getText("Value of Theory point is between 0 and 100."));
        }
        if (student.getAsm() > 15 | student.getAsm() < 0) {
            addFieldError("student.asm", getText("Value of Assignment point is between 0 and 15."));
        }
        if (student.getProj() > 10 || student.getProj() < 0) {
            addFieldError("student.proj", getText("Value of Project point is between 0 and 10."));
        }
    }

    public String list() {
        students = studentService.getAllStudents();
        return SUCCESS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
