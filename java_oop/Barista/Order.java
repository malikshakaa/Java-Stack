import java.util.ArrayList;

public class Order{
    private String name;
    public double total;
    private boolean ready;
    private ArrayList<Item> items;
    public Order (){
        this.name = "Guest";
        items = new ArrayList<Item>();
    }
   public Order(String name){
       this.name =name; 

   }

   public String getName() {
    return  name;
}

public boolean getReady() {
    return  ready;
}

public void setReady(boolean isready) {
    ready = isready;
}

public void setName(String name) {
    this.name = name;
}

public String getStatusMessage (){
    if (ready==true){
        return "Your order is ready.";
    }
    else{
        return "Thank you for waiting. Your order will be ready soon.";
    }
}
public void display (ArrayList<String> dispalyOrder){
    for (int i = 0 ;i<dispalyOrder.size();i++){
        System.out.println();
    }
}

}