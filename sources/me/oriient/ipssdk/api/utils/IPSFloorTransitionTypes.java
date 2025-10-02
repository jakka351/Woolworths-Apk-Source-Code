package me.oriient.ipssdk.api.utils;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface IPSFloorTransitionTypes {
    public static final int ELEVATOR = 1;
    public static final int ESCALATOR = 2;
    public static final int RAMP = 3;
    public static final int STAIRS = 0;
}
