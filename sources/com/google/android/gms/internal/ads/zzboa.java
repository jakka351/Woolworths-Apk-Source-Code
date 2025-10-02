package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzboa {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbnx zza = new zzbny();
    public static final zzbnv zzb = zzbnz.zza;

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
