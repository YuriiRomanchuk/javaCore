package core.task6;

import java.util.ArrayList;
import java.util.List;

public class MusicShopAssortmentAndOrderCalculator {


    public int receiveInstrumentQuantity(ArrayList<Instrument> arrayInstrumentsAssortment, String nameOfInstrument) {

        int quantity = 0;

        for (int i = 0; i <= arrayInstrumentsAssortment.size() - 1; i++) {

            if (arrayInstrumentsAssortment.get(i).getName() = nameOfInstrument) {
                quantity++;
            }

        }

        return quantity;

    }


}
