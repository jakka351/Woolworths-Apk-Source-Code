package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes6.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public ViewOffsetHelper d;
    public int e;

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
    }

    public void A(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.v(i, view);
    }

    public boolean B(int i) {
        ViewOffsetHelper viewOffsetHelper = this.d;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.b(i);
        }
        this.e = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
        A(coordinatorLayout, view, i);
        if (this.d == null) {
            this.d = new ViewOffsetHelper(view);
        }
        ViewOffsetHelper viewOffsetHelper = this.d;
        View view2 = viewOffsetHelper.f14516a;
        viewOffsetHelper.b = view2.getTop();
        viewOffsetHelper.c = view2.getLeft();
        this.d.a();
        int i2 = this.e;
        if (i2 == 0) {
            return true;
        }
        this.d.b(i2);
        this.e = 0;
        return true;
    }

    public int y() {
        ViewOffsetHelper viewOffsetHelper = this.d;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.d;
        }
        return 0;
    }

    public int z() {
        return y();
    }

    public ViewOffsetBehavior() {
        this.e = 0;
    }
}
