package com.google.android.recaptcha.internal;

/* loaded from: classes6.dex */
public final class zzsa extends zznd implements zzoj {
    private static final zzsa zzb;
    private static volatile zzoq zzd;
    private zzle zze = zzle.zzb;

    static {
        zzsa zzsaVar = new zzsa();
        zzb = zzsaVar;
        zznd.zzI(zzsa.class, zzsaVar);
    }

    private zzsa() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzsa();
        }
        zzsn zzsnVar = null;
        if (i2 == 4) {
            return new zzrz(zzsnVar);
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
        synchronized (zzsa.class) {
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
}
