package com.google.mlkit.vision.common.internal;

import YU.a;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes6.dex */
public class CommonConvertUtils {
    public static int a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalArgumentException(a.d(i, "Invalid rotation: "));
    }
}
