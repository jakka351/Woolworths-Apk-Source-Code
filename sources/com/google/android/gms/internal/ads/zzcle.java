package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzcle implements zzcky {
    private final zzdvs zza;

    public zzcle(zzdvs zzdvsVar) {
        this.zza = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                this.zza.zze(zzdvo.SHAKE);
                return;
            }
        } else if (str.equals("flick")) {
            this.zza.zze(zzdvo.FLICK);
            return;
        }
        this.zza.zze(zzdvo.NONE);
    }
}
