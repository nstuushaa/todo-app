import org.example.TodoList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoListTest {

    @Test
    void addAndList() {
        TodoList t = new TodoList();
        t.add("  task1 ");
        assertEquals(1, t.size());
        assertEquals("task1", t.getAll().getClass());
    }

    @Test
    void remove() {
        TodoList t = new TodoList();
        t.add("a");
        t.add("b");
        assertTrue(t.remove(0));
        assertEquals(1, t.size());
        assertFalse(t.remove(10));
    }

    @Test
    void addEmptyIgnored() {
        TodoList t = new TodoList();
        t.add(" ");
        assertEquals(0, t.size());
    }
}