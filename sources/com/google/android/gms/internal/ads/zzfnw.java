package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzfnw extends zzfns {
    public zzfnw(zzfnl zzfnlVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfnlVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfmh zzfmhVarZza = zzfmh.zza();
        if (zzfmhVarZza != null) {
            for (zzfln zzflnVar : zzfmhVarZza.zze()) {
                if (((zzfns) this).zza.contains(zzflnVar.zzh())) {
                    zzflnVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnt, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfnt
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
