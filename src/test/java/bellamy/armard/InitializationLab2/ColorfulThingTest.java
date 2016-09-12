package bellamy.armard.InitializationLab2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/12/16.
 */
public class ColorfulThingTest {

    @Test
    public void getColorTest(){
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.ColorTree.BLUE);
        ColorfulThing.ColorTree expectedValue = ColorfulThing.ColorTree.BLUE;
        ColorfulThing.ColorTree actualValue = colorfulThing.getColor();
        Assert.assertEquals("Should return color Blue", expectedValue, actualValue);
    }
    

}
