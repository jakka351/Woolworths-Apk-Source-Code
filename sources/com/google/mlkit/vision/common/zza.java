package com.google.mlkit.vision.common;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
final class zza extends PointF3D {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PointF3D) && Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) == Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) && Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) == Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) && Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) == Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
    }

    public final int hashCode() {
        return Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) ^ ((((Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) ^ 1000003) * 1000003) ^ Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 1000003);
    }

    public final String toString() {
        return "PointF3D{x=0.0, y=0.0, z=0.0}";
    }
}
