package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzdk extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzco zzc;
    final /* synthetic */ zzfb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzfb zzfbVar, String str, String str2, zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcoVar;
        Objects.requireNonNull(zzfbVar);
        this.zzd = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() throws RemoteException {
        ((zzcr) Preconditions.checkNotNull(this.zzd.zzQ())).getConditionalUserProperties(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zzb() {
        this.zzc.zzb(null);
    }
}
