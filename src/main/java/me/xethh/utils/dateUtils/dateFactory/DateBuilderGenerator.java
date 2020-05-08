package me.xethh.utils.dateUtils.dateFactory;

import me.xethh.utils.dateUtils.interfaces.Build;
import me.xethh.utils.dateUtils.date.DateBuilder;
import me.xethh.utils.dateUtils.datetime.DatetimeBuilder;

import java.util.Calendar;
import java.util.Date;

public interface DateBuilderGenerator {
    DateBuilder from(Date date);

    DateBuilder from(Date date, Build build);

    DateBuilder raw();

    DateBuilder now();

    DateBuilder from(Calendar cal);

    DateBuilder from(Calendar cal, Build build);

    DateBuilder from(Long longDate, Build build);

    default DateBuilder from(Long longDate) {
        return from(new Date(longDate));
    }

    DateBuilder from(DatetimeBuilder db);

    DateBuilder from(DateBuilder db);

    DateBuilder today();
}
