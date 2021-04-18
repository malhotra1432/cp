package list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomListTest {

    @Test
    public void shouldReturnTrueForEmptyList(){
        List<Object> list = new CustomList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldReturnFalseForNonEmptyList(){
        List<Object> list = new CustomList<>();
        list.add("null");
        assertFalse(list.isEmpty());
    }

}
