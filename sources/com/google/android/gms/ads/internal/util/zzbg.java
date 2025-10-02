package com.google.android.gms.ads.internal.util;

import androidx.constraintlayout.core.state.a;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapq;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbg implements zzapl {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    public zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final void zza(zzapq zzapqVar) {
        String str = this.zza;
        String string = zzapqVar.toString();
        String strL = a.l(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length()), "Failed to load URL: ", str, "\n", string);
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strL);
        this.zzb.zza((Object) null);
    }
}
