package com.skydoves.balloon;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/ArrowPositionRules;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArrowPositionRules {
    public static final ArrowPositionRules d;
    public static final ArrowPositionRules e;
    public static final /* synthetic */ ArrowPositionRules[] f;

    static {
        ArrowPositionRules arrowPositionRules = new ArrowPositionRules("ALIGN_BALLOON", 0);
        d = arrowPositionRules;
        ArrowPositionRules arrowPositionRules2 = new ArrowPositionRules("ALIGN_ANCHOR", 1);
        e = arrowPositionRules2;
        f = new ArrowPositionRules[]{arrowPositionRules, arrowPositionRules2};
    }

    public static ArrowPositionRules valueOf(String str) {
        return (ArrowPositionRules) Enum.valueOf(ArrowPositionRules.class, str);
    }

    public static ArrowPositionRules[] values() {
        return (ArrowPositionRules[]) f.clone();
    }
}
