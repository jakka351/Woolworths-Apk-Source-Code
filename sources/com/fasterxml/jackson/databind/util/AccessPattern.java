package com.fasterxml.jackson.databind.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AccessPattern {
    public static final AccessPattern d;
    public static final AccessPattern e;
    public static final AccessPattern f;
    public static final /* synthetic */ AccessPattern[] g;

    static {
        AccessPattern accessPattern = new AccessPattern("ALWAYS_NULL", 0);
        d = accessPattern;
        AccessPattern accessPattern2 = new AccessPattern("CONSTANT", 1);
        e = accessPattern2;
        AccessPattern accessPattern3 = new AccessPattern("DYNAMIC", 2);
        f = accessPattern3;
        g = new AccessPattern[]{accessPattern, accessPattern2, accessPattern3};
    }

    public static AccessPattern valueOf(String str) {
        return (AccessPattern) Enum.valueOf(AccessPattern.class, str);
    }

    public static AccessPattern[] values() {
        return (AccessPattern[]) g.clone();
    }
}
