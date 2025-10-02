package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzeen implements zzdgp {
    final /* synthetic */ zzeec zza;
    final /* synthetic */ zzfcj zzb;

    public zzeen(zzeeo zzeeoVar, zzeec zzeecVar, zzfcj zzfcjVar) {
        this.zza = zzeecVar;
        this.zzb = zzfcjVar;
        Objects.requireNonNull(zzeeoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z, Context context, @Nullable zzcwf zzcwfVar) throws zzdgo {
        try {
            zzfea zzfeaVar = (zzfea) this.zza.zzb;
            zzfeaVar.zzs(z);
            zzfeaVar.zzz(context);
        } catch (zzfdj e) {
            throw new zzdgo(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    @Nullable
    public final zzfcj zzb() {
        return this.zzb;
    }
}
