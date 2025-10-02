package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes5.dex */
final class zzdui extends zzbwg {
    final /* synthetic */ zzduk zza;

    public zzdui(zzduk zzdukVar) {
        Objects.requireNonNull(zzdukVar);
        this.zza = zzdukVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze() throws JSONException, RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzk(zzdukVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(int i) throws JSONException, RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzl(zzdukVar.zzd(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzl(zzdukVar.zzd(), zzeVar.zza);
    }
}
