package core.task6;

import java.io.InputStream;
import java.util.Scanner;

public class MusicShopInputController {

    private Scanner in;

    public MusicShopInputController(InputStream inputStream) {
        this.in = new Scanner(inputStream);
    }


    public int receiveMusicShop() {
        System.out.println("Select store, please(Input 1 - Main shop, or 2 - Second shop): ");
        return in.nextInt();
    }


    public String receiveNameOfInstrument() {
        System.out.println("Input name of instrument: ");
        return in.nextLine();
    }


    public int receiveQuantityOfInstrument() {
        System.out.println("Input quantity of instrument: ");
        return in.nextInt();
    }

    public boolean receiveAnswerToIncreaseOrder() {
        System.out.println("Do you want to increase your order?( 1 - Yes, 2 - No): ");
        int answer = in.nextInt();
        return answer != 1;
    }

    public boolean receiveAnswerToIncreaseAssortment() {
        System.out.println("Do you want to increase your assortment?( 1 - Yes, 2 - No): ");
        int answer = in.nextInt();
        return answer != 1;
    }

}
