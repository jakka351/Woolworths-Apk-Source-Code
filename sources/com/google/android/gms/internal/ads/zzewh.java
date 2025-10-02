package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzewh implements zzeup {
    private final JSONObject zza;

    public zzewh(Context context) {
        this.zza = zzbur.zzb(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmL)).booleanValue() ? zzgot.zza(zzewf.zza) : zzgot.zza(new zzeun() { // from class: com.google.android.gms.internal.ads.zzewg
            @Override // com.google.android.gms.internal.ads.zzeun
            public final /* synthetic */ void zza(Object obj) throws JSONException {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 46;
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
