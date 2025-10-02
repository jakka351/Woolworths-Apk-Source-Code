package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pools;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

@ViewPager.DecorView
/* loaded from: classes6.dex */
public class TabLayout extends HorizontalScrollView {
    public static final Pools.SynchronizedPool c0 = new Pools.SynchronizedPool(16);
    public final int A;
    public final int B;
    public int C;
    public final int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public TabIndicatorInterpolator L;
    public final TimeInterpolator M;
    public BaseOnTabSelectedListener N;
    public final ArrayList O;
    public ViewPagerOnTabSelectedListener P;
    public ValueAnimator Q;
    public ViewPager R;
    public PagerAdapter S;
    public DataSetObserver T;
    public TabLayoutOnPageChangeListener U;
    public AdapterChangeListener V;
    public boolean W;
    public int a0;
    public final Pools.SimplePool b0;
    public int d;
    public final ArrayList e;
    public Tab f;
    public final SlidingTabIndicator g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public ColorStateList o;
    public ColorStateList p;
    public ColorStateList q;
    public Drawable r;
    public int s;
    public final PorterDuff.Mode t;
    public final float u;
    public final float v;
    public final int w;
    public int x;
    public final int y;
    public final int z;

    public class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14657a;

        public AdapterChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public final void d(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.R == viewPager) {
                tabLayout.m(pagerAdapter2, this.f14657a);
            }
        }
    }

    @Deprecated
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void a(Tab tab);

        void b(Tab tab);

        void c(Tab tab);
    }

    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    public class PagerAdapterObserver extends DataSetObserver {
        public PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.j();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.j();
        }
    }

    public class SlidingTabIndicator extends LinearLayout {
        public static final /* synthetic */ int f = 0;
        public ValueAnimator d;

        public SlidingTabIndicator(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.a0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                TabIndicatorInterpolator tabIndicatorInterpolator = tabLayout.L;
                Drawable drawable = tabLayout.r;
                tabIndicatorInterpolator.getClass();
                RectF rectFA = TabIndicatorInterpolator.a(tabLayout, childAt);
                drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
                tabLayout.d = i;
            }
        }

        public final void b(int i) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.r.getBounds();
            tabLayout.r.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void c(View view, View view2, float f2) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.r;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.r.getBounds().bottom);
            } else {
                tabLayout.L.b(tabLayout, view, view2, f2, tabLayout.r);
            }
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            postInvalidateOnAnimation();
        }

        public final void d(int i, int i2, boolean z) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.d == i) {
                return;
            }
            final View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            final View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.d = i;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    int i3 = SlidingTabIndicator.f;
                    SlidingTabIndicator.this.c(childAt, childAt2, animatedFraction);
                }
            };
            if (!z) {
                this.d.removeAllUpdateListeners();
                this.d.addUpdateListener(animatorUpdateListener);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.d = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.M);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.r.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.r.getIntrinsicHeight();
            }
            int i = tabLayout.E;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.r.getBounds().width() > 0) {
                Rect bounds = tabLayout.r.getBounds();
                tabLayout.r.setBounds(bounds.left, height, bounds.right, iHeight);
                tabLayout.r.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.d;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.d == -1) {
                tabLayout.d = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.d);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.C == 1 || tabLayout.F == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) ViewUtils.d(16, getContext())) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != BitmapDescriptorFactory.HUE_RED) {
                            layoutParams.width = iMax;
                            layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    tabLayout.C = 0;
                    tabLayout.p(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public static class Tab {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f14659a;
        public CharSequence b;
        public CharSequence c;
        public int d;
        public View e;
        public TabLayout f;
        public TabView g;
        public int h;

        public final void a(Drawable drawable) {
            this.f14659a = drawable;
            TabLayout tabLayout = this.f;
            if (tabLayout.C == 1 || tabLayout.F == 2) {
                tabLayout.p(true);
            }
            c();
        }

        public final void b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
                this.g.setContentDescription(charSequence);
            }
            this.b = charSequence;
            c();
        }

        public final void c() {
            TabView tabView = this.g;
            if (tabView != null) {
                tabView.d();
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f14660a;
        public int b;
        public int c;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f14660a = new WeakReference(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void a(int i) {
            Callback.r();
            try {
                TabLayout tabLayout = (TabLayout) this.f14660a.get();
                if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                    int i2 = this.c;
                    tabLayout.l(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.b == 0));
                }
                Callback.s();
            } catch (Throwable th) {
                Callback.s();
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void b(int i) {
            this.b = this.c;
            this.c = i;
            TabLayout tabLayout = (TabLayout) this.f14660a.get();
            if (tabLayout != null) {
                tabLayout.a0 = this.c;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void c(float f, int i, int i2) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f14660a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z2 = true;
                if (i3 != 2 || this.b == 1) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                if (i3 == 2 && this.b == 0) {
                    z = false;
                }
                tabLayout.n(i, f, z2, z, false);
            }
        }
    }

    public final class TabView extends LinearLayout {
        public static final /* synthetic */ int o = 0;
        public Tab d;
        public TextView e;
        public ImageView f;
        public View g;
        public BadgeDrawable h;
        public View i;
        public TextView j;
        public ImageView k;
        public Drawable l;
        public int m;

        public TabView(Context context) {
            super(context);
            this.m = 2;
            e(context);
            int i = TabLayout.this.h;
            int i2 = TabLayout.this.i;
            int i3 = TabLayout.this.j;
            int i4 = TabLayout.this.k;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            setPaddingRelative(i, i2, i3, i4);
            setGravity(17);
            setOrientation(!TabLayout.this.G ? 1 : 0);
            setClickable(true);
            ViewCompat.J(this, new PointerIconCompat(PointerIcon.getSystemIcon(getContext(), 1002)));
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.h;
        }

        @NonNull
        private BadgeDrawable getOrCreateBadge() {
            if (this.h == null) {
                this.h = new BadgeDrawable(getContext(), null);
            }
            b();
            BadgeDrawable badgeDrawable = this.h;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            if (this.h != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.g;
                if (view != null) {
                    BadgeDrawable badgeDrawable = this.h;
                    if (badgeDrawable != null) {
                        if (badgeDrawable.d() != null) {
                            badgeDrawable.d().setForeground(null);
                        } else {
                            view.getOverlay().remove(badgeDrawable);
                        }
                    }
                    this.g = null;
                }
            }
        }

        public final void b() {
            Tab tab;
            if (this.h != null) {
                if (this.i != null) {
                    a();
                    return;
                }
                ImageView imageView = this.f;
                if (imageView != null && (tab = this.d) != null && tab.f14659a != null) {
                    if (this.g == imageView) {
                        c(imageView);
                        return;
                    }
                    a();
                    ImageView imageView2 = this.f;
                    if (this.h == null || imageView2 == null) {
                        return;
                    }
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    BadgeDrawable badgeDrawable = this.h;
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    badgeDrawable.setBounds(rect);
                    badgeDrawable.i(imageView2, null);
                    if (badgeDrawable.d() != null) {
                        badgeDrawable.d().setForeground(badgeDrawable);
                    } else {
                        imageView2.getOverlay().add(badgeDrawable);
                    }
                    this.g = imageView2;
                    return;
                }
                TextView textView = this.e;
                if (textView == null || this.d == null) {
                    a();
                    return;
                }
                if (this.g == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.e;
                if (this.h == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                BadgeDrawable badgeDrawable2 = this.h;
                Rect rect2 = new Rect();
                textView2.getDrawingRect(rect2);
                badgeDrawable2.setBounds(rect2);
                badgeDrawable2.i(textView2, null);
                if (badgeDrawable2.d() != null) {
                    badgeDrawable2.d().setForeground(badgeDrawable2);
                } else {
                    textView2.getOverlay().add(badgeDrawable2);
                }
                this.g = textView2;
            }
        }

        public final void c(View view) {
            BadgeDrawable badgeDrawable = this.h;
            if (badgeDrawable == null || view != this.g) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.i(view, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d() {
            /*
                r3 = this;
                r3.f()
                com.google.android.material.tabs.TabLayout$Tab r0 = r3.d
                if (r0 == 0) goto L20
                com.google.android.material.tabs.TabLayout r1 = r0.f
                if (r1 == 0) goto L18
                int r1 = r1.getSelectedTabPosition()
                r2 = -1
                if (r1 == r2) goto L20
                int r0 = r0.d
                if (r1 != r0) goto L20
                r0 = 1
                goto L21
            L18:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
            L20:
                r0 = 0
            L21:
                r3.setSelected(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.d():void");
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.l;
            if ((drawable == null || !drawable.isStateful()) ? false : this.l.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$TabView] */
        public final void e(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.w;
            if (i != 0) {
                Drawable drawableB = AppCompatResources.b(i, context);
                this.l = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.l.setState(getDrawableState());
                }
            } else {
                this.l = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (tabLayout.q != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = RippleUtils.a(tabLayout.q);
                boolean z = tabLayout.K;
                if (z) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z ? null : gradientDrawable2);
            }
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            setBackground(gradientDrawable);
            tabLayout.invalidate();
        }

        public final void f() {
            int i;
            ViewParent parent;
            Tab tab = this.d;
            View view = tab != null ? tab.e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.i;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.i);
                    }
                    addView(view);
                }
                this.i = view;
                TextView textView = this.e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.j = textView2;
                if (textView2 != null) {
                    this.m = textView2.getMaxLines();
                }
                this.k = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.i;
                if (view3 != null) {
                    removeView(view3);
                    this.i = null;
                }
                this.j = null;
                this.k = null;
            }
            if (this.i == null) {
                if (this.f == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.woolworths.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f = imageView2;
                    addView(imageView2, 0);
                }
                if (this.e == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.woolworths.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.e = textView3;
                    addView(textView3);
                    this.m = this.e.getMaxLines();
                }
                TextView textView4 = this.e;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.l);
                if (!isSelected() || (i = tabLayout.n) == -1) {
                    this.e.setTextAppearance(tabLayout.m);
                } else {
                    this.e.setTextAppearance(i);
                }
                ColorStateList colorStateList = tabLayout.o;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
                g(this.e, this.f, true);
                b();
                final ImageView imageView3 = this.f;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            View view5 = imageView3;
                            if (view5.getVisibility() == 0) {
                                int i10 = TabView.o;
                                TabView.this.c(view5);
                            }
                        }
                    });
                }
                final TextView textView5 = this.e;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            View view5 = textView5;
                            if (view5.getVisibility() == 0) {
                                int i10 = TabView.o;
                                TabView.this.c(view5);
                            }
                        }
                    });
                }
            } else {
                TextView textView6 = this.j;
                if (textView6 != null || this.k != null) {
                    g(textView6, this.k, false);
                }
            }
            if (tab == null || TextUtils.isEmpty(tab.c)) {
                return;
            }
            setContentDescription(tab.c);
        }

        public final void g(TextView textView, ImageView imageView, boolean z) {
            boolean z2;
            Drawable drawable;
            Tab tab = this.d;
            Drawable drawableMutate = (tab == null || (drawable = tab.f14659a) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (drawableMutate != null) {
                drawableMutate.setTintList(tabLayout.p);
                PorterDuff.Mode mode = tabLayout.t;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            Tab tab2 = this.d;
            CharSequence charSequence = tab2 != null ? tab2.b : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (zIsEmpty) {
                    z2 = false;
                } else {
                    this.d.getClass();
                    z2 = true;
                }
                textView.setText(!zIsEmpty ? charSequence : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iD = (z2 && imageView.getVisibility() == 0) ? (int) ViewUtils.d(8, getContext()) : 0;
                if (tabLayout.G) {
                    if (iD != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iD);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iD != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iD;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.d;
            CharSequence charSequence2 = tab3 != null ? tab3.c : null;
            if (zIsEmpty) {
                charSequence = charSequence2;
            }
            TooltipCompat.a(this, charSequence);
        }

        public int getContentHeight() {
            View[] viewArr = {this.e, this.f, this.i};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.e, this.f, this.i};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        @Nullable
        public Tab getTab() {
            return this.d;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) throws Resources.NotFoundException {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.h;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfoCompat.p(this.h.c());
            }
            accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 1, this.d.d, 1, false, isSelected()));
            if (isSelected()) {
                accessibilityNodeInfoCompat.m(false);
                accessibilityNodeInfoCompat.i(AccessibilityNodeInfoCompat.AccessibilityActionCompat.g);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.woolworths.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(tabLayout.x, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.e != null) {
                float f = tabLayout.u;
                int i3 = this.m;
                ImageView imageView = this.f;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.e;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.v;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.e.getTextSize();
                int lineCount = this.e.getLineCount();
                int maxLines = this.e.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (tabLayout.F == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.e.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.e.setTextSize(0, f);
                    this.e.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.d == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            Tab tab = this.d;
            TabLayout tabLayout = tab.f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.l(tab, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.e;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.i;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable Tab tab) {
            if (tab != this.d) {
                this.d = tab;
                d();
            }
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f14662a;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.f14662a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void a(Tab tab) throws Resources.NotFoundException {
            this.f14662a.setCurrentItem(tab.d);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void b(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void c(Tab tab) {
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    @Dimension
    private int getDefaultHeight() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Tab tab = (Tab) arrayList.get(i);
            if (tab != null && tab.f14659a != null && !TextUtils.isEmpty(tab.b)) {
                return !this.G ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.y;
        if (i != -1) {
            return i;
        }
        int i2 = this.F;
        if (i2 == 0 || i2 == 2) {
            return this.A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.g.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        SlidingTabIndicator slidingTabIndicator = this.g;
        int childCount = slidingTabIndicator.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = slidingTabIndicator.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).f();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(BaseOnTabSelectedListener baseOnTabSelectedListener) {
        ArrayList arrayList = this.O;
        if (arrayList.contains(baseOnTabSelectedListener)) {
            return;
        }
        arrayList.add(baseOnTabSelectedListener);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(Tab tab, boolean z) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        if (tab.f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        tab.d = size;
        arrayList.add(size, tab);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((Tab) arrayList.get(i2)).d == this.d) {
                i = i2;
            }
            ((Tab) arrayList.get(i2)).d = i2;
        }
        this.d = i;
        TabView tabView = tab.g;
        tabView.setSelected(false);
        tabView.setActivated(false);
        int i3 = tab.d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.F == 1 && this.C == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
        }
        this.g.addView(tabView, i3, layoutParams);
        if (z) {
            TabLayout tabLayout = tab.f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.l(tab, true);
        }
    }

    public final void c(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        Tab tabI = i();
        CharSequence charSequence = tabItem.d;
        if (charSequence != null) {
            tabI.b(charSequence);
        }
        Drawable drawable = tabItem.e;
        if (drawable != null) {
            tabI.a(drawable);
        }
        int i = tabItem.f;
        if (i != 0) {
            tabI.e = LayoutInflater.from(tabI.g.getContext()).inflate(i, (ViewGroup) tabI.g, false);
            tabI.c();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            tabI.c = tabItem.getContentDescription();
            tabI.c();
        }
        b(tabI, this.e.isEmpty());
    }

    public final void d(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (isLaidOut()) {
                SlidingTabIndicator slidingTabIndicator = this.g;
                int childCount = slidingTabIndicator.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (slidingTabIndicator.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iF = f(BitmapDescriptorFactory.HUE_RED, i);
                if (scrollX != iF) {
                    g();
                    this.Q.setIntValues(scrollX, iF);
                    this.Q.start();
                }
                ValueAnimator valueAnimator = slidingTabIndicator.d;
                if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.d != i) {
                    slidingTabIndicator.d.cancel();
                }
                slidingTabIndicator.d(i, this.D, true);
                return;
            }
        }
        n(i, BitmapDescriptorFactory.HUE_RED, true, true, true);
    }

    public final void e() {
        int i = this.F;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.B - this.h) : 0;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        SlidingTabIndicator slidingTabIndicator = this.g;
        slidingTabIndicator.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.F;
        if (i2 == 0) {
            int i3 = this.C;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                slidingTabIndicator.setGravity(1);
            } else if (i3 == 2) {
            }
            slidingTabIndicator.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.C == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            slidingTabIndicator.setGravity(1);
        }
        p(true);
    }

    public final int f(float f, int i) {
        SlidingTabIndicator slidingTabIndicator;
        View childAt;
        int i2 = this.F;
        if ((i2 != 0 && i2 != 2) || (childAt = (slidingTabIndicator = this.g).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < slidingTabIndicator.getChildCount() ? slidingTabIndicator.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void g() {
        if (this.Q == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.Q = valueAnimator;
            valueAnimator.setInterpolator(this.M);
            this.Q.setDuration(this.D);
            this.Q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        Tab tab = this.f;
        if (tab != null) {
            return tab.d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.e.size();
    }

    public int getTabGravity() {
        return this.C;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.p;
    }

    public int getTabIndicatorAnimationMode() {
        return this.J;
    }

    public int getTabIndicatorGravity() {
        return this.E;
    }

    public int getTabMaxWidth() {
        return this.x;
    }

    public int getTabMode() {
        return this.F;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.q;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.r;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.o;
    }

    public final Tab h(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (Tab) this.e.get(i);
    }

    public final Tab i() {
        Tab tab = (Tab) c0.a();
        if (tab == null) {
            tab = new Tab();
            tab.d = -1;
            tab.h = -1;
        }
        tab.f = this;
        Pools.SimplePool simplePool = this.b0;
        TabView tabView = simplePool != null ? (TabView) simplePool.a() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.c)) {
            tabView.setContentDescription(tab.b);
        } else {
            tabView.setContentDescription(tab.c);
        }
        tab.g = tabView;
        int i = tab.h;
        if (i != -1) {
            tabView.setId(i);
        }
        return tab;
    }

    public final void j() {
        int currentItem;
        k();
        PagerAdapter pagerAdapter = this.S;
        if (pagerAdapter != null) {
            int iG = pagerAdapter.g();
            for (int i = 0; i < iG; i++) {
                Tab tabI = i();
                this.S.getClass();
                tabI.b(null);
                b(tabI, false);
            }
            ViewPager viewPager = this.R;
            if (viewPager == null || iG <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            l(h(currentItem), true);
        }
    }

    public final void k() {
        SlidingTabIndicator slidingTabIndicator = this.g;
        int childCount = slidingTabIndicator.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) slidingTabIndicator.getChildAt(childCount);
            slidingTabIndicator.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.b0.b(tabView);
            }
            requestLayout();
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            Tab tab = (Tab) it.next();
            it.remove();
            tab.f = null;
            tab.g = null;
            tab.f14659a = null;
            tab.h = -1;
            tab.b = null;
            tab.c = null;
            tab.d = -1;
            tab.e = null;
            c0.b(tab);
        }
        this.f = null;
    }

    public final void l(Tab tab, boolean z) {
        TabLayout tabLayout;
        Tab tab2 = this.f;
        ArrayList arrayList = this.O;
        if (tab2 == tab) {
            if (tab2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((BaseOnTabSelectedListener) arrayList.get(size)).c(tab);
                }
                d(tab.d);
                return;
            }
            return;
        }
        int i = tab != null ? tab.d : -1;
        if (z) {
            if ((tab2 == null || tab2.d == -1) && i != -1) {
                tabLayout = this;
                tabLayout.n(i, BitmapDescriptorFactory.HUE_RED, true, true, true);
            } else {
                tabLayout = this;
                d(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.f = tab;
        if (tab2 != null && tab2.f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((BaseOnTabSelectedListener) arrayList.get(size2)).b(tab2);
            }
        }
        if (tab != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((BaseOnTabSelectedListener) arrayList.get(size3)).a(tab);
            }
        }
    }

    public final void m(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.S;
        if (pagerAdapter2 != null && (dataSetObserver = this.T) != null) {
            pagerAdapter2.d.unregisterObserver(dataSetObserver);
        }
        this.S = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.T == null) {
                this.T = new PagerAdapterObserver();
            }
            pagerAdapter.d.registerObserver(this.T);
        }
        j();
    }

    public final void n(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            SlidingTabIndicator slidingTabIndicator = this.g;
            if (iRound >= slidingTabIndicator.getChildCount()) {
                return;
            }
            if (z2) {
                TabLayout.this.d = Math.round(f2);
                ValueAnimator valueAnimator = slidingTabIndicator.d;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    slidingTabIndicator.d.cancel();
                }
                slidingTabIndicator.c(slidingTabIndicator.getChildAt(i), slidingTabIndicator.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Q.cancel();
            }
            int iF = f(f, i);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && iF >= scrollX) || (i > getSelectedTabPosition() && iF <= scrollX) || i == getSelectedTabPosition();
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && iF <= scrollX) || (i > getSelectedTabPosition() && iF >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.a0 == 1 || z3) {
                if (i < 0) {
                    iF = 0;
                }
                scrollTo(iF, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void o(ViewPager viewPager, boolean z) {
        TabLayout tabLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.R;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.U;
            if (tabLayoutOnPageChangeListener != null && (arrayList2 = viewPager2.U) != null) {
                arrayList2.remove(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.V;
            if (adapterChangeListener != null && (arrayList = this.R.a0) != null) {
                arrayList.remove(adapterChangeListener);
            }
        }
        ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = this.P;
        if (viewPagerOnTabSelectedListener != null) {
            this.O.remove(viewPagerOnTabSelectedListener);
            this.P = null;
        }
        if (viewPager != null) {
            this.R = viewPager;
            if (this.U == null) {
                this.U = new TabLayoutOnPageChangeListener(this);
            }
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener2 = this.U;
            tabLayoutOnPageChangeListener2.c = 0;
            tabLayoutOnPageChangeListener2.b = 0;
            viewPager.b(tabLayoutOnPageChangeListener2);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener2 = new ViewPagerOnTabSelectedListener(viewPager);
            this.P = viewPagerOnTabSelectedListener2;
            a(viewPagerOnTabSelectedListener2);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                m(adapter, true);
            }
            if (this.V == null) {
                this.V = new AdapterChangeListener();
            }
            AdapterChangeListener adapterChangeListener2 = this.V;
            adapterChangeListener2.f14657a = true;
            if (viewPager.a0 == null) {
                viewPager.a0 = new ArrayList();
            }
            viewPager.a0.add(adapterChangeListener2);
            tabLayout = this;
            tabLayout.n(viewPager.getCurrentItem(), BitmapDescriptorFactory.HUE_RED, true, true, true);
        } else {
            tabLayout = this;
            tabLayout.R = null;
            m(null, false);
        }
        tabLayout.W = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
        if (this.R == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                o((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.W) {
            setupWithViewPager(null);
            this.W = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        int i = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.g;
            if (i >= slidingTabIndicator.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i);
            if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).l) != null) {
                drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.l.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).n(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(1, getTabCount(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.ViewUtils.d(r1, r0)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.z
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.ViewUtils.d(r2, r1)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.x = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.F
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(boolean z) {
        int i = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.g;
            if (i >= slidingTabIndicator.getChildCount()) {
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.F == 1 && this.C == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.b(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        int i = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.g;
            if (i >= slidingTabIndicator.getChildCount()) {
                e();
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                TabView tabView = (TabView) childAt;
                tabView.setOrientation(!TabLayout.this.G ? 1 : 0);
                TextView textView = tabView.j;
                if (textView == null && tabView.k == null) {
                    tabView.g(tabView.e, tabView.f, true);
                } else {
                    tabView.g(textView, tabView.k, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.Q.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.r = drawableMutate;
        int i = this.s;
        if (i != 0) {
            drawableMutate.setTint(i);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.I;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.r.getIntrinsicHeight();
        }
        this.g.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.s = i;
        Drawable drawable = this.r;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        p(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.E != i) {
            this.E = i;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            this.g.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.I = i;
        this.g.b(i);
    }

    public void setTabGravity(int i) {
        if (this.C != i) {
            this.C = i;
            e();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Tab) arrayList.get(i)).c();
            }
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(ContextCompat.c(i, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.J = i;
        if (i == 0) {
            this.L = new TabIndicatorInterpolator();
            return;
        }
        if (i == 1) {
            this.L = new ElasticTabIndicatorInterpolator();
        } else {
            if (i == 2) {
                this.L = new FadeTabIndicatorInterpolator();
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.H = z;
        int i = SlidingTabIndicator.f;
        SlidingTabIndicator slidingTabIndicator = this.g;
        slidingTabIndicator.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        slidingTabIndicator.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.F) {
            this.F = i;
            e();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.q == colorStateList) {
            return;
        }
        this.q = colorStateList;
        int i = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.g;
            if (i >= slidingTabIndicator.getChildCount()) {
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i2 = TabView.o;
                ((TabView) childAt).e(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(ContextCompat.c(i, getContext()));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Tab) arrayList.get(i)).c();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        m(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.K == z) {
            return;
        }
        this.K = z;
        int i = 0;
        while (true) {
            SlidingTabIndicator slidingTabIndicator = this.g;
            if (i >= slidingTabIndicator.getChildCount()) {
                return;
            }
            View childAt = slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i2 = TabView.o;
                ((TabView) childAt).e(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        o(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.N;
        if (baseOnTabSelectedListener2 != null) {
            this.O.remove(baseOnTabSelectedListener2);
        }
        this.N = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            a(baseOnTabSelectedListener);
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132083886), attributeSet, i);
        this.d = -1;
        this.e = new ArrayList();
        this.n = -1;
        this.s = 0;
        this.x = Integer.MAX_VALUE;
        this.I = -1;
        this.O = new ArrayList();
        this.b0 = new Pools.SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        SlidingTabIndicator slidingTabIndicator = new SlidingTabIndicator(context2);
        this.g = slidingTabIndicator;
        super.addView(slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.f0, i, 2132083886, 24);
        ColorStateList colorStateListD = DrawableUtils.d(getBackground());
        if (colorStateListD != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.m(colorStateListD);
            materialShapeDrawable.k(context2);
            materialShapeDrawable.l(ViewCompat.k(this));
            setBackground(materialShapeDrawable);
        }
        setSelectedTabIndicator(MaterialResources.d(context2, typedArrayD, 5));
        setSelectedTabIndicatorColor(typedArrayD.getColor(8, 0));
        slidingTabIndicator.b(typedArrayD.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(9, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(16, 0);
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.h = typedArrayD.getDimensionPixelSize(19, dimensionPixelSize);
        this.i = typedArrayD.getDimensionPixelSize(20, dimensionPixelSize);
        this.j = typedArrayD.getDimensionPixelSize(18, dimensionPixelSize);
        this.k = typedArrayD.getDimensionPixelSize(17, dimensionPixelSize);
        if (MaterialAttributes.b(context2, com.woolworths.R.attr.isMaterial3Theme, false)) {
            this.l = com.woolworths.R.attr.textAppearanceTitleSmall;
        } else {
            this.l = com.woolworths.R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(24, 2132083437);
        this.m = resourceId;
        int[] iArr = androidx.appcompat.R.styleable.z;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.u = dimensionPixelSize2;
            this.o = MaterialResources.a(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(22)) {
                this.n = typedArrayD.getResourceId(22, resourceId);
            }
            int i2 = this.n;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i2 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i2, iArr);
                try {
                    typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListA = MaterialResources.a(context2, typedArrayObtainStyledAttributes, 3);
                    if (colorStateListA != null) {
                        this.o = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()), this.o.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (typedArrayD.hasValue(25)) {
                this.o = MaterialResources.a(context2, typedArrayD, 25);
            }
            if (typedArrayD.hasValue(23)) {
                this.o = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayD.getColor(23, 0), this.o.getDefaultColor()});
            }
            this.p = MaterialResources.a(context2, typedArrayD, 3);
            this.t = ViewUtils.i(typedArrayD.getInt(4, -1), null);
            this.q = MaterialResources.a(context2, typedArrayD, 21);
            this.D = typedArrayD.getInt(6, nlnlnnn.xxx00780078x0078);
            this.M = MotionUtils.d(context2, com.woolworths.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.b);
            this.y = typedArrayD.getDimensionPixelSize(14, -1);
            this.z = typedArrayD.getDimensionPixelSize(13, -1);
            this.w = typedArrayD.getResourceId(0, 0);
            this.B = typedArrayD.getDimensionPixelSize(1, 0);
            this.F = typedArrayD.getInt(15, 1);
            this.C = typedArrayD.getInt(2, 0);
            this.G = typedArrayD.getBoolean(12, false);
            this.K = typedArrayD.getBoolean(26, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.v = resources.getDimensionPixelSize(com.woolworths.R.dimen.design_tab_text_size_2line);
            this.A = resources.getDimensionPixelSize(com.woolworths.R.dimen.design_tab_scrollable_min_width);
            e();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.b(i, getContext()));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
