import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CafeUtil{

    public Integer getStreakGoal() {
        int sum = 0;
        for (int i=0; i <= 10; i++){
            sum += i;
        }
        return sum;
    }

    public Double getOrderTotal(double[] array) {
        double total = 0;
        for (double price: array){
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> loadMenu){
        for(int i = 0; i<loadMenu.size(); i++){
            System.out.println(loadMenu.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!", userName);
        System.out.println("There are " + customers.size()+ " people in front of you.");
        customers.add(userName);
        System.out.println("-----Currently in line:-----");
        for(int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i));
        }
    }
}