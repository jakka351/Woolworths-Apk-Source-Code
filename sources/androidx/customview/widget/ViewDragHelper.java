package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ViewDragHelper {
    public static final Interpolator x = new AnonymousClass1();

    /* renamed from: a, reason: collision with root package name */
    public int f2544a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public final OverScroller r;
    public final Callback s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public int c = -1;
    public final Runnable w = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public final void run() {
            ViewDragHelper.this.s(0);
        }
    };

    /* renamed from: androidx.customview.widget.ViewDragHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public static abstract class Callback {
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, @Px int i3, @Px int i4) {
        }

        public void onViewReleased(View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(View view, int i);
    }

    public ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.v = viewGroup;
        this.s = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.p = i;
        this.o = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(context, x);
    }

    public static ViewDragHelper i(ViewGroup viewGroup, float f, Callback callback) {
        ViewDragHelper viewDragHelper = new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
        viewDragHelper.b = (int) ((1.0f / f) * viewDragHelper.b);
        return viewDragHelper;
    }

    public static boolean m(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final void a() {
        b();
        if (this.f2544a == 2) {
            OverScroller overScroller = this.r;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.s.onViewPositionChanged(this.t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        s(0);
    }

    public final void b() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.e, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.g, BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void c(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.t = view;
        this.c = i;
        this.s.onViewCaptured(view, i);
        s(1);
    }

    public final boolean d(int i, float f, float f2, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.h[i] & i2) == i2 && (this.q & i2) != 0 && (this.j[i] & i2) != i2 && (this.i[i] & i2) != i2) {
            float f3 = this.b;
            if (fAbs > f3 || fAbs2 > f3) {
                if (fAbs < fAbs2 * 0.5f && this.s.onEdgeLock(i2)) {
                    int[] iArr = this.j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.i[i] & i2) == 0 && fAbs > this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            goto L45
        L4:
            androidx.customview.widget.ViewDragHelper$Callback r1 = r4.s
            int r2 = r1.getViewHorizontalDragRange(r5)
            r3 = 1
            if (r2 <= 0) goto Lf
            r2 = r3
            goto L10
        Lf:
            r2 = r0
        L10:
            int r5 = r1.getViewVerticalDragRange(r5)
            if (r5 <= 0) goto L18
            r5 = r3
            goto L19
        L18:
            r5 = r0
        L19:
            if (r2 == 0) goto L29
            if (r5 == 0) goto L29
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r7 = r7 + r6
            int r5 = r4.b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L45
            goto L44
        L29:
            if (r2 == 0) goto L37
            float r5 = java.lang.Math.abs(r6)
            int r6 = r4.b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L45
            goto L44
        L37:
            if (r5 == 0) goto L45
            float r5 = java.lang.Math.abs(r7)
            int r6 = r4.b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L45
        L44:
            return r3
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.e(android.view.View, float, float):boolean");
    }

    public final void f(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int g(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.v.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean h() {
        if (this.f2544a == 2) {
            OverScroller overScroller = this.r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                View view = this.t;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.t;
                WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.s.onViewPositionChanged(this.t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.v.post(this.w);
            }
        }
        return this.f2544a == 2;
    }

    public final View j(int i, int i2) {
        ViewGroup viewGroup = this.v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.s.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean k(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.r;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            s(0);
            return false;
        }
        View view = this.t;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.n;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i10;
        } else {
            f = iAbs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i10;
        } else {
            f3 = iAbs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        Callback callback = this.s;
        overScroller.startScroll(left, top, i5, i6, (int) ((g(i6, i4, callback.getViewVerticalDragRange(view)) * f6) + (g(i5, i3, callback.getViewHorizontalDragRange(view)) * f5)));
        s(2);
        return true;
    }

    public final boolean l(int i) {
        if ((this.k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void n(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        Callback callback = this.s;
        int i2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewJ = j((int) x2, (int) y);
            q(x2, y, pointerId);
            w(pointerId, viewJ);
            int i3 = this.h[pointerId] & this.q;
            if (i3 != 0) {
                callback.onEdgeTouched(i3, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f2544a == 1) {
                o();
            }
            b();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f2544a == 1) {
                    this.u = true;
                    callback.onViewReleased(this.t, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    this.u = false;
                    if (this.f2544a == 1) {
                        s(0);
                    }
                }
                b();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                q(x3, y2, pointerId2);
                if (this.f2544a != 0) {
                    if (m(this.t, (int) x3, (int) y2)) {
                        w(pointerId2, this.t);
                        return;
                    }
                    return;
                }
                w(pointerId2, j((int) x3, (int) y2));
                int i4 = this.h[pointerId2] & this.q;
                if (i4 != 0) {
                    callback.onEdgeTouched(i4, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f2544a == 1 && pointerId3 == this.c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.c) {
                        View viewJ2 = j((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view = this.t;
                        if (viewJ2 == view && w(pointerId4, view)) {
                            i = this.c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    o();
                }
            }
            f(pointerId3);
            return;
        }
        if (this.f2544a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (l(pointerId5)) {
                    float x4 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x4 - this.d[pointerId5];
                    float f2 = y3 - this.e[pointerId5];
                    p(f, f2, pointerId5);
                    if (this.f2544a != 1) {
                        View viewJ3 = j((int) x4, (int) y3);
                        if (e(viewJ3, f, f2) && w(pointerId5, viewJ3)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            r(motionEvent);
            return;
        }
        if (l(this.c)) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.c);
            float x5 = motionEvent.getX(iFindPointerIndex);
            float y4 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f;
            int i5 = this.c;
            int i6 = (int) (x5 - fArr[i5]);
            int i7 = (int) (y4 - this.g[i5]);
            int left = this.t.getLeft() + i6;
            int top = this.t.getTop() + i7;
            int left2 = this.t.getLeft();
            int top2 = this.t.getTop();
            if (i6 != 0) {
                left = callback.clampViewPositionHorizontal(this.t, left, i6);
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                this.t.offsetLeftAndRight(left - left2);
            }
            int i8 = left;
            if (i7 != 0) {
                top = callback.clampViewPositionVertical(this.t, top, i7);
                WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                this.t.offsetTopAndBottom(top - top2);
            }
            int i9 = top;
            if (i6 != 0 || i7 != 0) {
                this.s.onViewPositionChanged(this.t, i8, i9, i8 - left2, i9 - top2);
            }
            r(motionEvent);
        }
    }

    public final void o() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float f2 = this.n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > BitmapDescriptorFactory.HUE_RED ? f : -f;
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float f3 = this.n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f3) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= BitmapDescriptorFactory.HUE_RED) {
            f = -f;
        }
        this.u = true;
        this.s.onViewReleased(this.t, xVelocity, f);
        this.u = false;
        if (this.f2544a == 1) {
            s(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    public final void p(float f, float f2, int i) {
        boolean zD = d(i, f, f2, 1);
        boolean z = zD;
        if (d(i, f2, f, 4)) {
            z = (zD ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (d(i, f, f2, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (d(i, f2, f, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r0;
            this.s.onEdgeDragStarted(r0, i);
        }
    }

    public final void q(float f, float f2, int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.v;
        int i5 = i3 < viewGroup.getLeft() + this.o ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.o) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.o) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.k |= 1 << i;
    }

    public final void r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (l(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x2;
                this.g[pointerId] = y;
            }
        }
    }

    public final void s(int i) {
        this.v.removeCallbacks(this.w);
        if (this.f2544a != i) {
            this.f2544a = i;
            this.s.onViewDragStateChanged(i);
            if (this.f2544a == 0) {
                this.t = null;
            }
        }
    }

    public final boolean t(int i, int i2) {
        if (this.u) {
            return k(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.u(android.view.MotionEvent):boolean");
    }

    public final boolean v(View view, int i, int i2) {
        this.t = view;
        this.c = -1;
        boolean zK = k(i, i2, 0, 0);
        if (!zK && this.f2544a == 0 && this.t != null) {
            this.t = null;
        }
        return zK;
    }

    public final boolean w(int i, View view) {
        if (view == this.t && this.c == i) {
            return true;
        }
        if (view == null || !this.s.tryCaptureView(view, i)) {
            return false;
        }
        this.c = i;
        c(i, view);
        return true;
    }
}
