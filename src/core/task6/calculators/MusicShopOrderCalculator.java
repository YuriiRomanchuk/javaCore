package core.task6.Calculators;

import java.util.HashMap;
import java.util.Map;

public class MusicShopOrderCalculator {

    private Map<String, Integer> order = new HashMap<String, Integer>();

    public Map<String, Integer> increaseAnOrder(Map<String, Integer> order, String nameOfInstrument, int quantityOfInstrument) {

        int quantityOfInstrumentInOrder = 0;
       
        if (order.containsKey(nameOfInstrument)) {
            quantityOfInstrumentInOrder = order.get(nameOfInstrument);  
        }
        
        order.put(nameOfInstrument, quantityOfInstrument + quantityOfInstrumentInOrder);

        return order;
    }

    public Map<String, Integer> getOrder() {
        return order;
    }
}
