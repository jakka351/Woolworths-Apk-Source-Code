package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzbyn {
    public final ListenableFuture zza(Context context, int i) {
        zzbzm zzbzmVar = new zzbzm();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzy(context)) {
            zzbzh.zza.execute(new zzbym(this, context, zzbzmVar));
        }
        return zzbzmVar;
    }
}
