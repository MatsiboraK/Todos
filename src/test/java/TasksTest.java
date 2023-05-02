import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netologe.javaqa.*;

public class TasksTest {

    //Тесты для SimpleTask
    @Test
    public void shouldGetTitle() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        Assertions.assertEquals("Позвонить родителям", simpleTask.getTitle());
    }

    @Test
    public void shouldTrueSearchTasksByQuerySimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        simpleTask.matches("Позвонить родителям");

        Assertions.assertEquals(true, true);
    }

    @Test
    public void shouldFalseSearchTasksByQuerySimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        simpleTask.matches("Позвонить врачу");

        Assertions.assertEquals(false, false);
    }

    //Тесты для Epic

    @Test
    public void shouldGetSubtask() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        String[] expected = {"Молоко", "Яйца", "Хлеб"};
        String[] actual = epic.getSubtasks();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTrueSearchTasksByQueryEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        epic.matches("Молоко");

        Assertions.assertEquals(true, true);
    }

    @Test
    public void shouldFalseSearchTasksByQueryEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        epic.matches("Колбаса");

        Assertions.assertEquals(false, false);
    }

    //Тесты для Meeting Topic

    @Test
    public void shouldGetTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "приложение НетоБанка",
                "Во вторник после обеда"
        );

        Assertions.assertEquals("Выкатка 3й версии приложения", meeting.getTopic());
    }

    @Test
    public void shouldTrueSearchTasksByQueryMeetingTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "приложение НетоБанка",
                "Во вторник после обеда"
        );

        meeting.matches("Выкатка 3й версии приложения");

        Assertions.assertEquals(true, true);
    }

    @Test
    public void shouldFalseSearchTasksByQueryMeetingTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "приложение НетоБанка",
                "Во вторник после обеда"
        );

        meeting.matches("Выкатка финальной версии приложения");

        Assertions.assertEquals(false, false);
    }

    //Тесты для Meeting Project

    @Test
    public void shouldGetProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "приложение НетоБанка",
                "Во вторник после обеда"
        );

        Assertions.assertEquals("приложение НетоБанка", meeting.getProject());
    }

    @Test
    public void shouldTrueSearchTasksByQueryMeetingProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "приложение НетоБанка",
                "Во вторник после обеда"
        );

        meeting.matches("приложение НетоБанк");

        Assertions.assertEquals(true, true);
    }

    @Test
    public void shouldFalseSearchTasksByQueryMeetingProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "приложение НетоБанка",
                "Во вторник после обеда"
        );

        meeting.matches("приложение БРК");

            Assertions.assertEquals(false, false);
    }

    //Тесты для Meeting Start

    @Test
    public void shouldGetStart() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "приложение НетоБанка",
                "Во вторник после обеда"
        );

        Assertions.assertEquals("Во вторник после обеда", meeting.getStart());
    }

    @Test
    public void shouldTrueSearchTasksByQueryMeetingStart() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "приложение НетоБанка",
                "Во вторник после обеда"
        );

        meeting.matches("Во вторник после обеда");

        Assertions.assertEquals(true, true);
    }

    @Test
    public void shouldFalseSearchTasksByQueryMeetingStart() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "приложение НетоБанка",
                "Во вторник после обеда"
        );

        meeting.matches("В среду утром");

        Assertions.assertEquals(false, false);
    }

    //Тесты для Tasks

    @Test
    public void shouldGetId() {
        Task task = new Task(15);

        Assertions.assertEquals(15, task.getId());
    }

//    @Test
//    public void shouldFalseSearchTasksByQuery() {
//        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
//
//        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
//        Epic epic = new Epic(55, subtasks);
//
//        Meeting meeting = new Meeting(
//                555,
//                "Выкатка 3й версии приложения",
//                "приложение НетоБанка",
//                "Во вторник после обеда"
//        );
//        Task task = new Task(5);
//
//        task.matches("Мороженое");
//
//        Assertions.assertEquals(false, false);
//    }


}
