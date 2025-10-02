package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes.dex */
abstract class d0 {
    private void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        e();
        q4.a(i4.c().b()).a(broadcastReceiver, intentFilter);
    }

    public abstract String a();

    public abstract void a(Object obj);

    public abstract Object b();

    public abstract BroadcastReceiver c();

    public void d() {
        if (i4.c().b() != null) {
            a(c(), new IntentFilter(a()));
        }
    }

    public void e() {
        try {
            q4.a(i4.c().b()).a(c());
        } catch (Exception e) {
            a4.f(e.getMessage());
        }
    }
}
