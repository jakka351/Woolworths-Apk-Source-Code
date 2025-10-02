package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.function.Function;

@RestrictTo
/* loaded from: classes6.dex */
public final class DynamicColor {
    public DynamicColor(String str, Function function, Function function2, boolean z, Function function3, ContrastCurve contrastCurve, Function function4) {
        new HashMap();
    }

    public static DynamicColor a(String str, Function function, Function function2) {
        return new DynamicColor(str, function, function2, false, null, null, null);
    }
}
