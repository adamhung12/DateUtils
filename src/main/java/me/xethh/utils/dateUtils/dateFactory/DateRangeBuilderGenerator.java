package me.xethh.utils.dateUtils.dateFactory;

import me.xethh.utils.dateUtils.date.DateBuilder;
import me.xethh.utils.dateUtils.range.datetime.DatetimeRange;

import java.util.Calendar;
import java.util.Date;

public interface DateRangeBuilderGenerator extends DateBuilderGenerator {
    DatetimeRange rangeOn(DateBuilder dateBuilder);

    default DatetimeRange rangeOnNow() {
        return rangeOn(now());
    }

    default DatetimeRange rangeOn(Date date) {
        return rangeOn(from(date));
    }

    default DatetimeRange rangeOn(Long dateLong) {
        return rangeOn(from(dateLong));
    }

    default DatetimeRange rangeOn(Calendar cal) {
        return rangeOn(from(cal));
    }

}