package com.google.android.material.shape;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public class CutCornerTreatment extends CornerTreatment {
    @Override // com.google.android.material.shape.CornerTreatment
    public final void a(ShapePath shapePath, float f, float f2) {
        shapePath.f(BitmapDescriptorFactory.HUE_RED, f2 * f, 180.0f, 90.0f);
        double d = f2;
        double d2 = f;
        shapePath.d((float) (Math.sin(Math.toRadians(90.0f)) * d * d2), (float) (Math.sin(Math.toRadians(BitmapDescriptorFactory.HUE_RED)) * d * d2));
    }
}
