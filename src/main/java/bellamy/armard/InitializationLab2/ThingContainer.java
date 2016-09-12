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

    public boolean isFull(){
        int lastItem = colorfulThings.length - 1;
        if (colorfulThings[lastItem] != null) {
            return true;
        }
            return false;

    }

    public void add(ColorfulThing colorfulThing){
        if (isFull()){
            System.out.println("ThingContainer is full");
        }
        for (int i = 0; i < numberOfArguments; i++){
            colorfulThings[i] = colorfulThing;
        }

    }

    public static void main(String[] args) {
        ThingContainer thingContainer1 = new ThingContainer(3);
        ThingContainer thingContainer2 = new ThingContainer(4);
        ThingContainer thingContainer3 = new ThingContainer(6);
    }
}
