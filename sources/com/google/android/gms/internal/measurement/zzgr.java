package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzgr extends zzmf implements zznn {
    private static final zzgr zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzgr zzgrVar = new zzgr();
        zzf = zzgrVar;
        zzmf.zzcp(zzgr.class, zzgrVar);
    }

    private zzgr() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgr();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzgq(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
