package me.oriient.ipssdk.api.utils;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface IPSErrorCodes {
    public static final int ENGINE_BIND_FAILURE = 6;
    public static final int ENGINE_ERROR = 5;
    public static final int ENGINE_LIBRARIES_UNAVAILABLE = 15;
    public static final int INSUFFICIENT_HARDWARE = 9;
    public static final int INTERNAL = 0;
    public static final int INVALID_INPUT = 4;
    public static final int INVALID_STATE = 3;
    public static final int NOT_CONNECTED = 1;
    public static final int NO_BAROMETER_IN_MULTI_FLOOR_BUILDING = 13;
    public static final int NO_PERMISSION = 11;
    public static final int OUTSIDE_BUILDING = 12;
    public static final int OUT_OF_SPACE = 10;
    public static final int SENSOR_FAILURE = 14;
    public static final int SERVER_ERROR = 7;
    public static final int SERVER_INTERNAL = 2;
    public static final int TIMEOUT = 8;
}
