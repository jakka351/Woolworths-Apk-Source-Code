package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Priority {
    public static final Priority d;
    public static final Priority e;
    public static final Priority f;
    public static final /* synthetic */ Priority[] g;

    static {
        Priority priority = new Priority("DEFAULT", 0);
        d = priority;
        Priority priority2 = new Priority("VERY_LOW", 1);
        e = priority2;
        Priority priority3 = new Priority("HIGHEST", 2);
        f = priority3;
        g = new Priority[]{priority, priority2, priority3};
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) g.clone();
    }
}
