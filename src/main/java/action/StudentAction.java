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
            addFieldError("student.id", getText("Please enter id for student!"));
        } else if (student.getId().length() != 7) {
            addFieldError("student.id", getText("The id must be 7 characters."));
        }
        if (student.getSubjects() == null || student.getSubjects().isEmpty()) {
            addFieldError("student.subjects", getText("Please enter name for subject!"));
        }
        if (student.getNameStudent() == null || student.getNameStudent().isEmpty()) {
            addFieldError("student.nameStudent", getText("Please enter name for student!"));
        } else if (student.getNameStudent().length() < 10 && student.getNameStudent().length() > 30) {
            addFieldError("student.nameStudent", getText("Name student between 10 and 30 characters!"));
        }
        if (student.getPointLt() > 100 || student.getPointLt() < 0) {
            addFieldError("student.pointLt", getText("Value of point Lt student between 0 and 100."));
        }
        if (student.getPointTh() > 15 | student.getPointTh() < 0) {
            addFieldError("student.pointTh", getText("Value of point Th student between 0 and 15."));
        }
        if (student.getPointAssignment() > 10 || student.getPointAssignment() < 0) {
            addFieldError("student.pointAssignment", getText("Value of point assignment student between 0 and 10."));
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
