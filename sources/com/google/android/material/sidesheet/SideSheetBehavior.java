package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.sidesheet.SideSheetDialog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements Sheet<SideSheetCallback> {
    public SheetDelegate d;
    public final MaterialShapeDrawable e;
    public final ColorStateList f;
    public final ShapeAppearanceModel g;
    public final StateSettlingTracker h;
    public final float i;
    public final boolean j;
    public int k;
    public ViewDragHelper l;
    public boolean m;
    public final float n;
    public int o;
    public int p;
    public int q;
    public int r;
    public WeakReference s;
    public WeakReference t;
    public final int u;
    public VelocityTracker v;
    public MaterialSideContainerBackHelper w;
    public int x;
    public final LinkedHashSet y;
    public final ViewDragHelper.Callback z;

    public class StateSettlingTracker {

        /* renamed from: a, reason: collision with root package name */
        public int f14648a;
        public boolean b;
        public final c c = new Runnable() { // from class: com.google.android.material.sidesheet.c
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.StateSettlingTracker stateSettlingTracker = this.d;
                stateSettlingTracker.b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                ViewDragHelper viewDragHelper = sideSheetBehavior.l;
                if (viewDragHelper != null && viewDragHelper.h()) {
                    stateSettlingTracker.a(stateSettlingTracker.f14648a);
                } else if (sideSheetBehavior.k == 2) {
                    sideSheetBehavior.y(stateSettlingTracker.f14648a);
                }
            }
        };

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.sidesheet.c] */
        public StateSettlingTracker() {
        }

        public final void a(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference weakReference = sideSheetBehavior.s;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f14648a = i;
            if (this.b) {
                return;
            }
            View view = (View) sideSheetBehavior.s.get();
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            view.postOnAnimation(this.c);
            this.b = true;
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new StateSettlingTracker();
        this.j = true;
        this.k = 5;
        this.n = 0.1f;
        this.u = -1;
        this.y = new LinkedHashSet();
        this.z = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return MathUtils.b(i, sideSheetBehavior.d.g(), sideSheetBehavior.d.f());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionVertical(View view, int i, int i2) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int getViewHorizontalDragRange(View view) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return sideSheetBehavior.o + sideSheetBehavior.r;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    if (sideSheetBehavior.j) {
                        sideSheetBehavior.y(1);
                    }
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                WeakReference weakReference = sideSheetBehavior.t;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.d.p(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.y;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.d.b(i);
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((SheetCallback) it.next()).getClass();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onViewReleased(android.view.View r3, float r4, float r5) {
                /*
                    r2 = this;
                    com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                    com.google.android.material.sidesheet.SheetDelegate r1 = r0.d
                    boolean r1 = r1.k(r4)
                    if (r1 == 0) goto Lb
                    goto L53
                Lb:
                    com.google.android.material.sidesheet.SheetDelegate r1 = r0.d
                    boolean r1 = r1.n(r3, r4)
                    if (r1 == 0) goto L24
                    com.google.android.material.sidesheet.SheetDelegate r1 = r0.d
                    boolean r4 = r1.m(r4, r5)
                    if (r4 != 0) goto L55
                    com.google.android.material.sidesheet.SheetDelegate r4 = r0.d
                    boolean r4 = r4.l(r3)
                    if (r4 == 0) goto L53
                    goto L55
                L24:
                    r1 = 0
                    int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r1 == 0) goto L36
                    float r4 = java.lang.Math.abs(r4)
                    float r5 = java.lang.Math.abs(r5)
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 <= 0) goto L36
                    goto L55
                L36:
                    int r4 = r3.getLeft()
                    com.google.android.material.sidesheet.SheetDelegate r5 = r0.d
                    int r5 = r5.d()
                    int r5 = r4 - r5
                    int r5 = java.lang.Math.abs(r5)
                    com.google.android.material.sidesheet.SheetDelegate r1 = r0.d
                    int r1 = r1.e()
                    int r4 = r4 - r1
                    int r4 = java.lang.Math.abs(r4)
                    if (r5 >= r4) goto L55
                L53:
                    r4 = 3
                    goto L56
                L55:
                    r4 = 5
                L56:
                    r5 = 1
                    r0.A(r3, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.AnonymousClass1.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean tryCaptureView(View view, int i) {
                WeakReference weakReference;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return (sideSheetBehavior.k == 1 || (weakReference = sideSheetBehavior.s) == null || weakReference.get() != view) ? false : true;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.a0);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f = MaterialResources.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.g = ShapeAppearanceModel.d(context, attributeSet, 0, com.woolworths.R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.u = resourceId;
            WeakReference weakReference = this.t;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.t = null;
            WeakReference weakReference2 = this.s;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        ShapeAppearanceModel shapeAppearanceModel = this.g;
        if (shapeAppearanceModel != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            this.e = materialShapeDrawable;
            materialShapeDrawable.k(context);
            ColorStateList colorStateList = this.f;
            if (colorStateList != null) {
                this.e.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.e.setTint(typedValue.data);
            }
        }
        this.i = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.j = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void A(View view, int i, boolean z) {
        int iD;
        if (i == 3) {
            iD = this.d.d();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(YU.a.d(i, "Invalid state to get outer edge offset: "));
            }
            iD = this.d.e();
        }
        ViewDragHelper viewDragHelper = this.l;
        if (viewDragHelper == null || (!z ? viewDragHelper.v(view, iD, view.getTop()) : viewDragHelper.t(iD, view.getTop()))) {
            y(i);
        } else {
            y(2);
            this.h.a(i);
        }
    }

    public final void B() {
        View view;
        WeakReference weakReference = this.s;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.w(262144, view);
        ViewCompat.t(0, view);
        ViewCompat.w(1048576, view);
        ViewCompat.t(0, view);
        int i = 5;
        if (this.k != 5) {
            ViewCompat.x(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.n, null, new m(this, i));
        }
        int i2 = 3;
        if (this.k != 3) {
            ViewCompat.x(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.l, null, new m(this, i2));
        }
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public final void a(SideSheetDialog.AnonymousClass1 anonymousClass1) {
        this.y.add(anonymousClass1);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void b(BackEventCompat backEventCompat) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.w;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.f = backEventCompat;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void c(BackEventCompat backEventCompat) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.w;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        SheetDelegate sheetDelegate = this.d;
        int i = (sheetDelegate == null || sheetDelegate.j() == 0) ? 5 : 3;
        if (materialSideContainerBackHelper.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = materialSideContainerBackHelper.f;
        materialSideContainerBackHelper.f = backEventCompat;
        if (backEventCompat2 != null) {
            materialSideContainerBackHelper.d(backEventCompat.d == 0, backEventCompat.c, i);
        }
        WeakReference weakReference = this.s;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.s.get();
        WeakReference weakReference2 = this.t;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.d.o(marginLayoutParams, (int) ((view.getScaleX() * this.o) + this.r));
        view2.requestLayout();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.w;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompat = materialSideContainerBackHelper.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        materialSideContainerBackHelper.f = null;
        int i = 5;
        if (backEventCompat == null || Build.VERSION.SDK_INT < 34) {
            f(5);
            return;
        }
        SheetDelegate sheetDelegate = this.d;
        if (sheetDelegate != null && sheetDelegate.j() != 0) {
            i = 3;
        }
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.y(5);
                WeakReference weakReference = sideSheetBehavior.s;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((View) sideSheetBehavior.s.get()).requestLayout();
            }
        };
        WeakReference weakReference = this.t;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iC = this.d.c(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.d.d.o(marginLayoutParams, AnimationUtils.c(valueAnimator.getAnimatedFraction(), iC, 0));
                    view.requestLayout();
                }
            };
        }
        materialSideContainerBackHelper.c(backEventCompat, i, animatorListenerAdapter, animatorUpdateListener);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void e() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.w;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.b();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public final void f(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(YU.a.o(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.s;
        if (weakReference == null || weakReference.get() == null) {
            y(i);
            return;
        }
        View view = (View) this.s.get();
        androidx.core.content.res.a aVar = new androidx.core.content.res.a(i, 3, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (view.isAttachedToWindow()) {
                view.post(aVar);
                return;
            }
        }
        aVar.run();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public final int getState() {
        return this.k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void i(CoordinatorLayout.LayoutParams layoutParams) {
        this.s = null;
        this.l = null;
        this.w = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void l() {
        this.s = null;
        this.l = null;
        this.w = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && ViewCompat.g(view) == null) || !this.j) {
            this.m = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.v) != null) {
            velocityTracker.recycle();
            this.v = null;
        }
        if (this.v == null) {
            this.v = VelocityTracker.obtain();
        }
        this.v.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.x = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.m) {
            this.m = false;
            return false;
        }
        return (this.m || (viewDragHelper = this.l) == null || !viewDragHelper.u(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.s;
        MaterialShapeDrawable materialShapeDrawable = this.e;
        int iH = 0;
        if (weakReference == null) {
            this.s = new WeakReference(view);
            this.w = new MaterialSideContainerBackHelper(view);
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                float fK = this.i;
                if (fK == -1.0f) {
                    fK = ViewCompat.k(view);
                }
                materialShapeDrawable.l(fK);
            } else {
                ColorStateList colorStateList = this.f;
                if (colorStateList != null) {
                    ViewCompat.D(view, colorStateList);
                }
            }
            int i3 = this.k == 5 ? 4 : 0;
            if (view.getVisibility() != i3) {
                view.setVisibility(i3);
            }
            B();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (ViewCompat.g(view) == null) {
                ViewCompat.C(view, view.getResources().getString(com.woolworths.R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i4 = Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        SheetDelegate sheetDelegate = this.d;
        if (sheetDelegate == null || sheetDelegate.j() != i4) {
            CoordinatorLayout.LayoutParams layoutParams = null;
            ShapeAppearanceModel shapeAppearanceModel = this.g;
            if (i4 == 0) {
                this.d = new RightSheetDelegate(this);
                if (shapeAppearanceModel != null) {
                    WeakReference weakReference2 = this.s;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view3.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin <= 0) {
                        ShapeAppearanceModel.Builder builderG = shapeAppearanceModel.g();
                        builderG.f(BitmapDescriptorFactory.HUE_RED);
                        builderG.d(BitmapDescriptorFactory.HUE_RED);
                        ShapeAppearanceModel shapeAppearanceModelA = builderG.a();
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA);
                        }
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException(YU.a.e(i4, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.d = new LeftSheetDelegate(this);
                if (shapeAppearanceModel != null) {
                    WeakReference weakReference3 = this.s;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view2.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin <= 0) {
                        ShapeAppearanceModel.Builder builderG2 = shapeAppearanceModel.g();
                        builderG2.e(BitmapDescriptorFactory.HUE_RED);
                        builderG2.c(BitmapDescriptorFactory.HUE_RED);
                        ShapeAppearanceModel shapeAppearanceModelA2 = builderG2.a();
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA2);
                        }
                    }
                }
            }
        }
        if (this.l == null) {
            this.l = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.z);
        }
        int iH2 = this.d.h(view);
        coordinatorLayout.v(i, view);
        this.p = coordinatorLayout.getWidth();
        this.q = this.d.i(coordinatorLayout);
        this.o = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.r = marginLayoutParams != null ? this.d.a(marginLayoutParams) : 0;
        int i5 = this.k;
        if (i5 == 1 || i5 == 2) {
            iH = iH2 - this.d.h(view);
        } else if (i5 != 3) {
            if (i5 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.k);
            }
            iH = this.d.e();
        }
        view.offsetLeftAndRight(iH);
        if (this.t == null && (i2 = this.u) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.t = new WeakReference(viewFindViewById);
        }
        for (SheetCallback sheetCallback : this.y) {
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void t(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).f;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.k = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable u(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.k == 1 && actionMasked == 0) {
            return true;
        }
        if (z()) {
            this.l.n(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.v) != null) {
            velocityTracker.recycle();
            this.v = null;
        }
        if (this.v == null) {
            this.v = VelocityTracker.obtain();
        }
        this.v.addMovement(motionEvent);
        if (z() && actionMasked == 2 && !this.m && z()) {
            float fAbs = Math.abs(this.x - motionEvent.getX());
            ViewDragHelper viewDragHelper = this.l;
            if (fAbs > viewDragHelper.b) {
                viewDragHelper.c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.m;
    }

    public final void y(int i) {
        View view;
        if (this.k == i) {
            return;
        }
        this.k = i;
        WeakReference weakReference = this.s;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.k == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((SheetCallback) it.next()).a(i);
        }
        B();
    }

    public final boolean z() {
        if (this.l != null) {
            return this.j || this.k == 1;
        }
        return false;
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public final int f;

        /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$SavedState$1, reason: invalid class name */
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
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f = sideSheetBehavior.k;
        }
    }

    public SideSheetBehavior() {
        this.h = new StateSettlingTracker();
        this.j = true;
        this.k = 5;
        this.n = 0.1f;
        this.u = -1;
        this.y = new LinkedHashSet();
        this.z = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return MathUtils.b(i, sideSheetBehavior.d.g(), sideSheetBehavior.d.f());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionVertical(View view, int i, int i2) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int getViewHorizontalDragRange(View view) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return sideSheetBehavior.o + sideSheetBehavior.r;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    if (sideSheetBehavior.j) {
                        sideSheetBehavior.y(1);
                    }
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                WeakReference weakReference = sideSheetBehavior.t;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.d.p(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.y;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.d.b(i);
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((SheetCallback) it.next()).getClass();
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewReleased(View v, float v2, float v3) {
                /*
                    this = this;
                    com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                    com.google.android.material.sidesheet.SheetDelegate r1 = r0.d
                    boolean r1 = r1.k(r4)
                    if (r1 == 0) goto Lb
                    goto L53
                Lb:
                    com.google.android.material.sidesheet.SheetDelegate r1 = r0.d
                    boolean r1 = r1.n(r3, r4)
                    if (r1 == 0) goto L24
                    com.google.android.material.sidesheet.SheetDelegate r1 = r0.d
                    boolean r4 = r1.m(r4, r5)
                    if (r4 != 0) goto L55
                    com.google.android.material.sidesheet.SheetDelegate r4 = r0.d
                    boolean r4 = r4.l(r3)
                    if (r4 == 0) goto L53
                    goto L55
                L24:
                    r1 = 0
                    int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r1 == 0) goto L36
                    float r4 = java.lang.Math.abs(r4)
                    float r5 = java.lang.Math.abs(r5)
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 <= 0) goto L36
                    goto L55
                L36:
                    int r4 = r3.getLeft()
                    com.google.android.material.sidesheet.SheetDelegate r5 = r0.d
                    int r5 = r5.d()
                    int r5 = r4 - r5
                    int r5 = java.lang.Math.abs(r5)
                    com.google.android.material.sidesheet.SheetDelegate r1 = r0.d
                    int r1 = r1.e()
                    int r4 = r4 - r1
                    int r4 = java.lang.Math.abs(r4)
                    if (r5 >= r4) goto L55
                L53:
                    r4 = 3
                    goto L56
                L55:
                    r4 = 5
                L56:
                    r5 = 1
                    r0.A(r3, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.AnonymousClass1.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean tryCaptureView(View view, int i) {
                WeakReference weakReference;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return (sideSheetBehavior.k == 1 || (weakReference = sideSheetBehavior.s) == null || weakReference.get() != view) ? false : true;
            }
        };
    }
}
