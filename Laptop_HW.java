import java.util.*;

public class Laptop_HW {

    public static void main(String[] args){
        
        Laptop dell1 = new Laptop(1, "Dell", "Precision", 16, "Windows",  256, "White", 1.52);
        Laptop dell2 = new Laptop(2, "Dell", "Precision", 32, "Windows",  512, "Black", 1.6);
        Laptop dell3 = new Laptop(3, "Dell", "Latitude", 32, "Windows",  128, "Black", 1.1);
        Laptop dell4 = new Laptop(4, "Dell", "Latitude", 64, "Windows",  1024, "White", 1.9);

        System.out.println(dell4.toString());

        //var Laptops = new HashSet<Laptop>(Arrays.asList(dell1, dell2, dell3, dell4));

        
        System.out.println("Input a sorting criteria:");
        System.out.println("1 - sort by memory.   2 - sort by SSD capacity.");
        System.out.println("3 - sort by weight.   4 - sort by Operation System4.");


        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();
            if(choice == 1){
                System.out.printf("Input necesssary memory volume: ");
                Integer ram = sc.nextInt();
                if(ram <= dell1.memory){
                    System.out.printf(dell1.toString() + "\n");
                }if(ram <= dell2.memory){
                    System.out.printf(dell2.toString() + "\n");
                }if(ram <= dell3.memory){
                    System.out.printf(dell3.toString() + "\n");
                }if(ram <= dell4.memory){
                    System.out.printf(dell4.toString() + "\n");
                }else System.out.println("There are not laptops for your criteria!");
            }
            else if(choice == 2){
                System.out.printf("Input necesssary SSD capasity: ");
                Integer ssd = sc.nextInt();
                if(ssd <= dell1.ssdCapasity){
                    System.out.printf(dell1.toString()+ "\n");
                }if(ssd <= dell2.ssdCapasity){
                    System.out.printf(dell2.toString() + "\n");
                }if(ssd <= dell3.ssdCapasity){
                    System.out.printf(dell3.toString() + "\n");
                }if(ssd <= dell4.ssdCapasity){
                    System.out.printf(dell4.toString() + "\n");
                }else System.out.println("There are not laptops for your criteria!");
            }
            else if(choice == 3){
                System.out.printf("Input necesssary weight: ");
                Integer weight = sc.nextInt();
                if(weight <= dell1.ssdCapasity){
                    System.out.printf(dell1.toString()+ "\n");
                }if(weight <= dell2.ssdCapasity){
                    System.out.printf(dell2.toString() + "\n");
                }if(weight <= dell3.ssdCapasity){
                    System.out.printf(dell3.toString() + "\n");
                }if(weight <= dell4.ssdCapasity){
                    System.out.printf(dell4.toString() + "\n");
                }else System.out.println("There are not laptops for your criteria!");
            }
            else if(choice == 4){
                System.out.println("Input a Operation System: ");
                Scanner t = new Scanner(System.in);
                String os = t.nextLine();
                if(os.equals(dell1.operSystem)){
                    System.out.printf(dell1.toString() + "\n");
                }if(os.equals(dell2.operSystem)){
                    System.out.printf(dell2.toString() + "\n");
                }if(os.equals(dell3.operSystem)){
                    System.out.printf(dell3.toString() + "\n");
                }if(os.equals(dell4.operSystem)){
                        System.out.printf(dell4.toString() + "\n");
                }else System.out.println("There are not laptops for your criteria!");
                t.close();
                }
                
            sc.close();









    }  
    

}
