package com.google.android.recaptcha.internal;

/* loaded from: classes6.dex */
public final class zzsm extends zznd implements zzoj {
    private static final zzsm zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";

    static {
        zzsm zzsmVar = new zzsm();
        zzb = zzsmVar;
        zznd.zzI(zzsm.class, zzsmVar);
    }

    private zzsm() {
    }

    public static zzsl zzf() {
        return (zzsl) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsm zzsmVar, String str) {
        str.getClass();
        zzsmVar.zze |= 1;
        zzsmVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzsm();
        }
        zzsn zzsnVar = null;
        if (i2 == 4) {
            return new zzsl(zzsnVar);
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
        synchronized (zzsm.class) {
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
