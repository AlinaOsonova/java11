import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void test1() {
        SimpleTask task = new SimpleTask(15, "Поездка на море летом");
        String query = "море";
        boolean expected = true;
        boolean actual = task.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        SimpleTask task = new SimpleTask(15, "Поездка на море летом");
        String query = "горы";
        boolean expected = false;
        boolean actual = task.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Epic epic = new Epic(1, new String[]{"Аптечка", "Чемодан", "Косметика"});
        String query = "Зонт";
        boolean expected = false;
        boolean actual = epic.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Epic epic = new Epic(1, new String[]{"Аптечка", "Чемодан", "Косметика"});
        String query = "Чемодан";
        boolean expected = true;
        boolean actual = epic.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Meeting meeting = new Meeting(5, "Совместный отдых", "Даты и программа отпуска", "01.02.2025");
        String query = "Совместный отдых";
        boolean expected = true;
        boolean actual = meeting.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Meeting meeting = new Meeting(5, "Совместный отдых", "Даты и программа отпуска", "01.02.2025");
        String query = "Даты и программа отпуска";
        boolean expected = true;
        boolean actual = meeting.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Meeting meeting = new Meeting(5, "Совместный отдых", "Даты и программа отпуска", "01.02.2025");
        String query = "Месяц отпуска";
        boolean expected = false;
        boolean actual = meeting.matches(query);
        Assertions.assertEquals(expected, actual);
    }
}

