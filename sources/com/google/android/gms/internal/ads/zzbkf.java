package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes.dex */
public final class zzbkf implements zzbjl {
    private final Context zza;

    public zzbkf(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        if (!map.containsKey(TextBundle.TEXT_ENTRY) || TextUtils.isEmpty((CharSequence) map.get(TextBundle.TEXT_ENTRY))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get(TextBundle.TEXT_ENTRY))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get(TextBundle.TEXT_ENTRY));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(this.zza, intent);
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to open Share Sheet", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
