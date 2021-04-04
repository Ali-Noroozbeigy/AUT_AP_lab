package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.*;


/**
 * this is voting class that makes a new voting
 * subject and allows people to attend and vote.
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Voting {

    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> polls;


    /**
     * constructor for class that makes a new voting with
     * the subject given. if type be 0 means
     * choosing 1 poll is allowed and if it be 1
     * means multiple choosing is allowed.
     * @param type is type of voting
     * @param question is question of voting
     */
    public Voting(int type, String question)
    {
        this.type = type;
        this.question = question;
        polls = new HashMap<String, HashSet<Vote>>();
        voters = new ArrayList<Person>();
    }

    /**
     * getter for question of voting
     * @return question of voting
     */
    public String getQuestion() {
        return question;
    }

    /**
     * makes a new poll in voting with given string
     * @param poll is the poll we want to create
     */
    public void createPoll(String poll)
    {
        polls.put(poll,null);
    }

    /**
     * a class that records vote of each person and checks if
     * a person has attended before or not
     * @param person is voter to this voting
     * @param poll is the polls that voter chose.
     */
    public void vote(Person person, ArrayList<String>poll )
    {

        if (voters!=null)
        {
            for(Person p:voters)
            {
                if (person.toString().equals(p.toString()))
                {
                    System.out.println("you have voted before!");
                    return;
                }
            }
        }

        JalaliCalendar jc = new JalaliCalendar(new GregorianCalendar());
        Vote vote = new Vote(person, jc.toString());

        for (String p : poll)
        {
            HashSet<Vote> tempSet = polls.get(p);
            if(tempSet == null)
            {
                tempSet = new HashSet<Vote>();
                polls.put(p,tempSet);
            }

            tempSet.add(vote);
            voters.add(person);

        }
    }


    /**
     * getter for people who attend in voting
     * @return voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * prints the result of voting with the number of
     * people who vote to each poll
     */
    public void printVotes()
    {
        for (Map.Entry<String, HashSet<Vote>> entry : polls.entrySet())
        {
            if(entry.getValue() == null)
                System.out.println(entry.getKey() + " : " + "0");
            else
                System.out.println(entry.getKey() + " : " + entry.getValue().size());
        }
    }

    /**
     * getter for list of polls of voting
     * @return polls of voting
     */
    public ArrayList<String> getPolls ()
    {
        ArrayList<String> listPolls = new ArrayList<String>();

        for (Map.Entry<String, HashSet<Vote>> entry : polls.entrySet())
        {
            listPolls.add(entry.getKey());
        }

        return listPolls;
    }

    /**
     * getter for type of voting
     * @return
     */
    public int getType() {
        return type;
    }
}
