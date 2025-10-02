package com.google.android.material.shape;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public class EdgeTreatment {
    public boolean a() {
        return this instanceof MarkerEdgeTreatment;
    }

    public void b(float f, float f2, float f3, ShapePath shapePath) {
        shapePath.d(f, BitmapDescriptorFactory.HUE_RED);
    }
}
