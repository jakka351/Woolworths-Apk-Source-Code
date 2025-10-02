package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class AbsoluteCornerSize implements CornerSize {

    /* renamed from: a, reason: collision with root package name */
    public final float f14630a;

    public AbsoluteCornerSize(float f) {
        this.f14630a = f;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return this.f14630a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsoluteCornerSize) && this.f14630a == ((AbsoluteCornerSize) obj).f14630a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14630a)});
    }
}
