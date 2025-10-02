package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.math.MathUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public AppBarLayout.OnOffsetChangedListener A;
    public int B;
    public int C;
    public WindowInsetsCompat D;
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean d;
    public final int e;
    public ViewGroup f;
    public View g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public final Rect m;
    public final CollapsingTextHelper n;
    public final ElevationOverlayProvider o;
    public boolean p;
    public boolean q;
    public Drawable r;
    public Drawable s;
    public int t;
    public boolean u;
    public ValueAnimator v;
    public long w;
    public final TimeInterpolator x;
    public final TimeInterpolator y;
    public int z;

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f14514a;
        public float b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14514a = 0;
            this.b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.p);
            this.f14514a = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void a(int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            CollapsingTextHelper collapsingTextHelper = collapsingToolbarLayout.n;
            collapsingToolbarLayout.B = i;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.D;
            int iK = windowInsetsCompat != null ? windowInsetsCompat.k() : 0;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = collapsingToolbarLayout.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelperB = CollapsingToolbarLayout.b(childAt);
                int i3 = layoutParams.f14514a;
                if (i3 == 1) {
                    viewOffsetHelperB.b(MathUtils.b(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).bottomMargin));
                } else if (i3 == 2) {
                    viewOffsetHelperB.b(Math.round((-i) * layoutParams.b));
                }
            }
            collapsingToolbarLayout.d();
            if (collapsingToolbarLayout.s != null && iK > 0) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                collapsingToolbarLayout.postInvalidateOnAnimation();
            }
            int height = collapsingToolbarLayout.getHeight();
            WeakHashMap weakHashMap2 = ViewCompat.f2488a;
            int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iK;
            float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
            float f = minimumHeight;
            float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f);
            collapsingTextHelper.d = fMin;
            collapsingTextHelper.e = YU.a.a(1.0f, fMin, 0.5f, fMin);
            collapsingTextHelper.f = collapsingToolbarLayout.B + minimumHeight;
            collapsingTextHelper.p(Math.abs(i) / f);
        }
    }

    @RequiresApi
    @RestrictTo
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    public static ViewOffsetHelper b(View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(com.woolworths.R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(com.woolworths.R.id.view_offset_helper, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() throws Resources.NotFoundException {
        ColorStateList colorStateListE = MaterialColors.e(com.woolworths.R.attr.colorSurfaceContainer, getContext());
        if (colorStateListE != null) {
            return colorStateListE.getDefaultColor();
        }
        float dimension = getResources().getDimension(com.woolworths.R.dimen.design_appbar_elevation);
        ElevationOverlayProvider elevationOverlayProvider = this.o;
        return elevationOverlayProvider.a(dimension, elevationOverlayProvider.d);
    }

    public final void a() {
        if (this.d) {
            ViewGroup viewGroup = null;
            this.f = null;
            this.g = null;
            int i = this.e;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.g = view;
                }
            }
            if (this.f == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f = viewGroup;
            }
            c();
            this.d = false;
        }
    }

    public final void c() {
        View view;
        if (!this.p && (view = this.h) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.h);
            }
        }
        if (!this.p || this.f == null) {
            return;
        }
        if (this.h == null) {
            this.h = new View(getContext());
        }
        if (this.h.getParent() == null) {
            this.f.addView(this.h, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        if (this.r == null && this.s == null) {
            return;
        }
        setScrimsShown(getHeight() + this.B < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f == null && (drawable = this.r) != null && this.t > 0) {
            drawable.mutate().setAlpha(this.t);
            this.r.draw(canvas);
        }
        if (this.p && this.q) {
            ViewGroup viewGroup = this.f;
            CollapsingTextHelper collapsingTextHelper = this.n;
            if (viewGroup == null || this.r == null || this.t <= 0 || this.C != 1 || collapsingTextHelper.b >= collapsingTextHelper.e) {
                collapsingTextHelper.d(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.r.getBounds(), Region.Op.DIFFERENCE);
                collapsingTextHelper.d(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.s == null || this.t <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.D;
        int iK = windowInsetsCompat != null ? windowInsetsCompat.k() : 0;
        if (iK > 0) {
            this.s.setBounds(0, -this.B, getWidth(), iK - this.B);
            this.s.mutate().setAlpha(this.t);
            this.s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.r;
        if (drawable == null || this.t <= 0 || ((view2 = this.g) == null || view2 == this ? view != this.f : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.C == 1 && view != null && this.p) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.r.mutate().setAlpha(this.t);
            this.r.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (collapsingTextHelper != null) {
            collapsingTextHelper.R = drawableState;
            ColorStateList colorStateList2 = collapsingTextHelper.o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = collapsingTextHelper.n) != null && colorStateList.isStateful())) {
                collapsingTextHelper.i(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.p || (view = this.h) == null) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.h.getVisibility() == 0;
        this.q = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.g;
            if (view2 == null) {
                view2 = this.f;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view2.getLayoutParams())).bottomMargin;
            View view3 = this.h;
            Rect rect = this.m;
            DescendantOffsetUtils.a(this, view3, rect);
            ViewGroup viewGroup = this.f;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + height + titleMarginTop;
            int i7 = rect.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            int i8 = i7 - titleMarginStart;
            int i9 = (rect.bottom + height) - titleMarginBottom;
            CollapsingTextHelper collapsingTextHelper = this.n;
            Rect rect2 = collapsingTextHelper.h;
            if (rect2.left != i5 || rect2.top != i6 || rect2.right != i8 || rect2.bottom != i9) {
                rect2.set(i5, i6, i8, i9);
                collapsingTextHelper.S = true;
            }
            int i10 = z3 ? this.k : this.i;
            int i11 = rect.top + this.j;
            int i12 = (i3 - i) - (z3 ? this.i : this.k);
            int i13 = (i4 - i2) - this.l;
            Rect rect3 = collapsingTextHelper.g;
            if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                rect3.set(i10, i11, i12, i13);
                collapsingTextHelper.S = true;
            }
            collapsingTextHelper.i(z);
        }
    }

    public final void f() {
        if (this.f != null && this.p && TextUtils.isEmpty(this.n.G)) {
            ViewGroup viewGroup = this.f;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f14514a = 0;
        layoutParams.b = 0.5f;
        return layoutParams;
    }

    public int getCollapsedTitleGravity() {
        return this.n.k;
    }

    public float getCollapsedTitleTextSize() {
        return this.n.m;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.n.w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.r;
    }

    public int getExpandedTitleGravity() {
        return this.n.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.l;
    }

    public int getExpandedTitleMarginEnd() {
        return this.k;
    }

    public int getExpandedTitleMarginStart() {
        return this.i;
    }

    public int getExpandedTitleMarginTop() {
        return this.j;
    }

    public float getExpandedTitleTextSize() {
        return this.n.l;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.n.z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @RequiresApi
    @RestrictTo
    public int getHyphenationFrequency() {
        return this.n.q0;
    }

    @RestrictTo
    public int getLineCount() {
        StaticLayout staticLayout = this.n.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi
    @RestrictTo
    public float getLineSpacingAdd() {
        return this.n.i0.getSpacingAdd();
    }

    @RequiresApi
    @RestrictTo
    public float getLineSpacingMultiplier() {
        return this.n.i0.getSpacingMultiplier();
    }

    @RestrictTo
    public int getMaxLines() {
        return this.n.n0;
    }

    public int getScrimAlpha() {
        return this.t;
    }

    public long getScrimAnimationDuration() {
        return this.w;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.z;
        if (i >= 0) {
            return i + this.E + this.G;
        }
        WindowInsetsCompat windowInsetsCompat = this.D;
        int iK = windowInsetsCompat != null ? windowInsetsCompat.k() : 0;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iK, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.s;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.p) {
            return this.n.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.C;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.n.V;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.n.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.C == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.A == null) {
                this.A = new OffsetUpdateListener();
            }
            appBarLayout.a(this.A);
            ViewCompat.y(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.A;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).k) != null) {
            arrayList.remove(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.D;
        if (windowInsetsCompat != null) {
            int iK = windowInsetsCompat.k();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iK) {
                    childAt.offsetTopAndBottom(iK);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            ViewOffsetHelper viewOffsetHelperB = b(getChildAt(i6));
            View view = viewOffsetHelperB.f14516a;
            viewOffsetHelperB.b = view.getTop();
            viewOffsetHelperB.c = view.getLeft();
        }
        e(i, i2, i3, i4, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            r9.a()
            super.onMeasure(r10, r11)
            int r11 = android.view.View.MeasureSpec.getMode(r11)
            androidx.core.view.WindowInsetsCompat r0 = r9.D
            if (r0 == 0) goto L13
            int r0 = r0.k()
            goto L14
        L13:
            r0 = 0
        L14:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == 0) goto L1c
            boolean r11 = r9.F
            if (r11 == 0) goto L2c
        L1c:
            if (r0 <= 0) goto L2c
            r9.E = r0
            int r11 = r9.getMeasuredHeight()
            int r11 = r11 + r0
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r1)
            super.onMeasure(r10, r11)
        L2c:
            boolean r11 = r9.H
            if (r11 == 0) goto L7f
            com.google.android.material.internal.CollapsingTextHelper r11 = r9.n
            int r0 = r11.n0
            r2 = 1
            if (r0 <= r2) goto L7f
            r9.f()
            int r6 = r9.getMeasuredWidth()
            int r7 = r9.getMeasuredHeight()
            r8 = 1
            r4 = 0
            r5 = 0
            r3 = r9
            r3.e(r4, r5, r6, r7, r8)
            int r0 = r11.p
            if (r0 <= r2) goto L80
            android.text.TextPaint r4 = r11.U
            float r5 = r11.l
            r4.setTextSize(r5)
            android.graphics.Typeface r5 = r11.z
            r4.setTypeface(r5)
            float r11 = r11.g0
            r4.setLetterSpacing(r11)
            float r11 = r4.ascent()
            float r11 = -r11
            float r4 = r4.descent()
            float r4 = r4 + r11
            int r11 = java.lang.Math.round(r4)
            int r0 = r0 - r2
            int r0 = r0 * r11
            r3.G = r0
            int r11 = r9.getMeasuredHeight()
            int r0 = r3.G
            int r11 = r11 + r0
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r1)
            super.onMeasure(r10, r11)
            goto L80
        L7f:
            r3 = r9
        L80:
            android.view.ViewGroup r10 = r3.f
            if (r10 == 0) goto Lc4
            android.view.View r11 = r3.g
            if (r11 == 0) goto La8
            if (r11 != r3) goto L8b
            goto La8
        L8b:
            android.view.ViewGroup$LayoutParams r10 = r11.getLayoutParams()
            boolean r0 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto La0
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            int r11 = r11.getMeasuredHeight()
            int r0 = r10.topMargin
            int r11 = r11 + r0
            int r10 = r10.bottomMargin
            int r11 = r11 + r10
            goto La4
        La0:
            int r11 = r11.getMeasuredHeight()
        La4:
            r9.setMinimumHeight(r11)
            return
        La8:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            boolean r0 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lbd
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r10 = r10.getMeasuredHeight()
            int r0 = r11.topMargin
            int r10 = r10 + r0
            int r11 = r11.bottomMargin
            int r10 = r10 + r11
            goto Lc1
        Lbd:
            int r10 = r10.getMeasuredHeight()
        Lc1:
            r9.setMinimumHeight(r10)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.r;
        if (drawable != null) {
            ViewGroup viewGroup = this.f;
            if (this.C == 1 && viewGroup != null && this.p) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.n.l(i);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.n.k(i);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (collapsingTextHelper.o != colorStateList) {
            collapsingTextHelper.o = colorStateList;
            collapsingTextHelper.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (collapsingTextHelper.m != f) {
            collapsingTextHelper.m = f;
            collapsingTextHelper.i(false);
        }
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (collapsingTextHelper.m(typeface)) {
            collapsingTextHelper.i(false);
        }
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.r = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f;
                if (this.C == 1 && viewGroup != null && this.p) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.r.setCallback(this);
                this.r.setAlpha(this.t);
            }
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@DrawableRes int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (collapsingTextHelper.j != i) {
            collapsingTextHelper.j = i;
            collapsingTextHelper.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.l = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.k = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.j = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.n.n(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (collapsingTextHelper.n != colorStateList) {
            collapsingTextHelper.n = colorStateList;
            collapsingTextHelper.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (collapsingTextHelper.l != f) {
            collapsingTextHelper.l = f;
            collapsingTextHelper.i(false);
        }
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (collapsingTextHelper.o(typeface)) {
            collapsingTextHelper.i(false);
        }
    }

    @RestrictTo
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.H = z;
    }

    @RestrictTo
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.F = z;
    }

    @RequiresApi
    @RestrictTo
    public void setHyphenationFrequency(int i) {
        this.n.q0 = i;
    }

    @RequiresApi
    @RestrictTo
    public void setLineSpacingAdd(float f) {
        this.n.o0 = f;
    }

    @RequiresApi
    @RestrictTo
    public void setLineSpacingMultiplier(@FloatRange float f) {
        this.n.p0 = f;
    }

    @RestrictTo
    public void setMaxLines(int i) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (i != collapsingTextHelper.n0) {
            collapsingTextHelper.n0 = i;
            Bitmap bitmap = collapsingTextHelper.K;
            if (bitmap != null) {
                bitmap.recycle();
                collapsingTextHelper.K = null;
            }
            collapsingTextHelper.i(false);
        }
    }

    @RestrictTo
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.n.J = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.t) {
            if (this.r != null && (viewGroup = this.f) != null) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.t = i;
            WeakHashMap weakHashMap2 = ViewCompat.f2488a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(@IntRange long j) {
        this.w = j;
    }

    public void setScrimVisibleHeightTrigger(@IntRange int i) {
        if (this.z != i) {
            this.z = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.u != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.v = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.t ? this.x : this.y);
                    this.v.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                        }
                    });
                } else if (valueAnimator.isRunning()) {
                    this.v.cancel();
                }
                this.v.setDuration(this.w);
                this.v.setIntValues(this.t, i);
                this.v.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.u = z;
        }
    }

    @RequiresApi
    @RestrictTo
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (collapsingTextHelper.r0 != staticLayoutBuilderConfigurer) {
            collapsingTextHelper.r0 = staticLayoutBuilderConfigurer;
            collapsingTextHelper.i(true);
        }
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.s = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.s.setState(getDrawableState());
                }
                Drawable drawable3 = this.s;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.s.setVisible(getVisibility() == 0, false);
                this.s.setCallback(this);
                this.s.setAlpha(this.t);
            }
            WeakHashMap weakHashMap2 = ViewCompat.f2488a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        if (charSequence == null || !TextUtils.equals(collapsingTextHelper.G, charSequence)) {
            collapsingTextHelper.G = charSequence;
            collapsingTextHelper.H = null;
            Bitmap bitmap = collapsingTextHelper.K;
            if (bitmap != null) {
                bitmap.recycle();
                collapsingTextHelper.K = null;
            }
            collapsingTextHelper.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.C = i;
        boolean z = i == 1;
        this.n.c = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.C == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.r == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        collapsingTextHelper.F = truncateAt;
        collapsingTextHelper.i(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.p) {
            this.p = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        CollapsingTextHelper collapsingTextHelper = this.n;
        collapsingTextHelper.V = timeInterpolator;
        collapsingTextHelper.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.s;
        if (drawable != null && drawable.isVisible() != z) {
            this.s.setVisible(z, false);
        }
        Drawable drawable2 = this.r;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.r.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r || drawable == this.s;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList colorStateListA;
        ColorStateList colorStateListA2;
        TextUtils.TruncateAt truncateAt;
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132083881), attributeSet, i);
        this.d = true;
        this.m = new Rect();
        this.z = -1;
        this.E = 0;
        this.G = 0;
        Context context2 = getContext();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.n = collapsingTextHelper;
        collapsingTextHelper.W = AnimationUtils.e;
        collapsingTextHelper.i(false);
        collapsingTextHelper.J = false;
        this.o = new ElevationOverlayProvider(context2);
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, R.styleable.o, i, 2132083881, new int[0]);
        int i3 = typedArrayD.getInt(4, 8388691);
        if (collapsingTextHelper.j != i3) {
            collapsingTextHelper.j = i3;
            collapsingTextHelper.i(false);
        }
        collapsingTextHelper.l(typedArrayD.getInt(0, 8388627));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(5, 0);
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        this.i = dimensionPixelSize;
        if (typedArrayD.hasValue(8)) {
            this.i = typedArrayD.getDimensionPixelSize(8, 0);
        }
        if (typedArrayD.hasValue(7)) {
            this.k = typedArrayD.getDimensionPixelSize(7, 0);
        }
        if (typedArrayD.hasValue(9)) {
            this.j = typedArrayD.getDimensionPixelSize(9, 0);
        }
        if (typedArrayD.hasValue(6)) {
            this.l = typedArrayD.getDimensionPixelSize(6, 0);
        }
        this.p = typedArrayD.getBoolean(20, true);
        setTitle(typedArrayD.getText(18));
        collapsingTextHelper.n(2132083427);
        collapsingTextHelper.k(2132083386);
        if (typedArrayD.hasValue(10)) {
            collapsingTextHelper.n(typedArrayD.getResourceId(10, 0));
        }
        if (typedArrayD.hasValue(1)) {
            collapsingTextHelper.k(typedArrayD.getResourceId(1, 0));
        }
        if (typedArrayD.hasValue(22)) {
            int i4 = typedArrayD.getInt(22, -1);
            if (i4 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i4 == 1) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else if (i4 != 3) {
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                truncateAt = TextUtils.TruncateAt.MARQUEE;
            }
            setTitleEllipsize(truncateAt);
        }
        if (typedArrayD.hasValue(11) && collapsingTextHelper.n != (colorStateListA2 = MaterialResources.a(context2, typedArrayD, 11))) {
            collapsingTextHelper.n = colorStateListA2;
            collapsingTextHelper.i(false);
        }
        if (typedArrayD.hasValue(2) && collapsingTextHelper.o != (colorStateListA = MaterialResources.a(context2, typedArrayD, 2))) {
            collapsingTextHelper.o = colorStateListA;
            collapsingTextHelper.i(false);
        }
        this.z = typedArrayD.getDimensionPixelSize(16, -1);
        if (typedArrayD.hasValue(14) && (i2 = typedArrayD.getInt(14, 1)) != collapsingTextHelper.n0) {
            collapsingTextHelper.n0 = i2;
            Bitmap bitmap = collapsingTextHelper.K;
            if (bitmap != null) {
                bitmap.recycle();
                collapsingTextHelper.K = null;
            }
            collapsingTextHelper.i(false);
        }
        if (typedArrayD.hasValue(21)) {
            collapsingTextHelper.V = android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayD.getResourceId(21, 0));
            collapsingTextHelper.i(false);
        }
        this.w = typedArrayD.getInt(15, 600);
        this.x = MotionUtils.d(context2, com.woolworths.R.attr.motionEasingStandardInterpolator, AnimationUtils.c);
        this.y = MotionUtils.d(context2, com.woolworths.R.attr.motionEasingStandardInterpolator, AnimationUtils.d);
        setContentScrim(typedArrayD.getDrawable(3));
        setStatusBarScrim(typedArrayD.getDrawable(17));
        setTitleCollapseMode(typedArrayD.getInt(19, 0));
        this.e = typedArrayD.getResourceId(23, -1);
        this.F = typedArrayD.getBoolean(13, false);
        this.H = typedArrayD.getBoolean(12, false);
        typedArrayD.recycle();
        setWillNotDraw(false);
        ViewCompat.I(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                WindowInsetsCompat windowInsetsCompat2 = collapsingToolbarLayout.getFitsSystemWindows() ? windowInsetsCompat : null;
                if (!Objects.equals(collapsingToolbarLayout.D, windowInsetsCompat2)) {
                    collapsingToolbarLayout.D = windowInsetsCompat2;
                    collapsingToolbarLayout.requestLayout();
                }
                return windowInsetsCompat.c();
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.f14514a = 0;
        layoutParams2.b = 0.5f;
        return layoutParams2;
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f14514a = 0;
        layoutParams.b = 0.5f;
        return layoutParams;
    }
}
