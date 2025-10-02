package me.oriient.ipssdk.api.utils;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface IPSTriggerEvents {
    public static final int DWELL = 2;
    public static final int ENTER = 0;
    public static final int EXIT = 1;
}
