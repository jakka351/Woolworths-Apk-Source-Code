package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarManager;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a, reason: collision with root package name */
    public final int f14651a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final SnackbarBaseLayout i;
    public final com.google.android.material.snackbar.ContentViewCallback j;
    public int k;
    public Anchor l;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public ArrayList u;
    public final AccessibilityManager v;
    public static final FastOutSlowInInterpolator x = AnimationUtils.b;
    public static final LinearInterpolator y = AnimationUtils.f14504a;
    public static final LinearOutSlowInInterpolator z = AnimationUtils.d;
    public static final int[] B = {R.attr.snackbarStyle};
    public static final String C = "BaseTransientBottomBar";
    public static final Handler A = new Handler(Looper.getMainLooper(), new AnonymousClass1());
    public final Runnable m = new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.2
        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.i == null || (context = baseTransientBottomBar.h) == null) {
                return;
            }
            int iHeight = WindowUtils.a(context).height();
            int[] iArr = new int[2];
            SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.i;
            snackbarBaseLayout.getLocationInWindow(iArr);
            int height = (iHeight - (snackbarBaseLayout.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.i.getTranslationY());
            int i = baseTransientBottomBar.r;
            if (height >= i) {
                baseTransientBottomBar.s = i;
                return;
            }
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.C, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            int i2 = baseTransientBottomBar.r;
            baseTransientBottomBar.s = i2;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (i2 - height) + marginLayoutParams.bottomMargin;
            baseTransientBottomBar.i.requestLayout();
        }
    };
    public final AnonymousClass5 w = new SnackbarManager.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.5
        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public final void a() {
            Handler handler = BaseTransientBottomBar.A;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.SnackbarManager.Callback
        public final void b(int i) {
            Handler handler = BaseTransientBottomBar.A;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$1, reason: invalid class name */
    public class AnonymousClass1 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i = message.what;
            int height = 0;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                final BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                final int i2 = message.arg1;
                SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.i;
                AccessibilityManager accessibilityManager = baseTransientBottomBar.v;
                if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || snackbarBaseLayout.getVisibility() != 0) {
                    baseTransientBottomBar.d(i2);
                    return true;
                }
                if (snackbarBaseLayout.getAnimationMode() == 1) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
                    valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.d);
                    valueAnimatorOfFloat.addUpdateListener(new AnonymousClass11());
                    valueAnimatorOfFloat.setDuration(baseTransientBottomBar.b);
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.10
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            BaseTransientBottomBar.this.d(i2);
                        }
                    });
                    valueAnimatorOfFloat.start();
                    return true;
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar.i;
                int height2 = snackbarBaseLayout2.getHeight();
                ViewGroup.LayoutParams layoutParams = snackbarBaseLayout2.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    height2 += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                valueAnimator.setIntValues(0, height2);
                valueAnimator.setInterpolator(baseTransientBottomBar.e);
                valueAnimator.setDuration(baseTransientBottomBar.c);
                valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.15
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        BaseTransientBottomBar.this.d(i2);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                        baseTransientBottomBar2.j.b(baseTransientBottomBar2.b);
                    }
                });
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.16
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                        FastOutSlowInInterpolator fastOutSlowInInterpolator = BaseTransientBottomBar.x;
                        BaseTransientBottomBar.this.i.setTranslationY(iIntValue);
                    }
                });
                valueAnimator.start();
                return true;
            }
            final BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            SnackbarBaseLayout snackbarBaseLayout3 = baseTransientBottomBar2.i;
            ViewGroup viewGroup = baseTransientBottomBar2.g;
            if (snackbarBaseLayout3.getParent() == null) {
                ViewGroup.LayoutParams layoutParams2 = snackbarBaseLayout3.getLayoutParams();
                if (layoutParams2 instanceof CoordinatorLayout.LayoutParams) {
                    CoordinatorLayout.LayoutParams layoutParams3 = (CoordinatorLayout.LayoutParams) layoutParams2;
                    Behavior behavior = new Behavior();
                    BehaviorDelegate behaviorDelegate = behavior.l;
                    behaviorDelegate.getClass();
                    behaviorDelegate.f14654a = baseTransientBottomBar2.w;
                    behavior.e = new SwipeDismissBehavior.OnDismissListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.7
                        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
                        public final void a(View view) {
                            if (view.getParent() != null) {
                                view.setVisibility(8);
                            }
                            BaseTransientBottomBar.this.b(0);
                        }

                        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
                        public final void b(int i3) {
                            AnonymousClass5 anonymousClass5 = BaseTransientBottomBar.this.w;
                            if (i3 == 0) {
                                SnackbarManager.b().e(anonymousClass5);
                            } else if (i3 == 1 || i3 == 2) {
                                SnackbarManager.b().d(anonymousClass5);
                            }
                        }
                    };
                    layoutParams3.b(behavior);
                    if (baseTransientBottomBar2.c() == null) {
                        layoutParams3.g = 80;
                    }
                }
                snackbarBaseLayout3.n = true;
                viewGroup.addView(snackbarBaseLayout3);
                snackbarBaseLayout3.n = false;
                if (baseTransientBottomBar2.c() != null) {
                    int[] iArr = new int[2];
                    baseTransientBottomBar2.c().getLocationOnScreen(iArr);
                    int i3 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    height = (viewGroup.getHeight() + iArr2[1]) - i3;
                }
                baseTransientBottomBar2.q = height;
                baseTransientBottomBar2.h();
                snackbarBaseLayout3.setVisibility(4);
            }
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (snackbarBaseLayout3.isLaidOut()) {
                baseTransientBottomBar2.g();
                return true;
            }
            baseTransientBottomBar2.t = true;
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$11, reason: invalid class name */
    class AnonymousClass11 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass11() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class Anchor implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        public final WeakReference d;
        public final WeakReference e;

        public Anchor(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.d = new WeakReference(baseTransientBottomBar);
            this.e = new WeakReference(view);
        }

        public final void a() {
            WeakReference weakReference = this.e;
            if (weakReference.get() != null) {
                ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
                View view = (View) weakReference.get();
                if (view != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
            weakReference.clear();
            this.d.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            WeakReference weakReference = this.d;
            if (weakReference.get() == null) {
                a();
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) weakReference.get();
            FastOutSlowInInterpolator fastOutSlowInInterpolator = BaseTransientBottomBar.x;
            baseTransientBottomBar.getClass();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            if (this.d.get() == null) {
                a();
            } else if (view != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (this.d.get() == null) {
                a();
            } else if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AnimationMode {
    }

    public static abstract class BaseCallback<B> {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface DismissEvent {
        }

        public void a(BaseTransientBottomBar baseTransientBottomBar, int i) {
        }

        public void b(BaseTransientBottomBar baseTransientBottomBar) {
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {
        public final BehaviorDelegate l;

        public Behavior() {
            BehaviorDelegate behaviorDelegate = new BehaviorDelegate();
            this.i = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 0.1f), 1.0f);
            this.j = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 0.6f), 1.0f);
            this.h = 0;
            this.l = behaviorDelegate;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            BehaviorDelegate behaviorDelegate = this.l;
            behaviorDelegate.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    SnackbarManager.b().e(behaviorDelegate.f14654a);
                }
            } else if (coordinatorLayout.t(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                SnackbarManager.b().d(behaviorDelegate.f14654a);
            }
            return super.m(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean y(View view) {
            this.l.getClass();
            return view instanceof SnackbarBaseLayout;
        }
    }

    @RestrictTo
    public static class BehaviorDelegate {

        /* renamed from: a, reason: collision with root package name */
        public AnonymousClass5 f14654a;
    }

    @Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @IntRange
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Duration {
    }

    @RestrictTo
    public static class SnackbarBaseLayout extends FrameLayout {
        public static final View.OnTouchListener o = new AnonymousClass1();
        public BaseTransientBottomBar d;
        public final ShapeAppearanceModel e;
        public int f;
        public final float g;
        public final float h;
        public final int i;
        public final int j;
        public ColorStateList k;
        public PorterDuff.Mode l;
        public Rect m;
        public boolean n;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$1, reason: invalid class name */
        public class AnonymousClass1 implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
            GradientDrawable gradientDrawable;
            super(MaterialThemeOverlay.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.c0);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                ViewCompat.F(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
                this.e = ShapeAppearanceModel.d(context2, attributeSet, 0, 0).a();
            }
            this.g = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 4));
            setBackgroundTintMode(ViewUtils.i(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.h = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(o);
            setFocusable(true);
            if (getBackground() == null) {
                int iG = MaterialColors.g(getBackgroundOverlayColorAlpha(), MaterialColors.b(R.attr.colorSurface, this), MaterialColors.b(R.attr.colorOnSurface, this));
                ShapeAppearanceModel shapeAppearanceModel = this.e;
                if (shapeAppearanceModel != null) {
                    FastOutSlowInInterpolator fastOutSlowInInterpolator = BaseTransientBottomBar.x;
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
                    materialShapeDrawable.m(ColorStateList.valueOf(iG));
                    gradientDrawable = materialShapeDrawable;
                } else {
                    Resources resources = getResources();
                    FastOutSlowInInterpolator fastOutSlowInInterpolator2 = BaseTransientBottomBar.x;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(iG);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    gradientDrawable.setTintList(colorStateList);
                }
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                setBackground(gradientDrawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.d = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.h;
        }

        public int getAnimationMode() {
            return this.f;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.g;
        }

        public int getMaxInlineActionWidth() {
            return this.j;
        }

        public int getMaxWidth() {
            return this.i;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.d;
            if (baseTransientBottomBar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = baseTransientBottomBar.i.getRootWindowInsets()) != null) {
                baseTransientBottomBar.r = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                baseTransientBottomBar.h();
            }
            ViewCompat.y(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z;
            super.onDetachedFromWindow();
            final BaseTransientBottomBar baseTransientBottomBar = this.d;
            if (baseTransientBottomBar != null) {
                SnackbarManager snackbarManagerB = SnackbarManager.b();
                AnonymousClass5 anonymousClass5 = baseTransientBottomBar.w;
                synchronized (snackbarManagerB.f14655a) {
                    z = true;
                    if (!snackbarManagerB.c(anonymousClass5)) {
                        SnackbarManager.SnackbarRecord snackbarRecord = snackbarManagerB.d;
                        if (!(snackbarRecord != null && snackbarRecord.f14656a.get() == anonymousClass5)) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    BaseTransientBottomBar.A.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.6
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseTransientBottomBar.this.d(3);
                        }
                    });
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar baseTransientBottomBar = this.d;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.t) {
                return;
            }
            baseTransientBottomBar.g();
            baseTransientBottomBar.t = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int i3 = this.i;
            if (i3 <= 0 || getMeasuredWidth() <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }

        public void setAnimationMode(int i) {
            this.f = i;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.k != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.k);
                drawable.setTintMode(this.l);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.k = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintList(colorStateList);
                drawableMutate.setTintMode(this.l);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.l = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintMode(mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.n || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.m = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar baseTransientBottomBar = this.d;
            if (baseTransientBottomBar != null) {
                FastOutSlowInInterpolator fastOutSlowInInterpolator = BaseTransientBottomBar.x;
                baseTransientBottomBar.h();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : o);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.snackbar.BaseTransientBottomBar$5] */
    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (contentViewCallback == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup;
        this.j = contentViewCallback;
        this.h = context;
        ThemeEnforcement.c(context, ThemeEnforcement.f14606a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(B);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = snackbarBaseLayout.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.e.setTextColor(MaterialColors.g(actionTextColorAlpha, MaterialColors.b(R.attr.colorSurface, snackbarContentLayout), snackbarContentLayout.e.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        snackbarBaseLayout.setAccessibilityLiveRegion(1);
        snackbarBaseLayout.setImportantForAccessibility(1);
        snackbarBaseLayout.setFitsSystemWindows(true);
        ViewCompat.I(snackbarBaseLayout, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                int iH = windowInsetsCompat.h();
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                baseTransientBottomBar.n = iH;
                baseTransientBottomBar.o = windowInsetsCompat.i();
                baseTransientBottomBar.p = windowInsetsCompat.j();
                baseTransientBottomBar.h();
                return windowInsetsCompat;
            }
        });
        ViewCompat.A(snackbarBaseLayout, new AccessibilityDelegateCompat() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.4
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
                this.f2466a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                accessibilityNodeInfoCompat.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean g(View view2, int i, Bundle bundle) {
                if (i != 1048576) {
                    return super.g(view2, i, bundle);
                }
                BaseTransientBottomBar.this.a();
                return true;
            }
        });
        this.v = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = MotionUtils.c(context, R.attr.motionDurationLong2, 250);
        this.f14651a = MotionUtils.c(context, R.attr.motionDurationLong2, 150);
        this.b = MotionUtils.c(context, R.attr.motionDurationMedium1, 75);
        this.d = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, y);
        this.f = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, z);
        this.e = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, x);
    }

    public void a() {
        b(3);
    }

    public final void b(int i) {
        SnackbarManager snackbarManagerB = SnackbarManager.b();
        AnonymousClass5 anonymousClass5 = this.w;
        synchronized (snackbarManagerB.f14655a) {
            try {
                if (snackbarManagerB.c(anonymousClass5)) {
                    snackbarManagerB.a(snackbarManagerB.c, i);
                } else {
                    SnackbarManager.SnackbarRecord snackbarRecord = snackbarManagerB.d;
                    if (snackbarRecord != null && snackbarRecord.f14656a.get() == anonymousClass5) {
                        snackbarManagerB.a(snackbarManagerB.d, i);
                    }
                }
            } finally {
            }
        }
    }

    public final View c() {
        Anchor anchor = this.l;
        if (anchor == null) {
            return null;
        }
        return (View) anchor.e.get();
    }

    public final void d(int i) {
        SnackbarManager snackbarManagerB = SnackbarManager.b();
        AnonymousClass5 anonymousClass5 = this.w;
        synchronized (snackbarManagerB.f14655a) {
            try {
                if (snackbarManagerB.c(anonymousClass5)) {
                    snackbarManagerB.c = null;
                    SnackbarManager.SnackbarRecord snackbarRecord = snackbarManagerB.d;
                    if (snackbarRecord != null && snackbarRecord != null) {
                        snackbarManagerB.c = snackbarRecord;
                        snackbarManagerB.d = null;
                        SnackbarManager.Callback callback = (SnackbarManager.Callback) snackbarRecord.f14656a.get();
                        if (callback != null) {
                            callback.a();
                        } else {
                            snackbarManagerB.c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.u.get(size)).a(this, i);
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void e() {
        SnackbarManager snackbarManagerB = SnackbarManager.b();
        AnonymousClass5 anonymousClass5 = this.w;
        synchronized (snackbarManagerB.f14655a) {
            try {
                if (snackbarManagerB.c(anonymousClass5)) {
                    snackbarManagerB.f(snackbarManagerB.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.u.get(size)).b(this);
            }
        }
    }

    public final void f(View view) {
        Anchor anchor;
        Anchor anchor2 = this.l;
        if (anchor2 != null) {
            anchor2.a();
        }
        if (view == null) {
            anchor = null;
        } else {
            Anchor anchor3 = new Anchor(this, view);
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(anchor3);
            }
            view.addOnAttachStateChangeListener(anchor3);
            anchor = anchor3;
        }
        this.l = anchor;
    }

    public final void g() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        SnackbarBaseLayout snackbarBaseLayout = this.i;
        AccessibilityManager accessibilityManager = this.v;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            snackbarBaseLayout.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.8
                @Override // java.lang.Runnable
                public final void run() {
                    final BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                    SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar.i;
                    if (snackbarBaseLayout2 == null) {
                        return;
                    }
                    if (snackbarBaseLayout2.getParent() != null) {
                        snackbarBaseLayout2.setVisibility(0);
                    }
                    if (snackbarBaseLayout2.getAnimationMode() == 1) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.d);
                        valueAnimatorOfFloat.addUpdateListener(new AnonymousClass11());
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(baseTransientBottomBar.f);
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.12
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                                baseTransientBottomBar2.i.setScaleX(fFloatValue);
                                baseTransientBottomBar2.i.setScaleY(fFloatValue);
                            }
                        });
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(baseTransientBottomBar.f14651a);
                        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.9
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                BaseTransientBottomBar.this.e();
                            }
                        });
                        animatorSet.start();
                        return;
                    }
                    int height = snackbarBaseLayout2.getHeight();
                    ViewGroup.LayoutParams layoutParams = snackbarBaseLayout2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    snackbarBaseLayout2.setTranslationY(height);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(height, 0);
                    valueAnimator.setInterpolator(baseTransientBottomBar.e);
                    valueAnimator.setDuration(baseTransientBottomBar.c);
                    valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.13
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            BaseTransientBottomBar.this.e();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                            com.google.android.material.snackbar.ContentViewCallback contentViewCallback = baseTransientBottomBar2.j;
                            int i = baseTransientBottomBar2.c;
                            int i2 = baseTransientBottomBar2.f14651a;
                            contentViewCallback.a(i - i2, i2);
                        }
                    });
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(height) { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.14
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                            FastOutSlowInInterpolator fastOutSlowInInterpolator = BaseTransientBottomBar.x;
                            BaseTransientBottomBar.this.i.setTranslationY(iIntValue);
                        }
                    });
                    valueAnimator.start();
                }
            });
            return;
        }
        if (snackbarBaseLayout.getParent() != null) {
            snackbarBaseLayout.setVisibility(0);
        }
        e();
    }

    public final void h() {
        SnackbarBaseLayout snackbarBaseLayout = this.i;
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = C;
        if (!z2) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (snackbarBaseLayout.m == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (snackbarBaseLayout.getParent() == null) {
            return;
        }
        int i = c() != null ? this.q : this.n;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = snackbarBaseLayout.m;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.o;
        int i4 = rect.right + this.p;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            snackbarBaseLayout.requestLayout();
        }
        if ((z3 || this.s != this.r) && Build.VERSION.SDK_INT >= 29 && this.r > 0) {
            ViewGroup.LayoutParams layoutParams2 = snackbarBaseLayout.getLayoutParams();
            if ((layoutParams2 instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams2).f2382a instanceof SwipeDismissBehavior)) {
                Runnable runnable = this.m;
                snackbarBaseLayout.removeCallbacks(runnable);
                snackbarBaseLayout.post(runnable);
            }
        }
    }
}
