package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class zzghx {
    public static zzght zza(zzght zzghtVar) {
        return ((zzghtVar instanceof zzghw) || (zzghtVar instanceof zzghu)) ? zzghtVar : zzghtVar instanceof Serializable ? new zzghu(zzghtVar) : new zzghw(zzghtVar);
    }
}
