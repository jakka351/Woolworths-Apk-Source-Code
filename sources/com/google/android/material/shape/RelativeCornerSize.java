package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class RelativeCornerSize implements CornerSize {

    /* renamed from: a, reason: collision with root package name */
    public final float f14635a;

    public RelativeCornerSize(float f) {
        this.f14635a = f;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f14635a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.f14635a == ((RelativeCornerSize) obj).f14635a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14635a)});
    }
}
