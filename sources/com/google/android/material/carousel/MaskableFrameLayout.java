package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import au.com.woolworths.feature.product.list.legacy.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.ShapeableDelegate;

/* loaded from: classes6.dex */
public class MaskableFrameLayout extends FrameLayout implements Maskable, Shapeable {
    public static final /* synthetic */ int j = 0;
    public float d;
    public final RectF e;
    public OnMaskChangedListener f;
    public ShapeAppearanceModel g;
    public final ShapeableDelegate h;
    public Boolean i;

    public MaskableFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public final void a() {
        if (this.d != -1.0f) {
            float fB = AnimationUtils.b(BitmapDescriptorFactory.HUE_RED, getWidth() / 2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, this.d);
            setMaskRectF(new RectF(fB, BitmapDescriptorFactory.HUE_RED, getWidth() - fB, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeableDelegate shapeableDelegate = this.h;
        Path path = shapeableDelegate.e;
        if (!shapeableDelegate.c() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        RectF rectF = this.e;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @NonNull
    public RectF getMaskRectF() {
        return this.e;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.d;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.i;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            ShapeableDelegate shapeableDelegate = this.h;
            if (zBooleanValue != shapeableDelegate.f14643a) {
                shapeableDelegate.f14643a = zBooleanValue;
                shapeableDelegate.b(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ShapeableDelegate shapeableDelegate = this.h;
        this.i = Boolean.valueOf(shapeableDelegate.f14643a);
        if (true != shapeableDelegate.f14643a) {
            shapeableDelegate.f14643a = true;
            shapeableDelegate.b(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.d != -1.0f) {
            a();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.e;
        if (rectF.isEmpty() || motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @RestrictTo
    @VisibleForTesting
    public void setForceCompatClipping(boolean z) {
        ShapeableDelegate shapeableDelegate = this.h;
        if (z != shapeableDelegate.f14643a) {
            shapeableDelegate.f14643a = z;
            shapeableDelegate.b(this);
        }
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskRectF(@NonNull RectF rectF) {
        RectF rectF2 = this.e;
        rectF2.set(rectF);
        ShapeableDelegate shapeableDelegate = this.h;
        shapeableDelegate.d = rectF2;
        shapeableDelegate.d();
        shapeableDelegate.b(this);
        OnMaskChangedListener onMaskChangedListener = this.f;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.a();
        }
    }

    @Deprecated
    public void setMaskXPercentage(float f) {
        float fA = MathUtils.a(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (this.d != fA) {
            this.d = fA;
            a();
        }
    }

    public void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener) {
        this.f = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel shapeAppearanceModelH = shapeAppearanceModel.h(new k(28));
        this.g = shapeAppearanceModelH;
        ShapeableDelegate shapeableDelegate = this.h;
        shapeableDelegate.c = shapeAppearanceModelH;
        shapeableDelegate.d();
        shapeableDelegate.b(this);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = -1.0f;
        this.e = new RectF();
        this.h = ShapeableDelegate.a(this);
        this.i = null;
        setShapeAppearanceModel(ShapeAppearanceModel.d(context, attributeSet, i, 0).a());
    }
}
