package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzggy {
    private final String zza;
    private final zzggx zzb;
    private zzggx zzc;

    public /* synthetic */ zzggy(String str, byte[] bArr) {
        zzggx zzggxVar = new zzggx();
        this.zzb = zzggxVar;
        this.zzc = zzggxVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzggx zzggxVar = this.zzb.zzb;
        String str = "";
        while (zzggxVar != null) {
            Object obj = zzggxVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzggxVar = zzggxVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzggy zza(Object obj) {
        zzggx zzggxVar = new zzggx();
        this.zzc.zzb = zzggxVar;
        this.zzc = zzggxVar;
        zzggxVar.zza = obj;
        return this;
    }
}
