package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzdvz implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final JSONObject zza = new JSONObject();
    private List zzb;

    @VisibleForTesting
    public zzdvz() {
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, @Nullable String str) throws JSONException {
        if (str != null && this.zzb.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                if (obj == null) {
                    this.zza.remove(str);
                } else {
                    this.zza.put(str, obj);
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
            }
        }
    }

    public final void zza(SharedPreferences sharedPreferences, List list) throws JSONException {
        this.zzb = list;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onSharedPreferenceChanged(sharedPreferences, (String) it.next());
        }
    }

    public final JSONObject zzb() throws JSONException {
        return this.zza;
    }
}
