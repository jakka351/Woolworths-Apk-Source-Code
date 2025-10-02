package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzeua implements zzeun {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final String zzd;

    @Nullable
    public final Long zze;

    public zzeua(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        zzfdr.zze(bundle, "gmp_app_id", this.zza);
        zzfdr.zze(bundle, "fbs_aiid", this.zzb);
        zzfdr.zze(bundle, "fbs_aeid", this.zzc);
        zzfdr.zze(bundle, "apm_id_origin", this.zzd);
        Long l = this.zze;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfdr.zze(((zzcuu) obj).zzb, "fbs_aeid", this.zzc);
    }
}
