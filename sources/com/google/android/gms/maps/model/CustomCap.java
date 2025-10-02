package com.google.android.gms.maps.model;

import android.support.v4.media.session.a;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class CustomCap extends Cap {

    @NonNull
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    public CustomCap(@NonNull BitmapDescriptor bitmapDescriptor) {
        this(bitmapDescriptor, 10.0f);
    }

    @Override // com.google.android.gms.maps.model.Cap
    @NonNull
    public String toString() {
        return a.j(this.refWidth, "]", YU.a.u("[CustomCap: bitmapDescriptor=", String.valueOf(this.bitmapDescriptor), " refWidth="));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomCap(@NonNull BitmapDescriptor bitmapDescriptor, float f) {
        BitmapDescriptor bitmapDescriptor2 = (BitmapDescriptor) Preconditions.checkNotNull(bitmapDescriptor, "bitmapDescriptor must not be null");
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        super(bitmapDescriptor2, f);
        this.bitmapDescriptor = bitmapDescriptor;
        this.refWidth = f;
    }
}
