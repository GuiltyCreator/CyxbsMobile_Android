package com.mredrock.cyxbs.ui.Interface;

import com.amap.api.maps.AMap;
import com.amap.api.maps.model.MyLocationStyle;
import com.mredrock.cyxbs.model.SchoolCarLocation;

import java.util.List;

/**
 * Created by glossimar on 2018/1/29.
 */

public interface SchoolCarMapInterface {
    void initLocationMapButton (AMap aMap, MyLocationStyle locationStyle);
    void init(SchoolCarLocation carLocationInfo, long aLong, int carID);
}