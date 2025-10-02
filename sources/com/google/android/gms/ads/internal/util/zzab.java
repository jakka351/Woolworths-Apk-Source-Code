package com.google.android.gms.ads.internal.util;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class zzab {
    public static boolean zza(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                return true;
            }
        }
        return false;
    }
}
