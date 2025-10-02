package com.google.android.material.navigationrail;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import com.woolworths.R;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class NavigationRailView extends NavigationBarView {
    public final int j;
    public final View k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;

    public NavigationRailView(@NonNull Context context) {
        this(context, null);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final NavigationBarMenuView a(Context context) {
        return new NavigationRailMenuView(context);
    }

    @Nullable
    public View getHeaderView() {
        return this.k;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            r3 = r2
            com.google.android.material.navigationrail.NavigationRailMenuView r4 = r2.getNavigationRailMenuView()
            int r5 = r3.j
            r6 = 0
            android.view.View r7 = r3.k
            if (r7 == 0) goto L27
            int r7 = r7.getVisibility()
            r0 = 8
            if (r7 == r0) goto L27
            android.view.View r7 = r3.k
            int r7 = r7.getBottom()
            int r7 = r7 + r5
            int r5 = r4.getTop()
            if (r5 >= r7) goto L32
            int r7 = r7 - r5
            r5 = r7
            goto L33
        L27:
            android.widget.FrameLayout$LayoutParams r7 = r4.L
            int r7 = r7.gravity
            r7 = r7 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r7 != r0) goto L32
            goto L33
        L32:
            r5 = r6
        L33:
            if (r5 <= 0) goto L4a
            int r6 = r4.getLeft()
            int r7 = r4.getTop()
            int r7 = r7 + r5
            int r0 = r4.getRight()
            int r1 = r4.getBottom()
            int r1 = r1 + r5
            r4.layout(r6, r7, r0, r1)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigationrail.NavigationRailView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i, i2);
        View view = this.k;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        measureChild(getNavigationRailMenuView(), i, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.k.getMeasuredHeight()) - this.j, Integer.MIN_VALUE));
    }

    public void setItemMinimumHeight(@Px int i) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_NavigationRailView);
        this.l = null;
        this.m = null;
        this.n = null;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        this.j = dimensionPixelSize;
        Context context2 = getContext();
        TintTypedArray tintTypedArrayE = ThemeEnforcement.e(context2, attributeSet, com.google.android.material.R.styleable.Q, i, R.style.Widget_MaterialComponents_NavigationRailView, new int[0]);
        TypedArray typedArray = tintTypedArrayE.b;
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            View view = this.k;
            if (view != null) {
                removeView(view);
                this.k = null;
            }
            this.k = viewInflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = dimensionPixelSize;
            addView(viewInflate, 0, layoutParams);
        }
        setMenuGravity(typedArray.getInt(2, 49));
        if (typedArray.hasValue(1)) {
            setItemMinimumHeight(typedArray.getDimensionPixelSize(1, -1));
        }
        if (typedArray.hasValue(5)) {
            this.l = Boolean.valueOf(typedArray.getBoolean(5, false));
        }
        if (typedArray.hasValue(3)) {
            this.m = Boolean.valueOf(typedArray.getBoolean(3, false));
        }
        if (typedArray.hasValue(4)) {
            this.n = Boolean.valueOf(typedArray.getBoolean(4, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fB = AnimationUtils.b(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f);
        float fC = AnimationUtils.c(fB, getItemPaddingTop(), dimensionPixelOffset);
        float fC2 = AnimationUtils.c(fB, getItemPaddingBottom(), dimensionPixelOffset2);
        setItemPaddingTop(Math.round(fC));
        setItemPaddingBottom(Math.round(fC2));
        tintTypedArrayE.g();
        ViewUtils.b(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final WindowInsetsCompat a(View view2, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                boolean fitsSystemWindows;
                boolean fitsSystemWindows2;
                boolean fitsSystemWindows3;
                Insets insetsE = windowInsetsCompat.e(519);
                NavigationRailView navigationRailView = NavigationRailView.this;
                Boolean bool = navigationRailView.l;
                if (bool != null) {
                    fitsSystemWindows = bool.booleanValue();
                } else {
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    fitsSystemWindows = navigationRailView.getFitsSystemWindows();
                }
                if (fitsSystemWindows) {
                    relativePadding.b += insetsE.b;
                }
                Boolean bool2 = navigationRailView.m;
                if (bool2 != null) {
                    fitsSystemWindows2 = bool2.booleanValue();
                } else {
                    WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                    fitsSystemWindows2 = navigationRailView.getFitsSystemWindows();
                }
                if (fitsSystemWindows2) {
                    relativePadding.d += insetsE.d;
                }
                Boolean bool3 = navigationRailView.n;
                if (bool3 != null) {
                    fitsSystemWindows3 = bool3.booleanValue();
                } else {
                    WeakHashMap weakHashMap3 = ViewCompat.f2488a;
                    fitsSystemWindows3 = navigationRailView.getFitsSystemWindows();
                }
                if (fitsSystemWindows3) {
                    relativePadding.f14609a += ViewUtils.h(view2) ? insetsE.c : insetsE.f2430a;
                }
                int i2 = relativePadding.f14609a;
                int i3 = relativePadding.b;
                int i4 = relativePadding.c;
                int i5 = relativePadding.d;
                WeakHashMap weakHashMap4 = ViewCompat.f2488a;
                view2.setPaddingRelative(i2, i3, i4, i5);
                return windowInsetsCompat;
            }
        });
    }
}
