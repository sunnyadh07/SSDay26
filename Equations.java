public class Equations {
    //public static double hypotenuseOfTrianle(double a, double b, double c){
        //return ((a^2 + b^2) = c^2);
        //return Math.pow(a)


    public static double areaOfTriangle(double h, double b){
        return ((h * b) / 2);
    }
    public static double circumferenceOfSphere(double r) {
        return Math.PI * (r * r);
    }
    public static double hypotenuseOfTraingle(double a, double b, double c){
        a = Math.sqrt((b*b) + (c + c));
        return a;
    }

}
