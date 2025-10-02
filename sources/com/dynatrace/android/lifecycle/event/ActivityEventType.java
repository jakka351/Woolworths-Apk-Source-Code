package com.dynatrace.android.lifecycle.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ActivityEventType {
    public static final ActivityEventType d;
    public static final ActivityEventType e;
    public static final ActivityEventType f;
    public static final /* synthetic */ ActivityEventType[] g;

    static {
        ActivityEventType activityEventType = new ActivityEventType("ON_CREATE", 0);
        d = activityEventType;
        ActivityEventType activityEventType2 = new ActivityEventType("ON_START", 1);
        e = activityEventType2;
        ActivityEventType activityEventType3 = new ActivityEventType("ON_RESUME", 2);
        f = activityEventType3;
        g = new ActivityEventType[]{activityEventType, activityEventType2, activityEventType3};
    }

    public static ActivityEventType valueOf(String str) {
        return (ActivityEventType) Enum.valueOf(ActivityEventType.class, str);
    }

    public static ActivityEventType[] values() {
        return (ActivityEventType[]) g.clone();
    }
}
