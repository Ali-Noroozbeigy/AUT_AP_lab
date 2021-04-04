package com.company;



import java.util.ArrayList;
import java.util.Scanner;


/**
 * main class of project
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Main {

    public static void main(String[] args) {

        menu();

    }

    /**
     * menu method to create and attend votings.
     */
    public static void menu()
    {
        Scanner input = new Scanner(System.in);
        VotingSystem vs = new VotingSystem();


        String question;
        String firstName, lastName,ch;
        ArrayList<String> poll = new ArrayList<String>();
        int type;

        int choice = 0;

        while (choice != 3)
        {
            System.out.println("1)making a new voting");
            System.out.println("2)attending a voting");
            System.out.println("3)exit");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("enter question :");
                    question = input.nextLine();
                    System.out.println("enter type (0/1) :");
                    type = input.nextInt();
                    input.nextLine();
                    vs.createVoting(question, type);
                    System.out.println("voting created!");
                    break;
                case 2:
                    System.out.println("enter your first name:");
                    firstName = input.nextLine();
                    System.out.println("enter your last name :");
                    lastName = input.nextLine();
                    vs.getVotingList();
                    System.out.println("choose one of them : ");
                    int vNum = input.nextInt();
                    input.nextLine();
                    vs.getVoting(vNum-1);
                    if (vs.returnVoting(vNum-1).getType() == 0)
                    {
                        System.out.println("enter your choice :");
                        ch = input.nextLine();
                        poll.add(ch);
                        vs.vote(vNum-1,new Person(firstName,lastName),poll);
                        System.out.println("thanks for your opinion!");
                    }
                    else
                    {
                        System.out.println("how many polls want to choose?");
                        int nCh = input.nextInt();
                        input.nextLine();
                        for (int i = 0; i < nCh; i++) {
                            System.out.println("enter your choice :");
                            ch = input.nextLine();
                            poll.add(ch);
                        }
                        vs.vote(vNum-1,new Person(firstName,lastName),poll);
                        System.out.println("thanks for your opinion!");
                    }
                    vs.getResult(vNum-1);
                    poll.clear();
                    break;
                default:
                    choice = 3;
                    break;
            }

        }
    }
}
