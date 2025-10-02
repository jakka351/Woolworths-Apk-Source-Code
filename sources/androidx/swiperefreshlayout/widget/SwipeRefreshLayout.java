package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent3, NestedScrollingParent2, NestedScrollingChild3, NestedScrollingChild2, NestedScrollingParent, NestedScrollingChild {
    public static final int[] O = {R.attr.enabled};
    public final int A;
    public int B;
    public final CircularProgressDrawable C;
    public Animation D;
    public Animation E;
    public Animation F;
    public Animation G;
    public boolean H;
    public int I;
    public OnChildScrollUpCallback J;
    public boolean K;
    public final Animation.AnimationListener L;
    public final Animation M;
    public final Animation N;
    public View d;
    public OnRefreshListener e;
    public boolean f;
    public final int g;
    public float h;
    public float i;
    public final NestedScrollingParentHelper j;
    public final NestedScrollingChildHelper k;
    public final int[] l;
    public final int[] m;
    public final int[] n;
    public boolean o;
    public final int p;
    public int q;
    public float r;
    public float s;
    public boolean t;
    public int u;
    public final DecelerateInterpolator v;
    public final CircleImageView w;
    public int x;
    public int y;
    public final int z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$3, reason: invalid class name */
    class AnonymousClass3 extends Animation {
        public AnonymousClass3() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$8, reason: invalid class name */
    class AnonymousClass8 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    public interface OnChildScrollUpCallback {
        boolean a();
    }

    public interface OnRefreshListener {
        void a();
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i) {
        this.w.getBackground().setAlpha(i);
        this.C.setAlpha(i);
    }

    public final boolean a() {
        OnChildScrollUpCallback onChildScrollUpCallback = this.J;
        if (onChildScrollUpCallback != null) {
            return onChildScrollUpCallback.a();
        }
        View view = this.d;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.d == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.w)) {
                    this.d = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f) {
        if (f > this.h) {
            g(true, true);
            return;
        }
        this.f = false;
        CircularProgressDrawable circularProgressDrawable = this.C;
        CircularProgressDrawable.Ring ring = circularProgressDrawable.d;
        ring.e = BitmapDescriptorFactory.HUE_RED;
        ring.f = BitmapDescriptorFactory.HUE_RED;
        circularProgressDrawable.invalidateSelf();
        Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.5
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                AnonymousClass3 anonymousClass3 = swipeRefreshLayout.new AnonymousClass3();
                swipeRefreshLayout.E = anonymousClass3;
                anonymousClass3.setDuration(150L);
                CircleImageView circleImageView = swipeRefreshLayout.w;
                circleImageView.d = null;
                circleImageView.clearAnimation();
                swipeRefreshLayout.w.startAnimation(swipeRefreshLayout.E);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        };
        this.y = this.q;
        Animation animation = this.N;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.v);
        CircleImageView circleImageView = this.w;
        circleImageView.d = animationListener;
        circleImageView.clearAnimation();
        this.w.startAnimation(animation);
        CircularProgressDrawable circularProgressDrawable2 = this.C;
        CircularProgressDrawable.Ring ring2 = circularProgressDrawable2.d;
        if (ring2.n) {
            ring2.n = false;
        }
        circularProgressDrawable2.invalidateSelf();
    }

    public final void d(float f) {
        Animation animation;
        Animation animation2;
        CircularProgressDrawable circularProgressDrawable = this.C;
        CircularProgressDrawable.Ring ring = circularProgressDrawable.d;
        if (!ring.n) {
            ring.n = true;
        }
        circularProgressDrawable.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.h));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.h;
        int i = this.B;
        if (i <= 0) {
            i = this.A;
        }
        float f2 = i;
        double dMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.z + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.w.getVisibility() != 0) {
            this.w.setVisibility(0);
        }
        this.w.setScaleX(1.0f);
        this.w.setScaleY(1.0f);
        if (f < this.h) {
            final int i3 = 76;
            if (this.C.d.t > 76 && ((animation2 = this.F) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                final int i4 = this.C.d.t;
                Animation animation3 = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.4
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f3, Transformation transformation) {
                        SwipeRefreshLayout.this.C.setAlpha((int) (((i3 - r0) * f3) + i4));
                    }
                };
                animation3.setDuration(300L);
                CircleImageView circleImageView = this.w;
                circleImageView.d = null;
                circleImageView.clearAnimation();
                this.w.startAnimation(animation3);
                this.F = animation3;
            }
        } else {
            final int i5 = 255;
            if (this.C.d.t < 255 && ((animation = this.G) == null || !animation.hasStarted() || animation.hasEnded())) {
                final int i6 = this.C.d.t;
                Animation animation4 = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.4
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f3, Transformation transformation) {
                        SwipeRefreshLayout.this.C.setAlpha((int) (((i5 - r0) * f3) + i6));
                    }
                };
                animation4.setDuration(300L);
                CircleImageView circleImageView2 = this.w;
                circleImageView2.d = null;
                circleImageView2.clearAnimation();
                this.w.startAnimation(animation4);
                this.G = animation4;
            }
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        CircularProgressDrawable circularProgressDrawable2 = this.C;
        CircularProgressDrawable.Ring ring2 = circularProgressDrawable2.d;
        ring2.e = BitmapDescriptorFactory.HUE_RED;
        ring2.f = fMin2;
        circularProgressDrawable2.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        CircularProgressDrawable circularProgressDrawable3 = this.C;
        CircularProgressDrawable.Ring ring3 = circularProgressDrawable3.d;
        if (fMin3 != ring3.p) {
            ring3.p = fMin3;
        }
        circularProgressDrawable3.invalidateSelf();
        CircularProgressDrawable circularProgressDrawable4 = this.C;
        circularProgressDrawable4.d.g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        circularProgressDrawable4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.q);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.k.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.k.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.k.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.k.d(i, iArr, i2, i3, i4, null, 0);
    }

    public final void e(float f) {
        setTargetOffsetTopAndBottom((this.y + ((int) ((this.z - r0) * f))) - this.w.getTop());
    }

    public final void f() {
        this.w.clearAnimation();
        this.C.stop();
        this.w.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.z - this.q);
        this.q = this.w.getTop();
    }

    public final void g(boolean z, boolean z2) {
        if (this.f != z) {
            this.H = z2;
            b();
            this.f = z;
            Animation.AnimationListener animationListener = this.L;
            if (!z) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3();
                this.E = anonymousClass3;
                anonymousClass3.setDuration(150L);
                CircleImageView circleImageView = this.w;
                circleImageView.d = animationListener;
                circleImageView.clearAnimation();
                this.w.startAnimation(this.E);
                return;
            }
            this.y = this.q;
            Animation animation = this.M;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.v);
            if (animationListener != null) {
                this.w.d = animationListener;
            }
            this.w.clearAnimation();
            this.w.startAnimation(animation);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.x;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.j.a();
    }

    public int getProgressCircleDiameter() {
        return this.I;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.z;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void h(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.k.f(0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.k.d;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        n(view, i, i2, i3, i4, i5, this.n);
    }

    public final void k(float f) {
        float f2 = this.s;
        float f3 = f - f2;
        float f4 = this.g;
        if (f3 <= f4 || this.t) {
            return;
        }
        this.r = f2 + f4;
        this.t = true;
        this.C.setAlpha(76);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void l(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.k.d(i, this.m, i2, i3, i4, iArr, i5);
        }
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? i4 + this.m[1] : i7) >= 0 || a()) {
            return;
        }
        float fAbs = this.i + Math.abs(r14);
        this.i = fAbs;
        d(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean o(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.b()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L88
            boolean r1 = r5.a()
            if (r1 != 0) goto L88
            boolean r1 = r5.f
            if (r1 != 0) goto L88
            boolean r1 = r5.o
            if (r1 == 0) goto L1e
            goto L88
        L1e:
            if (r0 == 0) goto L64
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L5f
            r4 = 2
            if (r0 == r4) goto L44
            r4 = 3
            if (r0 == r4) goto L5f
            r3 = 6
            if (r0 == r3) goto L2e
            goto L85
        L2e:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.u
            if (r3 != r4) goto L85
            if (r0 != 0) goto L3d
            r2 = r1
        L3d:
            int r6 = r6.getPointerId(r2)
            r5.u = r6
            goto L85
        L44:
            int r0 = r5.u
            if (r0 != r3) goto L50
            java.lang.String r6 = "SwipeRefreshLayout"
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r6, r0)
            return r2
        L50:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L57
            goto L88
        L57:
            float r6 = r6.getY(r0)
            r5.k(r6)
            goto L85
        L5f:
            r5.t = r2
            r5.u = r3
            goto L85
        L64:
            androidx.swiperefreshlayout.widget.CircleImageView r0 = r5.w
            int r0 = r0.getTop()
            int r1 = r5.z
            int r1 = r1 - r0
            r5.setTargetOffsetTopAndBottom(r1)
            int r0 = r6.getPointerId(r2)
            r5.u = r0
            r5.t = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L7f
            goto L88
        L7f:
            float r6 = r6.getY(r0)
            r5.s = r6
        L85:
            boolean r6 = r5.t
            return r6
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.d == null) {
            b();
        }
        View view = this.d;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.w.getMeasuredWidth();
        int measuredHeight2 = this.w.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.q;
        this.w.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.d == null) {
            b();
        }
        View view = this.d;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.w.measure(View.MeasureSpec.makeMeasureSpec(this.I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
        this.x = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.w) {
                this.x = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.k.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.k.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.i;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.i = BitmapDescriptorFactory.HUE_RED;
                } else {
                    this.i = f - f2;
                    iArr[1] = i2;
                }
                d(this.i);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.l;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        n(view, i, i2, i3, i4, 0, this.n);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.j.f2480a = i;
        startNestedScroll(i & 2);
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.o = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.j.f2480a = 0;
        this.o = false;
        float f = this.i;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            c(f);
            this.i = BitmapDescriptorFactory.HUE_RED;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f && !this.o) {
            if (actionMasked == 0) {
                this.u = motionEvent.getPointerId(0);
                this.t = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.u);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.t) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.r) * 0.5f;
                    this.t = false;
                    c(y);
                }
                this.u = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.u);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                k(y2);
                if (this.t) {
                    float f = (y2 - this.r) * 0.5f;
                    if (f > BitmapDescriptorFactory.HUE_RED) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        d(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.u) {
                            this.u = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.u = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.d;
        if (view == null || ViewCompat.s(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        } else {
            if (this.K || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimationProgress(float f) {
        this.w.setScaleX(f);
        this.w.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        b();
        this.C.b(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.h = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        f();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.K = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.k.g(z);
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback onChildScrollUpCallback) {
        this.J = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener onRefreshListener) {
        this.e = onRefreshListener;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i) {
        this.w.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f == z) {
            g(z, false);
            return;
        }
        this.f = z;
        setTargetOffsetTopAndBottom((this.A + this.z) - this.q);
        this.H = false;
        this.w.setVisibility(0);
        this.C.setAlpha(255);
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.2
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.D = animation;
        animation.setDuration(this.p);
        Animation.AnimationListener animationListener = this.L;
        if (animationListener != null) {
            this.w.d = animationListener;
        }
        this.w.clearAnimation();
        this.w.startAnimation(this.D);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.I = (int) (displayMetrics.density * 56.0f);
            } else {
                this.I = (int) (displayMetrics.density * 40.0f);
            }
            this.w.setImageDrawable(null);
            this.C.e(i);
            this.w.setImageDrawable(this.C);
        }
    }

    public void setSlingshotDistance(@Px int i) {
        this.B = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        CircleImageView circleImageView = this.w;
        circleImageView.bringToFront();
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        circleImageView.offsetTopAndBottom(i);
        this.q = circleImageView.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.k.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.k.i(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public final boolean d;

        /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.d = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.d = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        this.h = -1.0f;
        this.l = new int[2];
        this.m = new int[2];
        this.n = new int[2];
        this.u = -1;
        this.x = -1;
        this.L = new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                OnRefreshListener onRefreshListener;
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (!swipeRefreshLayout.f) {
                    swipeRefreshLayout.f();
                    return;
                }
                swipeRefreshLayout.C.setAlpha(255);
                swipeRefreshLayout.C.start();
                if (swipeRefreshLayout.H && (onRefreshListener = swipeRefreshLayout.e) != null) {
                    onRefreshListener.a();
                }
                swipeRefreshLayout.q = swipeRefreshLayout.w.getTop();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        };
        this.M = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.6
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                int iAbs = swipeRefreshLayout.A - Math.abs(swipeRefreshLayout.z);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.y + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout.w.getTop());
                CircularProgressDrawable circularProgressDrawable = swipeRefreshLayout.C;
                float f2 = 1.0f - f;
                CircularProgressDrawable.Ring ring = circularProgressDrawable.d;
                if (f2 != ring.p) {
                    ring.p = f2;
                }
                circularProgressDrawable.invalidateSelf();
            }
        };
        this.N = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.e(f);
            }
        };
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.p = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.v = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.I = (int) (displayMetrics.density * 40.0f);
        CircleImageView circleImageView = new CircleImageView(getContext());
        float f = circleImageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = circleImageView.getContext().obtainStyledAttributes(androidx.swiperefreshlayout.R.styleable.f3772a);
        circleImageView.e = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        ViewCompat.F(circleImageView, f * 4.0f);
        shapeDrawable.getPaint().setColor(circleImageView.e);
        circleImageView.setBackground(shapeDrawable);
        this.w = circleImageView;
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.C = circularProgressDrawable;
        circularProgressDrawable.e(1);
        this.w.setImageDrawable(this.C);
        this.w.setVisibility(8);
        addView(this.w);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.A = i;
        this.h = i;
        this.j = new NestedScrollingParentHelper();
        this.k = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.I;
        this.q = i2;
        this.z = i2;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, O);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }
}
