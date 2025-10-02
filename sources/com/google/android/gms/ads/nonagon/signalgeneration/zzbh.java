package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbuv;
import com.google.android.gms.internal.ads.zzdyb;
import com.google.android.gms.internal.ads.zzdzl;
import com.google.android.gms.internal.ads.zzgob;
import com.google.android.gms.internal.ads.zzgot;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class zzbh implements zzgob {
    private final Executor zza;
    private final zzdyb zzb;

    public zzbh(Executor executor, zzdyb zzdybVar) {
        this.zza = executor;
        this.zzb = zzdybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        final zzbuv zzbuvVar = (zzbuv) obj;
        return zzgot.zzj(this.zzb.zza(zzbuvVar), new zzgob() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                zzdzl zzdzlVar = (zzdzl) obj2;
                zzbj zzbjVar = new zzbj(new JsonReader(new InputStreamReader(zzdzlVar.zza())), zzdzlVar.zzb());
                zzbuv zzbuvVar2 = zzbuvVar;
                try {
                    zzbjVar.zzb = com.google.android.gms.ads.internal.client.zzbb.zza().zzm(zzbuvVar2.zza).toString();
                } catch (JSONException unused) {
                    zzbjVar.zzb = "{}";
                }
                Bundle bundle = zzbuvVar2.zzn;
                if (!bundle.isEmpty()) {
                    try {
                        zzbjVar.zzc = com.google.android.gms.ads.internal.client.zzbb.zza().zzm(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return zzgot.zza(zzbjVar);
            }
        }, this.zza);
    }
}
