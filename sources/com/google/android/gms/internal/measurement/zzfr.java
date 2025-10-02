package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zzfr extends zzmf implements zznn {
    private static final zzfr zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private zzmo zzg = zzmf.zzcv();

    static {
        zzfr zzfrVar = new zzfr();
        zzh = zzfrVar;
        zzmf.zzcp(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static zzfr zzh() {
        return zzh;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzg;
    }

    public final int zzg() {
        return this.zzg.size();
    }

    public final int zzj() {
        int iZza = zzfq.zza(this.zzd);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmf.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", zzfp.zza, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzfr();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzfo(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
