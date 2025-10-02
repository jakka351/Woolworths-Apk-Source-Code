package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcev;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzecy;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class zzt extends zzz {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    @Nullable
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (zzs.zzJ()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public zzcev zzb(zzcek zzcekVar, zzbbh zzbbhVar, boolean z, @Nullable zzecy zzecyVar) {
        return new zzcfy(zzcekVar, zzbbhVar, z, zzecyVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
