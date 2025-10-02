package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzeie implements zzeeb {
    private final Map zza = new HashMap();
    private final zzdqc zzb;

    public zzeie(zzdqc zzdqcVar) {
        this.zzb = zzdqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    @Nullable
    public final zzeec zza(String str, JSONObject jSONObject) throws zzfdj {
        zzeec zzeecVar;
        synchronized (this) {
            try {
                Map map = this.zza;
                zzeecVar = (zzeec) map.get(str);
                if (zzeecVar == null) {
                    zzeecVar = new zzeec(this.zzb.zza(str, jSONObject), new zzefp(), str);
                    map.put(str, zzeecVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzeecVar;
    }
}
