package Prototype.Tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CloneTreeTest {
    @Test
    void testRedMapleTreeClone() {
        Maple maple = new Maple(10, 1);
        maple.setLeafColor(Color.RED);

        Maple newMaple = (Maple) maple.clone();
        newMaple.setLeafColor(Color.GREEN);

        assertEquals(Color.RED, maple.getLeafColor());
        assertEquals(1, maple.getAge());
        assertEquals(10, maple.getHeight());

        assertEquals(Color.GREEN, newMaple.getLeafColor());
        assertEquals(1, newMaple.getAge());
        assertEquals(10, newMaple.getHeight());
    }
}