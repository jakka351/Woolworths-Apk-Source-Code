package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzfco {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfco(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
        this.zzd = jSONObjectZzd;
        this.zza = jSONObjectZzd.optString("ad_html", null);
        this.zzb = jSONObjectZzd.optString("ad_base_url", null);
        this.zzc = jSONObjectZzd.optJSONObject("ad_json");
    }
}
