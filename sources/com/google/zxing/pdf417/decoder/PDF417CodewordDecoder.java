package com.google.zxing.pdf417.decoder;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

/* loaded from: classes6.dex */
final class PDF417CodewordDecoder {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f16207a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i;
        for (int i2 = 0; i2 < 2787; i2++) {
            int i3 = PDF417Common.b[i2];
            int i4 = i3 & 1;
            int i5 = 0;
            while (i5 < 8) {
                float f = BitmapDescriptorFactory.HUE_RED;
                while (true) {
                    i = i3 & 1;
                    if (i == i4) {
                        f += 1.0f;
                        i3 >>= 1;
                    }
                }
                f16207a[i2][7 - i5] = f / 17.0f;
                i5++;
                i4 = i;
            }
        }
    }
}
