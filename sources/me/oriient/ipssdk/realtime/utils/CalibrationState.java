package me.oriient.ipssdk.realtime.utils;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes8.dex */
public @interface CalibrationState {
    public static final int CALIBRATING = 2;
    public static final int IDLE = 0;
    public static final int WAITING_FOR_CALIBRATION_START = 1;
    public static final int WAITING_FOR_CALIBRATION_STOP = 3;
}
