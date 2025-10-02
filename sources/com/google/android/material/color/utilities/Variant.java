package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@RestrictTo
/* loaded from: classes6.dex */
public final class Variant {
    public static final /* synthetic */ Variant[] d = {new Variant("MONOCHROME", 0), new Variant("NEUTRAL", 1), new Variant("TONAL_SPOT", 2), new Variant("VIBRANT", 3), new Variant("EXPRESSIVE", 4), new Variant("FIDELITY", 5), new Variant("CONTENT", 6), new Variant("RAINBOW", 7), new Variant("FRUIT_SALAD", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    Variant EF5;

    public static Variant valueOf(String str) {
        return (Variant) Enum.valueOf(Variant.class, str);
    }

    public static Variant[] values() {
        return (Variant[]) d.clone();
    }
}
