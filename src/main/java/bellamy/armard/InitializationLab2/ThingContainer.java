package bellamy.armard.InitializationLab2;

import java.util.ArrayList;

/**
 * Created by armardbellamy on 9/10/16.
 */
public class ThingContainer {

    int numberOfArguments;
    ColorfulThing[] colorfulThings;


    public ThingContainer(int numberOfArguments){
        ColorfulThing[] colorfulThings = new ColorfulThing[numberOfArguments];
    }

    public ThingContainer(ColorfulThing[] colorList){
        colorfulThings = colorList;
    }


    // Search Last Index of Container to Check if full
    public boolean isFull(){
        int lastItem = colorfulThings.length - 1;
        if (colorfulThings[lastItem] != null) {
            return true;
        }
            return false;

    }
    // Check if container is full & Add Colorful Thing
    public void add(ColorfulThing colorfulThing){
        if (isFull()){
            System.out.println("ThingContainer is full");
        }
        for (int i = 0; i < numberOfArguments; i++){
            if(colorfulThings[i] != null){
                colorfulThings[i] = colorfulThing;
            }
        }
    }

    // Print Colorful Things To Screen - Helped By Adam Kamsheh
    StringBuilder stringbuilder = new StringBuilder();

    for(int i = 0; i < colorfulThings.length; i++){
        if(colorfulThings[i] != null){
            stringbuilder.append(colorfulThings[i]);
        }
        stringbuilder.append(colorfulThings.getColor());
    }

    // Create Pop Method - Helped By Adam Kamsheh
    public ColorfulThing pop(){
        ColorfulThing lastItemInIndex = null;
        for(int i = colorfulThings.length - 1; i >= 0; i--){
            if (colorfulThings[i] != null) {
                lastItemInIndex = colorfulThings[i];
                colorfulThings[i] = null;
            }
        }
        return lastItemInIndex;
    }

    // Remove Item From Array
    public ColorfulThing remove(ColorfulThing.ColorTree color){
        ColorfulThing itemToRemove = null;
        int counter;
        if (isFull()){
            counter = 0;
        }else {
            counter = 1;
        }

        for (int i = 0; i < colorfulThings.length - counter; i++){
            if(colorfulThings[i].getColor().equals(color)){
                itemToRemove = colorfulThings[i];
                colorfulThings[i] = null;
            }
        }
        return itemToRemove;
    }



}
