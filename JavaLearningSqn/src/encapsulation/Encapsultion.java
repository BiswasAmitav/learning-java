package encapsulation;

class Car{

    public static final int speed = 150;
    private String type;

    public String getType(){
        return type;
    }

    public String getRevenueData(){
        String data = "Revenue...!";
    }

    private int calculateRevenue(){
        return 12000;
    }

    public void setType(String type){
        this.type=type;
    }
}
public class Encapsultion {
    public static void main(String[] args) {

    }
}
