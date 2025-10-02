package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public ViewDragHelper d;
    public OnDismissListener e;
    public boolean f;
    public boolean g;
    public int h = 2;
    public float i = BitmapDescriptorFactory.HUE_RED;
    public float j = 0.5f;
    public final ViewDragHelper.Callback k = new ViewDragHelper.Callback() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        public int c;
        public int d = -1;

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            boolean z = view.getLayoutDirection() == 1;
            int i3 = SwipeDismissBehavior.this.h;
            if (i3 == 0) {
                if (z) {
                    width = this.c - view.getWidth();
                    width2 = this.c;
                } else {
                    width = this.c;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.c - view.getWidth();
                width2 = view.getWidth() + this.c;
            } else if (z) {
                width = this.c;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.c - view.getWidth();
                width2 = this.c;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(View view, int i) {
            this.d = i;
            this.c = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.g = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.g = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.e;
            if (onDismissListener != null) {
                onDismissListener.b(i);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f = width * swipeDismissBehavior.i;
            float width2 = view.getWidth() * swipeDismissBehavior.j;
            float fAbs = Math.abs(i - this.c);
            if (fAbs <= f) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            } else {
                view.setAlpha(Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onViewReleased(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.d = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r4 = 1
                if (r1 == 0) goto L39
                java.util.WeakHashMap r5 = androidx.core.view.ViewCompat.f2488a
                int r5 = r9.getLayoutDirection()
                if (r5 != r4) goto L1a
                r5 = r4
                goto L1b
            L1a:
                r5 = r2
            L1b:
                int r6 = r3.h
                r7 = 2
                if (r6 != r7) goto L21
                goto L52
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L67
                goto L52
            L2a:
                if (r1 <= 0) goto L67
                goto L52
            L2d:
                if (r6 != r4) goto L67
                if (r5 == 0) goto L34
                if (r1 <= 0) goto L67
                goto L52
            L34:
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L67
                goto L52
            L39:
                int r1 = r9.getLeft()
                int r5 = r8.c
                int r1 = r1 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                r6 = 1056964608(0x3f000000, float:0.5)
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r5) goto L67
            L52:
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L61
                int r10 = r9.getLeft()
                int r0 = r8.c
                if (r10 >= r0) goto L5f
                goto L61
            L5f:
                int r0 = r0 + r11
                goto L65
            L61:
                int r10 = r8.c
                int r0 = r10 - r11
            L65:
                r2 = r4
                goto L69
            L67:
                int r0 = r8.c
            L69:
                androidx.customview.widget.ViewDragHelper r10 = r3.d
                int r11 = r9.getTop()
                boolean r10 = r10.t(r0, r11)
                if (r10 == 0) goto L80
                com.google.android.material.behavior.SwipeDismissBehavior$SettleRunnable r10 = new com.google.android.material.behavior.SwipeDismissBehavior$SettleRunnable
                r10.<init>(r9, r2)
                java.util.WeakHashMap r11 = androidx.core.view.ViewCompat.f2488a
                r9.postOnAnimation(r10)
                return
            L80:
                if (r2 == 0) goto L89
                com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener r10 = r3.e
                if (r10 == 0) goto L89
                r10.a(r9)
            L89:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass1.onViewReleased(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i) {
            int i2 = this.d;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.y(view);
        }
    };

    public interface OnDismissListener {
        void a(View view);

        void b(int i);
    }

    public class SettleRunnable implements Runnable {
        public final View d;
        public final boolean e;

        public SettleRunnable(View view, boolean z) {
            this.d = view;
            this.e = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OnDismissListener onDismissListener;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            ViewDragHelper viewDragHelper = swipeDismissBehavior.d;
            View view = this.d;
            if (viewDragHelper != null && viewDragHelper.h()) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                view.postOnAnimation(this);
            } else {
                if (!this.e || (onDismissListener = swipeDismissBehavior.e) == null) {
                    return;
                }
                onDismissListener.a(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zT = this.f;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zT = coordinatorLayout.t(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f = zT;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f = false;
        }
        if (zT) {
            if (this.d == null) {
                this.d = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.k);
            }
            if (!this.g && this.d.u(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            ViewCompat.w(1048576, view);
            ViewCompat.t(0, view);
            if (y(view)) {
                ViewCompat.x(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.n, null, new AccessibilityViewCommand() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                    public final boolean b(View view2) {
                        SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                        if (!swipeDismissBehavior.y(view2)) {
                            return false;
                        }
                        WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                        boolean z = view2.getLayoutDirection() == 1;
                        int i2 = swipeDismissBehavior.h;
                        view2.offsetLeftAndRight((!(i2 == 0 && z) && (i2 != 1 || z)) ? view2.getWidth() : -view2.getWidth());
                        view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        OnDismissListener onDismissListener = swipeDismissBehavior.e;
                        if (onDismissListener != null) {
                            onDismissListener.a(view2);
                        }
                        return true;
                    }
                });
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.d == null) {
            return false;
        }
        if (this.g && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.d.n(motionEvent);
        return true;
    }

    public boolean y(View view) {
        return true;
    }
}
