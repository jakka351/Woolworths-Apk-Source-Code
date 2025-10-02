package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    public Runnable f;
    public OverScroller g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public VelocityTracker l;

    public class FlingRunnable implements Runnable {
        public final CoordinatorLayout d;
        public final View e;

        public FlingRunnable(CoordinatorLayout coordinatorLayout, View view) {
            this.d = coordinatorLayout;
            this.e = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HeaderBehavior headerBehavior;
            OverScroller overScroller;
            View view = this.e;
            if (view == null || (overScroller = (headerBehavior = HeaderBehavior.this).g) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.d;
            if (!zComputeScrollOffset) {
                headerBehavior.F(coordinatorLayout, view);
                return;
            }
            headerBehavior.H(coordinatorLayout, view, headerBehavior.g.getCurrY());
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            view.postOnAnimation(this);
        }
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = -1;
        this.k = -1;
    }

    public boolean C(View view) {
        return false;
    }

    public int D(View view) {
        return -view.getHeight();
    }

    public int E(View view) {
        return view.getHeight();
    }

    public void F(CoordinatorLayout coordinatorLayout, View view) {
    }

    public int G(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int iB;
        int iY = y();
        if (i2 == 0 || iY < i2 || iY > i3 || iY == (iB = MathUtils.b(i, i2, i3))) {
            return 0;
        }
        B(iB);
        return iY - iB;
    }

    public final void H(CoordinatorLayout coordinatorLayout, View view, int i) {
        G(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.k
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.k = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L40
            boolean r0 = r6.h
            if (r0 == 0) goto L40
            int r0 = r6.i
            if (r0 != r3) goto L25
            goto L8e
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 != r3) goto L2c
            goto L8e
        L2c:
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.j
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.k
            if (r1 <= r5) goto L40
            r6.j = r0
            return r2
        L40:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L87
            r6.i = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.C(r8)
            if (r3 == 0) goto L60
            boolean r7 = r7.t(r8, r0, r1)
            if (r7 == 0) goto L60
            r7 = r2
            goto L61
        L60:
            r7 = r4
        L61:
            r6.h = r7
            if (r7 == 0) goto L87
            r6.j = r1
            int r7 = r9.getPointerId(r4)
            r6.i = r7
            android.view.VelocityTracker r7 = r6.l
            if (r7 != 0) goto L77
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.l = r7
        L77:
            android.widget.OverScroller r7 = r6.g
            if (r7 == 0) goto L87
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L87
            android.widget.OverScroller r7 = r6.g
            r7.abortAnimation()
            return r2
        L87:
            android.view.VelocityTracker r7 = r6.l
            if (r7 == 0) goto L8e
            r7.addMovement(r9)
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.m(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean x(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.x(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
