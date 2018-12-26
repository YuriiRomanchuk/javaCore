package core.task6;

import java.util.List;
import java.util.Map;

public interface Shop {

    public List<Instrument> prepareInstruments(Map<String, Integer> order, MusicShopAssortmentCalculator musicShopAssortmentCalculator) throws Exception;
}
