package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes6.dex */
public final class zzac extends zzeh implements zzfn {
    private static final zzac zzb;
    private int zzd;
    private String zze = "";
    private zzdf zzf;
    private String zzg;
    private zzdf zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        zzac zzacVar = new zzac();
        zzb = zzacVar;
        zzeh.zzV(zzac.class, zzacVar);
    }

    public zzac() {
        zzdf zzdfVar = zzdf.zzb;
        this.zzf = zzdfVar;
        this.zzg = "";
        this.zzh = zzdfVar;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static zzab a() {
        return (zzab) zzb.zzG();
    }

    public static /* synthetic */ void b(zzac zzacVar, zzdf zzdfVar) {
        zzdfVar.getClass();
        zzacVar.zzd |= 2;
        zzacVar.zzf = zzdfVar;
    }

    public static /* synthetic */ void c(zzac zzacVar, zzdf zzdfVar) {
        zzdfVar.getClass();
        zzacVar.zzd |= 8;
        zzacVar.zzh = zzdfVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzeh.zzS(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzac();
        }
        if (i2 == 4) {
            return new zzab(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
