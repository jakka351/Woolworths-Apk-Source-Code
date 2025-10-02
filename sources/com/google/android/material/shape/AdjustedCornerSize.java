package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

@RestrictTo
/* loaded from: classes6.dex */
public final class AdjustedCornerSize implements CornerSize {

    /* renamed from: a, reason: collision with root package name */
    public final CornerSize f14631a;
    public final float b;

    public AdjustedCornerSize(float f, CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).f14631a;
            f += ((AdjustedCornerSize) cornerSize).b;
        }
        this.f14631a = cornerSize;
        this.b = f;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return Math.max(BitmapDescriptorFactory.HUE_RED, this.f14631a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
        return this.f14631a.equals(adjustedCornerSize.f14631a) && this.b == adjustedCornerSize.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14631a, Float.valueOf(this.b)});
    }
}
