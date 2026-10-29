package Cylinder;

public class Cylinder {

    double r;
    double h;
    double volume;
    final double phi = 3.14;

    double hitungVolume() {
        volume = phi * r * r * h;
        return volume;
    }
}

