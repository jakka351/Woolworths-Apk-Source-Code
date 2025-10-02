package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzfkn extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfko zza;

    public zzfkn(zzfko zzfkoVar) {
        Objects.requireNonNull(zzfkoVar);
        this.zza = zzfkoVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzi(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzi(false);
    }
}
