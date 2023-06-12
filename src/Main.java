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
                    System.out.println("\t> You Strike the "+enemy+" for "+damagedone+" damage. ");
                    System.out.println("\t> You receive "+damagetaken+" in retaliation");

                    if(myVariable.player_health<1) {
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
                        +"\n\t You have "+myVariable.player_health+ " amount of HP."+ "\n\t> You have "+myVariable.num_health_potion+
                                " Health Potion Left \n");
                    }
                    else{
                        System.out.println("\t> You have no health potion left!!\n" +
                                "Defeat your ennemy for a chance to get one!!!");
                    }

                }
                else if(myinput.equals("3")){
                    System.out.println("\t> You are not Strong!!!\n\t You run away from the enemy "+enemy+" !!");
                    break;

                }
                else{
                    System.out.println("\t> You have enter an invalid Command!!");
                }
            }
            if(myVariable.player_health<1){
                System.out.println("You are not strong to play the battle!!");
                break;
            }
            System.out.println("__________________________________");
            System.out.println("# "+enemy+" was defeated! #");
            System.out.println("# You have "+myVariable.player_health+" HP left #");

            if (myVariable.rnd.nextInt(100)< myVariable.health_potion_drop_chance){
                myVariable.num_health_potion++;
                System.out.println("# The "+ enemy+ " dropped a health potion! #");
                System.out.println("# You have "+myVariable.num_health_potion+" Health potion #");

            }
            System.out.println("___________________________________");
            System.out.println("What would you like to do now? ");
            System.out.println("1 Continue Fighting? ");
            System.out.println("2 Exit Game");
            String input=myVariable.input.nextLine();

            while(!input.equals("1") && !input.equals("2")){
                System.out.println("Invalid Command");
                input=myVariable.input.nextLine();
            }
            if(input.equals("1")){
                System.out.println("You can continue your adventure");

            }
            else if(input.equals("2")){
                System.out.println("You have successfully exit the game");
                break;
            }
        }

    }
    public static void GameOn(){

    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO DUNGEON ADVENTURE GAME");
        Main game= new Main();
        game.initiateGame();

    }
}