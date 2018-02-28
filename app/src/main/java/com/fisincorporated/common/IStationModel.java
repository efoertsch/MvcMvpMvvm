package com.fisincorporated.common;

import java.util.List;

public interface IStationModel {
    List<IStationControl> getStationControls();

    String getStationName();

    String getBigButtonName();

    void setLogText(String logText);

    String getLogText();

    void setStationSwitchValue(int position, boolean onOff);
}
