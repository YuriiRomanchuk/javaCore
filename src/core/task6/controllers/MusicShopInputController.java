package core.task6.controllers;

import java.io.InputStream;
import java.util.Scanner;

public class MusicShopInputController {

    private Scanner in;

    public MusicShopInputController(InputStream inputStream) {
        this.in = new Scanner(inputStream);
    }

    public int receiveMusicShop() {
        System.out.print("Select store, please(Input 1 - main shop, or 2 - second shop): ");
        return in.nextInt();
    }

    public String receiveNameOfInstrument() {
        System.out.print("Input name of instrument: ");
        return in.next();
    }

    public int receiveQuantityOfInstrument() {
        System.out.print("Input quantity of instrument: ");
        return in.nextInt();
    }

    public boolean receiveAnswerToIncreaseOrder() {
        System.out.print("Do you want to increase your order?( 1 - Yes, 2 - No): ");
        int answer = in.nextInt();
        return answer == 1;
    }

    public boolean receiveAnswerToIncreaseAssortment() {
        System.out.print("Do you want to increase your assortment?( 1 - Yes, 2 - No): ");
        int answer = in.nextInt();
        return answer == 1;
    }

    public boolean receiveAnswerToINewOrder() {
        System.out.print("Do you want to create new  order?( 1 - Yes, 2 - No): ");
        int answer = in.nextInt();
        return answer == 1;
    }
}
