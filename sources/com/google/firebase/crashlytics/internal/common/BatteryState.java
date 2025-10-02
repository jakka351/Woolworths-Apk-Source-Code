package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.internal.Logger;

/* loaded from: classes6.dex */
class BatteryState {

    /* renamed from: a, reason: collision with root package name */
    public final Float f15264a;
    public final boolean b;

    public BatteryState(Float f, boolean z) {
        this.b = z;
        this.f15264a = f;
    }

    public static BatteryState a(Context context) {
        boolean z = false;
        Float fValueOf = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                    z = true;
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    fValueOf = Float.valueOf(intExtra2 / intExtra3);
                }
            }
        } catch (IllegalStateException e) {
            Logger.f15258a.c(e, "An error occurred getting battery state.");
        }
        return new BatteryState(fValueOf, z);
    }

    public final Float b() {
        return this.f15264a;
    }

    public final int c() {
        Float f;
        if (!this.b || (f = this.f15264a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
