package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LottieFeatureFlag {
    public static final LottieFeatureFlag d;
    public static final /* synthetic */ LottieFeatureFlag[] e;

    static {
        LottieFeatureFlag lottieFeatureFlag = new LottieFeatureFlag("MergePathsApi19", 0);
        d = lottieFeatureFlag;
        e = new LottieFeatureFlag[]{lottieFeatureFlag};
    }

    public static LottieFeatureFlag valueOf(String str) {
        return (LottieFeatureFlag) Enum.valueOf(LottieFeatureFlag.class, str);
    }

    public static LottieFeatureFlag[] values() {
        return (LottieFeatureFlag[]) e.clone();
    }
}
