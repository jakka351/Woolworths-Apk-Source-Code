package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes6.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    public static final FloatPropertyCompat t = new AnonymousClass1();
    public final DrawingDelegate o;
    public final SpringForce p;
    public final SpringAnimation q;
    public final DrawingDelegate.ActiveIndicator r;
    public boolean s;

    /* renamed from: com.google.android.material.progressindicator.DeterminateDrawable$1, reason: invalid class name */
    public class AnonymousClass1 extends FloatPropertyCompat<DeterminateDrawable<?>> {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((DeterminateDrawable) obj).r.b * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) obj;
            FloatPropertyCompat floatPropertyCompat = DeterminateDrawable.t;
            determinateDrawable.r.b = f / 10000.0f;
            determinateDrawable.invalidateSelf();
        }
    }

    public DeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.s = false;
        this.o = drawingDelegate;
        this.r = new DrawingDelegate.ActiveIndicator();
        SpringForce springForce = new SpringForce();
        this.p = springForce;
        springForce.a(1.0f);
        springForce.b(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, t);
        this.q = springAnimation;
        springAnimation.t = springForce;
        if (this.k != 1.0f) {
            this.k = 1.0f;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final void c() {
        super.f(false, false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            boolean zE = super.e();
            boolean zD = super.d();
            DrawingDelegate drawingDelegate = this.o;
            drawingDelegate.f14619a.a();
            drawingDelegate.a(canvas, bounds, fB, zE, zD);
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.l;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.e;
            int i = baseProgressIndicatorSpec.c[0];
            DrawingDelegate.ActiveIndicator activeIndicator = this.r;
            activeIndicator.c = i;
            int iA = baseProgressIndicatorSpec.g;
            if (iA > 0) {
                if (!(this.o instanceof LinearDrawingDelegate)) {
                    iA = (int) ((MathUtils.a(activeIndicator.b, BitmapDescriptorFactory.HUE_RED, 0.01f) * iA) / 0.01f);
                }
                this.o.d(canvas, paint, activeIndicator.b, 1.0f, baseProgressIndicatorSpec.d, this.m, iA);
            } else {
                this.o.d(canvas, paint, BitmapDescriptorFactory.HUE_RED, 1.0f, baseProgressIndicatorSpec.d, this.m, 0);
            }
            this.o.c(canvas, paint, activeIndicator, this.m);
            this.o.b(canvas, paint, baseProgressIndicatorSpec.c[0], this.m);
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final boolean g(boolean z, boolean z2, boolean z3) {
        boolean zG = super.g(z, z2, z3);
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f;
        ContentResolver contentResolver = this.d.getContentResolver();
        animatorDurationScaleProvider.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == BitmapDescriptorFactory.HUE_RED) {
            this.s = true;
            return zG;
        }
        this.s = false;
        this.p.b(50.0f / f);
        return zG;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.o.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.o.f();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.q.d();
        this.r.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.s;
        DrawingDelegate.ActiveIndicator activeIndicator = this.r;
        SpringAnimation springAnimation = this.q;
        if (z) {
            springAnimation.d();
            activeIndicator.b = i / 10000.0f;
            invalidateSelf();
        } else {
            springAnimation.b = activeIndicator.b * 10000.0f;
            springAnimation.c = true;
            springAnimation.c(i);
        }
        return true;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return f(z, z2, true);
    }
}
