package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzerg implements zzeun {
    private final String zza;
    private final String zzb;

    @Nullable
    private final Bundle zzc;

    public /* synthetic */ zzerg(String str, String str2, Bundle bundle, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        bundle.putString("consent_string", this.zza);
        bundle.putString("fc_consent", this.zzb);
        Bundle bundle2 = this.zzc;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
