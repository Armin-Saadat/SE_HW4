package AbstractFactory.Client;

import AbstractFactory.GardenCreator.GardenCreator;
import AbstractFactory.GardenCreator.GardenType;
import AbstractFactory.GardenCreator.IranianGardenCreator;
import AbstractFactory.GardenCreator.JapaneseGardenCreator;

public class Client {
    public static GardenCreator getGarden(GardenType type) {
        GardenCreator gardenCreator;
        switch (type) {
            case IRANIAN:
                gardenCreator = new IranianGardenCreator();
                break;
            case JAPANESE:
                gardenCreator = new JapaneseGardenCreator();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

        gardenCreator.createFlower();
        gardenCreator.createTree();

        return gardenCreator;
    }
}
