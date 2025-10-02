package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbop implements zzgob {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    public zzbop(ListenableFuture listenableFuture, String str, zzbnw zzbnwVar, zzbnv zzbnvVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzgot.zzj(this.zzb, new zzgob() { // from class: com.google.android.gms.internal.ads.zzboo
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return this.zza.zzc(obj, (zzbnq) obj2);
            }
        }, zzbzh.zzg);
    }

    public final /* synthetic */ ListenableFuture zzc(Object obj, zzbnq zzbnqVar) throws JSONException {
        zzbzm zzbzmVar = new zzbzm();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbjk.zzo.zzb(string, new zzbon(this, zzbzmVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbnqVar.zzb(this.zza, jSONObject);
        return zzbzmVar;
    }
}
