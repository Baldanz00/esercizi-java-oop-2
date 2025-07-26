package esercizio1;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("base");
        pizza.aggiungiMozzarella()
             .aggiungiPomodoro()
             .aggiungiProsciutto();
        
        System.out.println(pizza);
    }

}
