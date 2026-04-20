package dev.skystone;

public class Sphere {
    static double calcSurface(double radius){
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    static double calcVolume(double radius){
        return (4 * Math.pow(radius, 3) * Math.PI) / 3;
    }
}
