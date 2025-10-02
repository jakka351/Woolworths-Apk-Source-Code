package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzdvg implements zzcvv, zzcyy, zzcxk {
    private final zzdvs zza;
    private final String zzb;
    private final String zzc;
    private zzcvl zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdvf zze = zzdvf.AD_REQUESTED;

    public zzdvg(zzdvs zzdvsVar, zzfdc zzfdcVar, String str) {
        this.zza = zzdvsVar;
        this.zzc = str;
        this.zzb = zzfdcVar.zzg;
    }

    private final JSONObject zzh(zzcvl zzcvlVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcvlVar.zze());
        jSONObject.put("responseSecsSinceEpoch", zzcvlVar.zzc());
        jSONObject.put("responseId", zzcvlVar.zzf());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjZ)).booleanValue()) {
            String strZzd = zzcvlVar.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                String strValueOf = String.valueOf(strZzd);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkc)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzcvlVar.zzg()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.zza);
            jSONObject2.put("latencyMillis", zzvVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzka)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzbb.zza().zzm(zzvVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : zzi(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzi(zzeVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zza(zzcqs zzcqsVar) {
        zzdvs zzdvsVar = this.zza;
        if (zzdvsVar.zzs()) {
            this.zzf = zzcqsVar.zzn();
            this.zze = zzdvf.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkg)).booleanValue()) {
                zzdvsVar.zzk(this.zzb, this);
            }
        }
    }

    public final boolean zzc() {
        return this.zze != zzdvf.AD_REQUESTED;
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdvs zzdvsVar = this.zza;
        if (zzdvsVar.zzs()) {
            this.zze = zzdvf.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkg)).booleanValue()) {
                zzdvsVar.zzk(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkg)).booleanValue()) {
            return;
        }
        zzdvs zzdvsVar = this.zza;
        if (zzdvsVar.zzs()) {
            zzdvsVar.zzk(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
        zzdvs zzdvsVar = this.zza;
        if (zzdvsVar.zzs()) {
            zzfct zzfctVar = zzfcuVar.zzb;
            List list = zzfctVar.zza;
            if (!list.isEmpty()) {
                this.zzd = ((zzfcj) list.get(0)).zzb;
            }
            zzfcm zzfcmVar = zzfctVar.zzb;
            String str = zzfcmVar.zzl;
            if (!TextUtils.isEmpty(str)) {
                this.zzh = str;
            }
            String str2 = zzfcmVar.zzm;
            if (!TextUtils.isEmpty(str2)) {
                this.zzi = str2;
            }
            JSONObject jSONObject = zzfcmVar.zzp;
            if (jSONObject.length() > 0) {
                this.zzl = jSONObject;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkc)).booleanValue()) {
                if (!zzdvsVar.zzm()) {
                    this.zzo = true;
                    return;
                }
                String str3 = zzfcmVar.zzn;
                if (!TextUtils.isEmpty(str3)) {
                    this.zzj = str3;
                }
                JSONObject jSONObject2 = zzfcmVar.zzo;
                if (jSONObject2.length() > 0) {
                    this.zzk = jSONObject2;
                }
                JSONObject jSONObject3 = this.zzk;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzdvsVar.zzl(length);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final JSONObject zzg() throws JSONException {
        JSONObject jSONObjectZzh;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzfcj.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkg)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzcvl zzcvlVar = this.zzf;
        if (zzcvlVar != null) {
            jSONObjectZzh = zzh(zzcvlVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObjectZzh2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcvl zzcvlVar2 = (zzcvl) iBinder;
                jSONObjectZzh2 = zzh(zzcvlVar2);
                if (zzcvlVar2.zzg().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzi(this.zzg));
                    jSONObjectZzh2.put("errors", jSONArray);
                }
            }
            jSONObjectZzh = jSONObjectZzh2;
        }
        jSONObject.put("responseInfo", jSONObjectZzh);
        return jSONObject;
    }
}
