package com.google.android.material.progressindicator;

import YU.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes6.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    public final DrawingDelegate o;
    public IndeterminateAnimatorDelegate p;
    public VectorDrawableCompat q;

    public IndeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, DrawingDelegate drawingDelegate, IndeterminateAnimatorDelegate indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.o = drawingDelegate;
        this.p = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.f14621a = this;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final void c() {
        super.f(false, false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        VectorDrawableCompat vectorDrawableCompat;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f;
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.e;
            if (animatorDurationScaleProvider != null && Settings.Global.getFloat(this.d.getContentResolver(), "animator_duration_scale", 1.0f) == BitmapDescriptorFactory.HUE_RED && (vectorDrawableCompat = this.q) != null) {
                vectorDrawableCompat.setBounds(getBounds());
                this.q.setTint(baseProgressIndicatorSpec.c[0]);
                this.q.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            boolean zE = super.e();
            boolean zD = super.d();
            DrawingDelegate drawingDelegate = this.o;
            drawingDelegate.f14619a.a();
            drawingDelegate.a(canvas, bounds, fB, zE, zD);
            int i2 = baseProgressIndicatorSpec.g;
            int i3 = this.m;
            Paint paint = this.l;
            if (i2 == 0) {
                this.o.d(canvas, paint, BitmapDescriptorFactory.HUE_RED, 1.0f, baseProgressIndicatorSpec.d, i3, 0);
                i = i2;
            } else {
                DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) this.p.b.get(0);
                DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) a.c(1, this.p.b);
                DrawingDelegate drawingDelegate2 = this.o;
                if (drawingDelegate2 instanceof LinearDrawingDelegate) {
                    i = i2;
                    drawingDelegate2.d(canvas, paint, BitmapDescriptorFactory.HUE_RED, activeIndicator.f14620a, baseProgressIndicatorSpec.d, i3, i);
                    this.o.d(canvas, paint, activeIndicator2.b, 1.0f, baseProgressIndicatorSpec.d, i3, i);
                } else {
                    i = i2;
                    i3 = 0;
                    drawingDelegate2.d(canvas, paint, activeIndicator2.b, activeIndicator.f14620a + 1.0f, baseProgressIndicatorSpec.d, 0, i);
                }
            }
            for (int i4 = 0; i4 < this.p.b.size(); i4++) {
                DrawingDelegate.ActiveIndicator activeIndicator3 = (DrawingDelegate.ActiveIndicator) this.p.b.get(i4);
                this.o.c(canvas, paint, activeIndicator3, this.m);
                if (i4 > 0 && i > 0) {
                    this.o.d(canvas, paint, ((DrawingDelegate.ActiveIndicator) this.p.b.get(i4 - 1)).b, activeIndicator3.f14620a, baseProgressIndicatorSpec.d, i3, i);
                }
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final boolean g(boolean z, boolean z2, boolean z3) {
        VectorDrawableCompat vectorDrawableCompat;
        boolean zG = super.g(z, z2, z3);
        if (this.f != null && Settings.Global.getFloat(this.d.getContentResolver(), "animator_duration_scale", 1.0f) == BitmapDescriptorFactory.HUE_RED && (vectorDrawableCompat = this.q) != null) {
            return vectorDrawableCompat.setVisible(z, z2);
        }
        if (!super.isRunning()) {
            this.p.a();
        }
        if (z && z3) {
            this.p.f();
        }
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

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return f(z, z2, true);
    }
}
