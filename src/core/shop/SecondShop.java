/*
package core.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SecondShop implements Shop {

    private Map <String, List <Instrument>>;

    public void MusicShop() {

        List <Instrument> musicInstruments = new ArrayList <Instrument>( );

        fillAssortment(musicInstruments);

    }

    public void fillAssortment(List <Instrument> musicInstruments) {

        String[] Instruments = new String[3];
        Instruments[0] = "piano";
        Instruments[1] = "guitar";
        Instruments[2] = "trumpet";

        System.out.println("Store assortment:");

        for (int x = 0; x <= Instruments.length - 1; x++) {

            Instrument newInstrument = new Instrument(Instruments[0]);
            musicInstruments.add(newInstrument);
            System.out.println(newInstrument.getName( ) + " - " + newInstrument.getQuantity( ));
        }


        System.out.println("Do you wish to increase assortment? (yes - 1, no - 2)");

        Scanner in = new Scanner(System.in);
        int value = in.nextInt( );

        switch (value) {

            case 1:
                System.out.println("Input name of instument;");
                Scanner inName = new Scanner(System.in);
                String name = inName.nextLine( );

                System.out.println("Input name of instument;");
                Scanner inQuantity = new Scanner(System.in);
                String quantity = inQuantity.nextLine( );

                Instrument newInstrument = new Instrument(Instruments[0], (int) Math.random( ));
                musicInstruments.add(newInstrument);
                break;
            case 2:
                break;
            default:
                System.out.println("Сurrent number is not equal 1 or 2");
        }


    }

    @Override
    public void prepareInstruments(Map <String, Integer> order) {

    }
*/
/*  public List <Instrument> prepareInstruments(Map <String, Integer> order) {


    }*//*



}
*/
