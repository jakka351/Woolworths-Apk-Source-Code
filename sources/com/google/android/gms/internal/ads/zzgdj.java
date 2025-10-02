package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgdj extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzgdl zza;

    public zzgdj(zzgdl zzgdlVar) {
        Objects.requireNonNull(zzgdlVar);
        this.zza = zzgdlVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgdl zzgdlVar = this.zza;
        synchronized (zzgdlVar) {
            zzgdlVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgdl zzgdlVar = this.zza;
        synchronized (zzgdlVar) {
            zzgdlVar.zzf(null);
        }
    }
}
