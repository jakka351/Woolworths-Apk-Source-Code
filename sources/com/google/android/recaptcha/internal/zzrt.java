package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzrt extends zznd implements zzoj {
    private static final zzrt zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();

    static {
        zzrt zzrtVar = new zzrt();
        zzb = zzrtVar;
        zznd.zzI(zzrt.class, zzrtVar);
    }

    private zzrt() {
    }

    public static zzrt zzg() {
        return zzb;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzrt();
        }
        zzrw zzrwVar = null;
        if (i2 == 4) {
            return new zzrs(zzrwVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar != null) {
            return zzoqVar;
        }
        synchronized (zzrt.class) {
            try {
                zzmyVar = zzd;
                if (zzmyVar == null) {
                    zzmyVar = new zzmy(zzb);
                    zzd = zzmyVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzmyVar;
    }

    public final List zzi() {
        return this.zze;
    }
}
