package me.oriient.ipssdk.api.utils;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface IPSErrorRecoveryStrategy {
    public static final int LOGIN = 0;
    public static final int RETRY = 1;
    public static final int UNRECOVERABLE = 2;
}
