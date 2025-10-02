package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzfnx extends zzfns {
    public zzfnx(zzfnl zzfnlVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfnlVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfnl zzfnlVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfnd.zzg(jSONObject, zzfnlVar.zzd())) {
            return null;
        }
        zzfnlVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnt, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfmh zzfmhVarZza;
        if (!TextUtils.isEmpty(str) && (zzfmhVarZza = zzfmh.zza()) != null) {
            for (zzfln zzflnVar : zzfmhVarZza.zze()) {
                if (((zzfns) this).zza.contains(zzflnVar.zzh())) {
                    zzflnVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
