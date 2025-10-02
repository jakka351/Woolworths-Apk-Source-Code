package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Priority {
    public static final Priority d;
    public static final Priority e;
    public static final Priority f;
    public static final Priority g;
    public static final /* synthetic */ Priority[] h;

    static {
        Priority priority = new Priority("IMMEDIATE", 0);
        d = priority;
        Priority priority2 = new Priority("HIGH", 1);
        e = priority2;
        Priority priority3 = new Priority("NORMAL", 2);
        f = priority3;
        Priority priority4 = new Priority("LOW", 3);
        g = priority4;
        h = new Priority[]{priority, priority2, priority3, priority4};
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) h.clone();
    }
}
