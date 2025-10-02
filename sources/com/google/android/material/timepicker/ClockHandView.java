package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int y = 0;
    public final int d;
    public final TimeInterpolator e;
    public final ValueAnimator f;
    public boolean g;
    public float h;
    public float i;
    public boolean j;
    public final int k;
    public boolean l;
    public final ArrayList m;
    public final int n;
    public final float o;
    public final Paint p;
    public final RectF q;
    public final int r;
    public float s;
    public boolean t;
    public OnActionUpListener u;
    public double v;
    public int w;
    public int x;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$1, reason: invalid class name */
    class AnonymousClass1 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface OnActionUpListener {
    }

    public interface OnRotateListener {
        void c(float f, boolean z);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public final int a(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public final int b(int i) {
        return i == 2 ? Math.round(this.w * 0.66f) : this.w;
    }

    public final void c(float f, boolean z) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            d(f, false);
            return;
        }
        float f2 = this.s;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.d);
        valueAnimator.setInterpolator(this.e);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.y;
                ClockHandView clockHandView = this.d;
                clockHandView.getClass();
                clockHandView.d(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new AnonymousClass1());
        valueAnimator.start();
    }

    public final void d(float f, boolean z) {
        float f2 = f % 360.0f;
        this.s = f2;
        this.v = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fB = b(this.x);
        float fCos = (((float) Math.cos(this.v)) * fB) + width;
        float fSin = (fB * ((float) Math.sin(this.v))) + height;
        float f3 = this.n;
        this.q.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).c(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fB = b(this.x);
        float fCos = (((float) Math.cos(this.v)) * fB) + f;
        float f2 = height;
        float fSin = (fB * ((float) Math.sin(this.v))) + f2;
        Paint paint = this.p;
        paint.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        canvas.drawCircle(fCos, fSin, this.n, paint);
        double dSin = Math.sin(this.v);
        paint.setStrokeWidth(this.r);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.v) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.o, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f.isRunning()) {
            return;
        }
        c(this.s, false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.h);
                int i2 = (int) (y2 - this.i);
                this.j = (i2 * i2) + (i * i) > this.k;
                z3 = this.t;
                z2 = actionMasked == 1;
                if (this.l) {
                    this.x = MathUtils.a((float) (getWidth() / 2), (float) (getHeight() / 2), x, y2) > ((float) b(2)) + ViewUtils.d(12, getContext()) ? 1 : 2;
                }
                z = false;
            } else {
                z2 = false;
                z = false;
                z3 = false;
            }
        } else {
            this.h = x;
            this.i = y2;
            this.j = true;
            this.t = false;
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean z5 = this.t;
        float fA = a(x, y2);
        boolean z6 = this.s != fA;
        if (z && z6) {
            z4 = true;
        } else if (z6 || z3) {
            c(fA, z2 && this.g);
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z7 = z4 | z5;
        this.t = z7;
        if (z7 && z2 && (onActionUpListener = this.u) != null) {
            float fA2 = a(x, y2);
            boolean z8 = this.j;
            TimePickerClockPresenter timePickerClockPresenter = (TimePickerClockPresenter) onActionUpListener;
            TimePickerView timePickerView = timePickerClockPresenter.d;
            timePickerClockPresenter.h = true;
            TimeModel timeModel = timePickerClockPresenter.e;
            int i3 = timeModel.h;
            int i4 = timeModel.g;
            if (timeModel.i == 10) {
                timePickerView.f.c(timePickerClockPresenter.g, false);
                AccessibilityManager accessibilityManager = (AccessibilityManager) timePickerView.getContext().getSystemService(AccessibilityManager.class);
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    timePickerClockPresenter.d(12, true);
                }
            } else {
                int iRound = Math.round(fA2);
                if (!z8) {
                    timeModel.h = (((iRound + 15) / 30) * 5) % 60;
                    timePickerClockPresenter.f = r12 * 6;
                }
                timePickerView.f.c(timePickerClockPresenter.f, z8);
            }
            timePickerClockPresenter.h = false;
            timePickerClockPresenter.e();
            if (timeModel.h != i3 || timeModel.g != i4) {
                timePickerView.performHapticFeedback(4);
            }
        }
        return true;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new ValueAnimator();
        this.m = new ArrayList();
        Paint paint = new Paint();
        this.p = paint;
        this.q = new RectF();
        this.x = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.n, i, 2132084174);
        this.d = MotionUtils.c(context, R.attr.motionDurationLong2, 200);
        this.e = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.b);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.r = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.o = r3.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        c(BitmapDescriptorFactory.HUE_RED, false);
        this.k = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
