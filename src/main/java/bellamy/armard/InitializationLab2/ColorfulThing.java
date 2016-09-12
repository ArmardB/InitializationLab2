package bellamy.armard.InitializationLab2;

/**
 * Created by armardbellamy on 9/10/16.
 */
public class ColorfulThing {
    enum ColorTree {GREEN, YELLOW, RED, BLUE, PURPLE, GREY};

    private ColorTree color;
    public int index = 1;

    public ColorfulThing(ColorTree color){
        this.color = color;
    }

    public ColorTree getColor(){
        return this.color;
    }
}
