package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbox;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzao extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbox zzd;
    final /* synthetic */ zzaz zze;

    public zzao(zzaz zzazVar, Context context, zzr zzrVar, String str, zzbox zzboxVar) {
        this.zza = context;
        this.zzb = zzrVar;
        this.zzc = str;
        this.zzd = zzboxVar;
        Objects.requireNonNull(zzazVar);
        this.zze = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza, "interstitial");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        return this.zze.zzn().zza(this.zza, this.zzb, this.zzc, this.zzd, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        return zzcrVar.zzc(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, ModuleDescriptor.MODULE_VERSION);
    }
}
