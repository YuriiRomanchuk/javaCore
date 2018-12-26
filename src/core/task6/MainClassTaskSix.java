package core.task6;

import java.util.List;
import java.util.Map;

public class MainClassTaskSix {

    public static void main(String[] args) {

        MusicShopInputController musicShopInputController = new MusicShopInputController(System.in);
        MusicShopAssortmentCalculator musicShopAssortmentCalculator = new MusicShopAssortmentCalculator();
        MusicShopOrderCalculator musicShopOrderCalculator = new MusicShopOrderCalculator();

        int musicShopNumber = musicShopInputController.receiveMusicShop();

        switch (musicShopNumber) {

            case 1:
                MainShop mainShop = new MainShop(musicShopInputController);
                Map<String, List<Instrument>> instrumentAssortmentMap = mainShop.fillAssortment(musicShopAssortmentCalculator);
                Map<String, Integer> order = mainShop.makeAnOrder(musicShopOrderCalculator);

                break;
            case 2:

                /*SecondShop SecondShop = new SecondShop();*/
                break;
            default:
                System.out.println("You have not selected a store. Choose 1 or 2");
                break;


        }

    }
}