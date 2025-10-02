package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class zzfvf implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzfvf(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzfvf zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzfvf(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzfui zzfuiVar = (zzfui) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        androidx.constraintlayout.core.state.a.B(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
        sb.append(")");
        return new zzfvk(executorService, sb.toString(), zzfuiVar.zzl());
    }
}
