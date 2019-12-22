public class Vehicle {

    String brand;
    int capacity;

    Vehicle(){

    }

    Vehicle(String brand){
        this.brand = brand;
        System.out.println("Vehicle konstruktor");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public void drive() {
        System.out.println("Jade ");
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Vehicle)){
            return false;
        }
            return this.brand.equals(((Vehicle)o).brand)
                    && this.capacity == ((Vehicle)o).capacity;
        }
    }



