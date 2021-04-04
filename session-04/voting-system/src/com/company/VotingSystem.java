package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * this class will generate multiple voting and
 * users can make or attend a voting
 * @author Ali Noroozbeigy
 * @version 1
 */
public class VotingSystem {

    private ArrayList<Voting> votingList;

    /**
     * constructor of class that makes a list to save votings
     */
    public VotingSystem ()
    {
        votingList = new ArrayList<Voting>();
    }

    /**
     * this method will generate a new voting with given question
     * and type and also makes the polls of voting.
     * @param question is question of voting
     * @param type is type of voting
     */
    public void createVoting(String question, int type)
    {
        Voting voting = new Voting(type,question);
        votingList.add(voting);

        Scanner input = new Scanner(System.in);
        System.out.println("how many polls does your voting has?");

        int numPolls = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numPolls; i++) {
            System.out.println("enter poll "+(i+1)+" :");
            String str = input.nextLine();
            voting.createPoll(str);
        }
    }


    /**
     * this method will show the available votings to user
     */
    public void getVotingList ()
    {
        Iterator<Voting> it = votingList.iterator();

        int i = 1;

        while (it.hasNext())
        {
            System.out.println("Q "+(i++)+" :"+it.next().getQuestion());
        }
    }

    /**
     * will show the voting with index i with its polls
     * @param i is the index of voting
     */
    public void getVoting(int i)
    {
        if (i>=0 && i<votingList.size())
        {
            System.out.println(votingList.get(i).getQuestion());
            ArrayList<String>p = votingList.get(i).getPolls();
            for (String s : p)
            {
                System.out.println(s);
            }
        }
    }

    /**
     * this method will record a vote from a user
     * @param num is number of voting in list
     * @param person is the person who votes
     * @param choices is the voter choices
     */
    public void vote(int num, Person person, ArrayList<String> choices)
    {
        votingList.get(num).vote(person,choices);
    }

    /**
     * will print the result of voting with index num
     * @param num is the index of voting we want to see its result
     */
    public void getResult(int num)
    {
        votingList.get(num).printVotes();
    }

    /**
     * this method will returns the voting with index i
     * because of the operations need later
     * @param i is the index of voting
     * @return the voting with index i
     */
    public Voting returnVoting(int i)
    {
        if (i>=0 && i<votingList.size())
            return votingList.get(i);
        else
            return null;
    }


}
