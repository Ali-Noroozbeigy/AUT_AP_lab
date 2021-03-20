package com.company;

/**
 * this class shows the numbers that should be shown in
 * digital clock and makes the clock go ahead
 * @author Ali_Nrb
 * @version 1
 */
public class ClockDisplay {

    private NumberDisplay hour;
    private NumberDisplay minute;
    private NumberDisplay second;


    /**
     * constructor for class if we want the clock to start
     * from beginning
     */
    public ClockDisplay()
    {
        this.hour = new NumberDisplay(24);
        this.minute = new NumberDisplay(60);
        this.second = new NumberDisplay(60);
    }


    /**
     * constructor for class if we want to start from specific time
     * @param hour sets hour
     * @param minute sets minute
     * @param second sets second
     */
    public ClockDisplay(int hour, int minute, int second )
    {
        this.hour = new NumberDisplay(24);
        this.minute = new NumberDisplay(60);
        this.second = new NumberDisplay(60);

        this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);

    }


    /**
     * this a method to print standard time as clock goes on
     * @return standard state od clock hh:mm:ss
     */
    public String getTime()
    {
        return    (hour.arrangeValue() +" : "+
                   minute.arrangeValue()+" : "+
                   second.arrangeValue());
    }


    /**
     * a method for incrementation of clock
     */
    public void timeTick ()
    {
        second.increment();
        if(second.getValue()==0)
        {
            minute.increment();
            if(minute.getValue()==0)
                hour.increment();
        }


    }






}
