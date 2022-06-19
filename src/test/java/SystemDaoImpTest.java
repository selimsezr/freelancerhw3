import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SystemDaoImpTest {

    @Test
    void getAllProject() {
    }

    @Test
    byte updateProject(String aa, String s, String aa1, String s1) {
        Assertions.assertEquals("aa", updateProject("aa", "aa","aa","aa"));
        return 0;
    }

    @Test
    byte deleteProject(String aa, String s, String aa1, String s1) {
        Assertions.assertEquals("aa", deleteProject("aa", "aa","aa","aa"));
        return 0;
    }

    @Test
    byte createProject(String aa, String s, String aa1, String s1) {
        Assertions.assertEquals("aa", createProject("aa", "aa","aa","aa"));
        return 0;
    }

    @Test
    byte updateStudent(String aa, String s, String aa1, String s1) {
        Assertions.assertEquals("aa", updateStudent("aa", "aa","aa","aa"));
        return 0;
    }

    @Test
    int deleteStudent() {
        Assertions.assertEquals("aa", createProject("aa", "aa","aa","aa"));
        return 0;
    }

    @Test
    int createStudent() {
        Assertions.assertEquals("aa", createProject("aa", "aa","aa","aa"));
        return 0;
    }

    @Test
    byte updateSupervisor(String aa, String s, String aa1, String s1) {
        Assertions.assertEquals("aa", updateSupervisor("aa", "aa","aa","aa"));
        return 0;
    }

    @Test
    byte deleteSupervisor(String aa, String s, String aa1, String s1) {
        Assertions.assertEquals("aa", deleteSupervisor("aa", "aa","aa","aa"));
        return 0;
    }

    @Test
    byte createSupervisor(String aa, String s, String aa1, String s1) {
        Assertions.assertEquals("aa", createSupervisor("aa", "aa","aa","aa"));
         return 0;
    }

    @Test
    byte findProjectName(String aa) {
        String found = "found";
        aa = "aa";
        Assertions.assertEquals(found, findProjectName(aa));
        return 0;
    }

    @Test
    byte findType(String aa) {
        String found = "found";
        aa = "aa";
        Assertions.assertEquals(found, findType(aa));
        return 0;
    }

    @Test
    byte findSemester(String aa) {
        String found = "found";
        aa = "aa";
        Assertions.assertEquals(found, findSemester(aa));
        return 0;
    }
}