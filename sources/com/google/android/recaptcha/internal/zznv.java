package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes6.dex */
final class zznv {
    public static final List zza(Object obj, long j) {
        zznk zznkVar = (zznk) zzps.zzf(obj, j);
        if (zznkVar.zzc()) {
            return zznkVar;
        }
        int size = zznkVar.size();
        zznk zznkVarZzd = zznkVar.zzd(size == 0 ? 10 : size + size);
        zzps.zzs(obj, j, zznkVarZzd);
        return zznkVarZzd;
    }
}
