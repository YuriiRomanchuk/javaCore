package core.task6;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class MusicShopAssortmentCalculator {

    public int receiveInstrumentQuantity(Map<String, List<Instrument>> instrumentAssortmenMap, String nameOfInstrument) {

        int quantity = 0;

        Optional<List<Instrument>> optionalInstrument = Optional.ofNullable(instrumentAssortmenMap.get(nameOfInstrument));

        if (!optionalInstrument.isEmpty()) {
            quantity = optionalInstrument.get().size();
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

        int minimum = 1;
        int maximum = 20;

        for (int x = 0; x <= instruments.length - 1; x++) {

            List musicInstrumentsList = new ArrayList();

            int instrumentQuantity = ThreadLocalRandom.current().nextInt(minimum, maximum + 1);

            for (int i = 1; i <= instrumentQuantity; i++) {

                Instrument newInstrument = new Instrument(instruments[x]);
                musicInstrumentsList.add(newInstrument);
            }

            instrumentAssortmenMap.put(instruments[x], musicInstrumentsList);
        }

        return instrumentAssortmenMap;
    }

    public List<Instrument> removeInstrumentFromAssortrment(List<Instrument> musicInstrumentsList, int quantityDeleteInstument) {

        for (int i = quantityDeleteInstument; i >= 0; i--) {
            musicInstrumentsList.remove(i);
        }

        return musicInstrumentsList;
    }

}
