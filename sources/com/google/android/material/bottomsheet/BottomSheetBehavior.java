package com.google.android.material.bottomsheet;

import YU.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements MaterialBackHandler {
    public final boolean A;
    public final ShapeAppearanceModel B;
    public boolean C;
    public final StateSettlingTracker D;
    public final ValueAnimator E;
    public final int F;
    public int G;
    public int H;
    public final float I;
    public int J;
    public final float K;
    public boolean L;
    public boolean M;
    public final boolean N;
    public int O;
    public ViewDragHelper P;
    public boolean Q;
    public int R;
    public boolean S;
    public final float T;
    public int U;
    public int V;
    public int W;
    public WeakReference X;
    public WeakReference Y;
    public WeakReference Z;
    public final ArrayList a0;
    public VelocityTracker b0;
    public MaterialBottomContainerBackHelper c0;
    public final int d;
    public int d0;
    public boolean e;
    public int e0;
    public final float f;
    public boolean f0;
    public final int g;
    public HashMap g0;
    public int h;
    public final SparseIntArray h0;
    public boolean i;
    public final ViewDragHelper.Callback i0;
    public int j;
    public final int k;
    public final MaterialShapeDrawable l;
    public final ColorStateList m;
    public final int n;
    public final int o;
    public int p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public int y;
    public int z;

    public static abstract class BottomSheetCallback {
        public void a(View view) {
        }

        public abstract void b(View view, float f);

        public abstract void c(int i, View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface SaveFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface State {
    }

    public class StateSettlingTracker {

        /* renamed from: a, reason: collision with root package name */
        public int f14522a;
        public boolean b;
        public final Runnable c = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                stateSettlingTracker.b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                ViewDragHelper viewDragHelper = bottomSheetBehavior.P;
                if (viewDragHelper != null && viewDragHelper.h()) {
                    stateSettlingTracker.a(stateSettlingTracker.f14522a);
                } else if (bottomSheetBehavior.O == 2) {
                    bottomSheetBehavior.O(stateSettlingTracker.f14522a);
                }
            }
        };

        public StateSettlingTracker() {
        }

        public final void a(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference weakReference = bottomSheetBehavior.X;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f14522a = i;
            if (this.b) {
                return;
            }
            View view = (View) bottomSheetBehavior.X.get();
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            view.postOnAnimation(this.c);
            this.b = true;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        super(context, attributeSet);
        this.d = 0;
        this.e = true;
        this.n = -1;
        this.o = -1;
        this.D = new StateSettlingTracker();
        this.I = 0.5f;
        this.K = -1.0f;
        this.N = true;
        this.O = 4;
        this.T = 0.1f;
        this.a0 = new ArrayList();
        this.e0 = -1;
        this.h0 = new SparseIntArray();
        this.i0 = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionHorizontal(View view, int i2, int i3) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionVertical(View view, int i2, int i3) {
                return MathUtils.b(i2, BottomSheetBehavior.this.H(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int getViewVerticalDragRange(View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.L ? bottomSheetBehavior.W : bottomSheetBehavior.J;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewDragStateChanged(int i2) throws Resources.NotFoundException {
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.N) {
                        bottomSheetBehavior.O(1);
                    }
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                BottomSheetBehavior.this.D(i3);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onViewReleased(android.view.View r6, float r7, float r8) throws android.content.res.Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 233
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass5.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean tryCaptureView(View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.O;
                if (i3 == 1 || bottomSheetBehavior.f0) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.d0 == i2) {
                    WeakReference weakReference = bottomSheetBehavior.Z;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference2 = bottomSheetBehavior.X;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.k = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.g);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.m = MaterialResources.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.B = ShapeAppearanceModel.d(context, attributeSet, R.attr.bottomSheetStyle, 2132083880).a();
        }
        ShapeAppearanceModel shapeAppearanceModel = this.B;
        if (shapeAppearanceModel != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            this.l = materialShapeDrawable;
            materialShapeDrawable.k(context);
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                this.l.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.l.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(A(), 1.0f);
        this.E = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.E.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MaterialShapeDrawable materialShapeDrawable2 = BottomSheetBehavior.this.l;
                if (materialShapeDrawable2 != null) {
                    materialShapeDrawable2.n(fFloatValue);
                }
            }
        });
        this.K = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            N(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            N(i);
        }
        M(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.q = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.e != z) {
            this.e = z;
            if (this.X != null) {
                z();
            }
            O((this.e && this.O == 6) ? 3 : this.O);
            T(this.O, true);
            R();
        }
        this.M = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.N = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.d = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.I = f;
        if (this.X != null) {
            this.H = (int) ((1.0f - f) * this.W);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.F = dimensionPixelOffset;
            T(this.O, true);
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.F = i2;
            T(this.O, true);
        }
        this.g = typedArrayObtainStyledAttributes.getInt(11, 500);
        this.r = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.s = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.t = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(20, true);
        this.v = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.w = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.x = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.A = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View E(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.s(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewE = E(viewGroup.getChildAt(i));
            if (viewE != null) {
                return viewE;
            }
        }
        return null;
    }

    public static BottomSheetBehavior F(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).f2382a;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int G(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float A() {
        /*
            r5 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.l
            r1 = 0
            if (r0 == 0) goto L6f
            java.lang.ref.WeakReference r0 = r5.X
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L6f
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L6f
            java.lang.ref.WeakReference r0 = r5.X
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.J()
            if (r2 == 0) goto L6f
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L6f
            com.google.android.material.shape.MaterialShapeDrawable r2 = r5.l
            float r2 = r2.i()
            android.view.RoundedCorner r3 = com.google.android.gms.common.util.a.k(r0)
            if (r3 == 0) goto L44
            int r3 = com.google.android.gms.common.util.a.b(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r3 = r3 / r2
            goto L45
        L44:
            r3 = r1
        L45:
            com.google.android.material.shape.MaterialShapeDrawable r2 = r5.l
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r4 = r2.d
            com.google.android.material.shape.ShapeAppearanceModel r4 = r4.f14634a
            com.google.android.material.shape.CornerSize r4 = r4.f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = com.google.android.gms.common.util.a.v(r0)
            if (r0 == 0) goto L6a
            int r0 = com.google.android.gms.common.util.a.b(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L6a
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L6a
            float r1 = r0 / r2
        L6a:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A():float");
    }

    public final int B() {
        int i;
        return this.i ? Math.min(Math.max(this.j, this.W - ((this.V * 9) / 16)), this.U) + this.y : (this.q || this.r || (i = this.p) <= 0) ? this.h + this.y : Math.max(this.h, i + this.k);
    }

    public final void C(int i, View view) {
        if (view == null) {
            return;
        }
        ViewCompat.w(524288, view);
        ViewCompat.t(0, view);
        ViewCompat.w(262144, view);
        ViewCompat.t(0, view);
        ViewCompat.w(1048576, view);
        ViewCompat.t(0, view);
        SparseIntArray sparseIntArray = this.h0;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 != -1) {
            ViewCompat.w(i2, view);
            ViewCompat.t(0, view);
            sparseIntArray.delete(i);
        }
    }

    public final void D(int i) {
        float f;
        float fH;
        View view = (View) this.X.get();
        if (view != null) {
            ArrayList arrayList = this.a0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.J;
            if (i > i2 || i2 == H()) {
                int i3 = this.J;
                f = i3 - i;
                fH = this.W - i3;
            } else {
                int i4 = this.J;
                f = i4 - i;
                fH = i4 - H();
            }
            float f2 = f / fH;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((BottomSheetCallback) arrayList.get(i5)).b(view, f2);
            }
        }
    }

    public final int H() {
        if (this.e) {
            return this.G;
        }
        return Math.max(this.F, this.u ? 0 : this.z);
    }

    public final int I(int i) {
        if (i == 3) {
            return H();
        }
        if (i == 4) {
            return this.J;
        }
        if (i == 5) {
            return this.W;
        }
        if (i == 6) {
            return this.H;
        }
        throw new IllegalArgumentException(a.d(i, "Invalid state to get top offset: "));
    }

    public final boolean J() {
        WeakReference weakReference = this.X;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.X.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void K() {
        this.d0 = -1;
        this.e0 = -1;
        VelocityTracker velocityTracker = this.b0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.b0 = null;
        }
    }

    public final void L(BottomSheetDragHandleView bottomSheetDragHandleView) throws Resources.NotFoundException {
        WeakReference weakReference;
        if (bottomSheetDragHandleView != null || (weakReference = this.Y) == null) {
            this.Y = new WeakReference(bottomSheetDragHandleView);
            S(1, bottomSheetDragHandleView);
        } else {
            C(1, (View) weakReference.get());
            this.Y = null;
        }
    }

    public final void M(boolean z) throws Resources.NotFoundException {
        if (this.L != z) {
            this.L = z;
            if (!z && this.O == 5) {
                f(4);
            }
            R();
        }
    }

    public final void N(int i) {
        if (i == -1) {
            if (this.i) {
                return;
            } else {
                this.i = true;
            }
        } else {
            if (!this.i && this.h == i) {
                return;
            }
            this.i = false;
            this.h = Math.max(0, i);
        }
        V();
    }

    public final void O(int i) throws Resources.NotFoundException {
        View view;
        if (this.O == i) {
            return;
        }
        this.O = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.L;
        }
        WeakReference weakReference = this.X;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            U(true);
        } else if (i == 6 || i == 5 || i == 4) {
            U(false);
        }
        T(i, true);
        while (true) {
            ArrayList arrayList = this.a0;
            if (i2 >= arrayList.size()) {
                R();
                return;
            } else {
                ((BottomSheetCallback) arrayList.get(i2)).c(i, view);
                i2++;
            }
        }
    }

    public final boolean P(View view, float f) {
        if (this.M) {
            return true;
        }
        if (view.getTop() < this.J) {
            return false;
        }
        return Math.abs(((f * this.T) + ((float) view.getTop())) - ((float) this.J)) / ((float) B()) > 0.5f;
    }

    public final void Q(View view, int i, boolean z) throws Resources.NotFoundException {
        int I = I(i);
        ViewDragHelper viewDragHelper = this.P;
        if (viewDragHelper == null || (!z ? viewDragHelper.v(view, view.getLeft(), I) : viewDragHelper.t(view.getLeft(), I))) {
            O(i);
            return;
        }
        O(2);
        T(i, true);
        this.D.a(i);
    }

    public final void R() throws Resources.NotFoundException {
        WeakReference weakReference = this.X;
        if (weakReference != null) {
            S(0, (View) weakReference.get());
        }
        WeakReference weakReference2 = this.Y;
        if (weakReference2 != null) {
            S(1, (View) weakReference2.get());
        }
    }

    public final void S(int i, View view) throws Resources.NotFoundException {
        int iA;
        int i2;
        if (view == null) {
            return;
        }
        C(i, view);
        if (!this.e && this.O != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            AccessibilityViewCommand accessibilityViewCommand = new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean b(View view2) throws Resources.NotFoundException {
                    BottomSheetBehavior.this.f(i);
                    return true;
                }
            };
            ArrayList arrayListH = ViewCompat.h(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListH.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = ViewCompat.d;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListH.size(); i7++) {
                            z &= ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i7)).a() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    iA = i5;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i3)).f2509a).getLabel())) {
                        iA = ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (iA != -1) {
                i2 = iA;
                AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, i2, string, accessibilityViewCommand, null);
                AccessibilityDelegateCompat accessibilityDelegateCompatE = ViewCompat.e(view);
                if (accessibilityDelegateCompatE == null) {
                    accessibilityDelegateCompatE = new AccessibilityDelegateCompat();
                }
                ViewCompat.A(view, accessibilityDelegateCompatE);
                ViewCompat.w(accessibilityActionCompat.a(), view);
                ViewCompat.h(view).add(accessibilityActionCompat);
                ViewCompat.t(0, view);
            } else {
                i2 = iA;
            }
            this.h0.put(i, i2);
        }
        if (this.L) {
            final int i8 = 5;
            if (this.O != 5) {
                ViewCompat.x(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.n, null, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                    public final boolean b(View view2) throws Resources.NotFoundException {
                        BottomSheetBehavior.this.f(i8);
                        return true;
                    }
                });
            }
        }
        int i9 = this.O;
        final int i10 = 4;
        final int i11 = 3;
        if (i9 == 3) {
            i = this.e ? 4 : 6;
            ViewCompat.x(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.m, null, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean b(View view2) throws Resources.NotFoundException {
                    BottomSheetBehavior.this.f(i);
                    return true;
                }
            });
        } else if (i9 == 4) {
            i = this.e ? 3 : 6;
            ViewCompat.x(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.l, null, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean b(View view2) throws Resources.NotFoundException {
                    BottomSheetBehavior.this.f(i);
                    return true;
                }
            });
        } else {
            if (i9 != 6) {
                return;
            }
            ViewCompat.x(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.m, null, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean b(View view2) throws Resources.NotFoundException {
                    BottomSheetBehavior.this.f(i10);
                    return true;
                }
            });
            ViewCompat.x(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.l, null, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean b(View view2) throws Resources.NotFoundException {
                    BottomSheetBehavior.this.f(i11);
                    return true;
                }
            });
        }
    }

    public final void T(int i, boolean z) {
        MaterialShapeDrawable materialShapeDrawable;
        if (i == 2) {
            return;
        }
        boolean z2 = this.O == 3 && (this.A || J());
        if (this.C == z2 || (materialShapeDrawable = this.l) == null) {
            return;
        }
        this.C = z2;
        ValueAnimator valueAnimator = this.E;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            materialShapeDrawable.n(this.C ? A() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(materialShapeDrawable.d.i, z2 ? A() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void U(boolean z) {
        WeakReference weakReference = this.X;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.g0 != null) {
                    return;
                } else {
                    this.g0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.X.get() && z) {
                    this.g0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.g0 = null;
        }
    }

    public final void V() {
        View view;
        if (this.X != null) {
            z();
            if (this.O != 4 || (view = (View) this.X.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void b(BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.c0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.f = backEventCompat;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void c(BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.c0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        if (materialBottomContainerBackHelper.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = materialBottomContainerBackHelper.f;
        materialBottomContainerBackHelper.f = backEventCompat;
        if (backEventCompat2 == null) {
            return;
        }
        materialBottomContainerBackHelper.d(backEventCompat.c);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d() throws Resources.NotFoundException {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.c0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompat = materialBottomContainerBackHelper.f;
        materialBottomContainerBackHelper.f = null;
        if (backEventCompat == null || Build.VERSION.SDK_INT < 34) {
            f(this.L ? 5 : 4);
            return;
        }
        if (this.L) {
            materialBottomContainerBackHelper.c(backEventCompat, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    bottomSheetBehavior.O(5);
                    WeakReference weakReference = bottomSheetBehavior.X;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    ((View) bottomSheetBehavior.X.get()).requestLayout();
                }
            });
            return;
        }
        AnimatorSet animatorSetB = materialBottomContainerBackHelper.b();
        animatorSetB.setDuration(AnimationUtils.c(backEventCompat.c, materialBottomContainerBackHelper.c, materialBottomContainerBackHelper.d));
        animatorSetB.start();
        f(4);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void e() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.c0;
        if (materialBottomContainerBackHelper == null || materialBottomContainerBackHelper.a() == null) {
            return;
        }
        AnimatorSet animatorSetB = materialBottomContainerBackHelper.b();
        animatorSetB.setDuration(materialBottomContainerBackHelper.e);
        animatorSetB.start();
    }

    public final void f(int i) throws Resources.NotFoundException {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(a.o(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.L && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        final int i2 = (i == 6 && this.e && I(i) <= this.G) ? 3 : i;
        WeakReference weakReference = this.X;
        if (weakReference == null || weakReference.get() == null) {
            O(i);
            return;
        }
        final View view = (View) this.X.get();
        Runnable runnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                BottomSheetBehavior.this.Q(view, i2, false);
            }
        };
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (view.isAttachedToWindow()) {
                view.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void i(CoordinatorLayout.LayoutParams layoutParams) {
        this.X = null;
        this.P = null;
        this.c0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void l() {
        this.X = null;
        this.P = null;
        this.c0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        ViewDragHelper viewDragHelper;
        if (!view.isShown() || !this.N) {
            this.Q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            K();
        }
        if (this.b0 == null) {
            this.b0 = VelocityTracker.obtain();
        }
        this.b0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.e0 = (int) motionEvent.getY();
            if (this.O != 2) {
                WeakReference weakReference = this.Z;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.t(view2, x, this.e0)) {
                    this.d0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f0 = true;
                }
            }
            this.Q = this.d0 == -1 && !coordinatorLayout.t(view, x, this.e0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f0 = false;
            this.d0 = -1;
            if (this.Q) {
                this.Q = false;
                return false;
            }
        }
        if (this.Q || (viewDragHelper = this.P) == null || !viewDragHelper.u(motionEvent)) {
            WeakReference weakReference2 = this.Z;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.Q || this.O == 1 || coordinatorLayout.t(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.P == null || (i = this.e0) == -1 || Math.abs(i - motionEvent.getY()) <= this.P.b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.X == null) {
            this.j = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            final boolean z = (Build.VERSION.SDK_INT < 29 || this.q || this.i) ? false : true;
            if (this.r || this.s || this.t || this.v || this.w || this.x || z) {
                ViewUtils.b(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
                    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final androidx.core.view.WindowInsetsCompat a(android.view.View r12, androidx.core.view.WindowInsetsCompat r13, com.google.android.material.internal.ViewUtils.RelativePadding r14) {
                        /*
                            r11 = this;
                            r0 = 519(0x207, float:7.27E-43)
                            androidx.core.graphics.Insets r0 = r13.e(r0)
                            r1 = 32
                            androidx.core.graphics.Insets r1 = r13.e(r1)
                            int r2 = r0.b
                            int r3 = r0.c
                            int r4 = r0.f2430a
                            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                            r5.z = r2
                            boolean r2 = com.google.android.material.internal.ViewUtils.h(r12)
                            int r6 = r12.getPaddingBottom()
                            int r7 = r12.getPaddingLeft()
                            int r8 = r12.getPaddingRight()
                            boolean r9 = r5.r
                            if (r9 == 0) goto L33
                            int r6 = r13.h()
                            r5.y = r6
                            int r10 = r14.d
                            int r6 = r6 + r10
                        L33:
                            boolean r10 = r5.s
                            if (r10 == 0) goto L3f
                            if (r2 == 0) goto L3c
                            int r7 = r14.c
                            goto L3e
                        L3c:
                            int r7 = r14.f14609a
                        L3e:
                            int r7 = r7 + r4
                        L3f:
                            boolean r10 = r5.t
                            if (r10 == 0) goto L4c
                            if (r2 == 0) goto L48
                            int r14 = r14.f14609a
                            goto L4a
                        L48:
                            int r14 = r14.c
                        L4a:
                            int r8 = r14 + r3
                        L4c:
                            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
                            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
                            boolean r2 = r5.v
                            r10 = 1
                            if (r2 == 0) goto L5f
                            int r2 = r14.leftMargin
                            if (r2 == r4) goto L5f
                            r14.leftMargin = r4
                            r2 = r10
                            goto L60
                        L5f:
                            r2 = 0
                        L60:
                            boolean r4 = r5.w
                            if (r4 == 0) goto L6b
                            int r4 = r14.rightMargin
                            if (r4 == r3) goto L6b
                            r14.rightMargin = r3
                            r2 = r10
                        L6b:
                            boolean r3 = r5.x
                            if (r3 == 0) goto L78
                            int r3 = r14.topMargin
                            int r0 = r0.b
                            if (r3 == r0) goto L78
                            r14.topMargin = r0
                            goto L79
                        L78:
                            r10 = r2
                        L79:
                            if (r10 == 0) goto L7e
                            r12.setLayoutParams(r14)
                        L7e:
                            int r14 = r12.getPaddingTop()
                            r12.setPadding(r7, r14, r8, r6)
                            boolean r12 = r2
                            if (r12 == 0) goto L8d
                            int r14 = r1.d
                            r5.p = r14
                        L8d:
                            if (r9 != 0) goto L93
                            if (r12 == 0) goto L92
                            goto L93
                        L92:
                            return r13
                        L93:
                            r5.V()
                            return r13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.a(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.ViewUtils$RelativePadding):androidx.core.view.WindowInsetsCompat");
                    }
                });
            }
            ViewCompat.P(view, new InsetsAnimationCallback(view));
            this.X = new WeakReference(view);
            this.c0 = new MaterialBottomContainerBackHelper(view);
            MaterialShapeDrawable materialShapeDrawable = this.l;
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                float fK = this.K;
                if (fK == -1.0f) {
                    fK = ViewCompat.k(view);
                }
                materialShapeDrawable.l(fK);
            } else {
                ColorStateList colorStateList = this.m;
                if (colorStateList != null) {
                    ViewCompat.D(view, colorStateList);
                }
            }
            R();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.P == null) {
            this.P = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.i0);
        }
        int top = view.getTop();
        coordinatorLayout.v(i, view);
        this.V = coordinatorLayout.getWidth();
        this.W = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.U = height;
        int iMin = this.W;
        int i3 = iMin - height;
        int i4 = this.z;
        if (i3 < i4) {
            boolean z2 = this.u;
            int i5 = this.o;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.U = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.U = iMin2;
            }
        }
        this.G = Math.max(0, this.W - this.U);
        this.H = (int) ((1.0f - this.I) * this.W);
        z();
        int i6 = this.O;
        if (i6 == 3) {
            view.offsetTopAndBottom(H());
        } else if (i6 == 6) {
            view.offsetTopAndBottom(this.H);
        } else if (this.L && i6 == 5) {
            view.offsetTopAndBottom(this.W);
        } else if (i6 == 4) {
            view.offsetTopAndBottom(this.J);
        } else if (i6 == 1 || i6 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        T(this.O, false);
        this.Z = new WeakReference(E(view));
        while (true) {
            ArrayList arrayList = this.a0;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((BottomSheetCallback) arrayList.get(i2)).a(view);
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(G(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.n, marginLayoutParams.width), G(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.o, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean p(View view) {
        WeakReference weakReference = this.Z;
        return (weakReference == null || view != weakReference.get() || this.O == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) throws Resources.NotFoundException {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.Z;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.N;
        if (i2 > 0) {
            if (i4 < H()) {
                int iH = top - H();
                iArr[1] = iH;
                int i5 = -iH;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                view.offsetTopAndBottom(i5);
                O(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                view.offsetTopAndBottom(-i2);
                O(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.J;
            if (i4 > i6 && !this.L) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = ViewCompat.f2488a;
                view.offsetTopAndBottom(i8);
                O(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = ViewCompat.f2488a;
                view.offsetTopAndBottom(-i2);
                O(1);
            }
        }
        D(view.getTop());
        this.R = i2;
        this.S = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void t(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.d;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.h = savedState.g;
            }
            if (i == -1 || (i & 2) == 2) {
                this.e = savedState.h;
            }
            if (i == -1 || (i & 4) == 4) {
                this.L = savedState.i;
            }
            if (i == -1 || (i & 8) == 8) {
                this.M = savedState.j;
            }
        }
        int i2 = savedState.f;
        if (i2 == 1 || i2 == 2) {
            this.O = 4;
        } else {
            this.O = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable u(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.R = 0;
        this.S = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.H()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.O(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.Z
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.S
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.R
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.e
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.H
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.L
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.b0
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.b0
            int r6 = r2.d0
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.P(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.R
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.e
            if (r1 == 0) goto L74
            int r5 = r2.G
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.J
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.H
            if (r3 >= r1) goto L83
            int r6 = r2.J
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.J
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.e
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.H
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.J
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.Q(r4, r0, r3)
            r2.S = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.w(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.O;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.P;
        if (viewDragHelper != null && (this.N || i == 1)) {
            viewDragHelper.n(motionEvent);
        }
        if (actionMasked == 0) {
            K();
        }
        if (this.b0 == null) {
            this.b0 = VelocityTracker.obtain();
        }
        this.b0.addMovement(motionEvent);
        if (this.P != null && ((this.N || this.O == 1) && actionMasked == 2 && !this.Q)) {
            float fAbs = Math.abs(this.e0 - motionEvent.getY());
            ViewDragHelper viewDragHelper2 = this.P;
            if (fAbs > viewDragHelper2.b) {
                viewDragHelper2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.Q;
    }

    public final void y(BottomSheetCallback bottomSheetCallback) {
        ArrayList arrayList = this.a0;
        if (arrayList.contains(bottomSheetCallback)) {
            return;
        }
        arrayList.add(bottomSheetCallback);
    }

    public final void z() {
        int iB = B();
        if (this.e) {
            this.J = Math.max(this.W - iB, this.G);
        } else {
            this.J = this.W - iB;
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public final int f;
        public final int g;
        public final boolean h;
        public final boolean i;
        public final boolean j;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1, reason: invalid class name */
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
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f = bottomSheetBehavior.O;
            this.g = bottomSheetBehavior.h;
            this.h = bottomSheetBehavior.e;
            this.i = bottomSheetBehavior.L;
            this.j = bottomSheetBehavior.M;
        }
    }

    public BottomSheetBehavior() {
        this.d = 0;
        this.e = true;
        this.n = -1;
        this.o = -1;
        this.D = new StateSettlingTracker();
        this.I = 0.5f;
        this.K = -1.0f;
        this.N = true;
        this.O = 4;
        this.T = 0.1f;
        this.a0 = new ArrayList();
        this.e0 = -1;
        this.h0 = new SparseIntArray();
        this.i0 = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionHorizontal(View view, int i2, int i3) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionVertical(View view, int i2, int i3) {
                return MathUtils.b(i2, BottomSheetBehavior.this.H(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int getViewVerticalDragRange(View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.L ? bottomSheetBehavior.W : bottomSheetBehavior.J;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewDragStateChanged(int i2) throws Resources.NotFoundException {
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.N) {
                        bottomSheetBehavior.O(1);
                    }
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                BottomSheetBehavior.this.D(i3);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewReleased(View v, float v2, float v3) throws Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 233
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass5.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean tryCaptureView(View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.O;
                if (i3 == 1 || bottomSheetBehavior.f0) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.d0 == i2) {
                    WeakReference weakReference = bottomSheetBehavior.Z;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference2 = bottomSheetBehavior.X;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }
}
