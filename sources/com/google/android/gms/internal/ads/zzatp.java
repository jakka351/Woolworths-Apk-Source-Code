package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzatp implements PackageManager$OnChecksumsReadyListener {
    final zzgpm zza = zzgpm.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksumC = com.google.android.gms.common.util.a.c(list.get(i));
                if (apkChecksumC.getType() == 8) {
                    zzgpm zzgpmVar = this.zza;
                    zzgmk zzgmkVarZzi = zzgmk.zzn().zzi();
                    byte[] value = apkChecksumC.getValue();
                    zzgpmVar.zza(zzgmkVarZzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}
