package me.oriient.ipssdk.api.utils;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface IPSSensors {
    public static final int ACCELEROMETER = 2;
    public static final int GAME_ROTATION_VECTOR = 5;
    public static final int GYROSCOPE = 1;
    public static final int GYROSCOPE_UNCALIBRATED = 7;
    public static final int MAGNETIC_FIELD = 3;
    public static final int MAGNETIC_FIELD_UNCALIBRATED = 4;
    public static final int PRESSURE = 6;
}
