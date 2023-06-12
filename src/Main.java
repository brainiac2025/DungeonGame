public class Main {

    Variables myVariable= new Variables();

    private void initiateGame(){
        while (myVariable.gameOn){
            System.out.println("-----------------------------------");
            int enemyhealth=myVariable.rnd.nextInt(myVariable.enemy_max_health);
            String enemy=myVariable.enemies[myVariable.rnd.nextInt(myVariable.enemies.length)];
            System.out.println("\t<<< "+enemy+" has appeared!!! >>>\n");

            while(enemyhealth>0){
                System.out.println("\t Your Health Power: "+myVariable.player_health);
                System.out.println("\t"+enemy+"'s Health Power: "+ enemyhealth);
                System.out.println("\n\twhat who you like to do with enemy?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink Health potion");
                System.out.println("\t3. Run");

                String myinput=myVariable.input.nextLine();

                if(myinput.equals("1")){
                    int damagedone=myVariable.rnd.nextInt(myVariable.player_damage);
                    int damagetaken=myVariable.rnd.nextInt(myVariable.enemy_attack_damage);
                    enemyhealth-=damagedone;
                    myVariable.player_health-=damagetaken;
                    System.out.println("\t> You Strike the "+enemy+"for"+damagedone+" damage. ");
                    System.out.println("\t> You receive "+damagetaken+" in retaliation");

                    if(myVariable.player_health<=0) {
                        System.out.println("\t> You have taken Too much Damage\n You " +
                                "are too weak to continue the game");
                        break;
                    }
                }
                else if(myinput.equals("2")){
                    if(myVariable.player_health>0){
                        myVariable.player_health+=myVariable.health_potion_heal_amount;
                        myVariable.num_health_potion--;
                        System.out.println("\t> You drink a health potion of "+myVariable.health_potion_heal_amount
                        +"\n\t Your current health "+myVariable.player_health+ " HP.");
                    }

                }
                else if(myinput.equals("3")){

                }
                else{

                }
            }

        }

    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO DUNGEON ADVENTURE GAME");
    }
}