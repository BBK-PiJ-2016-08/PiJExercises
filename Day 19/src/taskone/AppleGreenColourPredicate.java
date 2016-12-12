package taskone;

public class AppleGreenColourPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColour());
    }
}
