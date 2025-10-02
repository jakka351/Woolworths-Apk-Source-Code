package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzavv implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzavx zzb;

    public zzavv(zzavx zzavxVar, int i, boolean z) {
        this.zza = i;
        Objects.requireNonNull(zzavxVar);
        this.zzb = zzavxVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        zzast zzastVarZza;
        int i = this.zza;
        zzavx zzavxVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzavxVar.zza;
            zzastVarZza = zzfoo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzastVarZza = null;
        }
        zzavx zzavxVar2 = this.zzb;
        zzavxVar2.zzs(zzastVarZza);
        int i2 = this.zza;
        if (i2 < 4) {
            if (zzastVarZza != null && zzastVarZza.zza() && !zzastVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzastVarZza.zze() && zzastVarZza.zzg().zza() && zzastVarZza.zzg().zzb() != -2) {
                return;
            }
            zzavxVar2.zzp(i2 + 1, true);
        }
    }
}
