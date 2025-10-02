package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzcll implements zzcky {
    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlj)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzy(Boolean.parseBoolean(str));
    }
}
