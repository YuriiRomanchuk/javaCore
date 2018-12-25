package core.task6;

import java.util.HashMap;
import java.util.Map;

public class MusicShopOrder {

    private Map<String, Integer> order = new HashMap<String, Integer>();

    public Map<String, Integer> receiveAnOrder() {

        System.out.println("Create your order, please: ");

        MusicShopInputController musicShopInputController = new MusicShopInputController(System.in);

        boolean increaseOrder = true;

        while (increaseOrder) {

            String nameOfInstrument = musicShopInputController.receiveNameOfInstrument();
            int quantityOfInstrument = musicShopInputController.receiveQuantityOfInstrument();

            if (quantityOfInstrument > 0) {
                int quantityOfInstrumentInOrder = order.get(nameOfInstrument);
                order.put(nameOfInstrument, quantityOfInstrumentInOrder + quantityOfInstrument);
            }

        }

        return order;
    }

}
