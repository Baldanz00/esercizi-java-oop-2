public class Pizza {
    private String ingredienti;

    public Pizza(String ingredienti) {
        this.ingredienti = ingredienti;
    }
    public Pizza aggiungiMozzarella() {
        this.ingredienti += ", mozzarella";
        return this;
    }
    public Pizza aggiungiPomodoro() {
        this.ingredienti += ", pomodoro";
        return this;
    }
    public Pizza aggiungiProsciutto() {
        this.ingredienti += ", prosciutto";
        return this;
    }

    @Override
    public String toString() {
        if(ingredienti.endsWith(", ")) {
            ingredienti = ingredienti.substring(0, ingredienti.length() - 2);
        }
        return "Pizza con ingredienti: " + ingredienti;
    }

}
