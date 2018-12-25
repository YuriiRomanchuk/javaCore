package core.task6;

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

        Map<String, Integer> order = new HashMap<>();

        System.out.println("Create your order, please: ");

        boolean increaseOrder = true;

        while (increaseOrder) {

            String nameOfInstrument = musicShopInputController.receiveNameOfInstrument();
            int quantityOfInstrument = musicShopInputController.receiveQuantityOfInstrument();

            if (quantityOfInstrument > 0) {
                order = musicShopOrderCalculator.increaseAnOrder(order, nameOfInstrument, quantityOfInstrument);
            }

            increaseOrder = musicShopInputController.receiveAnswerToIncreaseOrder();

        }

        return order;

    }


    @Override
    public void prepareInstruments() {

    }
}
