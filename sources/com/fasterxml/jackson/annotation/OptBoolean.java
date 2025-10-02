package com.fasterxml.jackson.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class OptBoolean {
    public static final OptBoolean d;
    public static final OptBoolean e;
    public static final /* synthetic */ OptBoolean[] f;

    static {
        OptBoolean optBoolean = new OptBoolean("TRUE", 0);
        d = optBoolean;
        OptBoolean optBoolean2 = new OptBoolean("FALSE", 1);
        OptBoolean optBoolean3 = new OptBoolean("DEFAULT", 2);
        e = optBoolean3;
        f = new OptBoolean[]{optBoolean, optBoolean2, optBoolean3};
    }

    public static OptBoolean valueOf(String str) {
        return (OptBoolean) Enum.valueOf(OptBoolean.class, str);
    }

    public static OptBoolean[] values() {
        return (OptBoolean[]) f.clone();
    }
}
