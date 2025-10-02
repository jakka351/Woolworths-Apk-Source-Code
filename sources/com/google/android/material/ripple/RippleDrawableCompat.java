package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

@RestrictTo
/* loaded from: classes6.dex */
public class RippleDrawableCompat extends Drawable implements Shapeable, TintAwareDrawable {
    public RippleDrawableCompatState d;

    public static final class RippleDrawableCompatState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public MaterialShapeDrawable f14626a;
        public boolean b;

        public RippleDrawableCompatState(RippleDrawableCompatState rippleDrawableCompatState) {
            this.f14626a = (MaterialShapeDrawable) rippleDrawableCompatState.f14626a.d.newDrawable();
            this.b = rippleDrawableCompatState.b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new RippleDrawableCompat(new RippleDrawableCompatState(this));
        }
    }

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        RippleDrawableCompatState rippleDrawableCompatState = new RippleDrawableCompatState();
        rippleDrawableCompatState.f14626a = materialShapeDrawable;
        rippleDrawableCompatState.b = false;
        this(rippleDrawableCompatState);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.d;
        if (rippleDrawableCompatState.b) {
            rippleDrawableCompatState.f14626a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.d.f14626a.getClass();
        return -3;
    }

    @Override // com.google.android.material.shape.Shapeable
    public final ShapeAppearanceModel getShapeAppearanceModel() {
        return this.d.f14626a.d.f14634a;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.d = new RippleDrawableCompatState(this.d);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.d.f14626a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.d.f14626a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zD = RippleUtils.d(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.d;
        if (rippleDrawableCompatState.b == zD) {
            return zOnStateChange;
        }
        rippleDrawableCompatState.b = zD;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.f14626a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.f14626a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.Shapeable
    public final void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.d.f14626a.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.d.f14626a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.d.f14626a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.d.f14626a.setTintMode(mode);
    }

    public RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState) {
        this.d = rippleDrawableCompatState;
    }
}
