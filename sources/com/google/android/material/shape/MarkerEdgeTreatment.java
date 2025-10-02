package com.google.android.material.shape;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    public final float d;

    public MarkerEdgeTreatment(float f) {
        this.d = f - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public final void b(float f, float f2, float f3, ShapePath shapePath) {
        double d = this.d;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        shapePath.f(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, BitmapDescriptorFactory.HUE_RED);
        shapePath.d(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        shapePath.d(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
