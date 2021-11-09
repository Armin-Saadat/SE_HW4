package AbstractFactory.Client;

import AbstractFactory.Flower.Color;
import AbstractFactory.Flower.Flower;
import AbstractFactory.Flower.JapaneseCherryBlossom;
import AbstractFactory.Flower.Khatami;
import AbstractFactory.GardenCreator.GardenCreator;
import AbstractFactory.GardenCreator.GardenType;
import AbstractFactory.Tree.Bonsai;
import AbstractFactory.Tree.Chenar;
import AbstractFactory.Tree.Tree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    public void testFlowerTypeInIranianGarden() {
        GardenCreator gardenCreator = Client.getGarden(GardenType.IRANIAN);
        assertTrue(gardenCreator.getFlower() instanceof Khatami);
    }

    @Test
    public void testTreeTypeInIranianGarden() {
        GardenCreator gardenCreator = Client.getGarden(GardenType.IRANIAN);
        assertTrue(gardenCreator.getTree() instanceof Chenar);
    }

    @Test
    public void testFlowerTypeInJapaneseGarden() {
        GardenCreator gardenCreator = Client.getGarden(GardenType.JAPANESE);
        assertTrue(gardenCreator.getFlower() instanceof JapaneseCherryBlossom);
    }

    @Test
    public void testTreeTypeInJapaneseGarden() {
        GardenCreator gardenCreator = Client.getGarden(GardenType.JAPANESE);
        assertTrue(gardenCreator.getTree() instanceof Bonsai);
    }

    @Test void testFlowerGrowInIranianGarden() {
        GardenCreator gardenCreator = Client.getGarden(GardenType.IRANIAN);
        Flower flower = gardenCreator.getFlower();
        flower.grow();
        assertEquals(Color.RED, flower.getColor());
        assertEquals(30, flower.getPetalCount());
        assertEquals(true, flower.isFragrant());
    }

    @Test void testFlowerGrowInJapaneseGarden() {
        GardenCreator gardenCreator = Client.getGarden(GardenType.JAPANESE);
        Flower flower = gardenCreator.getFlower();
        flower.grow();
        assertEquals(Color.WHITE, flower.getColor());
        assertEquals(100, flower.getPetalCount());
        assertEquals(false, flower.isFragrant());
    }

    @Test void testTreeGrowInIranianGarden() {
        GardenCreator gardenCreator = Client.getGarden(GardenType.IRANIAN);
        Tree tree = gardenCreator.getTree();
        tree.grow(2.0);
        assertEquals(2.0, tree.getAge());
        assertEquals(20.0, tree.getHeight());
    }

    @Test void testTreeGrowInJapaneseGarden() {
        GardenCreator gardenCreator = Client.getGarden(GardenType.JAPANESE);
        Tree tree = gardenCreator.getTree();
        tree.grow(1.0);
        assertEquals(1.0, tree.getAge());
        assertEquals(0.3, tree.getHeight());
    }
}