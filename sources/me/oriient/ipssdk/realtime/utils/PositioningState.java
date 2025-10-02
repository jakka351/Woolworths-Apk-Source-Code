package me.oriient.ipssdk.realtime.utils;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes8.dex */
public @interface PositioningState {
    public static final int CHANGING_ACTIVE_FLOOR = 4;
    public static final int IDLE = 0;
    public static final int POSITIONING = 2;
    public static final int WAITING_FOR_POSITIONING_START = 1;
    public static final int WAITING_FOR_POSITIONING_STOP = 3;
}
