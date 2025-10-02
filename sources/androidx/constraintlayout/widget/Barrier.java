package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;

/* loaded from: classes2.dex */
public class Barrier extends ConstraintHelper {
    public int m;
    public int n;
    public androidx.constraintlayout.core.widgets.Barrier o;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.o.y0;
    }

    public int getMargin() {
        return this.o.z0;
    }

    public int getType() {
        return this.m;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.o = new androidx.constraintlayout.core.widgets.Barrier();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.o.y0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.o.z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.g = this.o;
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(ConstraintSet.Constraint constraint, HelperWidget helperWidget, Constraints.LayoutParams layoutParams, SparseArray sparseArray) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.l(constraint, helperWidget, layoutParams, sparseArray);
        ConstraintSet.Layout layout = constraint.e;
        if (helperWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) helperWidget;
            r(barrier, layout.g0, ((ConstraintWidgetContainer) helperWidget.W).A0);
            barrier.y0 = layout.o0;
            barrier.z0 = layout.h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(ConstraintWidget constraintWidget, boolean z) {
        r(constraintWidget, this.m, z);
    }

    public final void r(ConstraintWidget constraintWidget, int i, boolean z) {
        this.n = i;
        if (z) {
            int i2 = this.m;
            if (i2 == 5) {
                this.n = 1;
            } else if (i2 == 6) {
                this.n = 0;
            }
        } else {
            int i3 = this.m;
            if (i3 == 5) {
                this.n = 0;
            } else if (i3 == 6) {
                this.n = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            ((androidx.constraintlayout.core.widgets.Barrier) constraintWidget).x0 = this.n;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.o.y0 = z;
    }

    public void setDpMargin(int i) {
        this.o.z0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.o.z0 = i;
    }

    public void setType(int i) {
        this.m = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
