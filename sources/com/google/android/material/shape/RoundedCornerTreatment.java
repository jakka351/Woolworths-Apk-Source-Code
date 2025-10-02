package com.google.android.material.shape;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    @Override // com.google.android.material.shape.CornerTreatment
    public final void a(ShapePath shapePath, float f, float f2) {
        shapePath.f(BitmapDescriptorFactory.HUE_RED, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        shapePath.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, f3, 180.0f, 90.0f);
    }
}
