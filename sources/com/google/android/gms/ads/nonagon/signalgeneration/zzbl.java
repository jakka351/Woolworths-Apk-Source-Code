package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdel;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class zzbl implements zzdel {
    private final zzb zza;
    private final int zzb;

    @Nullable
    private final String zzc;

    @VisibleForTesting
    public zzbl(zzb zzbVar, int i, @Nullable String str) {
        this.zza = zzbVar;
        this.zzb = i;
        this.zzc = str;
    }

    public final /* synthetic */ void zza(zzbj zzbjVar) throws JSONException {
        this.zza.zza(this.zzc, zzbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(@Nullable final zzbj zzbjVar) {
        if (zzbjVar == null || this.zzb != 2 || TextUtils.isEmpty(this.zzc)) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws JSONException {
                this.zza.zza(zzbjVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(@Nullable String str) {
    }
}
