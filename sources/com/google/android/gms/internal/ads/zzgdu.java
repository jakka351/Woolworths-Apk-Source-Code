package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzgdu implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgdw zza;

    public zzgdu(zzgdw zzgdwVar) {
        Objects.requireNonNull(zzgdwVar);
        this.zza = zzgdwVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        zzgdw zzgdwVar = this.zza;
        synchronized (zzgdwVar) {
            try {
                if (z) {
                    zzgdwVar.zzg(System.currentTimeMillis());
                    zzgdwVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgdwVar.zzh() > 0 && jCurrentTimeMillis >= zzgdwVar.zzh()) {
                        zzgdwVar.zzi(jCurrentTimeMillis - zzgdwVar.zzh());
                    }
                    zzgdwVar.zzj(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
