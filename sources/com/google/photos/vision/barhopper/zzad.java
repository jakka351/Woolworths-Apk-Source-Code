package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes6.dex */
public final class zzad extends zzeh implements zzfn {
    private static final zzad zzb;
    private zzeo zzd = zzeh.zzP();

    static {
        zzad zzadVar = new zzad();
        zzb = zzadVar;
        zzeh.zzV(zzad.class, zzadVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzac.class});
        }
        if (i2 == 3) {
            return new zzad();
        }
        if (i2 == 4) {
            return new zzaa(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
