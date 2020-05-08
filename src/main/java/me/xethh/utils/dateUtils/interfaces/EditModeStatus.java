package me.xethh.utils.dateUtils.interfaces;

/**
 * @author xethhung
 * Created on 7/19/2018
 */
public interface EditModeStatus<O extends Object> {
    O getEditingMode();

    O clearEditingMode();
}
