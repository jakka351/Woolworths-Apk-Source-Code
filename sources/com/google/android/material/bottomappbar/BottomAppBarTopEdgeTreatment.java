package com.google.android.material.bottomappbar;

import YU.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* loaded from: classes6.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;

    @Override // com.google.android.material.shape.EdgeTreatment
    public final void b(float f, float f2, float f3, ShapePath shapePath) {
        float f4;
        float f5;
        float f6 = this.f;
        if (f6 == BitmapDescriptorFactory.HUE_RED) {
            shapePath.d(f, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f7 = ((this.e * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.d;
        float f9 = f2 + this.h;
        float fA = a.a(1.0f, f3, f7, this.g * f3);
        if (fA / f7 >= 1.0f) {
            shapePath.d(f, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f10 = this.i;
        float f11 = f10 * f3;
        boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = fA;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f12 = f7 + f8;
        float f13 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f9 - fSqrt;
        float f15 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f13));
        float f16 = (90.0f - degrees) + f5;
        shapePath.d(f14, BitmapDescriptorFactory.HUE_RED);
        float f17 = f14 - f8;
        float f18 = f14 + f8;
        float f19 = f8 * 2.0f;
        shapePath.a(f17, BitmapDescriptorFactory.HUE_RED, f18, f19, 270.0f, degrees);
        if (z) {
            shapePath.a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f20 = this.e;
            float f21 = f11 * 2.0f;
            float f22 = f20 + f21;
            float f23 = f9 - f7;
            shapePath.a(f23, -(f11 + f20), f22 + f23, f20 + f11, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f24 = f9 + f7;
            float f25 = this.e;
            shapePath.d(f24 - ((f25 / 2.0f) + f11), f25 + f11);
            float f26 = this.e;
            shapePath.a(f24 - (f21 + f26), -(f11 + f26), f24, f26 + f11, 90.0f, f16 - 90.0f);
        }
        shapePath.a(f15 - f8, BitmapDescriptorFactory.HUE_RED, f15 + f8, f19, 270.0f - degrees, degrees);
        shapePath.d(f, BitmapDescriptorFactory.HUE_RED);
    }

    public final void c(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.g = f;
    }
}
