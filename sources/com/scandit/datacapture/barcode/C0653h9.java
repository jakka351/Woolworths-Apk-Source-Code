package com.scandit.datacapture.barcode;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.h9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0653h9 extends View implements Animatable {
    private int b;
    private AnimatorSet c;
    private Path d;
    private boolean e;
    private float f;

    public /* synthetic */ C0653h9(Context context, int i, int i2, int[] iArr, int i3) {
        this(context, i, i2, iArr);
    }

    public final void a(int[] value) {
        Intrinsics.h(value, "value");
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setColors(value);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        canvas.save();
        Path path = this.d;
        if (path != null) {
            canvas.clipOutPath(path);
        }
        float f = this.b / 2.0f;
        float f2 = this.f;
        canvas.scale(f2, f2, f, f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = this.e;
        if (z && z) {
            setVisibility(0);
            setAlpha(1.0f);
            this.f = BitmapDescriptorFactory.HUE_RED;
            invalidate();
            a(new C0621f9(this));
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.c = null;
        setVisibility(8);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.e) {
            return;
        }
        this.e = true;
        if (isAttachedToWindow()) {
            setVisibility(0);
            if (this.e) {
                setVisibility(0);
                setAlpha(1.0f);
                this.f = BitmapDescriptorFactory.HUE_RED;
                invalidate();
                a(new C0621f9(this));
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.c = null;
        setVisibility(8);
        this.e = false;
    }

    private C0653h9(Context context, int i, int i2, int[] iArr) {
        super(context);
        this.b = i;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(1);
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientRadius(i / 2.0f);
        setBackground(gradientDrawable);
        setVisibility(8);
        this.d = a(i, i2);
    }

    public static final void a(C0653h9 c0653h9) {
        if (c0653h9.e) {
            c0653h9.setVisibility(0);
            c0653h9.setAlpha(1.0f);
            c0653h9.f = BitmapDescriptorFactory.HUE_RED;
            c0653h9.invalidate();
            c0653h9.a(new C0621f9(c0653h9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0653h9 this$0, ValueAnimator it) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.setAlpha(((Float) animatedValue).floatValue());
    }

    private static Path a(int i, int i2) {
        if (i2 == 0) {
            return null;
        }
        Path path = new Path();
        float f = i / 2;
        path.addCircle(f, f, i2 / 2, Path.Direction.CW);
        return path;
    }

    private final void a(Function0 function0) {
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f));
        valueAnimatorOfFloat.setDuration(1000L);
        final int i = 0;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.scandit.datacapture.barcode.of
            public final /* synthetic */ C0653h9 e;

            {
                this.e = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0653h9.a(this.e, valueAnimator);
                        break;
                    default:
                        C0653h9.b(this.e, valueAnimator);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.setStartDelay(600L);
        valueAnimatorOfFloat2.setDuration(400L);
        final int i2 = 1;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.scandit.datacapture.barcode.of
            public final /* synthetic */ C0653h9 e;

            {
                this.e = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0653h9.a(this.e, valueAnimator);
                        break;
                    default:
                        C0653h9.b(this.e, valueAnimator);
                        break;
                }
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet2.addListener(new C0637g9(this, function0));
        animatorSet2.start();
        this.c = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0653h9 this$0, ValueAnimator it) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.f = ((Float) animatedValue).floatValue();
        this$0.invalidate();
    }
}
