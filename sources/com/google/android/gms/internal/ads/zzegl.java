package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzegl implements zzegf {
    private final zzdhd zza;
    private final zzgpd zzb;
    private final zzdln zzc;
    private final zzfeb zzd;
    private final zzdod zze;
    private final zzdsg zzf;
    private final VersionInfoParcel zzg;
    private final Context zzh;
    private final zzbxb zzi;

    public zzegl(zzdhd zzdhdVar, zzgpd zzgpdVar, zzdln zzdlnVar, zzfeb zzfebVar, zzdod zzdodVar, zzdsg zzdsgVar, VersionInfoParcel versionInfoParcel, Context context, zzbxb zzbxbVar) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzbxbVar;
        this.zza = zzdhdVar;
        this.zzb = zzgpdVar;
        this.zzc = zzdlnVar;
        this.zzd = zzfebVar;
        this.zze = zzdodVar;
        this.zzf = zzdsgVar;
    }

    private final ListenableFuture zzg(final zzfcu zzfcuVar, final zzfcj zzfcjVar, final JSONObject jSONObject) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzbxf zzbxfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcu)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzf.zze(), zzdru.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final ListenableFuture listenableFutureZzb = this.zzd.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoq)).booleanValue()) {
            Context context = this.zzh;
            zzbxf zzbxfVarZza = zzcvn.zza(context, this.zzg, zzfcjVar, this.zzi);
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zzbxfVarZza, null);
            zzbxfVar = zzbxfVarZza;
        } else {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzh, null, null);
            zzbxfVar = null;
        }
        final com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
        final zzbxf zzbxfVar2 = zzbxfVar;
        final ListenableFuture listenableFutureZza = this.zzc.zza(zzfcuVar, zzfcjVar, jSONObject, zzbVar2, zzbxfVar2);
        return zzgot.zzn(listenableFutureZzb, listenableFutureZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf(listenableFutureZza, listenableFutureZzb, zzfcuVar, zzfcjVar, jSONObject, zzbVar2, zzbxfVar2);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar = zzfcjVar.zzs;
        return (zzfcoVar == null || zzfcoVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final ListenableFuture zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzct)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzf.zze(), zzdru.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza());
        }
        ListenableFuture listenableFutureZzb = this.zzd.zzb();
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzegk
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfcjVar, (zzdnx) obj);
            }
        };
        zzgpd zzgpdVar = this.zzb;
        return zzgot.zzj(zzgot.zzj(listenableFutureZzb, zzgobVar, zzgpdVar), new zzgob() { // from class: com.google.android.gms.internal.ads.zzegg
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzfcuVar, zzfcjVar, (JSONArray) obj);
            }
        }, zzgpdVar);
    }

    public final /* synthetic */ ListenableFuture zzc(zzfcj zzfcjVar, final zzdnx zzdnxVar) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzct)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzf.zze(), zzdru.RENDERING_NATIVE_ADS_PREPROCESS_START.zza());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzju)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfcjVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgot.zzj(zzdnxVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgob() { // from class: com.google.android.gms.internal.ads.zzegh
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze(zzdnxVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ListenableFuture zzd(zzfcu zzfcuVar, zzfcj zzfcjVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgot.zzc(new zzdwz(3));
        }
        int i = zzfcuVar.zza.zza.zzl;
        if (i <= 1) {
            return zzgot.zzk(zzg(zzfcuVar, zzfcjVar, jSONArray.getJSONObject(0)), zzegi.zza, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcv)).booleanValue()) {
            this.zzf.zzd("nsl", String.valueOf(length));
        }
        this.zzd.zza(Math.min(length, i));
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < length) {
                arrayList.add(zzg(zzfcuVar, zzfcjVar, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(zzgot.zzc(new zzdwz(3)));
            }
        }
        return zzgot.zza(arrayList);
    }

    public final /* synthetic */ ListenableFuture zze(zzdnx zzdnxVar, JSONObject jSONObject) throws zzbns {
        this.zzd.zzc(zzgot.zza(zzdnxVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbns("process json failed");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzct)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzf.zze(), zzdru.RENDERING_NATIVE_ADS_PREPROCESS_END.zza());
        }
        return zzgot.zza(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzdip zzf(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfcu zzfcuVar, zzfcj zzfcjVar, JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar) throws Throwable {
        zzdiu zzdiuVar = (zzdiu) listenableFuture.get();
        zzdnx zzdnxVar = (zzdnx) listenableFuture2.get();
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzf.zze(), zzdru.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzdiv zzdivVarZzd = this.zza.zzd(new zzcri(zzfcuVar, zzfcjVar, null), new zzdjf(zzdiuVar), new zzdhq(jSONObject, zzdnxVar, zzbVar, zzbxfVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdsg zzdsgVar = this.zzf;
            zzdsgVar.zze().putLong(zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza(), jCurrentTimeMillis);
            zzdsgVar.zze().putLong(zzdru.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jCurrentTimeMillis);
        }
        zzdivVarZzd.zzi().zzb();
        zzdivVarZzd.zzj().zza(zzdnxVar);
        zzdivVarZzd.zzk().zza(zzdiuVar.zzT());
        zzdivVarZzd.zzl().zza(this.zze, zzdiuVar.zzU());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzf.zze(), zzdru.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
        return zzdivVarZzd.zzh();
    }
}
