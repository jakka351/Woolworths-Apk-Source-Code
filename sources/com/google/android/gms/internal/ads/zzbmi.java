package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public interface zzbmi extends zzbmt, zzbmh {
    @Override // com.google.android.gms.internal.ads.zzbmt
    void zza(String str);

    @Override // com.google.android.gms.internal.ads.zzbmt
    default void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    default void zzc(String str, String str2) {
        zza(androidx.constraintlayout.core.state.a.l(new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.e(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    default void zzd(String str, JSONObject jSONObject) {
        StringBuilder sbV = YU.a.v("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbV.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string));
        zza(sbV.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    default void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }
}
