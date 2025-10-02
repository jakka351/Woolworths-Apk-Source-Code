package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.internal.ads.b;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
public final /* synthetic */ class zzec {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!b.a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
