package me.oriient.ipssdk.api.models;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface IPSDataStatus {
    public static final int PREPARING = 2;
    public static final int READY = 1;
    public static final int REQUIRES_PREPARATION = 0;
}
