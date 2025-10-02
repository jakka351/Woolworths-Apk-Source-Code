package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class zzgbe implements zzfqb {
    private final Context zza;
    private final zzgcx zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    public zzgbe(Context context, zzfui zzfuiVar, zzgcx zzgcxVar) {
        this.zza = context;
        this.zzc = zzfuiVar.zzb();
        this.zzd = zzfuiVar.zzj();
        this.zze = zzfuiVar.zzk();
        this.zzb = zzgcxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(Map map) {
        ListenableFuture listenableFuture;
        zzast zzastVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            listenableFuture = (ListenableFuture) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strZzb = (listenableFuture == null || (Build.VERSION.SDK_INT >= 31 && !listenableFuture.isDone()) || (zzastVar = (zzast) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzastVar.zzb().length() <= 1) ? "E" : zzastVar.zzb();
        if (strZzb.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzghs.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzb() {
        Map mapZzb = this.zzb.zzb();
        zza(mapZzb);
        return mapZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzc() {
        Map mapZzc = this.zzb.zzc(this.zza, null);
        zza(mapZzc);
        return mapZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzd() {
        Map mapZzd = this.zzb.zzd();
        zza(mapZzd);
        return mapZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
