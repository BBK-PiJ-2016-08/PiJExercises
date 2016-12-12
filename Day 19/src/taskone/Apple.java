package taskone;

public class Apple {


    private String colour;
    private Integer weight;

    {
        weight = 150;
        colour = "red";
    }

    public Apple(Integer weight) {

        setWeight(weight);
    }

    public Apple(String colour) {
        setColour(colour);
    }

    public Apple(Integer weight, String colour) {
        setWeight(weight);
        setColour(colour);

    }

    public Apple() {

    }

    private void setWeight(Integer weight) {

        this.weight = weight;
    }

    private void setColour(String colour) {

        this.colour = colour;
    }

    public Integer getWeight() {

        return this.weight;
    }

    public String getColour() {

        return this.colour;
    }

    public String toString() {

        return "Colour: " + getColour() + " Weight: " + getWeight();
    }

}
