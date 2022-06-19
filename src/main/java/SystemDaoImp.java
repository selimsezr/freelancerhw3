import com.owlike.genson.Genson;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public abstract class SystemDaoImp implements SystemDao{
    private Project project;
    private Student student;
    private Supervisor supervisor;
    OutputStream outputStream = new OutputStream() {
        @Override
        public void write(int b) throws IOException {

        }
    };
    Genson genson = new Genson();
    String json;
    byte[] jsonBytes;
    @GET
    @Path("/allProject")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Byte getAllProject() {
        for (byte j:jsonBytes ){
            return j;
        }
        return null;
    }
    @POST
    @Path("/updateProject")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Project updateProject(String name, String description, String student, String supervisor, String semester, String type) {
        project.setName(name);
        project.setDescription(description);
        project.setStudents(student);
        project.setSupervisor(supervisor);
        project.setSemester(semester);
        project.setType(type);

        json = genson.serialize(project);
        jsonBytes = genson.serializeBytes(project);
        genson.serialize(project, outputStream);
        return project;
    }
    @POST
    @Path("/deleteProject")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public void deleteProject(String name) {
      Project project= genson.deserialize(name, Project.class);
    }
    @POST
    @Path("/createProject")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public void createProject(String name, String description, String student, String supervisor, String semester, String type) {
    Project project = new Project(name, description, student, supervisor, semester, type);
        json = genson.serialize(project);
        jsonBytes = genson.serializeBytes(project);
        genson.serialize(project, outputStream);

    }
    @POST
    @Path("/updateStudent")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Student updateStudent(String name, String surname, String course, String semester) {
        student.setName(name);
        student.setSurname(surname);
        student.setCourse(course);
        student.setSemester(semester);

        json = genson.serialize(student);
        jsonBytes = genson.serializeBytes(student);
        genson.serialize(student, outputStream);
        return student;
    }
    @POST
    @Path("/deleteStudent")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public void deleteStudent(String name) {
        Student student= genson.deserialize(name, Student.class);
    }
    @POST
    @Path("/createStudent")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Student createStudent(String name, String surname, String course, String semester) {
        Student student= new Student(name, surname, course, semester);
        json = genson.serialize(student);
        jsonBytes = genson.serializeBytes(student);
        genson.serialize(student, outputStream);
        return student;
    }
    @POST
    @Path("/updateSupervisor")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Supervisor updateSupervisor(String name, String surname, String title, String email) {
        supervisor.setName(name);
        supervisor.setSurname(surname);
        supervisor.setEmail(email);
        supervisor.setTitle(title);

        json = genson.serialize(supervisor);
        jsonBytes = genson.serializeBytes(supervisor);
        genson.serialize(supervisor, outputStream);
        return supervisor;
    }
    @POST
    @Path("/deleteSupervisor")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public void deleteSupervisor(String name) {
        Supervisor supervisor= genson.deserialize(name, Supervisor.class);
    }
    @POST
    @Path("/createSupervisor")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Supervisor createSupervisor(String name, String surname, String title, String email) {
    Supervisor supervisor = new Supervisor(name, surname, title, email);
        json = genson.serialize(supervisor);
        jsonBytes = genson.serializeBytes(supervisor);
        genson.serialize(supervisor, outputStream);
        return supervisor;
    }
    public String findProjectName(String name){
        for (int i = 0; i<=jsonBytes.length; i++) {
            if (Arrays.asList(jsonBytes).contains(name)) {
                return "found";
            }
        }
        return "not found";
    }
    public String findType(String type){
        for (int i = 0; i<=jsonBytes.length; i++) {
            if (Arrays.asList(jsonBytes).contains(type)) {
                return "found";
            }
        }
        return "not found";
    }
    public String findSemester(String semester){
        for (int i = 0; i<=jsonBytes.length; i++) {
            if (Arrays.asList(jsonBytes).contains(semester)) {
                return "found";
            }
        }
        return "not found";
    }
}
