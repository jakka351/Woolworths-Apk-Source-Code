package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes6.dex */
public final class zzf extends zzeh implements zzfn {
    private static final zzf zzb;
    private zzeo zzd = zzeh.zzP();

    static {
        zzf zzfVar = new zzf();
        zzb = zzfVar;
        zzeh.zzV(zzf.class, zzfVar);
    }

    public static zze a() {
        return (zze) zzb.zzG();
    }

    public static /* synthetic */ void b(zzf zzfVar, zzc zzcVar) {
        zzcVar.getClass();
        zzeo zzeoVar = zzfVar.zzd;
        if (!zzeoVar.zzc()) {
            zzfVar.zzd = zzeh.zzQ(zzeoVar);
        }
        zzfVar.zzd.add(zzcVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzc.class});
        }
        if (i2 == 3) {
            return new zzf();
        }
        if (i2 == 4) {
            return new zze(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
