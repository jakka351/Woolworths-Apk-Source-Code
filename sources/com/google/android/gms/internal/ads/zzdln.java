package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzdln {
    private final zzgpd zza;
    private final zzdmc zzb;
    private final zzdmh zzc;
    private final zzdsg zzd;

    public zzdln(zzgpd zzgpdVar, zzdmc zzdmcVar, zzdmh zzdmhVar, zzdsg zzdsgVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdmcVar;
        this.zzc = zzdmhVar;
        this.zzd = zzdsgVar;
    }

    private final ListenableFuture zze(ListenableFuture listenableFuture, zzdru zzdruVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            zzgot.zzq(listenableFuture, new zzdlk(this, zzdruVar), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfcu r15, final com.google.android.gms.internal.ads.zzfcj r16, final org.json.JSONObject r17, @androidx.annotation.Nullable com.google.android.gms.ads.internal.zzb r18, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzbxf r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdln.zza(com.google.android.gms.internal.ads.zzfcu, com.google.android.gms.internal.ads.zzfcj, org.json.JSONObject, com.google.android.gms.ads.internal.zzb, com.google.android.gms.internal.ads.zzbxf):com.google.common.util.concurrent.ListenableFuture");
    }

    public final /* synthetic */ zzdiu zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, JSONObject jSONObject) throws zzeho {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzd.zze(), zzdru.NATIVE_ASSETS_LOADING_BASIC_START.zza());
        }
        zzdiu zzdiuVar = new zzdiu();
        zzdiuVar.zza(jSONObject.optInt("template_id", -1));
        zzdiuVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdiuVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        if (!zzfdcVar.zzh.contains(Integer.toString(zzdiuVar.zzx()))) {
            int iZzx = zzdiuVar.zzx();
            throw new zzeho(1, YU.a.n(new StringBuilder(String.valueOf(iZzx).length() + 21), "Invalid template ID: ", iZzx));
        }
        if (zzdiuVar.zzx() == 3) {
            if (zzdiuVar.zzS() == null) {
                throw new zzeho(1, "No custom template id for custom template ad response.");
            }
            if (!zzfdcVar.zzi.contains(zzdiuVar.zzS())) {
                throw new zzeho(1, "Unexpected custom template id in the response.");
            }
        }
        zzdiuVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfcjVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String strZzC = com.google.android.gms.ads.internal.util.zzs.zzC();
            strOptString = YU.a.p(new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.f(3, strZzC) + String.valueOf(strOptString).length()), strZzC, " : ", strOptString);
        }
        zzdiuVar.zzs("headline", strOptString);
        zzdiuVar.zzs("body", jSONObject.optString("body", null));
        zzdiuVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdiuVar.zzs("store", jSONObject.optString("store", null));
        zzdiuVar.zzs("price", jSONObject.optString("price", null));
        zzdiuVar.zzs("advertiser", jSONObject.optString("advertiser", null));
        return zzdiuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdiu zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzct)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzd.zze(), zzdru.RENDERING_NATIVE_ASSETS_LOADING_END.zza());
        }
        zzdiu zzdiuVar = (zzdiu) listenableFuture.get();
        zzdiuVar.zzd((List) listenableFuture2.get());
        zzdiuVar.zzj((zzbfw) listenableFuture3.get());
        zzdiuVar.zzk((zzbfw) listenableFuture4.get());
        zzdiuVar.zzc((zzbfp) listenableFuture5.get());
        zzdiuVar.zze(zzdmc.zzl(jSONObject));
        zzdiuVar.zzf(zzdmc.zzk(jSONObject));
        zzcek zzcekVar = (zzcek) listenableFuture6.get();
        if (zzcekVar != null) {
            zzdiuVar.zzm(zzcekVar);
            zzdiuVar.zzg(zzcekVar.zzE());
            zzdiuVar.zzb(zzcekVar.zzh());
        }
        zzdiuVar.zzH().putAll((Bundle) listenableFuture7.get());
        zzcek zzcekVar2 = (zzcek) listenableFuture8.get();
        if (zzcekVar2 != null) {
            zzdiuVar.zzn(zzcekVar2);
            zzdiuVar.zzh(zzcekVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfQ)).booleanValue() || zzf(jSONObject)) {
            zzcek zzcekVar3 = (zzcek) listenableFuture9.get();
            if (zzcekVar3 != null) {
                zzdiuVar.zzo(zzcekVar3);
            }
        } else {
            zzdiuVar.zzp(listenableFuture9);
            zzdiuVar.zzr(new zzbzm());
        }
        for (zzdme zzdmeVar : (List) listenableFuture10.get()) {
            if (zzdmeVar.zza != 1) {
                zzdiuVar.zzt(zzdmeVar.zzb, zzdmeVar.zzd);
            } else {
                zzdiuVar.zzs(zzdmeVar.zzb, zzdmeVar.zzc);
            }
        }
        return zzdiuVar;
    }

    public final /* synthetic */ zzdsg zzd() {
        return this.zzd;
    }
}
