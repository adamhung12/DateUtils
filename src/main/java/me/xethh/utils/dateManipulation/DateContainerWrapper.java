package me.xethh.utils.dateManipulation;

import me.xethh.utils.rangeManipulation.DatetimeRange;

/**
 * @author xethhung
 * Created on 7/19/2018
 */
public interface DateContainerWrapper<X extends DateContainerWrapper<X, T>, T extends EditModeStatus> extends DateBuilder<X>, ContainerWrapper<T>{
}
