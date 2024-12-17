package GLABS.GLAB303_13_1_ReadingDelimitedFile;

public class Course {

    private String code;
    private String courseName;
    private String instructorName;

    public Course(String code, String courseName, String instructorName) {
        this.code = code;
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public Course() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
