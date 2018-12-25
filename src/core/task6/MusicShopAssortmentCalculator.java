package core.task6;

import java.util.*;

public class MusicShopAssortmentCalculator {

    public int receiveInstrumentQuantity(Map<String, List<Instrument>> instrumentAssortmenMap, String nameOfInstrument) {

        int quantity = 0;

        List<Instrument> instrumentList = instrumentAssortmenMap.get(nameOfInstrument);

        if (instrumentList != null) {
            quantity = instrumentList.size();
        }

        return quantity;
    }

    public Map<String, List<Instrument>> increaseInstrumentAssortment(Map<String, List<Instrument>> instrumentAssortmentMap, String nameOfInstrument, int quantityOfInstrument) {

        if (!instrumentAssortmentMap.containsKey(nameOfInstrument)) {
            instrumentAssortmentMap.put(nameOfInstrument, new ArrayList<>());
        }

        List<Instrument> instrumentList = instrumentAssortmentMap.get(nameOfInstrument);

        for (int i = 1; i <= quantityOfInstrument; i++) {
            Instrument instrument = new Instrument(nameOfInstrument);
            instrumentList.add(instrument);
        }
        return instrumentAssortmentMap;

    }

    public Map<String, List<Instrument>> initialStartAssortment() {

        Map<String, List<Instrument>> instrumentAssortmenMap = new HashMap<>();

        String[] instruments = new String[3];
        instruments[0] = "piano";
        instruments[1] = "guitar";
        instruments[2] = "trumpet";

        System.out.println("Store assortment:");

        for (int x = 0; x <= instruments.length - 1; x++) {

            List MusicInstrumentsList = new ArrayList();

            int instrumentQuantity = (int) Math.random();

            for (int i = 1; i <= instrumentQuantity; i++) {

                Instrument newInstrument = new Instrument(instruments[x]);
                MusicInstrumentsList.add(newInstrument);
            }

            System.out.println(instruments[0] + " - " + instrumentQuantity);
        }

        return instrumentAssortmenMap;

    }

}
