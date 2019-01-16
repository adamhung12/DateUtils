package me.xethh.utils.dateManipulation;

import me.xethh.utils.TimeUnit;
import me.xethh.utils.rangeManipulation.BuilderOperation;
import me.xethh.utils.rangeManipulation.DatetimeRange;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public interface DateBuilder<T extends DateBuilder<T>> extends CalendarDateBuilder<T>{
    @Override
    T y(int year);

    @Override
    T ym(int year, Month month);

    @Override
    T md(Month month, int day);

    @Override
    T ymd(int year, Month month, int day);

    @Override
    T minYear();

    @Override
    T year(final int year);

    @Override
    T minMonth();

    @Override
    T month(final Month month);

    @Override
    T minDay();

    @Override
    T day(final int date);

    @Override
    T firstDayOfMonth();

    @Override
    T endDayOfMonth();

    @Override
    T addYear(final int years);

    @Override
    T lastYear();

    @Override
    T nextYear();

    @Override
    T lastMonth();

    @Override
    T nextMonth();

    @Override
    T addMonths(final int months);

    @Override
    T addDays(final int days);

    @Override
    T yesterday();

    @Override
    T tomorrow();

    @Override
    T nextWeekday(Weekday day);

    @Override
    T prevWeekday(Weekday day);

    @Override
    T startOfWeek(Weekday startDay);

    @Override
    T endOfWeek(Weekday startDay);

    T hmsms(int hour, int minute, int second, int mSecond);
    T hms(int hour, int minute, int second);
    T hm(int hour, int minute);
    T h(int hour);


    /*
    Hour part
     */
    T minHour();
    T maxHour();
    T hour(final int hour);

    /*
    Minute part
     */
    T minMinute();
    T maxMinute();
    T minute(final int min);

    /*
    Second part
     */
    T minSecond();
    T maxSecond();
    T second(final int second);

    /*
    Millisecond
     */
    T minMs();
    T maxMs();
    T ms(final int ms);

    T timeZone(final BaseTimeZone timeZone);

    /*
    Time manipulation
     */

    /**
     * Cast the date builder object to maximum day time of the day up to millisecond
     * 2018-11-12 23:33:44.444 to 2018-11-12 23:59:59.999
     * @return maximum date time value up to millisecond
     */
    T maxDayTime();
    /**
     * Cast the date builder object to maximum day time of the day up to second
     * 2018-11-12 23:33:44.444 to 2018-11-12 23:59:59.000
     * @return maximum date time value up to second
     */
    T maxDayTimeSec();
    /**
     * Cast the date builder object to maximum day time of the day up to minutes
     * 2018-11-12 23:33:44.444 to 2018-11-12 23:59:00.000
     * @return maximum date time value up to minutes
     */
    T maxDayTimeMin();
    /**
     * Cast the date builder object to minimum day time of the day up to millisecond
     * 2018-11-12 23:33:44.444 to 2018-11-12 00:00:00.000
     * @return minimum date time value up to millisecond
     */
    T minDayTime();
    T timePartOnly();

    Date asDate();
    Calendar asCalendar();
    Long asLong();
    java.sql.Date asSqlDate();
    java.sql.Time asSqlTime();
    java.sql.Timestamp asSqlTimestamp();

    DateInfo view();

    DatetimeRange rangeTo(T date);

    DatetimeRange rangeFrom(T date);

    DatetimeRange rangeTo(Date date);

    DatetimeRange rangeFrom(Date date);

    DatetimeRange rangeWithBuilder(BuilderOperation start, BuilderOperation end);

    T addTime(final long time);

    T addHours(final int hours);

    T addMins(final int mins);

    T addSecond(final int sec);

    T addMS(final int ms);

    //Compare operation
    boolean sameDatetime(T builder);
    boolean sameDatetime(Long longDate);
    boolean sameDatetime(Date date);
    boolean sameDatetime(Calendar cal);

    boolean sameYear(T builder);
    boolean sameYear(Long longDate);
    boolean sameYear(Date date);
    boolean sameYear(Calendar cal);

    boolean sameMonth(T builder);
    boolean sameMonth(Long longDate);

    boolean sameMonth(Date date);
    boolean sameMonth(Calendar cal);

    boolean sameDay(T builder);
    boolean sameDay(Long longDate);
    boolean sameDay(Date date);
    boolean sameDay(Calendar cal);

    boolean sameTime(T dateBuilder);
    boolean sameTime(Long dateLong);
    boolean sameTime(Date date);
    boolean sameTime(Calendar calendar);

    boolean sameHMS(T dateBuilder);
    boolean sameHMS(Long dateLong);
    boolean sameHMS(Date date);
    boolean sameHMS(Calendar calendar);

    boolean sameHM(T dateBuilder);
    boolean sameHM(Long dateLong);
    boolean sameHM(Date date);
    boolean sameHM(Calendar calendar);

    boolean laterThan(T dateBuilder);
    boolean laterThan(Date date);
    boolean laterThan(Long longDate);
    boolean laterThan(Calendar calendar);

    boolean laterEqualThan(T dateBuilder);
    boolean laterEqualThan(Date date);
    boolean laterEqualThan(Long longDate);
    boolean laterEqualThan(Calendar calendar);

    boolean before(T dateBuilder);
    boolean before(Date date);
    boolean before(Long longDate);
    boolean before(Calendar calendar);

    boolean beforeEqual(T dateBuilder);
    boolean beforeEqual(Date date);
    boolean beforeEqual(Long longDate);
    boolean beforeEqual(Calendar calendar);

    TimeUnit diffFrom(Date date);
    TimeUnit diffTo(Date date);
    TimeUnit diffFrom(DateBuilder date);
    TimeUnit diffTo(DateBuilder date);
    TimeUnit diffFrom(long date);
    TimeUnit diffTo(long date);
    TimeUnit diffFrom(Calendar date);
    TimeUnit diffTo(Calendar date);

    String format(String format);
    String format(DateFormatBuilder.Format format);
    String format(SimpleDateFormat fmt);
    String format(DateFormatBuilder fmtBuilder);

    String format(TimeZone timeZone, String format);
    String format(TimeZone timeZone, DateFormatBuilder.Format format);
    String format(TimeZone timeZone, SimpleDateFormat fmt);
}
