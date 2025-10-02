package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzeoy implements zzeup {

    @Nullable
    private final zzezj zza;

    public zzeoy(@Nullable zzezj zzezjVar) {
        this.zza = zzezjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        zzezj zzezjVar = this.zza;
        if (zzezjVar == null) {
            return zzgot.zza(new zzeox(null));
        }
        String strZza = zzezjVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzgot.zza(new zzeox(null)) : zzgot.zza(new zzeox(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 15;
    }
}
