package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzdmh {
    private final Executor zza;
    private final zzdmc zzb;
    private final zzdsg zzc;

    public zzdmh(Executor executor, zzdmc zzdmcVar, zzdsg zzdsgVar) {
        this.zza = executor;
        this.zzb = zzdmcVar;
        this.zzc = zzdsgVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture listenableFutureZza;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgot.zza(Collections.EMPTY_LIST);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzc.zze(), zzdru.NATIVE_ASSETS_LOADING_CUSTOM_START.zza());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                listenableFutureZza = zzgot.zza(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (strOptString == null) {
                    listenableFutureZza = zzgot.zza(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    listenableFutureZza = "string".equals(strOptString2) ? zzgot.zza(new zzdme(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgot.zzk(this.zzb.zza(jSONObjectOptJSONObject, "image_value", null), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdmf
                        @Override // com.google.android.gms.internal.ads.zzggr
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdme(strOptString, (zzbfh) obj);
                        }
                    }, this.zza) : zzgot.zza(null);
                }
            }
            arrayList.add(listenableFutureZza);
        }
        return zzgot.zzk(zzgot.zzl(arrayList), zzdmg.zza, this.zza);
    }
}
