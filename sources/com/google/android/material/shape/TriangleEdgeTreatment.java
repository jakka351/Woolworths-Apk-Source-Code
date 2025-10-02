package com.google.android.material.shape;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    @Override // com.google.android.material.shape.EdgeTreatment
    public final void b(float f, float f2, float f3, ShapePath shapePath) {
        float f4 = BitmapDescriptorFactory.HUE_RED * f3;
        shapePath.e(f2 - f4, f2, (-0.0f) * f3);
        shapePath.e(f2 + f4, f, BitmapDescriptorFactory.HUE_RED);
    }
}
