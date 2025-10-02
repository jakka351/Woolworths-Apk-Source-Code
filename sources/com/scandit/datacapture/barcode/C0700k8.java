package com.scandit.datacapture.barcode;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.k8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0700k8 extends View {
    private final float b;
    private final float c;
    private final Path d;
    private final Paint e;
    private final Path f;
    private final Paint g;
    private final RectF h;
    private float i;
    private final ValueAnimator j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0700k8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        final int i2 = 1;
        this.b = PixelExtensionsKt.pxFromDp$default(3.0f, (Context) null, 1, (Object) null);
        this.c = PixelExtensionsKt.pxFromDp$default(8.0f, (Context) null, 1, (Object) null);
        this.d = new Path();
        int iArgb = Color.argb(77, 255, 255, 255);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setColor(iArgb);
        paint.setAntiAlias(true);
        this.e = paint;
        this.f = new Path();
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        this.g = paint2;
        this.h = new RectF();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 359);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        final int i3 = 0;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.scandit.datacapture.barcode.pf
            public final /* synthetic */ C0700k8 e;

            {
                this.e = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0700k8.b(this.e, valueAnimator);
                        break;
                    default:
                        C0700k8.a(this.e, valueAnimator);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 359);
        valueAnimatorOfInt2.setDuration(1000L);
        valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt2.setRepeatMode(1);
        valueAnimatorOfInt2.setRepeatCount(-1);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.scandit.datacapture.barcode.pf
            public final /* synthetic */ C0700k8 e;

            {
                this.e = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0700k8.b(this.e, valueAnimator);
                        break;
                    default:
                        C0700k8.a(this.e, valueAnimator);
                        break;
                }
            }
        });
        this.j = valueAnimatorOfInt2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0700k8 this$0, ValueAnimator animator) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float fIntValue = ((Integer) animatedValue).intValue();
        Path path = this$0.f;
        path.reset();
        path.arcTo(this$0.h, fIntValue - 90.0f, 30.0f);
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0700k8 this$0, ValueAnimator animator) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(animator, "animator");
        Intrinsics.f(animator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        float f = 359;
        this$0.i = ((Integer) r4).intValue() / f;
        Path path = this$0.f;
        path.reset();
        path.arcTo(this$0.h, -90.0f, this$0.i * f);
        this$0.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        canvas.drawPath(this.d, this.e);
        canvas.drawPath(this.f, this.g);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        RectF rectF = this.h;
        float strokeWidth = this.g.getStrokeWidth() / 2;
        rectF.left = strokeWidth;
        rectF.top = strokeWidth;
        float f = i - strokeWidth;
        rectF.right = f;
        rectF.bottom = f;
        Path path = this.d;
        path.reset();
        path.arcTo(this.h, -90.0f, 359.0f);
    }

    public static void a(C0700k8 c0700k8) {
        boolean z;
        float f = c0700k8.c;
        boolean z2 = true;
        if (c0700k8.g.getStrokeWidth() == f) {
            z = false;
        } else {
            c0700k8.g.setStrokeWidth(f);
            z = true;
        }
        if (c0700k8.e.getStrokeWidth() == f) {
            z2 = z;
        } else {
            c0700k8.e.setStrokeWidth(f);
        }
        if (z2) {
            int width = c0700k8.getWidth();
            RectF rectF = c0700k8.h;
            float strokeWidth = c0700k8.g.getStrokeWidth() / 2;
            rectF.left = strokeWidth;
            rectF.top = strokeWidth;
            float f2 = width - strokeWidth;
            rectF.right = f2;
            rectF.bottom = f2;
            Path path = c0700k8.d;
            path.reset();
            path.arcTo(c0700k8.h, -90.0f, 359.0f);
        }
        c0700k8.j.start();
    }

    public final void a(float f) {
        boolean z;
        this.j.cancel();
        float f2 = this.b;
        boolean z2 = true;
        if (this.g.getStrokeWidth() == f2) {
            z = false;
        } else {
            this.g.setStrokeWidth(f2);
            z = true;
        }
        if (this.e.getStrokeWidth() == f2) {
            z2 = z;
        } else {
            this.e.setStrokeWidth(f2);
        }
        if (z2) {
            int width = getWidth();
            RectF rectF = this.h;
            float strokeWidth = this.g.getStrokeWidth() / 2;
            rectF.left = strokeWidth;
            rectF.top = strokeWidth;
            float f3 = width - strokeWidth;
            rectF.right = f3;
            rectF.bottom = f3;
            Path path = this.d;
            path.reset();
            path.arcTo(this.h, -90.0f, 359.0f);
        }
        this.i = f;
        Path path2 = this.f;
        path2.reset();
        path2.arcTo(this.h, -90.0f, this.i * 359);
        invalidate();
    }
}
