public class Punch implements Attack {
    public static void damage(Entity attacked){
        attacked.takeDamage(10);
    }

    public static void animate(Entity attacker){

    }
}