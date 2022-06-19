import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public interface SystemDao {
    public Byte getAllProject();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Project updateProject(String name, String description, String student, String supervisor, String semester, String type);

    public void deleteProject();
    public Project createProject();
    public Student updateStudent();

    void deleteProject(String name);

    @POST
    @Path("/createProject")
    @Produces(MediaType.APPLICATION_JSON)
    void createProject(String name, String description, String student, String supervisor, String semester, String type);

    @POST
    @Path("/updateStudent")
    @Produces(MediaType.APPLICATION_JSON)
    Student updateStudent(String name, String surname, String course, String semester);

    public void deleteStudent();
    public Student createStudent();

    void deleteStudent(String name);

    @POST
    @Path("/createStudent")
    @Produces(MediaType.APPLICATION_JSON)
    Student createStudent(String name, String surname, String course, String semester);

    public Supervisor updateSupervisor();

    @POST
    @Path("/updateSupervisor")
    @Produces(MediaType.APPLICATION_JSON)
    Supervisor updateSupervisor(String name, String surname, String title, String email);

    public void deleteSupervisor();
    public void createSupervisor();

    @POST
    @Path("/deleteSupervisor")
    @Produces(MediaType.APPLICATION_JSON)
    void deleteSupervisor(String name);

    @POST
    @Path("/createSupervisor")
    @Produces(MediaType.APPLICATION_JSON)
    Supervisor createSupervisor(String name, String surname, String title, String email);
}
