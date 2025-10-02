package com.google.android.gms.internal.ads;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzdvm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private final int zzf;
    private final boolean zzg;

    public zzdvm(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i;
        this.zze = str4;
        this.zzf = i2;
        this.zzg = z;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put("version", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzke)).booleanValue()) {
            jSONObject.put(lllqqql.cc006300630063cc, this.zzb);
        }
        jSONObject.put("status", this.zzd);
        jSONObject.put(lqlqqlq.mmm006Dm006Dm, this.zze);
        jSONObject.put("initializationLatencyMillis", this.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkf)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.zzg);
        }
        return jSONObject;
    }
}
