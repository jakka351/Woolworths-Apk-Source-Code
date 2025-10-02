package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzclo implements zzcky {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public zzclo(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) throws IOException {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean z = Boolean.parseBoolean(str);
        zzgVar.zzw(z);
        if (z) {
            com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
        }
    }
}
