package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzbih implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzd;
        zzcek zzcekVar = (zzcek) obj;
        zzbfj zzbfjVarZzar = zzcekVar.zzar();
        if (zzbfjVarZzar == null || (jSONObjectZzd = zzbfjVarZzar.zzd()) == null) {
            zzcekVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzcekVar.zzd("nativeClickMetaReady", jSONObjectZzd);
        }
    }
}
