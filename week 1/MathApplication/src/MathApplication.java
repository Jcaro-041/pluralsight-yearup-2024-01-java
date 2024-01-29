public class MathApplication {
    public static void main(String[] args) {

        int bobSalary = 52000;
        int garySalary = 60000;
        //int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + Math.max(bobSalary, garySalary));
        System.out.println();

        float carPrice = 25678.99f;
        float truckPrice = 47456.99f;
        System.out.println("The lowest price vehicle costs " + Math.min(carPrice, truckPrice));
        System.out.println();

        float radius = 7.25f;
        double areaOfCircle = Math.PI * (Math.pow(radius, 2));
        System.out.println(areaOfCircle);
        System.out.println();

        int root = 5;
        double square = Math.sqrt(root);
        System.out.println(square);
        System.out.println();

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("The distance between the points is " + distance);
        System.out.println();

        float absolute = -3.8f;
        float positive = Math.abs(absolute);
        System.out.println("The absolute of " + absolute + " is " + positive);
        System.out.println();

        System.out.println(Math.round(Math.random()));
    }
}
