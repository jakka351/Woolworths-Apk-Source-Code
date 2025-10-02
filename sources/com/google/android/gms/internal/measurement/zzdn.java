package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzdn extends zzeq {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdn(zzfb zzfbVar, Boolean bool) {
        super(zzfbVar, true);
        this.zza = bool;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() throws RemoteException {
        ((zzcr) Preconditions.checkNotNull(this.zzb.zzQ())).setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
    }
}
