public class Project {
    private String name;
    private String description;
    private String students;
    private String supervisor;
    private String semester;
    private String type;

    public Project(String name, String description, String students, String supervisor, String semester, String type) {
        this.name = name;
        this.description = description;
        this.students = students;
        this.supervisor = supervisor;
        this.semester = semester;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
