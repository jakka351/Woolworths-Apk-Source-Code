package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzckw {
    private final Map zza;
    private final Map zzb;

    public zzckw(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfcu zzfcuVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfcs zzfcsVar : zzfcuVar.zzb.zzc) {
            Map map = this.zza;
            String str = zzfcsVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfcsVar.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfcsVar.zzb) != null) {
                    zzcky zzckyVar = (zzcky) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzckyVar.zza(map3);
                }
            } else {
                ((zzckz) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
