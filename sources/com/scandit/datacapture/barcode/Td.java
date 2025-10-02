package com.scandit.datacapture.barcode;

import android.content.Context;
import android.content.SharedPreferences;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Td {
    public static SharedPreferences a(Context context, BarcodeCount mode) {
        Intrinsics.h(context, "context");
        Intrinsics.h(mode, "mode");
        SharedPreferences it = context.getSharedPreferences("barcode_count_toolbar_preferences_key", 0);
        Intrinsics.g(it, "it");
        if (!it.contains("barcode_count_toolbar_audio_feedback_key")) {
            it.edit().putBoolean("barcode_count_toolbar_audio_feedback_key", mode.getFeedback().getSuccess().getSound() != null).apply();
        }
        if (!it.contains("barcode_count_toolbar_haptic_feedback_key")) {
            it.edit().putBoolean("barcode_count_toolbar_haptic_feedback_key", mode.getFeedback().getSuccess().getVibration() != null).apply();
        }
        return it;
    }
}
