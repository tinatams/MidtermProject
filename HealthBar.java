public class HealthBar{
    private final int MAX_HEALTH = 100;
    private int currentHealth;

    public HealthBar(){
        currentHealth = MAX_HEALTH;
    }

    public void takeHealth(int amount){
        currentHealth -= amount;
    }
}