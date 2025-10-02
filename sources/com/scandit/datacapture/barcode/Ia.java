package com.scandit.datacapture.barcode;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ia implements Ha {
    public final void a(SharedPreferences sharedPreferences) {
        Intrinsics.h(sharedPreferences, "sharedPreferences");
        if (sharedPreferences.getInt("com.scandit.barcode.spark_capture-version", -1) < 3) {
            sharedPreferences.edit().clear().putInt("com.scandit.barcode.spark_capture-version", 3).apply();
        }
    }
}
