package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes5.dex */
final class zzghu implements Serializable, zzght {
    final zzght zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgia zzd = new zzgia();

    public zzghu(zzght zzghtVar) {
        this.zza = zzghtVar;
    }

    public final String toString() {
        Object objP;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            objP = YU.a.p(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objP = this.zza;
        }
        String string = objP.toString();
        return YU.a.p(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzght
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
