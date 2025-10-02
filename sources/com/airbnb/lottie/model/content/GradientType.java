package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GradientType {
    public static final GradientType d;
    public static final GradientType e;
    public static final /* synthetic */ GradientType[] f;

    static {
        GradientType gradientType = new GradientType("LINEAR", 0);
        d = gradientType;
        GradientType gradientType2 = new GradientType("RADIAL", 1);
        e = gradientType2;
        f = new GradientType[]{gradientType, gradientType2};
    }

    public static GradientType valueOf(String str) {
        return (GradientType) Enum.valueOf(GradientType.class, str);
    }

    public static GradientType[] values() {
        return (GradientType[]) f.clone();
    }
}
