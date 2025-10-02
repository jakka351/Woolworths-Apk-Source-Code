package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class BoundType {
    public static final BoundType d;
    public static final BoundType e;
    public static final /* synthetic */ BoundType[] f;

    static {
        BoundType boundType = new BoundType("OPEN", 0);
        d = boundType;
        BoundType boundType2 = new BoundType("CLOSED", 1);
        e = boundType2;
        f = new BoundType[]{boundType, boundType2};
    }

    public static BoundType a(boolean z) {
        return z ? e : d;
    }

    public static BoundType valueOf(String str) {
        return (BoundType) Enum.valueOf(BoundType.class, str);
    }

    public static BoundType[] values() {
        return (BoundType[]) f.clone();
    }
}
