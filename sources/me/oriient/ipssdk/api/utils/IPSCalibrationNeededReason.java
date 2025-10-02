package me.oriient.ipssdk.api.utils;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface IPSCalibrationNeededReason {
    public static final int EXPIRED = 0;
    public static final int MAGNETIC = 1;
}
