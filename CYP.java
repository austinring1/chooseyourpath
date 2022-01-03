/*Choose Your Path Project
Author: Austin Ring
Date: 2/1/2022
Course: APCSA
Description: Simulates a "Choose Your Path" type game where the user can play along nine different predetermined paths.
Precondition(s): User must input several yes or no choices after which the computer will display a relevant message.
Postcondition(s): A full adventure game will be printed depending on the user's choices.
**************************************************************************************/

import java.util.Scanner;

public class CYP
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean finished = false;
        String eatBear = "";
        String eatAnotherBear = "";
        String attackBear = "";
        String askFood = "";
        String eatSoup = "";
        String askWhatFood = "";
        String eatMushroom = "";
        String noob = "";
        boolean tutorial = true;
        boolean antidote = false;
        double random;


        random = Math.random() * 10 + 1;
        if (random == 1.0){
            antidote = true;
        }

        System.out.println("You are in a candy world filled with no other life form than live, human-sized gummy bears.");
            


                if (antidote == true){
                    System.out.println("You find a vile of antidote, and store it in your back pocket.");
                    }

                System.out.print("Do you eat a gummy bear? (Y/N): ");
            
                 eatBear = scanner.nextLine();

                if(eatBear.contains("Y")){
                    System.out.println("The bears around you look on in horror.");
                    System.out.print("Do you eat another bear, or apologize? (Y for eat / N for apologize): ");

                    eatAnotherBear = scanner.nextLine();

                    if (eatAnotherBear.contains("Y")){
                        System.out.println("The bears start getting hostile, and move in to vanquish their newfound enemy.");
                        System.out.print("Do you attack the bears, or apologize? (Y for attack / N for apologize): ");

                        attackBear = scanner.nextLine();

                        if(attackBear.contains("Y")){
                            System.out.println("The bears are well armed, and after a long and hard battle, you die.");
                            System.out.println("YOU DIED.");
                            finished = true;
                        }
                        
                        if (attackBear.contains("N")){
                            System.out.println("You put your hands up and admit defeat, and you're taken to a prison in the area.");
                            System.out.println("YOU LIVE.");
                            finished = true;
                        }
                    }
                    
                    if (eatAnotherBear.contains("N")){
                        System.out.println("The bears understand your mistake, but mourn the loss of their friend.");
                        System.out.print("Do you ask the bears what to eat? (Y/N): ");

                        askWhatFood = scanner.nextLine();

                        if (askWhatFood.contains("Y")){
                            System.out.println("The bears show you around their candy world, and ensure that you're well fed.");
                            System.out.println("YOU LIVE.");
                            finished = true;
                        }
                        
                        if (askWhatFood.contains("N")){
                            System.out.println("You starve.");
                            System.out.println("YOU DIED.");
                            finished = true;
                        }
                    }
                }

                else if(eatBear.contains("N")){
                    System.out.println("You befriend a bear who shows you around his candy world, but you start getting hungry.");
                    System.out.print("Do you ask the bear for food? (Y/N): ");

                    askFood = scanner.nextLine();

                    if (askFood.contains("Y")){
                        System.out.println("The bear gives you marshmallow soup, a local delicacy.");
                        System.out.print("Do you eat the marshmallow soup? (Y/N): ");

                        eatSoup = scanner.nextLine();

                        if (eatSoup.contains("Y")){
                            System.out.println("The soup is excellent, and you and the bear become lifelong friends.");
                            System.out.println("YOU LIVE!");
                            finished = true;
                        }

                        if (eatSoup.contains("N")){
                            System.out.println("The bears are angered by your bad manners and unwillingness to try their delicacies, and you go to prison!");
                            System.out.println("YOU LIVE.");
                            finished = true;
                        }
                    }

                    if (askFood.contains("N")){
                        System.out.println("You are starving, and look around for possible sources of food.");
                        System.out.print("You find a large marshmallow mushroom. Do you eat it? (Y/N): ");

                        eatMushroom = scanner.nextLine();

                        if (eatMushroom.contains("Y") && (antidote == true)){
                            System.out.println("The mushroom was good, but turned out to be poisonous. Your antidote saved your life!");
                            System.out.println("YOU LIVE.");
                            finished = true;
                        }

                        if (eatMushroom.contains("Y")){
                            System.out.println("The mushroom was good, but turned out to be poisonous. Never eat wild mushrooms!");
                            System.out.println("YOU DIED.");
                            finished = true;
                        }

                        if (eatMushroom.contains("N")){
                            System.out.println("You starve.");
                            System.out.println("YOU DIED.");
                            finished = true;
                        }
                    }
                }
    }
}