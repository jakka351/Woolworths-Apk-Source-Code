package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;

@KeepForSdk
/* loaded from: classes.dex */
public class ServiceStarter {
    public static ServiceStarter e;

    /* renamed from: a, reason: collision with root package name */
    public String f15649a = null;
    public Boolean b = null;
    public Boolean c = null;
    public final ArrayDeque d = new ArrayDeque();

    public static synchronized ServiceStarter a() {
        try {
            if (e == null) {
                e = new ServiceStarter();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public final boolean b(Context context) {
        if (this.c == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.b == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b.booleanValue();
    }
}
