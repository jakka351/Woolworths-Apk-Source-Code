package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes.dex */
final class zzduj extends zzbwc {
    final /* synthetic */ zzduk zza;

    public zzduj(zzduk zzdukVar) {
        Objects.requireNonNull(zzdukVar);
        this.zza = zzdukVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zze() throws JSONException, RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzm(zzdukVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzf() throws JSONException, RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzo(zzdukVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzg(zzbvx zzbvxVar) throws JSONException, RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzp(zzdukVar.zzd(), zzbvxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzh(int i) throws JSONException, RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzn(zzdukVar.zzd(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzn(zzdukVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzj() throws JSONException, RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzq(zzdukVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzk() throws JSONException, RemoteException {
        zzduk zzdukVar = this.zza;
        zzdukVar.zze().zzr(zzdukVar.zzd());
    }
}
