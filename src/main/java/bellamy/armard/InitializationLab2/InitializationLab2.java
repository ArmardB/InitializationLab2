package bellamy.armard.InitializationLab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

/**
 * Created by armardbellamy on 9/12/16.
 */
public class InitializationLab2 {

    public static void main(String[] args) {

        // Generate random number for placement into ColorfulThing Array List
        Random random = new Random();

        //Fill ColorfulThing ArrayList with color from Randomly Generated Index
        ArrayList<ColorfulThing ColorTree> colorList = new ArrayList<ColorfulThing ColorTree>();

        //Iterate over ColorTree Enum to add Colors To colorList
        for (ColorfulThing.ColorTree color: ColorfulThing.ColorTree.values()){
            colorList.add(color);
        }

        //Fill ColorfulThing ArrayList with color from Randomly Generated Index
        ColorfulThing randomGenColor1 = new ColorfulThing(colorList.get(random.nextInt(colorList.size())));
        ColorfulThing randomGenColor2 = new ColorfulThing(colorList.get(random.nextInt(colorList.size())));
        ColorfulThing randomGenColor3 = new ColorfulThing(colorList.get(random.nextInt(colorList.size())));
        ColorfulThing randomGenColor4 = new ColorfulThing(colorList.get(random.nextInt(colorList.size())));

        //Array of Randomly Generated Colorful Thing Enums
        ColorfulThing[] arrayOfRandomColors = {randomGenColor1, randomGenColor2, randomGenColor3, randomGenColor4};

        //Create a ThingContainer filled taht holds RandomGen ColorfulThings
        ThingContainer container = new ThingContainer(arrayOfRandomColors);

    }

}
