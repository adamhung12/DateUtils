package me.xethh.utils.v6.datetime;

import me.xethh.utils.dateUtils.datetime.DatetimeBuilder;
import me.xethh.utils.dateUtils.datetime.DatetimeBuilderInterface;
import me.xethh.utils.dateUtils.datetimeFactory.DatetimeFactory;
import me.xethh.utils.dateUtils.formatBuilder.DateFormatBuilderFactory;
import me.xethh.utils.dateUtils.interfaces.Build;
import me.xethh.utils.dateUtils.month.Month;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class DatetimeFactoryImplTest {

    @Test
    public void datetimeFactoryDefaultTest() {
        DatetimeFactory df = DatetimeFactory.instance();
        SimpleDateFormat sdf = DateFormatBuilderFactory.ISO8601();
        DatetimeBuilderInterface db = df.raw();
        assertEquals("1970-01-01T00:00:00.000+0800", sdf.format(db.asDate()));
        DatetimeBuilder dateBuilder = new DatetimeBuilder(df.getTimezone());

        assertEquals("2088-01-14T20:11:44.777+0800",
                sdf.format(df.from(
                        dateBuilder.ymd(2088, Month.JAN, 14).hmsms(20, 11, 44, 777).asCalendar()
                ).asDate())
        );

        assertEquals("2088-01-14T20:11:44.777+0800",
                sdf.format(df.from(
                        dateBuilder.ymd(2088, Month.JAN, 14).hmsms(20, 11, 44, 777).asDate()
                ).asDate())
        );

        assertEquals("2088-01-14T20:11:44.777+0800",
                sdf.format(df.from(
                        dateBuilder.ymd(2088, Month.JAN, 14).hmsms(20, 11, 44, 777).asLong()
                ).asDate())
        );

        assertEquals("2077-01-14T20:11:44.777+0800",
                sdf.format(df.from(
                        dateBuilder.ymd(2088, Month.JAN, 14).hmsms(20, 11, 44, 777).asDate()
                        ,
                        new Build() {
                            @Override
                            public Calendar apply(Calendar cal) {
                                cal.set(Calendar.YEAR, 2077);
                                return cal;
                            }
                        }
                ).asDate())
        );

        assertEquals("2077-01-14T20:11:44.777+0800",
                sdf.format(df.from(
                        dateBuilder.ymd(2088, Month.JAN, 14).hmsms(20, 11, 44, 777).asLong()
                        ,
                        new Build() {
                            @Override
                            public Calendar apply(Calendar cal) {
                                cal.set(Calendar.YEAR, 2077);
                                return cal;
                            }
                        }
                ).asDate())
        );

        assertEquals("2077-01-14T20:11:44.777+0800",
                sdf.format(df.from(
                        dateBuilder.ymd(2088, Month.JAN, 14).hmsms(20, 11, 44, 777).asCalendar()
                        ,
                        new Build() {
                            @Override
                            public Calendar apply(Calendar cal) {
                                cal.set(Calendar.YEAR, 2077);
                                return cal;
                            }
                        }
                ).asDate())
        );

    }
}
