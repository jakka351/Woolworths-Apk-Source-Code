package com.google.android.gms.measurement.internal;

import android.content.Intent;
import androidx.annotation.WorkerThread;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzoy extends zzay {
    final /* synthetic */ zzpg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzoy(zzpg zzpgVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzpgVar);
        this.zza = zzpgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    @WorkerThread
    public final void zza() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaW().zzg();
        String str = (String) zzpgVar.zzay().pollFirst();
        if (str != null) {
            zzpgVar.zzaz(zzpgVar.zzaZ().elapsedRealtime());
            zzpgVar.zzaV().zzk().zzb("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            zzpg.zzaQ(zzpgVar.zzaY(), intent);
        }
        zzpgVar.zzav();
    }
}
