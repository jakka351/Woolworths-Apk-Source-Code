package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
final /* synthetic */ class zzexi implements Callable {
    static final /* synthetic */ zzexi zza = new zzexi();

    private /* synthetic */ zzexi() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        HashMap map = new HashMap();
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzac);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzad)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    map.put(str2, com.google.android.gms.ads.internal.util.zzch.zza(str2));
                }
            }
        }
        return new zzexk(map);
    }
}
