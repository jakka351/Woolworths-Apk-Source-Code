package com.swrve.sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SwrveInitMode {
    public static final SwrveInitMode d;
    public static final SwrveInitMode e;
    public static final /* synthetic */ SwrveInitMode[] f;

    static {
        SwrveInitMode swrveInitMode = new SwrveInitMode("AUTO", 0);
        d = swrveInitMode;
        SwrveInitMode swrveInitMode2 = new SwrveInitMode("MANAGED", 1);
        e = swrveInitMode2;
        f = new SwrveInitMode[]{swrveInitMode, swrveInitMode2};
    }

    public static SwrveInitMode valueOf(String str) {
        return (SwrveInitMode) Enum.valueOf(SwrveInitMode.class, str);
    }

    public static SwrveInitMode[] values() {
        return (SwrveInitMode[]) f.clone();
    }
}
