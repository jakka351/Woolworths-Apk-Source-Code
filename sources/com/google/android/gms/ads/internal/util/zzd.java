package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.common.util.concurrent.ListenableFuture;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;

/* loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbee.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), nnlllnn.nnlllln.www00770077ww, 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzi()) {
                    return;
                }
                ListenableFuture listenableFutureZzb = new zzc(context).zzb();
                int i2 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Updating ad debug logging enablement.");
                zzbzk.zza(listenableFutureZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to determine debug setting.", e);
            }
        }
    }
}
