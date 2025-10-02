package com.google.firebase.auth.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* loaded from: classes6.dex */
public final class zzax {
    public static zzax b;

    /* renamed from: a, reason: collision with root package name */
    public BroadcastReceiver f15198a;

    public static void a(Context context) {
        zzax zzaxVar = b;
        zzaxVar.getClass();
        if (zzaxVar.f15198a != null) {
            LocalBroadcastManager.a(context).d(b.f15198a);
        }
        b.f15198a = null;
    }
}
