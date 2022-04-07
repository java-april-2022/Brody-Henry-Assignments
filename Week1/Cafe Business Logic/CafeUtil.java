import java.util.ArrayList;

public class CafeUtil{
    


    public int getStreakGoal() {
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double totalPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            totalPrice = totalPrice + prices[i];
        }
        return totalPrice;
    }

    void displayMenu(ArrayList<String> cafeMenu) {
    for(int i = 0; i < cafeMenu.size(); i++){
    //come back and use string interpulation,  figure out how to straighten out lines in terminal
        System.out.printf("%s %s", i, cafeMenu.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("-----Please Enter your Name-----");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName);
    //change this to string interpulation 
        System.out.printf("There are %s people ahead of you.", customers.size());
        customers.add(userName);
    // uncomment to display customers created IN the list
    // System.out.println(customers);
    }
}