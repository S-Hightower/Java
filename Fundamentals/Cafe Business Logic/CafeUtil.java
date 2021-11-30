public class CafeUtil{

    public Integer getStreakGoal() {
        int sum = 0;
        for (int i=0; i <= 10; i++){
            sum += sum + 1;
        }
        return sum;
    }


}