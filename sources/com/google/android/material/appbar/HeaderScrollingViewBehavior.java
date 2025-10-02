package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    public final Rect f;
    public final Rect g;
    public int h;
    public int i;

    public HeaderScrollingViewBehavior() {
        this.f = new Rect();
        this.g = new Rect();
        this.h = 0;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final void A(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutC = C(coordinatorLayout.m(view));
        int iB = 0;
        if (appBarLayoutC == null) {
            coordinatorLayout.v(i, view);
            this.h = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int bottom = appBarLayoutC.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int bottom2 = ((appBarLayoutC.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        Rect rect = this.f;
        rect.set(paddingLeft, bottom, width, bottom2);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.i() + rect.left;
                rect.right -= lastWindowInsets.j();
            }
        }
        int i2 = layoutParams.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.g;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        if (this.i != 0) {
            float fD = D(appBarLayoutC);
            int i3 = this.i;
            iB = MathUtils.b((int) (fD * i3), 0, i3);
        }
        view.layout(rect2.left, rect2.top - iB, rect2.right, rect2.bottom - iB);
        this.h = rect2.top - appBarLayoutC.getBottom();
    }

    public abstract AppBarLayout C(ArrayList arrayList);

    public float D(View view) {
        return 1.0f;
    }

    public int E(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutC;
        WindowInsetsCompat lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutC = C(coordinatorLayout.m(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (appBarLayoutC.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.h() + lastWindowInsets.k();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int iE = size + E(appBarLayoutC);
        int measuredHeight = appBarLayoutC.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            iE -= measuredHeight;
        }
        coordinatorLayout.w(i, i2, View.MeasureSpec.makeMeasureSpec(iE, i4 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new Rect();
        this.g = new Rect();
        this.h = 0;
    }
}
