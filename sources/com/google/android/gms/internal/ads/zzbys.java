package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbys extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbyv zza;

    public zzbys(zzbyv zzbyvVar) {
        Objects.requireNonNull(zzbyvVar);
        this.zza = zzbyvVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzB().set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzB().set(false);
    }
}
