package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public int d;
    public PorterDuff.Mode e;
    public boolean f;
    public WrappedDrawableState g;
    public boolean h;
    public Drawable i;

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState wrappedDrawableState = this.g;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable b() {
        return this.i;
    }

    public final boolean c(int[] iArr) {
        if (this instanceof WrappedDrawableApi21) {
            return false;
        }
        WrappedDrawableState wrappedDrawableState = this.g;
        ColorStateList colorStateList = wrappedDrawableState.c;
        PorterDuff.Mode mode = wrappedDrawableState.d;
        if (colorStateList == null || mode == null) {
            this.f = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f && colorForState == this.d && mode == this.e) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.d = colorForState;
        this.e = mode;
        this.f = true;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.i.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState = this.g;
        return changingConfigurations | (wrappedDrawableState != null ? wrappedDrawableState.getChangingConfigurations() : 0) | this.i.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        WrappedDrawableState wrappedDrawableState = this.g;
        if (wrappedDrawableState == null || wrappedDrawableState.b == null) {
            return null;
        }
        wrappedDrawableState.f2437a = getChangingConfigurations();
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.i.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.i.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.i.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return this.i.getLayoutDirection();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.i.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.i.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.i.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.i.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.i.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.i.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.i.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        WrappedDrawableState wrappedDrawableState;
        ColorStateList colorStateList = ((this instanceof WrappedDrawableApi21) || (wrappedDrawableState = this.g) == null) ? null : wrappedDrawableState.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.i.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.i.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            WrappedDrawableState wrappedDrawableState = this.g;
            WrappedDrawableState wrappedDrawableState2 = new WrappedDrawableState();
            wrappedDrawableState2.c = null;
            wrappedDrawableState2.d = j;
            if (wrappedDrawableState != null) {
                wrappedDrawableState2.f2437a = wrappedDrawableState.f2437a;
                wrappedDrawableState2.b = wrappedDrawableState.b;
                wrappedDrawableState2.c = wrappedDrawableState.c;
                wrappedDrawableState2.d = wrappedDrawableState.d;
            }
            this.g = wrappedDrawableState2;
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState wrappedDrawableState3 = this.g;
            if (wrappedDrawableState3 != null) {
                Drawable drawable2 = this.i;
                wrappedDrawableState3.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return this.i.setLayoutDirection(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.i.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.i.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.i.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.i.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.i.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return c(iArr) || this.i.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.g.c = colorStateList;
        c(this.i.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.g.d = mode;
        c(this.i.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.i.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
