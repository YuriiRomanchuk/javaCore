package core.task6.shops;

import core.task6.Instrument;
import core.task6.calculators.MusicShopAssortmentCalculator;

import java.util.List;
import java.util.Map;

public interface Shop {

    public List<Instrument> prepareInstruments(Map<String, Integer> order, MusicShopAssortmentCalculator musicShopAssortmentCalculator) throws Exception;
}
