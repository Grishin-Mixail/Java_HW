import java.util.*;

public class Laptop {
    Integer id;
    String manufacturer;
    String model;
    Integer memory;
    String operSystem;
    Integer ssdCapasity;
    String color;
    Double weight;

Laptop(){
    id = null;   
    manufacturer = null;
    model = null;
    operSystem = "Windows";
    Random rand = new Random();
    ssdCapasity = (rand.nextInt(128,1024));
    color = "Black";
    weight = (rand.nextDouble(1, 3));
    }

Laptop(Integer i, String man, String mod, Integer mem, String osys, Integer sc, String col, Double w){
    id = i;
    manufacturer = man;
    model = mod;
    memory = mem;
    operSystem = osys;
    ssdCapasity = sc;
    color = col;
    weight = w;
    }

@Override
    public String toString(){
    String str;
    str = "id: " + id + "\n" + "Manufacturer: " +  manufacturer +"\n"
        + "Model: " + model + "\n" + "Memory: " +  memory +"\n" 
        + "Operation System: " + operSystem + "\n" + "SSD Capacity: " +  ssdCapasity +"\n"
        + "Color: " + color + "\n" + "Weight: " +  weight;
    return str;
}

@Override
public boolean equals(Object o){
    Laptop a = (Laptop) o;
    if (this.manufacturer == a.manufacturer && this.model == a.model) return true;
    else return false;
}


}




