package com.skydoves.balloon;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/ArrowOrientationRules;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArrowOrientationRules {
    public static final ArrowOrientationRules d;
    public static final ArrowOrientationRules e;
    public static final /* synthetic */ ArrowOrientationRules[] f;

    static {
        ArrowOrientationRules arrowOrientationRules = new ArrowOrientationRules("ALIGN_ANCHOR", 0);
        d = arrowOrientationRules;
        ArrowOrientationRules arrowOrientationRules2 = new ArrowOrientationRules("ALIGN_FIXED", 1);
        e = arrowOrientationRules2;
        f = new ArrowOrientationRules[]{arrowOrientationRules, arrowOrientationRules2};
    }

    public static ArrowOrientationRules valueOf(String str) {
        return (ArrowOrientationRules) Enum.valueOf(ArrowOrientationRules.class, str);
    }

    public static ArrowOrientationRules[] values() {
        return (ArrowOrientationRules[]) f.clone();
    }
}
