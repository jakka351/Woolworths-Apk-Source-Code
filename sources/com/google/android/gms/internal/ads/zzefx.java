package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes5.dex */
final class zzefx implements zzdgp {
    private final zzfcj zza;
    private final zzbqw zzb;
    private final AdFormat zzc;

    @Nullable
    private zzcwk zzd = null;

    public zzefx(zzfcj zzfcjVar, zzbqw zzbqwVar, AdFormat adFormat) {
        this.zza = zzfcjVar;
        this.zzb = zzbqwVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z, Context context, @Nullable zzcwf zzcwfVar) throws zzdgo {
        boolean zZzk;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzk = this.zzb.zzt(ObjectWrapper.wrap(context));
                    }
                    throw new zzdgo("Adapter failed to show.");
                }
                zZzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            }
            if (zZzk) {
                zzcwk zzcwkVar = this.zzd;
                if (zzcwkVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbJ)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzcwkVar.zza();
                return;
            }
            throw new zzdgo("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgo(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    @Nullable
    public final zzfcj zzb() {
        return this.zza;
    }

    public final void zzc(zzcwk zzcwkVar) {
        this.zzd = zzcwkVar;
    }
}
