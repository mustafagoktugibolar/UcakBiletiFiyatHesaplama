
public class Passenger implements Ticket{
    private int age;
    private int distance;
    private boolean twoWay = false;
    static double price = 0;
    private double km = 0.1;
    private double discount;

    public Passenger() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isTwoWay() {
        return twoWay;
    }

    public void setTwoWay(boolean twoWay) {
        this.twoWay = twoWay;
    }

    @Override
    public void checkAge(int age) {
        if(age < 12){
            discount = 0.5; 
        }
        else if(age <= 24){
            discount = 0.9;
        }
        else if(age >= 65){
            discount = 0.7;
        }
        else{
            discount = 1;
        }    
    }
    @Override
    public void checkDistance(int distance) {
        price = km * distance * discount;    
    }

    @Override
    public void checkTwoWay(String input) {
        if(input.equals("yes")){
            twoWay = true;
        }
        else if(input.equals("no")){
            twoWay = false;
        }
        else{
            System.out.println("Unvalid process!");
        }
        if(twoWay == true){
            price = ((price * 16) / 10);
        }   
    }  
}
