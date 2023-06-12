import java.util.Random;
import java.util.Scanner;

public class Variables {
   protected Scanner input= new Scanner(System.in);
   protected Random rnd= new Random();

   protected int enemy_max_health=70;
   protected int enemy_attack_damage=30;

   protected int player_health=100;
   protected int player_damage=25;
   protected int num_health_potion=4;
   protected int health_potion_heal_amount=30;
   protected int health_potion_drop_chance=50;

   protected boolean gameOn=true;

   String[]enemies={"Assasin", "Skeleton", "Warrior", "Zombie"};



}
