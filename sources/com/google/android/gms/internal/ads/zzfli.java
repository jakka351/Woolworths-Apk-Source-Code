package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class zzfli {
    private boolean zza;

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb(Context context) {
        zzfnh.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfmp.zza().zzb(context);
        zzfmg.zza().zzd(context);
        zzfnc.zza(context);
        zzfnd.zza(context);
        zzfng.zza(context);
        zzfmm.zza().zzc(context);
        zzfmf.zza().zzc(context);
        zzfmr.zza().zzb(context);
    }
}
