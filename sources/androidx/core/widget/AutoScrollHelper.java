package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {
    public static final int t = ViewConfiguration.getTapTimeout();
    public final ClampedScroller d;
    public final AccelerateInterpolator e;
    public final View f;
    public Runnable g;
    public final float[] h;
    public final float[] i;
    public final int j;
    public final int k;
    public final float[] l;
    public final float[] m;
    public final float[] n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    public static class ClampedScroller {

        /* renamed from: a, reason: collision with root package name */
        public int f2523a;
        public int b;
        public float c;
        public float d;
        public long e;
        public long f;
        public long g;
        public float h;
        public int i;

        public final float a(long j) {
            if (j < this.e) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            long j2 = this.g;
            if (j2 < 0 || j < j2) {
                return AutoScrollHelper.e((j - r0) / this.f2523a, BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
            }
            float f = this.h;
            return (AutoScrollHelper.e((j - j2) / this.i, BitmapDescriptorFactory.HUE_RED, 1.0f) * f) + (1.0f - f);
        }
    }

    public class ScrollAnimationRunnable implements Runnable {
        public ScrollAnimationRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            View view = autoScrollHelper.f;
            ClampedScroller clampedScroller = autoScrollHelper.d;
            if (autoScrollHelper.r) {
                if (autoScrollHelper.p) {
                    autoScrollHelper.p = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    clampedScroller.e = jCurrentAnimationTimeMillis;
                    clampedScroller.g = -1L;
                    clampedScroller.f = jCurrentAnimationTimeMillis;
                    clampedScroller.h = 0.5f;
                }
                if ((clampedScroller.g > 0 && AnimationUtils.currentAnimationTimeMillis() > clampedScroller.g + clampedScroller.i) || !autoScrollHelper.i()) {
                    autoScrollHelper.r = false;
                    return;
                }
                if (autoScrollHelper.q) {
                    autoScrollHelper.q = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (clampedScroller.f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = clampedScroller.a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - clampedScroller.f;
                clampedScroller.f = jCurrentAnimationTimeMillis2;
                autoScrollHelper.h((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * clampedScroller.d));
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                view.postOnAnimation(this);
            }
        }
    }

    public AutoScrollHelper(View view) {
        ClampedScroller clampedScroller = new ClampedScroller();
        clampedScroller.e = Long.MIN_VALUE;
        clampedScroller.g = -1L;
        clampedScroller.f = 0L;
        this.d = clampedScroller;
        this.e = new AccelerateInterpolator();
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.h = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.i = fArr2;
        float[] fArr3 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.l = fArr3;
        float[] fArr4 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.n = fArr5;
        this.f = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.j = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.k = t;
        clampedScroller.f2523a = 500;
        clampedScroller.b = 500;
    }

    public static float e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public abstract boolean c(int i);

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float d(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.h
            r0 = r0[r7]
            float[] r1 = r3.i
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = e(r0, r2, r1)
            float r1 = r3.f(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.f(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.e
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = e(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.l
            r0 = r0[r7]
            float[] r1 = r3.m
            r1 = r1[r7]
            float[] r2 = r3.n
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = e(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = e(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.d(float, float, float, int):float");
    }

    public final float f(float f, float f2) {
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            int i = this.j;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= BitmapDescriptorFactory.HUE_RED) {
                        return 1.0f - (f / f2);
                    }
                    if (this.r && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < BitmapDescriptorFactory.HUE_RED) {
                return f / (-f2);
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final void g() {
        int i = 0;
        if (this.p) {
            this.r = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ClampedScroller clampedScroller = this.d;
        int i2 = (int) (jCurrentAnimationTimeMillis - clampedScroller.e);
        int i3 = clampedScroller.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        clampedScroller.i = i;
        clampedScroller.h = clampedScroller.a(jCurrentAnimationTimeMillis);
        clampedScroller.g = jCurrentAnimationTimeMillis;
    }

    public abstract void h(int i);

    public final boolean i() {
        ClampedScroller clampedScroller = this.d;
        float f = clampedScroller.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(clampedScroller.c);
        return iAbs != 0 && c(iAbs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.s
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.g()
            return r1
        L1b:
            r7.q = r2
            r7.o = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.d(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.d(r9, r8, r3, r2)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r9 = r7.d
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.r
            if (r8 != 0) goto L7e
            boolean r8 = r7.i()
            if (r8 == 0) goto L7e
            java.lang.Runnable r8 = r7.g
            if (r8 != 0) goto L60
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r8 = new androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable
            r8.<init>()
            r7.g = r8
        L60:
            r7.r = r2
            r7.p = r2
            boolean r8 = r7.o
            if (r8 != 0) goto L75
            int r8 = r7.k
            if (r8 <= 0) goto L75
            java.lang.Runnable r9 = r7.g
            long r5 = (long) r8
            java.util.WeakHashMap r8 = androidx.core.view.ViewCompat.f2488a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L75:
            java.lang.Runnable r8 = r7.g
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r8 = (androidx.core.widget.AutoScrollHelper.ScrollAnimationRunnable) r8
            r8.run()
        L7c:
            r7.o = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
