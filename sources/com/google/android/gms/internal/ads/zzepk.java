package com.google.android.gms.internal.ads;

import android.os.Bundle;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzepk implements zzeun {

    @Nullable
    private final JSONObject zza;

    @Nullable
    private final JSONObject zzb;

    public zzepk(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        this.zza = jSONObject;
        this.zzb = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        JSONObject jSONObject = this.zza;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.zzb;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = this.zzb;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (jSONObject != null) {
            zzcuuVar.zzb.putString("fwd_common_cld", jSONObject.toString());
        }
    }
}
