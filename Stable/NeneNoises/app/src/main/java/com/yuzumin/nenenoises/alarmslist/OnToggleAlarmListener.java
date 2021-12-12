package com.yuzumin.nenenoises.alarmslist;

import com.yuzumin.nenenoises.data.Alarm;

public interface OnToggleAlarmListener {
    void onToggle(Alarm alarm);
    void onRemove(Alarm alarm);
}
