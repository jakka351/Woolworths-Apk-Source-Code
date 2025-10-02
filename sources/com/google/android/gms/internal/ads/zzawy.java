package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class zzawy extends zzaxl {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzawy(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2) {
        super(zzavxVar, "MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", zzarwVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zza("E");
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zza(zzh);
        }
    }
}
