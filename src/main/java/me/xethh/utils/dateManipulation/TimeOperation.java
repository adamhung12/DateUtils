package me.xethh.utils.dateManipulation;

import java.util.Calendar;
import java.util.Date;

public class TimeOperation {
    private DateBuilder dateBuilder;

    /*
    Constructor
     */
    private TimeOperation(DateBuilder dateBuilder){
        this.dateBuilder = dateBuilder;
    }

    public static TimeOperation raw(){
        return new TimeOperation(DateBuilder.raw());
    }
    public static TimeOperation from(Date date){
        return new TimeOperation(DateBuilder.from(date));
    }
    public static TimeOperation from(DateBuilder builder){
        return new TimeOperation(builder);
    }

    /*
    Convert to other form
     */
    public DateBuilder asBuilder(){
        return dateBuilder;
    }
    public Date asDate(){
        return dateBuilder.asDate();
    }
    public Calendar asCalendar(){
        return dateBuilder.asCalendar();
    }
    public Long asLong(){
        return dateBuilder.asDate().getTime();
    }
    public DateComparator asComparator(){
        return dateBuilder.asComparator();
    }
    public DateInfo view(){
        return dateBuilder.view();
    }

    /*
    Operation
     */
    public TimeOperation addYear(final int years){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.YEAR,years);
                return this;
            }
        }));
    }
    public TimeOperation lastYear(){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.YEAR,-1);
                return this;
            }
        }));
    }
    public TimeOperation nextYear(){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.YEAR,1);
                return this;
            }
        }));
    }
    public TimeOperation lastMonth(){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.MONTH,-1);
                return this;
            }
        }));
    }
    public TimeOperation nextMonth(){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.MONTH,1);
                return this;
            }
        }));
    }
    public TimeOperation addMonths(final int months){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.MONTH,months);
                return this;
            }
        }));
    }

    public TimeOperation addDays(final int days){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.DAY_OF_MONTH,days);
                return this;
            }
        }));
    }
    public TimeOperation yesterday(){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.DAY_OF_MONTH,-1);
                return this;
            }
        }));
    }
    public TimeOperation tomorrow(){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.DAY_OF_MONTH,1);
                return this;
            }
        }));
    }

    public TimeOperation addHours(final int hours){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.HOUR_OF_DAY,hours);
                return this;
            }
        }));
    }

    public TimeOperation addMins(final int mins){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.MINUTE,mins);
                return this;
            }
        }));
    }

    public TimeOperation addSecond(final int sec){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.SECOND,sec);
                return this;
            }
        }));
    }

    public TimeOperation addMS(final int ms){
        return new TimeOperation(DateBuilder.from(dateBuilder.getBuilds(),new DateBuilder.Build(){
            @Override
            public DateBuilder.Build apply(Calendar cal) {
                cal.add(Calendar.MILLISECOND,ms);
                return this;
            }
        }));
    }
}