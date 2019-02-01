package core.task6.shops;

import core.task6.Instrument;
import core.task6.exceptions.InstrumentIsNotInAssortmentException;
import core.task6.controllers.MusicShopInputController;
import core.task6.calculators.MusicShopAssortmentCalculator;
import core.task6.calculators.MusicShopOrderCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainShop implements Shop {


    private MusicShopInputController musicShopInputController;
    private Map<String, List<Instrument>> instrumentAssortmentMap = new HashMap<>();

    public MainShop(MusicShopInputController musicShopInputController) {
        this.musicShopInputController = musicShopInputController;
    }

    public Map<String, List<Instrument>> fillAssortment(MusicShopAssortmentCalculator musicShopAssortmentCalculator) {

        instrumentAssortmentMap = musicShopAssortmentCalculator.initialStartAssortment();

        showАssortment();

        boolean increaseAssortment = musicShopInputController.receiveAnswerToIncreaseAssortment();

        while (increaseAssortment) {

            String nameOfInstrument = musicShopInputController.receiveNameOfInstrument();
            int quantityOfInstrument = musicShopInputController.receiveQuantityOfInstrument();

            if (quantityOfInstrument != 0) {
                instrumentAssortmentMap = musicShopAssortmentCalculator.increaseInstrumentAssortment(instrumentAssortmentMap, nameOfInstrument, quantityOfInstrument);
            }

            increaseAssortment = musicShopInputController.receiveAnswerToIncreaseAssortment();
        }

        return instrumentAssortmentMap;
    }

    public Map<String, Integer> makeAnOrder(MusicShopOrderCalculator musicShopOrderCalculator) {

        Map<String, Integer> orderHashMap = new HashMap<>();

        System.out.println("Create your order, please: ");

        boolean increaseOrder = true;

        while (increaseOrder) {

            String nameOfInstrument;
            int quantityOfInstrument = 0;

            try {
                nameOfInstrument = nameOfInstrumentOrder();
            } catch (Exception e) {
                e.printStackTrace();
                increaseOrder = musicShopInputController.receiveAnswerToIncreaseOrder();
                continue;
            }

            try {
                quantityOfInstrument = quantityOfInstrumentOrder();
            } catch (Exception e) {
                e.printStackTrace();
                increaseOrder = musicShopInputController.receiveAnswerToIncreaseOrder();
                continue;
            }

            musicShopOrderCalculator.increaseAnOrder(orderHashMap, nameOfInstrument, quantityOfInstrument);
            increaseOrder = musicShopInputController.receiveAnswerToIncreaseOrder();

        }

        return orderHashMap;

    }

    private int quantityOfInstrumentOrder() throws Exception {

        int quantityOfInstrument = musicShopInputController.receiveQuantityOfInstrument();
        if (quantityOfInstrument <= 0) {
            throw new IllegalArgumentException("Quantity negative or 0: quantity = " + quantityOfInstrument);
        }

        return quantityOfInstrument;
    }

    private String nameOfInstrumentOrder() throws Exception {

        String nameOfInstrument = musicShopInputController.receiveNameOfInstrument();

        if (!instrumentAssortmentMap.containsKey(nameOfInstrument)) {
            throw new InstrumentIsNotInAssortmentException("The inserted name of instrument is not in assortment: " + nameOfInstrument);
        }

        return nameOfInstrument;
    }

    public void showАssortment() {

        System.out.println("Store assortment:");

        for (Map.Entry<String, List<Instrument>> entry : instrumentAssortmentMap.entrySet()) {

            String nameOfInstrument = entry.getKey();
            List<Instrument> quantityOfInstrument = entry.getValue();
            System.out.println(nameOfInstrument + " - " + quantityOfInstrument.size());
        }

    }

    @Override
    public List<Instrument> prepareInstruments(Map<String, Integer> order, MusicShopAssortmentCalculator musicShopAssortmentCalculator) throws Exception {

        List<Instrument> instrumentList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : order.entrySet()) {

            String nameOfInstrument = entry.getKey();
            Integer quantityOfInstrument = entry.getValue();

            List<Instrument> musicInstrumentsList = instrumentAssortmentMap.get(nameOfInstrument);

            if (quantityOfInstrument > musicInstrumentsList.size()) {
                throw new IllegalArgumentException("Order has more instruments " + nameOfInstrument + " than in music shop assortment. Lacks:" + (quantityOfInstrument - musicInstrumentsList.size()));
            }

            musicShopAssortmentCalculator.removeInstrumentFromAssortrment(musicInstrumentsList, quantityOfInstrument);
        }

        return instrumentList;

    }


}
