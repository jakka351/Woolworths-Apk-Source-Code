package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {
    public static final Property I = new AnonymousClass6(Float.class, "width");
    public static final Property J = new AnonymousClass7(Float.class, "height");
    public static final Property K = new AnonymousClass8(Float.class, "paddingStart");
    public static final Property L = new AnonymousClass9(Float.class, "paddingEnd");
    public int A;
    public final ExtendedFloatingActionButtonBehavior B;
    public boolean C;
    public boolean D;
    public boolean E;
    public ColorStateList F;
    public int G;
    public int H;
    public int t;
    public final ChangeSizeStrategy u;
    public final ChangeSizeStrategy v;
    public final ShowStrategy w;
    public final HideStrategy x;
    public final int y;
    public int z;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2, reason: invalid class name */
    class AnonymousClass2 implements Size {
        public AnonymousClass2() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int a() {
            return ExtendedFloatingActionButton.this.A;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int b() {
            return ExtendedFloatingActionButton.this.z;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int getWidth() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return (extendedFloatingActionButton.getMeasuredWidth() - (extendedFloatingActionButton.getCollapsedPadding() * 2)) + extendedFloatingActionButton.z + extendedFloatingActionButton.A;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3, reason: invalid class name */
    class AnonymousClass3 implements Size {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnonymousClass2 f14583a;

        public AnonymousClass3(AnonymousClass2 anonymousClass2) {
            this.f14583a = anonymousClass2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int a() {
            return ExtendedFloatingActionButton.this.A;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int b() {
            return ExtendedFloatingActionButton.this.z;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
            int i = extendedFloatingActionButton2.H;
            if (i != -1) {
                return (i == 0 || i == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i;
            }
            if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
                return extendedFloatingActionButton.getMeasuredHeight();
            }
            View view = (View) extendedFloatingActionButton2.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.height != -2) {
                return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
            }
            return extendedFloatingActionButton.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final ViewGroup.LayoutParams getLayoutParams() {
            int i = ExtendedFloatingActionButton.this.H;
            if (i == 0) {
                i = -2;
            }
            return new ViewGroup.LayoutParams(-1, i);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
        public final int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            boolean z = extendedFloatingActionButton.getParent() instanceof View;
            AnonymousClass2 anonymousClass2 = this.f14583a;
            if (!z) {
                return anonymousClass2.getWidth();
            }
            View view = (View) extendedFloatingActionButton.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.width != -2) {
                return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
            }
            return anonymousClass2.getWidth();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6, reason: invalid class name */
    public class AnonymousClass6 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7, reason: invalid class name */
    public class AnonymousClass7 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$8, reason: invalid class name */
    public class AnonymousClass8 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            int iIntValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            view2.setPaddingRelative(iIntValue, paddingTop, view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$9, reason: invalid class name */
    public class AnonymousClass9 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    public class ChangeSizeStrategy extends BaseMotionStrategy {
        public final Size g;
        public final boolean h;

        public ChangeSizeStrategy(AnimatorTracker animatorTracker, Size size, boolean z) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
            this.g = size;
            this.h = z;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final boolean a() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return this.h == extendedFloatingActionButton.C || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final int b() {
            return this.h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final AnimatorSet c() {
            MotionSpec motionSpec = this.f;
            if (motionSpec == null) {
                if (this.e == null) {
                    this.e = MotionSpec.b(b(), this.f14577a);
                }
                motionSpec = this.e;
                motionSpec.getClass();
            }
            boolean zG = motionSpec.g("width");
            Size size = this.g;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (zG) {
                PropertyValuesHolder[] propertyValuesHolderArrE = motionSpec.e("width");
                propertyValuesHolderArrE[0].setFloatValues(extendedFloatingActionButton.getWidth(), size.getWidth());
                motionSpec.h("width", propertyValuesHolderArrE);
            }
            if (motionSpec.g("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrE2 = motionSpec.e("height");
                propertyValuesHolderArrE2[0].setFloatValues(extendedFloatingActionButton.getHeight(), size.getHeight());
                motionSpec.h("height", propertyValuesHolderArrE2);
            }
            if (motionSpec.g("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrE3 = motionSpec.e("paddingStart");
                PropertyValuesHolder propertyValuesHolder = propertyValuesHolderArrE3[0];
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                propertyValuesHolder.setFloatValues(extendedFloatingActionButton.getPaddingStart(), size.b());
                motionSpec.h("paddingStart", propertyValuesHolderArrE3);
            }
            if (motionSpec.g("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrE4 = motionSpec.e("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolderArrE4[0];
                WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                propertyValuesHolder2.setFloatValues(extendedFloatingActionButton.getPaddingEnd(), size.a());
                motionSpec.h("paddingEnd", propertyValuesHolderArrE4);
            }
            if (motionSpec.g("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrE5 = motionSpec.e("labelOpacity");
                boolean z = this.h;
                propertyValuesHolderArrE5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                motionSpec.h("labelOpacity", propertyValuesHolderArrE5);
            }
            return g(motionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void d() {
            super.d();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.D = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            Size size = this.g;
            layoutParams.width = size.getLayoutParams().width;
            layoutParams.height = size.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final void e() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            boolean z = this.h;
            extendedFloatingActionButton.C = z;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!z) {
                extendedFloatingActionButton.G = layoutParams.width;
                extendedFloatingActionButton.H = layoutParams.height;
            }
            Size size = this.g;
            layoutParams.width = size.getLayoutParams().width;
            layoutParams.height = size.getLayoutParams().height;
            int iB = size.b();
            int paddingTop = extendedFloatingActionButton.getPaddingTop();
            int iA = size.a();
            int paddingBottom = extendedFloatingActionButton.getPaddingBottom();
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            extendedFloatingActionButton.setPaddingRelative(iB, paddingTop, iA, paddingBottom);
            extendedFloatingActionButton.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean z = this.h;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.C = z;
            extendedFloatingActionButton.D = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }
    }

    public class HideStrategy extends BaseMotionStrategy {
        public boolean g;

        public HideStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final boolean a() {
            Property property = ExtendedFloatingActionButton.I;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() == 0) {
                if (extendedFloatingActionButton.t != 1) {
                    return false;
                }
            } else if (extendedFloatingActionButton.t == 2) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final int b() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void d() {
            super.d();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.t = 0;
            if (this.g) {
                return;
            }
            extendedFloatingActionButton.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final void e() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void f() {
            super.f();
            this.g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.g = false;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.t = 1;
        }
    }

    public static abstract class OnChangedCallback {
    }

    public class ShowStrategy extends BaseMotionStrategy {
        public ShowStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final boolean a() {
            Property property = ExtendedFloatingActionButton.I;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() != 0) {
                if (extendedFloatingActionButton.t != 2) {
                    return false;
                }
            } else if (extendedFloatingActionButton.t == 1) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final int b() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void d() {
            super.d();
            ExtendedFloatingActionButton.this.t = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public final void e() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.setAlpha(1.0f);
            extendedFloatingActionButton.setScaleY(1.0f);
            extendedFloatingActionButton.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.t = 2;
        }
    }

    public interface Size {
        int a();

        int b();

        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4, int r5) {
        /*
            r0 = 1
            r1 = 2
            if (r5 == 0) goto L20
            if (r5 == r0) goto L1d
            if (r5 == r1) goto L1a
            r2 = 3
            if (r5 != r2) goto Le
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r2 = r4.v
            goto L22
        Le:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown strategy type: "
            java.lang.String r5 = YU.a.d(r5, r0)
            r4.<init>(r5)
            throw r4
        L1a:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r2 = r4.u
            goto L22
        L1d:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy r2 = r4.x
            goto L22
        L20:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy r2 = r4.w
        L22:
            boolean r3 = r2.a()
            if (r3 == 0) goto L29
            return
        L29:
            java.util.WeakHashMap r3 = androidx.core.view.ViewCompat.f2488a
            boolean r3 = r4.isLaidOut()
            if (r3 != 0) goto L45
            int r3 = r4.getVisibility()
            if (r3 == 0) goto L3c
            int r0 = r4.t
            if (r0 != r1) goto L41
            goto L92
        L3c:
            int r3 = r4.t
            if (r3 == r0) goto L41
            goto L92
        L41:
            boolean r0 = r4.E
            if (r0 == 0) goto L92
        L45:
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L92
            if (r5 != r1) goto L68
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            if (r5 == 0) goto L5c
            int r0 = r5.width
            r4.G = r0
            int r5 = r5.height
            r4.H = r5
            goto L68
        L5c:
            int r5 = r4.getWidth()
            r4.G = r5
            int r5 = r4.getHeight()
            r4.H = r5
        L68:
            r5 = 0
            r4.measure(r5, r5)
            android.animation.AnimatorSet r4 = r2.c()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5 r5 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5
            r5.<init>()
            r4.addListener(r5)
            java.util.ArrayList r5 = r2.c
            java.util.Iterator r5 = r5.iterator()
        L7e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r5.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r4.addListener(r0)
            goto L7e
        L8e:
            r4.start()
            return
        L92:
            r2.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.e(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton, int):void");
    }

    public final void f(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.B;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        int i = this.y;
        if (i >= 0) {
            return i;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    @Nullable
    public MotionSpec getExtendMotionSpec() {
        return this.v.f;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.x.f;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.w.f;
    }

    @Nullable
    public MotionSpec getShrinkMotionSpec() {
        return this.u.f;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.C && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.C = false;
            this.u.e();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.E = z;
    }

    public void setExtendMotionSpec(@Nullable MotionSpec motionSpec) {
        this.v.f = motionSpec;
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i) {
        setExtendMotionSpec(MotionSpec.b(i, getContext()));
    }

    public void setExtended(boolean z) {
        if (this.C == z) {
            return;
        }
        ChangeSizeStrategy changeSizeStrategy = z ? this.v : this.u;
        if (changeSizeStrategy.a()) {
            return;
        }
        changeSizeStrategy.e();
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.x.f = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(MotionSpec.b(i, getContext()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.C || this.D) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        this.z = getPaddingStart();
        this.A = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.C || this.D) {
            return;
        }
        this.z = i;
        this.A = i3;
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.w.f = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(MotionSpec.b(i, getContext()));
    }

    public void setShrinkMotionSpec(@Nullable MotionSpec motionSpec) {
        this.u.f = motionSpec;
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i) {
        setShrinkMotionSpec(MotionSpec.b(i, getContext()));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.F = getTextColors();
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4] */
    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084110), attributeSet, i);
        this.t = 0;
        AnimatorTracker animatorTracker = new AnimatorTracker();
        ShowStrategy showStrategy = new ShowStrategy(animatorTracker);
        this.w = showStrategy;
        HideStrategy hideStrategy = new HideStrategy(animatorTracker);
        this.x = hideStrategy;
        this.C = true;
        this.D = false;
        this.E = false;
        Context context2 = getContext();
        this.B = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.q, i, 2132084110, new int[0]);
        MotionSpec motionSpecA = MotionSpec.a(context2, typedArrayD, 5);
        MotionSpec motionSpecA2 = MotionSpec.a(context2, typedArrayD, 4);
        MotionSpec motionSpecA3 = MotionSpec.a(context2, typedArrayD, 2);
        MotionSpec motionSpecA4 = MotionSpec.a(context2, typedArrayD, 6);
        this.y = typedArrayD.getDimensionPixelSize(0, -1);
        int i2 = typedArrayD.getInt(3, 1);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        this.z = getPaddingStart();
        this.A = getPaddingEnd();
        AnimatorTracker animatorTracker2 = new AnimatorTracker();
        final AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        final ?? anonymousClass3 = new AnonymousClass3(anonymousClass2);
        ?? r3 = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int a() {
                return ExtendedFloatingActionButton.this.A;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int b() {
                return ExtendedFloatingActionButton.this.z;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int getHeight() {
                int i3 = ExtendedFloatingActionButton.this.H;
                return i3 == -1 ? anonymousClass3.getHeight() : (i3 == 0 || i3 == -2) ? ExtendedFloatingActionButton.this.getMeasuredHeight() : i3;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final ViewGroup.LayoutParams getLayoutParams() {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                int i3 = extendedFloatingActionButton.G;
                if (i3 == 0) {
                    i3 = -2;
                }
                int i4 = extendedFloatingActionButton.H;
                return new ViewGroup.LayoutParams(i3, i4 != 0 ? i4 : -2);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int getWidth() {
                int i3 = ExtendedFloatingActionButton.this.G;
                return i3 == -1 ? anonymousClass3.getWidth() : (i3 == 0 || i3 == -2) ? anonymousClass2.getWidth() : i3;
            }
        };
        boolean z = true;
        if (i2 != 1) {
            anonymousClass2 = i2 != 2 ? r3 : anonymousClass3;
            z = true;
        }
        ChangeSizeStrategy changeSizeStrategy = new ChangeSizeStrategy(animatorTracker2, anonymousClass2, z);
        this.v = changeSizeStrategy;
        ChangeSizeStrategy changeSizeStrategy2 = new ChangeSizeStrategy(animatorTracker2, new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int a() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int b() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int getHeight() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final ViewGroup.LayoutParams getLayoutParams() {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public final int getWidth() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }
        }, false);
        this.u = changeSizeStrategy2;
        showStrategy.f = motionSpecA;
        hideStrategy.f = motionSpecA2;
        changeSizeStrategy.f = motionSpecA3;
        changeSizeStrategy2.f = motionSpecA4;
        typedArrayD.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.c(context2, attributeSet, i, 2132084110, ShapeAppearanceModel.m).a());
        this.F = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.F = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        public Rect d;
        public final boolean e;
        public final boolean f;

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.r);
            this.e = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean g(Rect rect, View view) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void i(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.h == 0) {
                layoutParams.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                y(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f2382a instanceof BottomSheetBehavior : false) {
                    z(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListM = coordinatorLayout.m(extendedFloatingActionButton);
            int size = arrayListM.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListM.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f2382a instanceof BottomSheetBehavior : false) && z(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (y(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.v(i, extendedFloatingActionButton);
            return true;
        }

        public final boolean y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.e;
            boolean z2 = this.f;
            if ((!z && !z2) || layoutParams.f != appBarLayout.getId()) {
                return false;
            }
            if (this.d == null) {
                this.d = new Rect();
            }
            Rect rect = this.d;
            DescendantOffsetUtils.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public final boolean z(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.e;
            boolean z2 = this.f;
            if ((!z && !z2) || layoutParams.f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.e = false;
            this.f = true;
        }
    }
}
