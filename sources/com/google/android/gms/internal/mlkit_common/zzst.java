package com.google.android.gms.internal.mlkit_common;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* loaded from: classes5.dex */
public final class zzst {
    private static final GmsLogger zza = new GmsLogger("RemoteModelUtils", "");

    @WorkerThread
    public static zznc zza(RemoteModel remoteModel, SharedPrefManager sharedPrefManager, zzsj zzsjVar) {
        long jElapsedRealtime;
        ModelType modelTypeZzb = zzsjVar.zzb();
        remoteModel.getClass();
        zzni zzniVar = new zzni();
        zznd zzndVar = new zznd();
        zzndVar.zzc((String) RemoteModel.f15975a.get(null));
        zzndVar.zzd(zznf.CLOUD);
        zzndVar.zza(zzu.zzb(null));
        int iOrdinal = modelTypeZzb.ordinal();
        zzndVar.zzb(iOrdinal != 2 ? iOrdinal != 4 ? iOrdinal != 5 ? zzne.TYPE_UNKNOWN : zzne.BASE_DIGITAL_INK : zzne.CUSTOM : zzne.BASE_TRANSLATE);
        zzniVar.zzb(zzndVar.zzg());
        zznl zznlVarZzc = zzniVar.zzc();
        zzmz zzmzVar = new zzmz();
        zzmzVar.zzd(zzsjVar.zzc());
        zzmzVar.zzc(zzsjVar.zzd());
        zzmzVar.zzb(Long.valueOf(zzsjVar.zza()));
        zzmzVar.zzf(zznlVarZzc);
        if (zzsjVar.zzg()) {
            long jB = sharedPrefManager.b();
            if (jB == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                synchronized (sharedPrefManager) {
                    jElapsedRealtime = sharedPrefManager.c().getLong("model_first_use_time_" + RemoteModel.a(), 0L);
                }
                if (jElapsedRealtime == 0) {
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    synchronized (sharedPrefManager) {
                        sharedPrefManager.c().edit().putLong("model_first_use_time_" + RemoteModel.a(), jElapsedRealtime).apply();
                    }
                }
                zzmzVar.zzg(Long.valueOf(jElapsedRealtime - jB));
            }
        }
        if (zzsjVar.zzf()) {
            long jB2 = sharedPrefManager.b();
            if (jB2 == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                zzmzVar.zze(Long.valueOf(SystemClock.elapsedRealtime() - jB2));
            }
        }
        return zzmzVar.zzi();
    }
}
