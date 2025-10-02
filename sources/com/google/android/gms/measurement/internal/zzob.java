package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.core.source.CameraSettings;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzob {
    final /* synthetic */ zzoc zza;

    public zzob(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zza = zzocVar;
    }

    @WorkerThread
    public final void zza() {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zzic zzicVar = zzocVar.zzu;
        if (zzicVar.zzd().zzp(zzicVar.zzaZ().currentTimeMillis())) {
            zzicVar.zzd().zzg.zzb(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzicVar.zzaV().zzk().zza("Detected application was in foreground");
                zzc(zzicVar.zzaZ().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    public final void zzb(long j, boolean z) {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zzocVar.zzj();
        zzic zzicVar = zzocVar.zzu;
        if (zzicVar.zzd().zzp(j)) {
            zzicVar.zzd().zzg.zzb(true);
            zzocVar.zzu.zzv().zzi();
        }
        zzicVar.zzd().zzk.zzb(j);
        if (zzicVar.zzd().zzg.zza()) {
            zzc(j, z);
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzc(long j, boolean z) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar = zzocVar.zzu;
            zzicVar.zzd().zzk.zzb(j);
            zzicVar.zzaV().zzk().zzb("Session started, time", Long.valueOf(zzicVar.zzaZ().elapsedRealtime()));
            long j2 = j / 1000;
            zzic zzicVar2 = zzocVar.zzu;
            zzicVar2.zzj().zzN(CameraSettings.FOCUS_STRATEGY_AUTO, NotificationMessage.NOTIF_KEY_SID, Long.valueOf(j2), j);
            zzicVar.zzd().zzl.zzb(j2);
            zzicVar.zzd().zzg.zzb(false);
            Bundle bundle = new Bundle();
            bundle.putLong(NotificationMessage.NOTIF_KEY_SID, j2);
            zzicVar2.zzj().zzG(CameraSettings.FOCUS_STRATEGY_AUTO, "_s", j, bundle);
            String strZza = zzicVar.zzd().zzq.zza();
            if (TextUtils.isEmpty(strZza)) {
                return;
            }
            zzicVar2.zzj().zzG(CameraSettings.FOCUS_STRATEGY_AUTO, "_ssr", j, c.g("_ffr", strZza));
        }
    }
}
