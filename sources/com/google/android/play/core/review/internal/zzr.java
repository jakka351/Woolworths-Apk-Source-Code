package com.google.android.play.core.review.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes6.dex */
final class zzr implements ServiceConnection {
    public final /* synthetic */ zzt d;

    public /* synthetic */ zzr(zzt zztVar) {
        this.d = zztVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzt zztVar = this.d;
        zztVar.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zztVar.a().post(new zzp(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzt zztVar = this.d;
        zztVar.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zztVar.a().post(new zzq(this));
    }
}
