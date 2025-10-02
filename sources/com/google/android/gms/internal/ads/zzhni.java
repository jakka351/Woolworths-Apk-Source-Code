package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzhni extends zzhih implements zzhjt {
    private static final zzhni zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhhb zzc;
    private zzhhb zzd;

    static {
        zzhni zzhniVar = new zzhni();
        zze = zzhniVar;
        zzhih.zzbu(zzhni.class, zzhniVar);
    }

    private zzhni() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzc = zzhhbVar;
        this.zzd = zzhhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhni();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnh(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzf;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhni.class) {
            try {
                zzhicVar = zzf;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zze);
                    zzf = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
