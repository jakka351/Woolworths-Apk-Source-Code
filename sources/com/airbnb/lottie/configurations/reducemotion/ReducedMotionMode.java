package com.airbnb.lottie.configurations.reducemotion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ReducedMotionMode {
    public static final ReducedMotionMode d;
    public static final ReducedMotionMode e;
    public static final /* synthetic */ ReducedMotionMode[] f;

    static {
        ReducedMotionMode reducedMotionMode = new ReducedMotionMode("STANDARD_MOTION", 0);
        d = reducedMotionMode;
        ReducedMotionMode reducedMotionMode2 = new ReducedMotionMode("REDUCED_MOTION", 1);
        e = reducedMotionMode2;
        f = new ReducedMotionMode[]{reducedMotionMode, reducedMotionMode2};
    }

    public static ReducedMotionMode valueOf(String str) {
        return (ReducedMotionMode) Enum.valueOf(ReducedMotionMode.class, str);
    }

    public static ReducedMotionMode[] values() {
        return (ReducedMotionMode[]) f.clone();
    }
}
