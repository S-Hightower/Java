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
        for (int i = 0; i <= array.length; i++){
            total += i;
        }
        return total;
    }

    public String displayMenu(String list){
        String list = loadMenu.get(0);

    }


}