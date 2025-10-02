package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {
    public static final /* synthetic */ int o = 0;
    public final BaseProgressIndicatorSpec d;
    public int e;
    public final boolean f;
    public final int g;
    public AnimatorDurationScaleProvider h;
    public boolean i;
    public int j;
    public final Runnable k;
    public final Runnable l;
    public final Animatable2Compat.AnimationCallback m;
    public final Animatable2Compat.AnimationCallback n;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface HideAnimationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShowAnimationBehavior {
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084150), attributeSet, i);
        this.i = false;
        this.j = 4;
        this.k = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.1
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = BaseProgressIndicator.o;
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                if (baseProgressIndicator.g > 0) {
                    SystemClock.uptimeMillis();
                }
                baseProgressIndicator.setVisibility(0);
            }
        };
        this.l = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.2
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = BaseProgressIndicator.o;
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                ((DrawableWithAnimatedVisibilityChange) baseProgressIndicator.getCurrentDrawable()).f(false, false, true);
                if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                    baseProgressIndicator.setVisibility(4);
                }
                baseProgressIndicator.getClass();
            }
        };
        this.m = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.3
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public final void a(Drawable drawable) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setIndeterminate(false);
                baseProgressIndicator.b(baseProgressIndicator.e);
            }
        };
        this.n = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.4
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public final void a(Drawable drawable) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                if (baseProgressIndicator.i) {
                    return;
                }
                baseProgressIndicator.setVisibility(baseProgressIndicator.j);
            }
        };
        Context context2 = getContext();
        this.d = a(context2, attributeSet);
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, R.styleable.d, i, i2, new int[0]);
        typedArrayD.getInt(6, -1);
        this.g = Math.min(typedArrayD.getInt(4, -1), 1000);
        typedArrayD.recycle();
        this.h = new AnimatorDurationScaleProvider();
        this.f = true;
    }

    @Nullable
    private DrawingDelegate<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().o;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().o;
    }

    public abstract BaseProgressIndicatorSpec a(Context context, AttributeSet attributeSet);

    public void b(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.e = i;
            this.i = true;
            if (getIndeterminateDrawable().isVisible()) {
                AnimatorDurationScaleProvider animatorDurationScaleProvider = this.h;
                ContentResolver contentResolver = getContext().getContentResolver();
                animatorDurationScaleProvider.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != BitmapDescriptorFactory.HUE_RED) {
                    getIndeterminateDrawable().p.e();
                    return;
                }
            }
            this.m.a(getIndeterminateDrawable());
        }
    }

    public final boolean c() {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.d.f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.d.c;
    }

    @Px
    public int getIndicatorTrackGapSize() {
        return this.d.g;
    }

    public int getShowAnimationBehavior() {
        return this.d.e;
    }

    @ColorInt
    public int getTrackColor() {
        return this.d.d;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.d.b;
    }

    @Px
    public int getTrackThickness() {
        return this.d.f14618a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().p.d(this.m);
        }
        DeterminateDrawable<S> progressDrawable = getProgressDrawable();
        Animatable2Compat.AnimationCallback animationCallback = this.n;
        if (progressDrawable != null) {
            DeterminateDrawable<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.i == null) {
                progressDrawable2.i = new ArrayList();
            }
            if (!progressDrawable2.i.contains(animationCallback)) {
                progressDrawable2.i.add(animationCallback);
            }
        }
        if (getIndeterminateDrawable() != null) {
            IndeterminateDrawable<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.i == null) {
                indeterminateDrawable.i = new ArrayList();
            }
            if (!indeterminateDrawable.i.contains(animationCallback)) {
                indeterminateDrawable.i.add(animationCallback);
            }
        }
        if (c()) {
            if (this.g > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.l);
        removeCallbacks(this.k);
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).c();
        IndeterminateDrawable<S> indeterminateDrawable = getIndeterminateDrawable();
        Animatable2Compat.AnimationCallback animationCallback = this.n;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().h(animationCallback);
            getIndeterminateDrawable().p.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().h(animationCallback);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            DrawingDelegate<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.f) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).f(c(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).f(c(), false, false);
        }
    }

    @RestrictTo
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.h = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.d.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange != null) {
                drawableWithAnimatedVisibilityChange.c();
            }
            super.setIndeterminate(z);
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange2 != null) {
                drawableWithAnimatedVisibilityChange2.f(c(), false, false);
            }
            if ((drawableWithAnimatedVisibilityChange2 instanceof IndeterminateDrawable) && c()) {
                ((IndeterminateDrawable) drawableWithAnimatedVisibilityChange2).p.f();
            }
            this.i = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof IndeterminateDrawable)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((DrawableWithAnimatedVisibilityChange) drawable).c();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.c(getContext(), com.woolworths.R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.d.c = iArr;
        getIndeterminateDrawable().p.c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(@Px int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        if (baseProgressIndicatorSpec.g != i) {
            baseProgressIndicatorSpec.g = i;
            baseProgressIndicatorSpec.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        b(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof DeterminateDrawable)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.f(false, false, false);
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.d.e = i;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        if (baseProgressIndicatorSpec.d != i) {
            baseProgressIndicatorSpec.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        if (baseProgressIndicatorSpec.b != i) {
            baseProgressIndicatorSpec.b = Math.min(i, baseProgressIndicatorSpec.f14618a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(@Px int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        if (baseProgressIndicatorSpec.f14618a != i) {
            baseProgressIndicatorSpec.f14618a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.j = i;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
