package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class FadeThroughDrawable extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f14596a;
    public final Drawable b;
    public final float[] c;
    public float d;

    public FadeThroughDrawable(Drawable drawable, Drawable drawable2) {
        this.f14596a = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.b = drawableMutate;
        drawableMutate.setAlpha(0);
        this.c = new float[2];
    }

    public final void a(float f) {
        if (this.d != f) {
            this.d = f;
            float[] fArr = this.c;
            FadeThroughUtils.a(fArr, f);
            this.f14596a.setAlpha((int) (fArr[0] * 255.0f));
            this.b.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f14596a.draw(canvas);
        this.b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f14596a.getIntrinsicHeight(), this.b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f14596a.getIntrinsicWidth(), this.b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.f14596a.getMinimumHeight(), this.b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.f14596a.getMinimumWidth(), this.b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f14596a.isStateful() || this.b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        float f = this.d;
        Drawable drawable = this.b;
        Drawable drawable2 = this.f14596a;
        if (f <= 0.5f) {
            drawable2.setAlpha(i);
            drawable.setAlpha(0);
        } else {
            drawable2.setAlpha(0);
            drawable.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f14596a.setBounds(i, i2, i3, i4);
        this.b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f14596a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.f14596a.setState(iArr) || this.b.setState(iArr);
    }
}
