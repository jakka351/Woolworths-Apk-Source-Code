package com.otaliastudios.opengl.extensions;

import android.opengl.Matrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"library_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class MatrixKt {
    public static void a(float[] fArr, float f, float f2) {
        Intrinsics.h(fArr, "<this>");
        if (fArr.length != 16) {
            throw new RuntimeException("Need a 16 values matrix.");
        }
        Matrix.translateM(fArr, 0, f, f2, BitmapDescriptorFactory.HUE_RED);
    }
}
