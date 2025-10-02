package com.adobe.marketing.mobile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SharedStateStatus {
    public static final SharedStateStatus d;
    public static final SharedStateStatus e;
    public static final SharedStateStatus f;
    public static final /* synthetic */ SharedStateStatus[] g;

    static {
        SharedStateStatus sharedStateStatus = new SharedStateStatus("SET", 0);
        d = sharedStateStatus;
        SharedStateStatus sharedStateStatus2 = new SharedStateStatus("PENDING", 1);
        e = sharedStateStatus2;
        SharedStateStatus sharedStateStatus3 = new SharedStateStatus("NONE", 2);
        f = sharedStateStatus3;
        g = new SharedStateStatus[]{sharedStateStatus, sharedStateStatus2, sharedStateStatus3};
    }

    public static SharedStateStatus valueOf(String str) {
        return (SharedStateStatus) Enum.valueOf(SharedStateStatus.class, str);
    }

    public static SharedStateStatus[] values() {
        return (SharedStateStatus[]) g.clone();
    }
}
