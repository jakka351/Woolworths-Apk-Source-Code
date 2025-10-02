package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes6.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    public int d;

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean h(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (expandableWidget.a()) {
            int i = this.d;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.d != 1) {
            return false;
        }
        this.d = expandableWidget.a() ? 1 : 2;
        y((View) expandableWidget, view, expandableWidget.a(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final ExpandableWidget expandableWidget;
        int i2;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM = coordinatorLayout.m(view);
            int size = arrayListM.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    expandableWidget = null;
                    break;
                }
                View view2 = (View) arrayListM.get(i3);
                if (h(view, view2)) {
                    expandableWidget = (ExpandableWidget) view2;
                    break;
                }
                i3++;
            }
            if (expandableWidget != null) {
                if (!expandableWidget.a() ? this.d == 1 : !((i2 = this.d) != 0 && i2 != 2)) {
                    final int i4 = expandableWidget.a() ? 1 : 2;
                    this.d = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            View view3 = view;
                            view3.getViewTreeObserver().removeOnPreDrawListener(this);
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            if (expandableBehavior.d == i4) {
                                ExpandableWidget expandableWidget2 = expandableWidget;
                                expandableBehavior.y((View) expandableWidget2, view3, expandableWidget2.a(), false);
                            }
                            return false;
                        }
                    });
                }
            }
        }
        return false;
    }

    public abstract void y(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
        this.d = 0;
    }
}
