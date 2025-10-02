package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.d;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    public static final /* synthetic */ int x0 = 0;
    public Integer a0;
    public final MaterialShapeDrawable b0;
    public AnimatorSet c0;
    public AnimatorSet d0;
    public int e0;
    public int f0;
    public int g0;
    public final int h0;
    public int i0;
    public int j0;
    public final boolean k0;
    public boolean l0;
    public final boolean m0;
    public final boolean n0;
    public final boolean o0;
    public boolean p0;
    public boolean q0;
    public Behavior r0;
    public int s0;
    public int t0;
    public int u0;
    public final AnimatorListenerAdapter v0;
    public final TransformationCallback w0;

    public interface AnimationListener {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MenuAlignmentMode {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int f;
        public boolean g;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$1, reason: invalid class name */
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
            this.g = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }

    public static void M(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.d = 17;
        int i = bottomAppBar.g0;
        if (i == 1) {
            layoutParams.d = 49;
        }
        if (i == 0) {
            layoutParams.d |= 80;
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.s0;
    }

    private int getFabAlignmentAnimationDuration() {
        return MotionUtils.c(getContext(), R.attr.motionDurationLong2, nlnlnnn.xxx00780078x0078);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return F(this.e0);
    }

    private float getFabTranslationY() {
        if (this.g0 == 1) {
            return -getTopEdgeTreatment().g;
        }
        return D() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.u0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.t0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.b0.d.f14634a.i;
    }

    public final View D() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) coordinatorLayout.e.b.get(this);
        ArrayList arrayList = coordinatorLayout.g;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int E(ActionMenuView actionMenuView, int i, boolean z) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.j0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean zH = ViewUtils.h(this);
        int measuredWidth = zH ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f89a & 8388615) == 8388611) {
                measuredWidth = zH ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zH ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i3 = zH ? this.t0 : -this.u0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!zH) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i3) + dimensionPixelOffset);
    }

    public final float F(int i) {
        boolean zH = ViewUtils.h(this);
        if (i != 1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        View viewD = D();
        int i2 = zH ? this.u0 : this.t0;
        return ((getMeasuredWidth() / 2) - ((this.i0 == -1 || viewD == null) ? this.h0 + i2 : ((viewD.getMeasuredWidth() / 2) + this.i0) + i2)) * (zH ? -1 : 1);
    }

    public final boolean G() {
        View viewD = D();
        FloatingActionButton floatingActionButton = viewD instanceof FloatingActionButton ? (FloatingActionButton) viewD : null;
        return floatingActionButton != null && floatingActionButton.j();
    }

    public final void H(final int i, final boolean z) {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (!isLaidOut()) {
            this.p0 = false;
            return;
        }
        AnimatorSet animatorSet = this.d0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!G()) {
            i = 0;
            z = false;
        }
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - E(actionMenuView, i, z)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", BitmapDescriptorFactory.HUE_RED);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
                    public boolean d;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        this.d = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (this.d) {
                            return;
                        }
                        BottomAppBar.this.L(actionMenuView, i, z, false);
                    }
                });
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.d0 = animatorSet3;
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i2 = BottomAppBar.x0;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.p0 = false;
                bottomAppBar.d0 = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i2 = BottomAppBar.x0;
            }
        });
        this.d0.start();
    }

    public final void I() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.d0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (G()) {
            L(actionMenuView, this.e0, this.q0, false);
        } else {
            L(actionMenuView, 0, false, false);
        }
    }

    public final void J() {
        getTopEdgeTreatment().h = getFabTranslationX();
        this.b0.n((this.q0 && G() && this.g0 == 1) ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        View viewD = D();
        if (viewD != null) {
            viewD.setTranslationY(getFabTranslationY());
            viewD.setTranslationX(getFabTranslationX());
        }
    }

    public final void K(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().f) {
            getTopEdgeTreatment().f = f;
            this.b0.invalidateSelf();
        }
    }

    public final void L(final ActionMenuView actionMenuView, final int i, final boolean z, boolean z2) {
        Runnable runnable = new Runnable() { // from class: com.google.android.material.bottomappbar.BottomAppBar.8
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                boolean z3 = z;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                actionMenuView.setTranslationX(bottomAppBar.E(r3, i2, z3));
            }
        };
        if (z2) {
            actionMenuView.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.b0.d.e;
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().g;
    }

    public int getFabAlignmentMode() {
        return this.e0;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.i0;
    }

    public int getFabAnchorMode() {
        return this.g0;
    }

    public int getFabAnimationMode() {
        return this.f0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e;
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().d;
    }

    public boolean getHideOnScroll() {
        return this.l0;
    }

    public int getMenuAlignmentMode() {
        return this.j0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.c(this, this.b0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.d0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.c0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            J();
            View viewD = D();
            if (viewD != null) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                if (viewD.isLaidOut()) {
                    viewD.post(new d(2, viewD));
                }
            }
        }
        I();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        this.e0 = savedState.f;
        this.q0 = savedState.g;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f = this.e0;
        savedState.g = this.q0;
        return savedState;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        this.b0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().c(f);
            this.b0.invalidateSelf();
            J();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.b0;
        materialShapeDrawable.l(f);
        int iH = materialShapeDrawable.d.o - materialShapeDrawable.h();
        Behavior behavior = getBehavior();
        behavior.k = iH;
        if (behavior.j == 1) {
            setTranslationY(behavior.i + iH);
        }
    }

    public void setFabAlignmentMode(final int i) {
        this.p0 = true;
        H(i, this.q0);
        if (this.e0 != i) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (isLaidOut()) {
                AnimatorSet animatorSet = this.c0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f0 == 1) {
                    View viewD = D();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewD instanceof FloatingActionButton ? (FloatingActionButton) viewD : null, "translationX", F(i));
                    objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                    arrayList.add(objectAnimatorOfFloat);
                } else {
                    View viewD2 = D();
                    FloatingActionButton floatingActionButton = viewD2 instanceof FloatingActionButton ? (FloatingActionButton) viewD2 : null;
                    if (floatingActionButton != null && !floatingActionButton.i()) {
                        floatingActionButton.h(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5

                            /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$5$1, reason: invalid class name */
                            class AnonymousClass1 extends FloatingActionButton.OnVisibilityChangedListener {
                                @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                                public final void b() {
                                    int i = BottomAppBar.x0;
                                }
                            }

                            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                            public final void a(FloatingActionButton floatingActionButton2) {
                                int i2 = BottomAppBar.x0;
                                floatingActionButton2.setTranslationX(BottomAppBar.this.F(i));
                                floatingActionButton2.m(new AnonymousClass1(), true);
                            }
                        }, true);
                    }
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(arrayList);
                animatorSet2.setInterpolator(MotionUtils.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f14504a));
                this.c0 = animatorSet2;
                animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        int i2 = BottomAppBar.x0;
                        BottomAppBar.this.c0 = null;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        int i2 = BottomAppBar.x0;
                    }
                });
                this.c0.start();
            }
        }
        this.e0 = i;
    }

    public void setFabAlignmentModeEndMargin(@Px int i) {
        if (this.i0 != i) {
            this.i0 = i;
            J();
        }
    }

    public void setFabAnchorMode(int i) {
        this.g0 = i;
        J();
        View viewD = D();
        if (viewD != null) {
            M(this, viewD);
            viewD.requestLayout();
            this.b0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.f0 = i;
    }

    public void setFabCornerSize(@Dimension float f) {
        if (f != getTopEdgeTreatment().i) {
            getTopEdgeTreatment().i = f;
            this.b0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().e = f;
            this.b0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().d = f;
            this.b0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.l0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.j0 != i) {
            this.j0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                L(actionMenuView, this.e0, G(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.a0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.a0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.a0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        if (this.r0 == null) {
            this.r0 = new Behavior();
        }
        return this.r0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect m;
        public WeakReference n;
        public int o;
        public final View.OnLayoutChangeListener p;

        public Behavior() {
            this.p = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Behavior behavior = Behavior.this;
                    Rect rect = behavior.m;
                    BottomAppBar bottomAppBar = (BottomAppBar) behavior.n.get();
                    if (bottomAppBar != null) {
                        int i9 = bottomAppBar.h0;
                        if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                            int height = view.getHeight();
                            if (view instanceof FloatingActionButton) {
                                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                                floatingActionButton.k(rect);
                                int iHeight = rect.height();
                                bottomAppBar.K(iHeight);
                                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().e.a(new RectF(rect)));
                                height = iHeight;
                            }
                            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                            if (behavior.o == 0) {
                                if (bottomAppBar.g0 == 1) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                                }
                                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                                if (ViewUtils.h(view)) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += i9;
                                } else {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += i9;
                                }
                            }
                            int i10 = BottomAppBar.x0;
                            bottomAppBar.J();
                            return;
                        }
                    }
                    view.removeOnLayoutChangeListener(this);
                }
            };
            this.m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
            final BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.n = new WeakReference(bottomAppBar);
            int i2 = BottomAppBar.x0;
            View viewD = bottomAppBar.D();
            if (viewD != null) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                if (!viewD.isLaidOut()) {
                    BottomAppBar.M(bottomAppBar, viewD);
                    this.o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) viewD.getLayoutParams())).bottomMargin;
                    if (viewD instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewD;
                        if (bottomAppBar.g0 == 0 && bottomAppBar.k0) {
                            ViewCompat.F(floatingActionButton, BitmapDescriptorFactory.HUE_RED);
                            floatingActionButton.setCompatElevation(BitmapDescriptorFactory.HUE_RED);
                        }
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.d(bottomAppBar.v0);
                        floatingActionButton.e(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                BottomAppBar bottomAppBar2 = BottomAppBar.this;
                                bottomAppBar2.v0.onAnimationStart(animator);
                                View viewD2 = bottomAppBar2.D();
                                FloatingActionButton floatingActionButton2 = viewD2 instanceof FloatingActionButton ? (FloatingActionButton) viewD2 : null;
                                if (floatingActionButton2 != null) {
                                    floatingActionButton2.setTranslationX(bottomAppBar2.getFabTranslationX());
                                }
                            }
                        });
                        floatingActionButton.f(bottomAppBar.w0);
                    }
                    viewD.addOnLayoutChangeListener(this.p);
                    bottomAppBar.J();
                }
            }
            coordinatorLayout.v(i, bottomAppBar);
            super.n(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.v(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.p = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Behavior behavior = Behavior.this;
                    Rect rect = behavior.m;
                    BottomAppBar bottomAppBar = (BottomAppBar) behavior.n.get();
                    if (bottomAppBar != null) {
                        int i9 = bottomAppBar.h0;
                        if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                            int height = view.getHeight();
                            if (view instanceof FloatingActionButton) {
                                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                                floatingActionButton.k(rect);
                                int iHeight = rect.height();
                                bottomAppBar.K(iHeight);
                                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().e.a(new RectF(rect)));
                                height = iHeight;
                            }
                            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                            if (behavior.o == 0) {
                                if (bottomAppBar.g0 == 1) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                                }
                                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                                if (ViewUtils.h(view)) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += i9;
                                } else {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += i9;
                                }
                            }
                            int i10 = BottomAppBar.x0;
                            bottomAppBar.J();
                            return;
                        }
                    }
                    view.removeOnLayoutChangeListener(this);
                }
            };
            this.m = new Rect();
        }
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084074), attributeSet, i);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.b0 = materialShapeDrawable;
        this.p0 = false;
        this.q0 = true;
        this.v0 = new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                if (bottomAppBar.p0) {
                    return;
                }
                bottomAppBar.H(bottomAppBar.e0, bottomAppBar.q0);
            }
        };
        this.w0 = new TransformationCallback<FloatingActionButton>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.2
            @Override // com.google.android.material.animation.TransformationCallback
            public final void a(View view) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.b0.n((floatingActionButton.getVisibility() == 0 && bottomAppBar.g0 == 1) ? floatingActionButton.getScaleY() : BitmapDescriptorFactory.HUE_RED);
            }

            @Override // com.google.android.material.animation.TransformationCallback
            public final void b(View view) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                int i2 = bottomAppBar.g0;
                MaterialShapeDrawable materialShapeDrawable2 = bottomAppBar.b0;
                if (i2 != 1) {
                    return;
                }
                float translationX = floatingActionButton.getTranslationX();
                if (bottomAppBar.getTopEdgeTreatment().h != translationX) {
                    bottomAppBar.getTopEdgeTreatment().h = translationX;
                    materialShapeDrawable2.invalidateSelf();
                }
                float f = -floatingActionButton.getTranslationY();
                float scaleY = BitmapDescriptorFactory.HUE_RED;
                float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, f);
                if (bottomAppBar.getTopEdgeTreatment().g != fMax) {
                    bottomAppBar.getTopEdgeTreatment().c(fMax);
                    materialShapeDrawable2.invalidateSelf();
                }
                if (floatingActionButton.getVisibility() == 0) {
                    scaleY = floatingActionButton.getScaleY();
                }
                materialShapeDrawable2.n(scaleY);
            }
        };
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.e, i, 2132084074, new int[0]);
        ColorStateList colorStateListA = MaterialResources.a(context2, typedArrayD, 1);
        if (typedArrayD.hasValue(12)) {
            setNavigationIconTint(typedArrayD.getColor(12, -1));
        }
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = typedArrayD.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = typedArrayD.getDimensionPixelOffset(9, 0);
        this.e0 = typedArrayD.getInt(3, 0);
        this.f0 = typedArrayD.getInt(6, 0);
        this.g0 = typedArrayD.getInt(5, 1);
        this.k0 = typedArrayD.getBoolean(16, true);
        this.j0 = typedArrayD.getInt(11, 0);
        this.l0 = typedArrayD.getBoolean(10, false);
        this.m0 = typedArrayD.getBoolean(13, false);
        this.n0 = typedArrayD.getBoolean(14, false);
        this.o0 = typedArrayD.getBoolean(15, false);
        this.i0 = typedArrayD.getDimensionPixelOffset(4, -1);
        boolean z = typedArrayD.getBoolean(0, true);
        typedArrayD.recycle();
        this.h0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = new BottomAppBarTopEdgeTreatment();
        bottomAppBarTopEdgeTreatment.i = -1.0f;
        bottomAppBarTopEdgeTreatment.e = dimensionPixelOffset;
        bottomAppBarTopEdgeTreatment.d = dimensionPixelOffset2;
        bottomAppBarTopEdgeTreatment.c(dimensionPixelOffset3);
        bottomAppBarTopEdgeTreatment.h = BitmapDescriptorFactory.HUE_RED;
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        builder.i = bottomAppBarTopEdgeTreatment;
        materialShapeDrawable.setShapeAppearanceModel(builder.a());
        if (z) {
            materialShapeDrawable.r(2);
        } else {
            materialShapeDrawable.r(1);
            setOutlineAmbientShadowColor(0);
            setOutlineSpotShadowColor(0);
        }
        Paint.Style style = Paint.Style.FILL;
        materialShapeDrawable.o();
        materialShapeDrawable.k(context2);
        setElevation(dimensionPixelSize);
        materialShapeDrawable.setTintList(colorStateListA);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setBackground(materialShapeDrawable);
        ViewUtils.c(this, attributeSet, i, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.3
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                boolean z2;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                if (bottomAppBar.m0) {
                    bottomAppBar.s0 = windowInsetsCompat.h();
                }
                boolean z3 = false;
                if (bottomAppBar.n0) {
                    z2 = bottomAppBar.u0 != windowInsetsCompat.i();
                    bottomAppBar.u0 = windowInsetsCompat.i();
                } else {
                    z2 = false;
                }
                if (bottomAppBar.o0) {
                    boolean z4 = bottomAppBar.t0 != windowInsetsCompat.j();
                    bottomAppBar.t0 = windowInsetsCompat.j();
                    z3 = z4;
                }
                if (!z2 && !z3) {
                    return windowInsetsCompat;
                }
                AnimatorSet animatorSet = bottomAppBar.d0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = bottomAppBar.c0;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                bottomAppBar.J();
                bottomAppBar.I();
                return windowInsetsCompat;
            }
        });
    }
}
