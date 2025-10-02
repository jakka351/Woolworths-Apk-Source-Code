package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class zzfia {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjB), str);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfhr zzfhrVar) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzgot.zzq(zzgol.zzw(listenableFuture), new zzfhw(zzfhrVar), zzbzh.zzg);
        }
    }

    public static zzfgm zzc(final zzfhr zzfhrVar) {
        return new zzfgm() { // from class: com.google.android.gms.internal.ads.zzfhz
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                    zzfhrVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(ListenableFuture listenableFuture, zzfib zzfibVar, zzfhr zzfhrVar) {
        zzh(listenableFuture, zzfibVar, zzfhrVar, false);
    }

    public static void zze(ListenableFuture listenableFuture, zzfib zzfibVar, zzfhr zzfhrVar) {
        zzh(listenableFuture, zzfibVar, zzfhrVar, true);
    }

    public static void zzf(ListenableFuture listenableFuture, zzfib zzfibVar, zzfhr zzfhrVar) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzgot.zzq(zzgol.zzw(listenableFuture), new zzfhy(zzfibVar, zzfhrVar), zzbzh.zzg);
        }
    }

    public static int zzg(zzfdc zzfdcVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfdcVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    private static void zzh(ListenableFuture listenableFuture, zzfib zzfibVar, zzfhr zzfhrVar, boolean z) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzgot.zzq(zzgol.zzw(listenableFuture), new zzfhx(zzfibVar, zzfhrVar, z), zzbzh.zzg);
        }
    }
}
