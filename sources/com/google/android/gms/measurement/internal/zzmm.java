package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzmm extends zzay {
    final /* synthetic */ zznl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmm(zznl zznlVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zznlVar);
        this.zza = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        zznl zznlVar = this.zza;
        zznlVar.zzg();
        if (zznlVar.zzh()) {
            zznlVar.zzu.zzaV().zzk().zza("Inactivity, disconnecting from the service");
            zznlVar.zzM();
        }
    }
}
