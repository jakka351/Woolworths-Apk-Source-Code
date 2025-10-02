package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzemr implements zzeup {
    private final zzgpd zza;
    private final zzfdc zzb;
    private final int zzc;

    public zzemr(zzgpd zzgpdVar, zzfdc zzfdcVar, zzfds zzfdsVar, int i) {
        this.zza = zzgpdVar;
        this.zzb = zzfdcVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzemq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 5;
    }

    public final /* synthetic */ zzems zzc() throws GeneralSecurityException {
        List listAsList;
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhv)).booleanValue()) {
            zzfdc zzfdcVar = this.zzb;
            if (this.zzc != 2) {
                String strZzc = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfdcVar.zzd);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhx)).booleanValue()) {
                    listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhy)).split(","));
                } else {
                    listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhw)).split(","));
                }
                if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(strZzc))) {
                    strZza = zzfds.zza();
                }
            }
        }
        return new zzems(strZza);
    }
}
