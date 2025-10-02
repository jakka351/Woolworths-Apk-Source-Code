package com.swrve.sdk.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SwrveOrientation {
    public static final SwrveOrientation d;
    public static final SwrveOrientation e;
    public static final SwrveOrientation f;
    public static final /* synthetic */ SwrveOrientation[] g;

    static {
        SwrveOrientation swrveOrientation = new SwrveOrientation("Portrait", 0);
        d = swrveOrientation;
        SwrveOrientation swrveOrientation2 = new SwrveOrientation("Landscape", 1);
        e = swrveOrientation2;
        SwrveOrientation swrveOrientation3 = new SwrveOrientation("Both", 2);
        f = swrveOrientation3;
        g = new SwrveOrientation[]{swrveOrientation, swrveOrientation2, swrveOrientation3};
    }

    public static SwrveOrientation valueOf(String str) {
        return (SwrveOrientation) Enum.valueOf(SwrveOrientation.class, str);
    }

    public static SwrveOrientation[] values() {
        return (SwrveOrientation[]) g.clone();
    }
}
