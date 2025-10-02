package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.util.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
public class FixedSizeDrawable extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f13973a;
    public final RectF b;
    public final RectF c;
    public Drawable d;
    public State e;
    public boolean f;

    public static final class State extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f13974a;
        public final int b;
        public final int c;

        public State(Drawable.ConstantState constantState, int i, int i2) {
            this.f13974a = constantState;
            this.b = i;
            this.c = i2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new FixedSizeDrawable(this, this.f13974a.newDrawable());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new FixedSizeDrawable(this, this.f13974a.newDrawable(resources));
        }
    }

    public FixedSizeDrawable(State state, Drawable drawable) {
        this.e = state;
        Preconditions.c(drawable, "Argument must not be null");
        this.d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f13973a = new Matrix();
        this.b = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.concat(this.f13973a);
        this.d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.Callback getCallback() {
        return this.d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.e.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.e.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.d = this.d.mutate();
            State state = this.e;
            this.e = new State(state.f13974a, state.b, state.c);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.d.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        RectF rectF = this.c;
        rectF.set(i, i2, i3, i4);
        this.f13973a.setRectToRect(this.b, rectF, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.d.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.d.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.d.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return this.d.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.d.unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        RectF rectF = this.c;
        rectF.set(rect);
        this.f13973a.setRectToRect(this.b, rectF, Matrix.ScaleToFit.CENTER);
    }
}
