package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, ExpandableTransformationWidget, Shapeable, CoordinatorLayout.AttachedBehavior {
    public ColorStateList e;
    public PorterDuff.Mode f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public ColorStateList i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public final Rect o;
    public final Rect p;
    public final AppCompatImageHelper q;
    public final ExpandableWidgetHelper r;
    public FloatingActionButtonImplLollipop s;

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$1, reason: invalid class name */
    class AnonymousClass1 implements FloatingActionButtonImpl.InternalVisibilityChangedListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnVisibilityChangedListener f14585a;

        public AnonymousClass1(OnVisibilityChangedListener onVisibilityChangedListener) {
            this.f14585a = onVisibilityChangedListener;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
        public final void a() {
            this.f14585a.b();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
        public final void b() {
            this.f14585a.a(FloatingActionButton.this);
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class OnVisibilityChangedListener {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    public class ShadowDelegateImpl implements ShadowViewDelegate {
        public ShadowDelegateImpl() {
        }

        public final void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Size {
    }

    public class TransformationCallbackWrapper<T extends FloatingActionButton> implements FloatingActionButtonImpl.InternalTransformationCallback {

        /* renamed from: a, reason: collision with root package name */
        public final TransformationCallback f14587a;

        public TransformationCallbackWrapper(TransformationCallback transformationCallback) {
            this.f14587a = transformationCallback;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public final void a() {
            this.f14587a.a(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public final void b() {
            this.f14587a.b(FloatingActionButton.this);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof TransformationCallbackWrapper) && ((TransformationCallbackWrapper) obj).f14587a.equals(this.f14587a);
        }

        public final int hashCode() {
            return this.f14587a.hashCode();
        }
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    private FloatingActionButtonImpl getImpl() {
        if (this.s == null) {
            this.s = new FloatingActionButtonImplLollipop(this, new ShadowDelegateImpl());
        }
        return this.s;
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public final boolean a() {
        return this.r.b;
    }

    public final void d(Animator.AnimatorListener animatorListener) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.u == null) {
            impl.u = new ArrayList();
        }
        impl.u.add(animatorListener);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().k(getDrawableState());
    }

    public final void e(Animator.AnimatorListener animatorListener) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.t == null) {
            impl.t = new ArrayList();
        }
        impl.t.add(animatorListener);
    }

    public final void f(TransformationCallback transformationCallback) {
        FloatingActionButtonImpl impl = getImpl();
        TransformationCallbackWrapper transformationCallbackWrapper = new TransformationCallbackWrapper(transformationCallback);
        if (impl.v == null) {
            impl.v = new ArrayList();
        }
        impl.v.add(transformationCallbackWrapper);
    }

    public final int g(int i) {
        int i2 = this.k;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().f();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().e;
    }

    @Px
    public int getCustomSize() {
        return this.k;
    }

    public int getExpandedComponentIdHint() {
        return this.r.c;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return getImpl().o;
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.i;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.i;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        ShapeAppearanceModel shapeAppearanceModel = getImpl().f14588a;
        shapeAppearanceModel.getClass();
        return shapeAppearanceModel;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.j;
    }

    public int getSizeDimension() {
        return g(this.j);
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.g;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.h;
    }

    public boolean getUseCompatPadding() {
        return this.n;
    }

    public final void h(OnVisibilityChangedListener onVisibilityChangedListener, final boolean z) {
        final FloatingActionButtonImpl impl = getImpl();
        final AnonymousClass1 anonymousClass1 = onVisibilityChangedListener == null ? null : new AnonymousClass1(onVisibilityChangedListener);
        FloatingActionButton floatingActionButton = impl.w;
        FloatingActionButton floatingActionButton2 = impl.w;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.s == 1) {
                return;
            }
        } else if (impl.s != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.b(z ? 8 : 4, z);
            if (anonymousClass1 != null) {
                anonymousClass1.b();
                return;
            }
            return;
        }
        MotionSpec motionSpec = impl.o;
        AnimatorSet animatorSetB = motionSpec != null ? impl.b(motionSpec, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) : impl.c(BitmapDescriptorFactory.HUE_RED, 0.4f, 0.4f, FloatingActionButtonImpl.G, FloatingActionButtonImpl.H);
        animatorSetB.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1
            public boolean d;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator2) {
                this.d = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.s = 0;
                floatingActionButtonImpl.m = null;
                if (this.d) {
                    return;
                }
                FloatingActionButton floatingActionButton3 = floatingActionButtonImpl.w;
                boolean z2 = z;
                floatingActionButton3.b(z2 ? 8 : 4, z2);
                InternalVisibilityChangedListener internalVisibilityChangedListener = anonymousClass1;
                if (internalVisibilityChangedListener != null) {
                    internalVisibilityChangedListener.b();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.w.b(0, z);
                floatingActionButtonImpl.s = 1;
                floatingActionButtonImpl.m = animator2;
                this.d = false;
            }
        });
        ArrayList arrayList = impl.u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetB.start();
    }

    public final boolean i() {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.w.getVisibility() == 0) {
            if (impl.s != 1) {
                return false;
            }
        } else if (impl.s == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.w.getVisibility() != 0) {
            if (impl.s != 2) {
                return false;
            }
        } else if (impl.s == 1) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().i();
    }

    public final void k(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.o;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.h;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.c(colorForState, mode));
    }

    public final void m(OnVisibilityChangedListener onVisibilityChangedListener, final boolean z) {
        final FloatingActionButtonImpl impl = getImpl();
        final AnonymousClass1 anonymousClass1 = onVisibilityChangedListener == null ? null : new AnonymousClass1(onVisibilityChangedListener);
        FloatingActionButton floatingActionButton = impl.w;
        Matrix matrix = impl.B;
        FloatingActionButton floatingActionButton2 = impl.w;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.s == 2) {
                return;
            }
        } else if (impl.s != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.n == null;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.b(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.q = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (anonymousClass1 != null) {
                anonymousClass1.a();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            float f = BitmapDescriptorFactory.HUE_RED;
            floatingActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            if (z2) {
                f = 0.4f;
            }
            impl.q = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        MotionSpec motionSpec = impl.n;
        AnimatorSet animatorSetB = motionSpec != null ? impl.b(motionSpec, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, FloatingActionButtonImpl.E, FloatingActionButtonImpl.F);
        animatorSetB.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.s = 0;
                floatingActionButtonImpl.m = null;
                InternalVisibilityChangedListener internalVisibilityChangedListener = anonymousClass1;
                if (internalVisibilityChangedListener != null) {
                    internalVisibilityChangedListener.a();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.w.b(0, z);
                floatingActionButtonImpl.s = 2;
                floatingActionButtonImpl.m = animator2;
            }
        });
        ArrayList arrayList = impl.t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final FloatingActionButtonImpl impl = getImpl();
        FloatingActionButton floatingActionButton = impl.w;
        MaterialShapeDrawable materialShapeDrawable = impl.b;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.c(floatingActionButton, materialShapeDrawable);
        }
        if (impl instanceof FloatingActionButtonImplLollipop) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.C == null) {
            impl.C = new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.6
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                    float rotation = floatingActionButtonImpl.w.getRotation();
                    if (floatingActionButtonImpl.p == rotation) {
                        return true;
                    }
                    floatingActionButtonImpl.p = rotation;
                    floatingActionButtonImpl.q();
                    return true;
                }
            };
        }
        viewTreeObserver.addOnPreDrawListener(impl.C);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FloatingActionButtonImpl impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.C = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.l = (sizeDimension - this.m) / 2;
        getImpl().r();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.o;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.d);
        Bundle bundle = (Bundle) extendableSavedState.f.get("expandableWidgetHelper");
        bundle.getClass();
        ExpandableWidgetHelper expandableWidgetHelper = this.r;
        expandableWidgetHelper.getClass();
        expandableWidgetHelper.b = bundle.getBoolean("expanded", false);
        expandableWidgetHelper.c = bundle.getInt("expandedComponentIdHint", 0);
        if (expandableWidgetHelper.b) {
            FloatingActionButton floatingActionButton = expandableWidgetHelper.f14575a;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).g(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        ExpandableWidgetHelper expandableWidgetHelper = this.r;
        expandableWidgetHelper.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", expandableWidgetHelper.b);
        bundle.putInt("expandedComponentIdHint", expandableWidgetHelper.c);
        extendableSavedState.f.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.p;
            rect.set(0, 0, measuredWidth, measuredHeight);
            k(rect);
            FloatingActionButtonImplLollipop floatingActionButtonImplLollipop = this.s;
            int i = -(floatingActionButtonImplLollipop.f ? Math.max((floatingActionButtonImplLollipop.k - floatingActionButtonImplLollipop.w.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            FloatingActionButtonImpl impl = getImpl();
            MaterialShapeDrawable materialShapeDrawable = impl.b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintList(colorStateList);
            }
            BorderDrawable borderDrawable = impl.d;
            if (borderDrawable != null) {
                if (colorStateList != null) {
                    borderDrawable.m = colorStateList.getColorForState(borderDrawable.getState(), borderDrawable.m);
                }
                borderDrawable.p = colorStateList;
                borderDrawable.n = true;
                borderDrawable.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            MaterialShapeDrawable materialShapeDrawable = getImpl().b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.l(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(@DimenRes int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.l(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.l(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.k) {
            this.k = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = getImpl().b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.l(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.r.c = i;
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        getImpl().o = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(MotionSpec.b(i, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            FloatingActionButtonImpl impl = getImpl();
            float f = impl.q;
            impl.q = f;
            Matrix matrix = impl.B;
            impl.a(f, matrix);
            impl.w.setImageMatrix(matrix);
            if (this.g != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        this.q.c(i);
        l();
    }

    public void setMaxImageSize(int i) {
        this.m = i;
        FloatingActionButtonImpl impl = getImpl();
        if (impl.r != i) {
            impl.r = i;
            float f = impl.q;
            impl.q = f;
            Matrix matrix = impl.B;
            impl.a(f, matrix);
            impl.w.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(@ColorInt int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList arrayList = getImpl().v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((FloatingActionButtonImpl.InternalTransformationCallback) it.next()).a();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList arrayList = getImpl().v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((FloatingActionButtonImpl.InternalTransformationCallback) it.next()).a();
            }
        }
    }

    @RestrictTo
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z) {
        FloatingActionButtonImpl impl = getImpl();
        impl.g = z;
        impl.r();
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().o(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        getImpl().n = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(MotionSpec.b(i, getContext()));
    }

    public void setSize(int i) {
        this.k = 0;
        if (i != this.j) {
            this.j = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.n != z) {
            this.n = z;
            getImpl().j();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            getImpl().n(this.i);
        }
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132083882), attributeSet, i);
        this.o = new Rect();
        this.p = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.s, i, 2132083882, new int[0]);
        this.e = MaterialResources.a(context2, typedArrayD, 1);
        this.f = ViewUtils.i(typedArrayD.getInt(2, -1), null);
        this.i = MaterialResources.a(context2, typedArrayD, 12);
        this.j = typedArrayD.getInt(7, -1);
        this.k = typedArrayD.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(3, 0);
        float dimension = typedArrayD.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = typedArrayD.getDimension(9, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = typedArrayD.getDimension(11, BitmapDescriptorFactory.HUE_RED);
        this.n = typedArrayD.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayD.getDimensionPixelSize(10, 0));
        MotionSpec motionSpecA = MotionSpec.a(context2, typedArrayD, 15);
        MotionSpec motionSpecA2 = MotionSpec.a(context2, typedArrayD, 8);
        ShapeAppearanceModel shapeAppearanceModelA = ShapeAppearanceModel.c(context2, attributeSet, i, 2132083882, ShapeAppearanceModel.m).a();
        boolean z = typedArrayD.getBoolean(5, false);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.q = appCompatImageHelper;
        appCompatImageHelper.b(attributeSet, i);
        this.r = new ExpandableWidgetHelper(this);
        getImpl().o(shapeAppearanceModelA);
        getImpl().h(this.e, this.f, this.i, dimensionPixelSize);
        getImpl().k = dimensionPixelSize2;
        FloatingActionButtonImpl impl = getImpl();
        if (impl.h != dimension) {
            impl.h = dimension;
            impl.l(dimension, impl.i, impl.j);
        }
        FloatingActionButtonImpl impl2 = getImpl();
        if (impl2.i != dimension2) {
            impl2.i = dimension2;
            impl2.l(impl2.h, dimension2, impl2.j);
        }
        FloatingActionButtonImpl impl3 = getImpl();
        if (impl3.j != dimension3) {
            impl3.j = dimension3;
            impl3.l(impl3.h, impl3.i, dimension3);
        }
        getImpl().n = motionSpecA;
        getImpl().o = motionSpecA2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        public Rect d;
        public final boolean e;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.t);
            this.e = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean g(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.o;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void i(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.h == 0) {
                layoutParams.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                y(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f2382a instanceof BottomSheetBehavior : false) {
                    z(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListM = coordinatorLayout.m(floatingActionButton);
            int size = arrayListM.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayListM.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f2382a instanceof BottomSheetBehavior : false) && z(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (y(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.v(i, floatingActionButton);
            Rect rect = floatingActionButton.o;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (!this.e || layoutParams.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.d == null) {
                this.d = new Rect();
            }
            Rect rect = this.d;
            DescendantOffsetUtils.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public final boolean z(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (!this.e || layoutParams.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public BaseBehavior() {
            this.e = true;
        }
    }
}
