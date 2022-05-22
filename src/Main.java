public class Main {
    public static void main(String[] args) {
        suma(4, 7, 9);
        Car mycar = new Car();
        mycar.CarDoors();
        System.out.print(mycar.doors);
    }

    public static void suma(int a, int b, int c){
        int result;
        result = a + b + c;
        System.out.println(result);
    }
}

class Car {
    public int doors = 3;

    public void CarDoors() {
        this.doors++;
    }
}