package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes6.dex */
public final class zzc extends zzeh implements zzfn {
    private static final zzc zzb;
    private int zzd;
    private zzem zze = zzeh.zzM();
    private zzem zzf = zzeh.zzM();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzc zzcVar = new zzc();
        zzb = zzcVar;
        zzeh.zzV(zzc.class, zzcVar);
    }

    public static zzb a() {
        return (zzb) zzb.zzG();
    }

    public static /* synthetic */ void b(zzc zzcVar, int i) {
        zzcVar.zzd |= 2;
        zzcVar.zzh = i;
    }

    public static /* synthetic */ void c(zzc zzcVar, float f) {
        zzem zzemVar = zzcVar.zze;
        if (!zzemVar.zzc()) {
            zzcVar.zze = zzeh.zzN(zzemVar);
        }
        zzcVar.zze.zzh(f);
    }

    public static /* synthetic */ void d(zzc zzcVar, float f) {
        zzem zzemVar = zzcVar.zzf;
        if (!zzemVar.zzc()) {
            zzcVar.zzf = zzeh.zzN(zzemVar);
        }
        zzcVar.zzf.zzh(f);
    }

    public static /* synthetic */ void e(zzc zzcVar, int i) {
        zzcVar.zzd |= 1;
        zzcVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzc();
        }
        if (i2 == 4) {
            return new zzb(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
