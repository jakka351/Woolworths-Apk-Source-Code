package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
final class zzezu implements zzggr {
    final /* synthetic */ zzezx zza;

    public zzezu(zzezx zzezxVar) {
        Objects.requireNonNull(zzezxVar);
        this.zza = zzezxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbuv zzbuvVar = (zzbuv) obj;
        zzezv zzezvVar = new zzezv(zzbuvVar, new zzffd(zzbuvVar.zzj), null);
        zzezx zzezxVar = this.zza;
        zzezxVar.zzd(zzezvVar);
        return zzezxVar.zzc();
    }
}
