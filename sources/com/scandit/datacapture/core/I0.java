package com.scandit.datacapture.core;

import android.os.Build;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes6.dex */
public abstract class I0 {
    public static NativeFocusStrategy a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return NativeFocusStrategy.CONTINUOUS_UNTIL_NO_SCAN;
        }
        return null;
    }

    public static NativeCameraApi b() {
        return Build.VERSION.SDK_INT >= 33 ? NativeCameraApi.CAMERA2 : NativeCameraApi.CAMERA1;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
