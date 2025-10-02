package com.google.android.material.shape;

/* loaded from: classes6.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {
    public final MarkerEdgeTreatment d;
    public final float e;

    public OffsetEdgeTreatment(MarkerEdgeTreatment markerEdgeTreatment, float f) {
        this.d = markerEdgeTreatment;
        this.e = f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public final void b(float f, float f2, float f3, ShapePath shapePath) {
        this.d.b(f, f2 - this.e, f3, shapePath);
    }
}
