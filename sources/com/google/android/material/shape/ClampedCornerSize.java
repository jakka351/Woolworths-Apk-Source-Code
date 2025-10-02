package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo
/* loaded from: classes6.dex */
public final class ClampedCornerSize implements CornerSize {

    /* renamed from: a, reason: collision with root package name */
    public final float f14632a;

    public ClampedCornerSize(float f) {
        this.f14632a = f;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return Math.min(this.f14632a, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClampedCornerSize) && this.f14632a == ((ClampedCornerSize) obj).f14632a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14632a)});
    }
}
