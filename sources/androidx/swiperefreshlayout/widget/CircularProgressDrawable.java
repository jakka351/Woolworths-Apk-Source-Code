package androidx.swiperefreshlayout.widget;

import YU.a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    public static final LinearInterpolator j = new LinearInterpolator();
    public static final FastOutSlowInInterpolator k = new FastOutSlowInInterpolator();
    public static final int[] l = {-16777216};
    public final Ring d;
    public float e;
    public final Resources f;
    public final ValueAnimator g;
    public float h;
    public boolean i;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ProgressDrawableSize {
    }

    public static class Ring {

        /* renamed from: a, reason: collision with root package name */
        public final RectF f3773a = new RectF();
        public final Paint b;
        public final Paint c;
        public final Paint d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int[] i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public Path o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;

        public Ring() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.f = BitmapDescriptorFactory.HUE_RED;
            this.g = BitmapDescriptorFactory.HUE_RED;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i) {
            this.j = i;
            this.u = this.i[i];
        }
    }

    public CircularProgressDrawable(@NonNull Context context) {
        context.getClass();
        this.f = context.getResources();
        final Ring ring = new Ring();
        this.d = ring;
        ring.i = l;
        ring.a(0);
        d(2.5f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Ring ring2 = ring;
                CircularProgressDrawable.f(fFloatValue, ring2);
                CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
                circularProgressDrawable.a(fFloatValue, ring2, false);
                circularProgressDrawable.invalidateSelf();
            }
        });
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(j);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
                Ring ring2 = ring;
                circularProgressDrawable.a(1.0f, ring2, true);
                ring2.k = ring2.e;
                ring2.l = ring2.f;
                ring2.m = ring2.g;
                ring2.a((ring2.j + 1) % ring2.i.length);
                if (!circularProgressDrawable.i) {
                    circularProgressDrawable.h += 1.0f;
                    return;
                }
                circularProgressDrawable.i = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                if (ring2.n) {
                    ring2.n = false;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                CircularProgressDrawable.this.h = BitmapDescriptorFactory.HUE_RED;
            }
        });
        this.g = valueAnimatorOfFloat;
    }

    public static void f(float f, Ring ring) {
        if (f <= 0.75f) {
            ring.u = ring.i[ring.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = ring.i;
        int i = ring.j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        ring.u = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r1) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r3) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r4) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r2))));
    }

    public final void a(float f, Ring ring, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.i) {
            f(f, ring);
            float fFloor = (float) (Math.floor(ring.m / 0.8f) + 1.0d);
            float f2 = ring.k;
            float f3 = ring.l;
            ring.e = (((f3 - 0.01f) - f2) * f) + f2;
            ring.f = f3;
            float f4 = ring.m;
            ring.g = a.a(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = ring.m;
            FastOutSlowInInterpolator fastOutSlowInInterpolator = k;
            if (f < 0.5f) {
                interpolation = ring.k;
                interpolation2 = (fastOutSlowInInterpolator.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = ring.k + 0.79f;
                interpolation = f6 - (((1.0f - fastOutSlowInInterpolator.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.h) * 216.0f;
            ring.e = interpolation;
            ring.f = interpolation2;
            ring.g = f7;
            this.e = f8;
        }
    }

    public final void b(int... iArr) {
        Ring ring = this.d;
        ring.i = iArr;
        ring.a(0);
        ring.a(0);
        invalidateSelf();
    }

    public final void c(float f, float f2, float f3, float f4) {
        float f5 = this.f.getDisplayMetrics().density;
        float f6 = f2 * f5;
        Ring ring = this.d;
        ring.h = f6;
        ring.b.setStrokeWidth(f6);
        ring.q = f * f5;
        ring.a(0);
        ring.r = (int) (f3 * f5);
        ring.s = (int) (f4 * f5);
    }

    public final void d(float f) {
        Ring ring = this.d;
        ring.h = f;
        ring.b.setStrokeWidth(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.e, bounds.exactCenterX(), bounds.exactCenterY());
        Ring ring = this.d;
        Paint paint = ring.b;
        RectF rectF = ring.f3773a;
        float f = ring.q;
        float fMin = (ring.h / 2.0f) + f;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((ring.r * ring.p) / 2.0f, ring.h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = ring.e;
        float f3 = ring.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((ring.f + f3) * 360.0f) - f4;
        paint.setColor(ring.u);
        paint.setAlpha(ring.t);
        float f6 = ring.h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ring.d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = ring.c;
        if (ring.n) {
            Path path = ring.o;
            if (path == null) {
                Path path2 = new Path();
                ring.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (ring.r * ring.p) / 2.0f;
            ring.o.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            ring.o.lineTo(ring.r * ring.p, BitmapDescriptorFactory.HUE_RED);
            Path path3 = ring.o;
            float f9 = ring.r;
            float f10 = ring.p;
            path3.lineTo((f9 * f10) / 2.0f, ring.s * f10);
            ring.o.offset((rectF.centerX() + fMin2) - f8, (ring.h / 2.0f) + rectF.centerY());
            ring.o.close();
            paint2.setColor(ring.u);
            paint2.setAlpha(ring.t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(ring.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void e(int i) {
        if (i == 0) {
            c(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            c(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.g.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.g.cancel();
        Ring ring = this.d;
        float f = ring.e;
        ring.k = f;
        float f2 = ring.f;
        ring.l = f2;
        ring.m = ring.g;
        if (f2 != f) {
            this.i = true;
            this.g.setDuration(666L);
            this.g.start();
            return;
        }
        ring.a(0);
        ring.k = BitmapDescriptorFactory.HUE_RED;
        ring.l = BitmapDescriptorFactory.HUE_RED;
        ring.m = BitmapDescriptorFactory.HUE_RED;
        ring.e = BitmapDescriptorFactory.HUE_RED;
        ring.f = BitmapDescriptorFactory.HUE_RED;
        ring.g = BitmapDescriptorFactory.HUE_RED;
        this.g.setDuration(1332L);
        this.g.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.g.cancel();
        this.e = BitmapDescriptorFactory.HUE_RED;
        Ring ring = this.d;
        if (ring.n) {
            ring.n = false;
        }
        ring.a(0);
        ring.k = BitmapDescriptorFactory.HUE_RED;
        ring.l = BitmapDescriptorFactory.HUE_RED;
        ring.m = BitmapDescriptorFactory.HUE_RED;
        ring.e = BitmapDescriptorFactory.HUE_RED;
        ring.f = BitmapDescriptorFactory.HUE_RED;
        ring.g = BitmapDescriptorFactory.HUE_RED;
        invalidateSelf();
    }
}
