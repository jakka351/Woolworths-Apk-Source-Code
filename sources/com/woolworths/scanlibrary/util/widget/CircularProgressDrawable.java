package com.woolworths.scanlibrary.util.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes7.dex */
public class CircularProgressDrawable extends Drawable {
    public static final String CIRCLE_COLOR_PROPERTY = "centerColor";
    public static final String CIRCLE_SCALE_PROPERTY = "circleScale";
    public static final String OUTLINE_COLOR_PROPERTY = "outlineColor";
    private static final int PROGRESS_FACTOR = -360;
    private static final String PROGRESS_PROPERTY = "progress";
    public static final String RING_COLOR_PROPERTY = "ringColor";
    public static final String TAG = "CircularProgressDrawable";
    private final RectF arcElements;
    private int centerColor;
    private float circleScale;
    private boolean indeterminate;
    private Animator indeterminedAnimator;
    private int outlineColor;
    private final Paint paint;
    private float progress;
    private int ringColor;
    private final int ringWidth;

    public static class Builder {
        int centerColor;
        float circleScale = 0.75f;
        int outlineColor;
        int ringColor;
        int ringWidth;

        public CircularProgressDrawable create() {
            return new CircularProgressDrawable(this.ringWidth, this.outlineColor, this.ringColor, this.centerColor, this.circleScale, 0);
        }

        public Builder setCenterColor(int i) {
            this.centerColor = i;
            return this;
        }

        public Builder setInnerCircleScale(float f) {
            this.circleScale = f;
            return this;
        }

        public Builder setOutlineColor(int i) {
            this.outlineColor = i;
            return this;
        }

        public Builder setRingColor(int i) {
            this.ringColor = i;
            return this;
        }

        public Builder setRingWidth(int i) {
            this.ringWidth = i;
            return this;
        }
    }

    public /* synthetic */ CircularProgressDrawable(int i, int i2, int i3, int i4, float f, int i5) {
        this(i, f, i2, i3, i4);
    }

    private Animator getAnimator() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, PROGRESS_PROPERTY, BitmapDescriptorFactory.HUE_RED, 720.0f);
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        return objectAnimatorOfFloat;
    }

    private void startAnimation() {
        stopAnimation();
        Animator animator = getAnimator();
        this.indeterminedAnimator = animator;
        animator.start();
    }

    private void stopAnimation() {
        Animator animator = this.indeterminedAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        float fMin = (Math.min(bounds.height(), bounds.width()) / 2) - (this.ringWidth / 2);
        float f = this.circleScale * fMin;
        float f2 = fMin * 2.0f;
        float fWidth = (bounds.width() - f2) / 2.0f;
        float fHeight = (bounds.height() - f2) / 2.0f;
        Paint paint = this.paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.paint.setStrokeWidth(1.0f);
        this.paint.setColor(this.outlineColor);
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), fMin, this.paint);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.centerColor);
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), f, this.paint);
        float f3 = this.ringWidth / 2;
        this.paint.setColor(this.ringColor);
        this.paint.setStyle(style);
        this.paint.setStrokeWidth(this.ringWidth);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.arcElements.set(fWidth + f3, fHeight + f3, (fWidth + f2) - f3, (fHeight + f2) - f3);
        if (this.indeterminate) {
            canvas.drawArc(this.arcElements, this.progress, 120.0f, false, this.paint);
        } else {
            canvas.drawArc(this.arcElements, 89.0f, this.progress, false, this.paint);
        }
    }

    public int getCenterColor() {
        return this.centerColor;
    }

    public float getCircleScale() {
        return this.circleScale;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 1 - this.paint.getAlpha();
    }

    public int getOutlineColor() {
        return this.outlineColor;
    }

    public float getProgress() {
        return this.progress / (-360.0f);
    }

    public int getRingColor() {
        return this.ringColor;
    }

    public boolean isIndeterminate() {
        return this.indeterminate;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    public void setCenterColor(int i) {
        this.centerColor = i;
        invalidateSelf();
    }

    public void setCircleScale(float f) {
        this.circleScale = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public void setIndeterminate(boolean z) {
        this.indeterminate = z;
        if (z) {
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    public void setOutlineColor(int i) {
        this.outlineColor = i;
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.indeterminate) {
            this.progress = f;
        } else {
            this.progress = f * (-360.0f);
        }
        invalidateSelf();
    }

    public void setRingColor(int i) {
        this.ringColor = i;
        invalidateSelf();
    }

    private CircularProgressDrawable(int i, float f, int i2, int i3, int i4) {
        this.progress = BitmapDescriptorFactory.HUE_RED;
        this.outlineColor = i2;
        this.ringColor = i3;
        this.centerColor = i4;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.ringWidth = i;
        this.arcElements = new RectF();
        this.circleScale = f;
        this.indeterminate = false;
    }
}
