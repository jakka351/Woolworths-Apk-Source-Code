package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes6.dex */
final class ad implements ServiceConnection {
    public final /* synthetic */ ae d;

    public /* synthetic */ ad(ae aeVar) {
        this.d = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ae aeVar = this.d;
        aeVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        aeVar.a().post(new aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ae aeVar = this.d;
        aeVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        aeVar.a().post(new ab(this));
    }
}
