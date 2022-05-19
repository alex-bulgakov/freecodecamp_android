package org.alebul.OopComposition;

public class Main {
    public static void main(String[] args) {
        Engine LadaEngine = new Engine("LadaEngine01", 7500);
        Car LadaKalina = new Car("Kalina", 4, "deep blue", LadaEngine);

        System.out.println(LadaKalina.getName());
        System.out.println("Engine model: " + LadaKalina.getEngine().getModel());
    }
}
