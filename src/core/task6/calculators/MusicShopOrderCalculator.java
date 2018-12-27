package core.task6.calculators;

import java.util.HashMap;
import java.util.Map;

public class MusicShopOrderCalculator {

    public void increaseAnOrder(Map<String, Integer> order, String nameOfInstrument, int quantityOfInstrument) {

        int quantityOfInstrumentInOrder = 0;
       
        if (order.containsKey(nameOfInstrument)) {
            quantityOfInstrumentInOrder = order.get(nameOfInstrument);  
        }
        
        order.put(nameOfInstrument, quantityOfInstrument + quantityOfInstrumentInOrder);
    }

}
