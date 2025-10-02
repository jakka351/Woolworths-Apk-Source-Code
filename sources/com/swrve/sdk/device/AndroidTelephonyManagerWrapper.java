package com.swrve.sdk.device;

import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public class AndroidTelephonyManagerWrapper implements ITelephonyManager {

    /* renamed from: a, reason: collision with root package name */
    public final TelephonyManager f19081a;

    public AndroidTelephonyManagerWrapper(Context context) {
        this.f19081a = (TelephonyManager) context.getSystemService("phone");
    }
}
