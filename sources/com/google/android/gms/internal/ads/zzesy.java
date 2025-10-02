package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzesy implements zzeun {
    private final Map zza;

    public zzesy(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        Map map = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (map.isEmpty()) {
            return;
        }
        Bundle bundle = zzcuuVar.zza;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            if (!arrayDeque.isEmpty()) {
                zzdts zzdtsVar = (zzdts) entry.getKey();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", zzdtsVar.zza());
                    jSONObject.put("event_type", zzdtsVar.zzb());
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put((Long) it.next());
                    }
                    jSONObject.put("timestamps", jSONArray2);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Failed putting the on-device storage record.", e);
                }
            }
        }
        if (jSONArray.length() > 0) {
            bundle.putString("on_device_storage_records", jSONArray.toString());
        }
    }
}
