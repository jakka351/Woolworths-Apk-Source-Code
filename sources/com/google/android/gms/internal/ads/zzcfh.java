package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzcfh implements zzbjl {
    final /* synthetic */ zzcfn zza;

    public zzcfh(zzcfn zzcfnVar) {
        Objects.requireNonNull(zzcfnVar);
        this.zza = zzcfnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                zzcfn zzcfnVar = this.zza;
                synchronized (zzcfnVar) {
                    try {
                        if (zzcfnVar.zzaX() != i) {
                            zzcfnVar.zzaY(i);
                            zzcfnVar.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while getting webview content height", e);
            }
        }
    }
}
