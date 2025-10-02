package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.g;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    public static final /* synthetic */ int C = 0;
    public final float A;
    public Behavior B;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public WindowInsetsCompat j;
    public ArrayList k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public WeakReference q;
    public final boolean r;
    public ValueAnimator s;
    public final ValueAnimator.AnimatorUpdateListener t;
    public final ArrayList u;
    public final long v;
    public final TimeInterpolator w;
    public int[] x;
    public Drawable y;
    public Integer z;

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void a(int i);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class ChildScrollEffect {
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f14512a = new Rect();
        public final Rect b = new Rect();
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f14513a;
        public final CompressChildScrollEffect b;
        public final Interpolator c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14513a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.b);
            this.f14513a = typedArrayObtainStyledAttributes.getInt(1, 0);
            this.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new CompressChildScrollEffect();
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                this.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public interface LiftOnScrollListener {
        void a();
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final AppBarLayout C(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final float D(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).f2382a;
                int iZ = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).z() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iZ > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iZ / i) + 1.0f;
                }
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final int E(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iB;
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).f2382a;
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).m + this.h;
                if (this.i == 0) {
                    iB = 0;
                } else {
                    float fD = D(view2);
                    int i = this.i;
                    iB = MathUtils.b((int) (fD * i), 0, i);
                }
                int i2 = bottom - iB;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                view.offsetTopAndBottom(i2);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o) {
                    appBarLayout.f(appBarLayout.g(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void k(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                ViewCompat.A(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean s(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList arrayListM = coordinatorLayout.m(view);
            int size = arrayListM.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListM.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.e(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.V);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    public static LayoutParams b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.f14513a = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams3 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.f14513a = 1;
            return layoutParams3;
        }
        LayoutParams layoutParams4 = new LayoutParams(layoutParams);
        layoutParams4.f14513a = 1;
        return layoutParams4;
    }

    public final void a(OnOffsetChangedListener onOffsetChangedListener) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (onOffsetChangedListener == null || this.k.contains(onOffsetChangedListener)) {
            return;
        }
        this.k.add(onOffsetChangedListener);
    }

    public final void c() {
        Behavior behavior = this.B;
        BaseBehavior.SavedState savedStateM = (behavior == null || this.e == -1 || this.i != 0) ? null : behavior.M(AbsSavedState.e, this);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        if (savedStateM != null) {
            Behavior behavior2 = this.B;
            if (behavior2.p != null) {
                return;
            }
            behavior2.p = savedStateM;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d(int i) {
        this.d = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = (BaseOnOffsetChangedListener) this.k.get(i2);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.a(i);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.y == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, -this.d);
        this.y.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.y;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z, boolean z2, boolean z3) {
        this.i = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean f(boolean z) {
        if (this.l || this.n == z) {
            return false;
        }
        this.n = z;
        refreshDrawableState();
        if (!(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        boolean z2 = this.r;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (z2) {
            float f2 = z ? 0.0f : 1.0f;
            if (z) {
                f = 1.0f;
            }
            h(f2, f);
            return true;
        }
        if (!this.o) {
            return true;
        }
        float f3 = this.A;
        float f4 = z ? 0.0f : f3;
        if (z) {
            f = f3;
        }
        h(f4, f);
        return true;
    }

    public final boolean g(View view) {
        int i;
        if (this.q == null && (i = this.p) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.p);
            }
            if (viewFindViewById != null) {
                this.q = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.q;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.f14513a = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.B = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f14513a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap r4 = androidx.core.view.ViewCompat.f2488a
            int r4 = r3.getMinimumHeight()
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap r4 = androidx.core.view.ViewCompat.f2488a
            int r4 = r3.getMinimumHeight()
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap r6 = androidx.core.view.ViewCompat.f2488a
            boolean r3 = r3.getFitsSystemWindows()
            if (r3 == 0) goto L61
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i3 = layoutParams.f14513a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.g = iMax;
        return iMax;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.p;
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.i;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.y;
    }

    @Deprecated
    public float getTargetElevation() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.j;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.f14513a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.e = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void h(float f, float f2) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.s = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.v);
        this.s.setInterpolator(this.w);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.t;
        if (animatorUpdateListener != null) {
            this.s.addUpdateListener(animatorUpdateListener);
        }
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.x == null) {
            this.x = new int[4];
        }
        int[] iArr = this.x;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.m;
        iArr[0] = z ? com.woolworths.R.attr.state_liftable : -2130969918;
        iArr[1] = (z && this.n) ? com.woolworths.R.attr.state_lifted : -2130969919;
        iArr[2] = z ? com.woolworths.R.attr.state_collapsible : -2130969914;
        iArr[3] = (z && this.n) ? com.woolworths.R.attr.state_collapsed : -2130969913;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.q = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.h = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).c != null) {
                this.h = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.l) {
            return;
        }
        if (!this.o) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((LayoutParams) getChildAt(i6).getLayoutParams()).f14513a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.m != z2) {
            this.m = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = MathUtils.b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        c();
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.b(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        e(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.o = z;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.p = -1;
        if (view != null) {
            this.q = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.q = null;
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i) {
        this.p = i;
        WeakReference weakReference = this.q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.q = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.l = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.y;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.y = drawableMutate;
            if (drawableMutate instanceof MaterialShapeDrawable) {
                numValueOf = Integer.valueOf(((MaterialShapeDrawable) drawableMutate).x);
            } else {
                ColorStateList colorStateListD = DrawableUtils.d(drawableMutate);
                if (colorStateListD != null) {
                    numValueOf = Integer.valueOf(colorStateListD.getDefaultColor());
                }
            }
            this.z = numValueOf;
            Drawable drawable3 = this.y;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.y.setState(getDrawableState());
                }
                Drawable drawable4 = this.y;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.y.setVisible(getVisibility() == 0, false);
                this.y.setCallback(this);
            }
            if (this.y != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap weakHashMap2 = ViewCompat.f2488a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i) {
        setStatusBarForeground(AppCompatResources.b(i, getContext()));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        ViewUtilsLollipop.a(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.y;
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        public int m;
        public int n;
        public ValueAnimator o;
        public SavedState p;
        public WeakReference q;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$2, reason: invalid class name */
        class AnonymousClass2 extends AccessibilityDelegateCompat {
            public final /* synthetic */ AppBarLayout d;
            public final /* synthetic */ CoordinatorLayout e;
            public final /* synthetic */ BaseBehavior f;

            public AnonymousClass2(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
                this.f = baseBehavior;
                this.d = appBarLayout;
                this.e = coordinatorLayout;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
                accessibilityNodeInfoCompat.l(ScrollView.class.getName());
                AppBarLayout appBarLayout = this.d;
                if (appBarLayout.getTotalScrollRange() == 0) {
                    return;
                }
                CoordinatorLayout coordinatorLayout = this.e;
                BaseBehavior baseBehavior = this.f;
                View viewI = BaseBehavior.I(baseBehavior, coordinatorLayout);
                if (viewI == null) {
                    return;
                }
                int childCount = appBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).f14513a != 0) {
                        if (baseBehavior.z() != (-appBarLayout.getTotalScrollRange())) {
                            accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.j);
                            accessibilityNodeInfoCompat.q(true);
                        }
                        if (baseBehavior.z() != 0) {
                            if (!viewI.canScrollVertically(-1)) {
                                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.k);
                                accessibilityNodeInfoCompat.q(true);
                                return;
                            } else {
                                if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                    accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.k);
                                    accessibilityNodeInfoCompat.q(true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean g(View view, int i, Bundle bundle) {
                AppBarLayout appBarLayout = this.d;
                if (i == 4096) {
                    appBarLayout.setExpanded(false);
                    return true;
                }
                if (i != 8192) {
                    return super.g(view, i, bundle);
                }
                BaseBehavior baseBehavior = this.f;
                if (baseBehavior.z() != 0) {
                    CoordinatorLayout coordinatorLayout = this.e;
                    View viewI = BaseBehavior.I(baseBehavior, coordinatorLayout);
                    if (!viewI.canScrollVertically(-1)) {
                        appBarLayout.setExpanded(true);
                        return true;
                    }
                    int i2 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i2 != 0) {
                        baseBehavior.L(coordinatorLayout, this.d, viewI, i2, new int[]{0, 0});
                        return true;
                    }
                }
                return false;
            }
        }

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
            public boolean f;
            public boolean g;
            public int h;
            public float i;
            public boolean j;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1, reason: invalid class name */
            public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SavedState[i];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f = parcel.readByte() != 0;
                this.g = parcel.readByte() != 0;
                this.h = parcel.readInt();
                this.i = parcel.readFloat();
                this.j = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.h);
                parcel.writeFloat(this.i);
                parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.i = -1;
            this.k = -1;
        }

        public static View I(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).f2382a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View K(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void O(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                if (r4 == 0) goto L5c
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r0
                int r0 = r0.f14513a
                r1 = r0 & 1
                if (r1 == 0) goto L5c
                java.util.WeakHashMap r1 = androidx.core.view.ViewCompat.f2488a
                int r1 = r4.getMinimumHeight()
                r3 = 1
                if (r9 <= 0) goto L4a
                r9 = r0 & 12
                if (r9 == 0) goto L4a
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5c
                goto L5d
            L4a:
                r9 = r0 & 2
                if (r9 == 0) goto L5c
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5c
                goto L5d
            L5c:
                r3 = r2
            L5d:
                boolean r8 = r7.o
                if (r8 == 0) goto L69
                android.view.View r8 = K(r6)
                boolean r3 = r7.g(r8)
            L69:
                boolean r8 = r7.f(r3)
                if (r10 != 0) goto La7
                if (r8 == 0) goto Lce
                androidx.coordinatorlayout.widget.DirectedAcyclicGraph r8 = r6.e
                androidx.collection.SimpleArrayMap r8 = r8.b
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                java.util.ArrayList r6 = r6.g
                r6.clear()
                if (r8 == 0) goto L85
                r6.addAll(r8)
            L85:
                int r8 = r6.size()
            L89:
                if (r2 >= r8) goto Lce
                java.lang.Object r9 = r6.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r9
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r9 = r9.f2382a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto La4
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r6 = r9.i
                if (r6 == 0) goto Lce
                goto La7
            La4:
                int r2 = r2 + 1
                goto L89
            La7:
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                if (r6 == 0) goto Lb4
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                r6.jumpToCurrentState()
            Lb4:
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                if (r6 == 0) goto Lc1
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                r6.jumpToCurrentState()
            Lc1:
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                if (r6 == 0) goto Lce
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                r6.jumpToCurrentState()
            Lce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.O(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final boolean C(View view) {
            WeakReference weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int D(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int E(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final void F(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            N(coordinatorLayout, appBarLayout);
            if (appBarLayout.o) {
                appBarLayout.f(appBarLayout.g(K(coordinatorLayout)));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int G(androidx.coordinatorlayout.widget.CoordinatorLayout r17, android.view.View r18, int r19, int r20, int r21) {
            /*
                Method dump skipped, instructions count: 353
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void J(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(z() - i);
            float fAbs = Math.abs(BitmapDescriptorFactory.HUE_RED);
            int iRound = fAbs > BitmapDescriptorFactory.HUE_RED ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iZ = z();
            if (iZ == i) {
                ValueAnimator valueAnimator = this.o;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.o.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.o = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.animation.AnimationUtils.e);
                this.o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        this.H(coordinatorLayout, appBarLayout, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.o.setDuration(Math.min(iRound, 600));
            this.o.setIntValues(iZ, i);
            this.o.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void L(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
            Le:
                r6 = r0
                r7 = r1
                goto L18
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                goto Le
            L18:
                if (r6 == r7) goto L2b
                int r0 = r8.z()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r9 = r2.G(r3, r4, r5, r6, r7)
                r10 = 1
                r13[r10] = r9
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r9 = r4.o
                if (r9 == 0) goto L37
                boolean r9 = r4.g(r11)
                r4.f(r9)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.L(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        public final SavedState M(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iY = y();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iY;
                if (childAt.getTop() + iY <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.e;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = iY == 0;
                    savedState.g = z;
                    savedState.f = !z && (-iY) >= appBarLayout.getTotalScrollRange();
                    savedState.h = i;
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    savedState.j = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.i = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iZ = z() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.f14513a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i2 = -iZ;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i3 = layoutParams2.f14513a;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = ViewCompat.f2488a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap weakHashMap3 = ViewCompat.f2488a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iZ < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (iZ < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    J(coordinatorLayout, appBarLayout, MathUtils.b(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.n(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.p;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            J(coordinatorLayout, appBarLayout, i2);
                        } else {
                            H(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            J(coordinatorLayout, appBarLayout, 0);
                        } else {
                            H(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f) {
                H(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.g) {
                H(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.h);
                int i3 = -childAt.getBottom();
                if (this.p.j) {
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.p.i) + i3;
                }
                H(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.i = 0;
            this.p = null;
            B(MathUtils.b(y(), -appBarLayout.getTotalScrollRange(), 0));
            O(coordinatorLayout, appBarLayout, y(), 0, true);
            appBarLayout.d(y());
            if (ViewCompat.f(coordinatorLayout) != null) {
                return true;
            }
            ViewCompat.A(coordinatorLayout, new AnonymousClass2(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.w(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            L(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void r(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = G(coordinatorLayout2, appBarLayout, z() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0 && ViewCompat.f(coordinatorLayout2) == null) {
                ViewCompat.A(coordinatorLayout2, new AnonymousClass2(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void t(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.p = (SavedState) parcelable;
            } else {
                this.p = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable u(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateM = M(absSavedState, (AppBarLayout) view);
            return savedStateM == null ? absSavedState : savedStateM;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.o || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.o) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.n = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.n == 0 || i == 1) {
                N(coordinatorLayout, appBarLayout);
                if (appBarLayout.o) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.q = new WeakReference(view2);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public final int z() {
            return y() + this.m;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Throwable {
        Throwable th;
        final AppBarLayout appBarLayout;
        Integer numValueOf;
        int color;
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132083878), attributeSet, i);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.i = 0;
        this.u = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context3, attributeSet, ViewUtilsLollipop.f14517a, i, 2132083878, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                try {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
                } catch (Throwable th2) {
                    th = th2;
                    typedArrayD.recycle();
                    throw th;
                }
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = ThemeEnforcement.d(context2, attributeSet, R.styleable.f14503a, i, 2132083878, new int[0]);
            Drawable drawable = typedArrayD2.getDrawable(0);
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            setBackground(drawable);
            final ColorStateList colorStateListA = MaterialResources.a(context2, typedArrayD2, 6);
            this.r = colorStateListA != null;
            final ColorStateList colorStateListD = DrawableUtils.d(getBackground());
            int i2 = 2;
            if (colorStateListD != null) {
                final MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
                materialShapeDrawable.m(colorStateListD);
                if (colorStateListA != null) {
                    Context context4 = getContext();
                    TypedValue typedValueA = MaterialAttributes.a(com.woolworths.R.attr.colorSurface, context4);
                    if (typedValueA != null) {
                        int i3 = typedValueA.resourceId;
                        if (i3 != 0) {
                            color = context4.getColor(i3);
                        } else {
                            color = typedValueA.data;
                        }
                        numValueOf = Integer.valueOf(color);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    appBarLayout = this;
                    appBarLayout.t = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            AppBarLayout appBarLayout2 = this.d;
                            ArrayList arrayList = appBarLayout2.u;
                            int iG = MaterialColors.g(((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListD.getDefaultColor(), colorStateListA.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iG);
                            MaterialShapeDrawable materialShapeDrawable2 = materialShapeDrawable;
                            materialShapeDrawable2.m(colorStateListValueOf);
                            if (appBarLayout2.y != null && (num2 = appBarLayout2.z) != null && num2.equals(num)) {
                                appBarLayout2.y.setTint(iG);
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                AppBarLayout.LiftOnScrollListener liftOnScrollListener = (AppBarLayout.LiftOnScrollListener) it.next();
                                if (materialShapeDrawable2.d.c != null) {
                                    liftOnScrollListener.a();
                                }
                            }
                        }
                    };
                    setBackground(materialShapeDrawable);
                } else {
                    appBarLayout = this;
                    materialShapeDrawable.k(context2);
                    appBarLayout.t = new g(i2, this, materialShapeDrawable);
                    setBackground(materialShapeDrawable);
                }
            } else {
                appBarLayout = this;
            }
            appBarLayout.v = MotionUtils.c(context2, com.woolworths.R.attr.motionDurationMedium2, getResources().getInteger(com.woolworths.R.integer.app_bar_elevation_anim_duration));
            appBarLayout.w = MotionUtils.d(context2, com.woolworths.R.attr.motionEasingStandardInterpolator, com.google.android.material.animation.AnimationUtils.f14504a);
            if (typedArrayD2.hasValue(4)) {
                e(typedArrayD2.getBoolean(4, false), false, false);
            }
            if (typedArrayD2.hasValue(3)) {
                ViewUtilsLollipop.a(this, typedArrayD2.getDimensionPixelSize(3, 0));
            }
            if (typedArrayD2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayD2.getBoolean(2, false));
            }
            if (typedArrayD2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayD2.getBoolean(1, false));
            }
            appBarLayout.A = getResources().getDimension(com.woolworths.R.dimen.design_appbar_elevation);
            appBarLayout.o = typedArrayD2.getBoolean(5, false);
            appBarLayout.p = typedArrayD2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(8));
            typedArrayD2.recycle();
            ViewCompat.I(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.AppBarLayout.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                    AppBarLayout appBarLayout2 = AppBarLayout.this;
                    WindowInsetsCompat windowInsetsCompat2 = appBarLayout2.getFitsSystemWindows() ? windowInsetsCompat : null;
                    if (!Objects.equals(appBarLayout2.j, windowInsetsCompat2)) {
                        appBarLayout2.j = windowInsetsCompat2;
                        appBarLayout2.setWillNotDraw(!(appBarLayout2.y != null && appBarLayout2.getTopInset() > 0));
                        appBarLayout2.requestLayout();
                    }
                    return windowInsetsCompat;
                }
            });
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.f14513a = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
