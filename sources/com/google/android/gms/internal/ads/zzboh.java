package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzboh implements zzbnt {
    private final zzbnv zza;
    private final zzbnw zzb;
    private final zzbnp zzc;
    private final String zzd;

    public zzboh(zzbnp zzbnpVar, String str, zzbnw zzbnwVar, zzbnv zzbnvVar) {
        this.zzc = zzbnpVar;
        this.zzd = str;
        this.zzb = zzbnwVar;
        this.zza = zzbnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final ListenableFuture zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final ListenableFuture zzb(Object obj) {
        zzbzm zzbzmVar = new zzbzm();
        zzbnj zzbnjVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbnjVarZzb.zze(new zzboe(this, zzbnjVarZzb, obj, zzbzmVar), new zzbof(this, zzbzmVar, zzbnjVarZzb));
        return zzbzmVar;
    }

    public final /* synthetic */ void zzc(zzbnj zzbnjVar, zzbnq zzbnqVar, Object obj, zzbzm zzbzmVar) throws JSONException {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String string = UUID.randomUUID().toString();
            zzbjk.zzo.zzb(string, new zzbog(this, zzbnjVar, zzbzmVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbnqVar.zzb(this.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzbzmVar.zzd(e);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e);
            } finally {
                zzbnjVar.zza();
            }
        }
    }

    public final /* synthetic */ zzbnv zzd() {
        return this.zza;
    }
}
