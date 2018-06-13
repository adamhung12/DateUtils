package me.xethh.utils;

import me.xethh.utils.dateManipulation.DateBuilder;
import me.xethh.utils.dateManipulation.DateInfo;
import me.xethh.utils.dateManipulation.Weekday;
import org.junit.Test;

import static me.xethh.utils.dateManipulation.Month.JAN;
import static me.xethh.utils.dateManipulation.Month.MAY;
import static me.xethh.utils.dateManipulation.Month.NOV;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class DateInfoTest
{

    @Test
    public void extractDate(){
        DateInfo dateInfo =
                DateBuilder.raw()
                        .hour(13).minute(23).second(34).ms(666)
                        .day(20).month(NOV).year(2078).view();
        assertEquals(2078,dateInfo.year().intValue());
        assertEquals(11,dateInfo.month().toNumber());
        assertEquals(20,dateInfo.day().intValue());
        assertEquals(666,dateInfo.ms().intValue());
        assertEquals(34,dateInfo.second().intValue());
        assertEquals(23,dateInfo.min().intValue());
        assertEquals(13,dateInfo.hour().intValue());
    }
    @Test
    public void weekdayTest(){
        DateBuilder d20180506 = DateBuilder.raw().year(2018).month(MAY).day(6);
        assertEquals(Weekday.Sunday,d20180506.view().weekday());
        assertEquals(Weekday.Monday,d20180506.operate().addDays(1).view().weekday());
        assertEquals(Weekday.Tuesday,d20180506.operate().addDays(2).view().weekday());
        assertEquals(Weekday.Wednesday,d20180506.operate().addDays(3).view().weekday());
        assertEquals(Weekday.Thursday,d20180506.operate().addDays(4).view().weekday());
        assertEquals(Weekday.Friday,d20180506.operate().addDays(5).view().weekday());
        assertEquals(Weekday.Saturday,d20180506.operate().addDays(6).view().weekday());
        assertEquals(Weekday.Sunday,d20180506.operate().addDays(7).view().weekday());
    }


}