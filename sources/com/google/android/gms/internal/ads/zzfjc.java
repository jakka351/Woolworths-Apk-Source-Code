package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzfjc extends zzhih implements zzhjt {
    private static final zzfjc zzb;
    private static volatile zzhka zzc;
    private zzhit zza = zzhih.zzbM();

    static {
        zzfjc zzfjcVar = new zzfjc();
        zzb = zzfjcVar;
        zzhih.zzbu(zzfjc.class, zzfjcVar);
    }

    private zzfjc() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfja.class});
        }
        if (iOrdinal == 3) {
            return new zzfjc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfjb(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzc;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzfjc.class) {
            try {
                zzhicVar = zzc;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzb);
                    zzc = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
