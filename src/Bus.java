public class Bus extends Vehicle {

    int iloscMiejsc;

    Bus()
    {
     //   super ("volkswagen");
        System.out.println("Bus construktor");
    }

    @Override
    public String toString() {
        return super.toString() + "Bus{iloscMiejsc= " + this.iloscMiejsc + "}";
    }
}
/*   @Override
    public String toString(){
        return "Marka" + this.brand;
    }

  */

