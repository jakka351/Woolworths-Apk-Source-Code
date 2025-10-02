package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;

/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {
    public androidx.constraintlayout.core.widgets.Flow o;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.o = new androidx.constraintlayout.core.widgets.Flow();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.o.a1 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    androidx.constraintlayout.core.widgets.Flow flow = this.o;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    flow.x0 = dimensionPixelSize;
                    flow.y0 = dimensionPixelSize;
                    flow.z0 = dimensionPixelSize;
                    flow.A0 = dimensionPixelSize;
                } else if (index == 18) {
                    androidx.constraintlayout.core.widgets.Flow flow2 = this.o;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    flow2.z0 = dimensionPixelSize2;
                    flow2.B0 = dimensionPixelSize2;
                    flow2.C0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.o.A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.o.B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.o.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.o.C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.o.y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.o.Y0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.o.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.o.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.o.K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.o.M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.o.L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.o.N0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.o.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.o.Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.o.S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.o.R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.o.T0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.o.P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.o.W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.o.X0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.o.U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.o.V0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.o.Z0 = typedArrayObtainStyledAttributes.getInt(index, -1);
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
        if (helperWidget instanceof androidx.constraintlayout.core.widgets.Flow) {
            androidx.constraintlayout.core.widgets.Flow flow = (androidx.constraintlayout.core.widgets.Flow) helperWidget;
            int i = layoutParams.V;
            if (i != -1) {
                flow.a1 = i;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(ConstraintWidget constraintWidget, boolean z) {
        androidx.constraintlayout.core.widgets.Flow flow = this.o;
        int i = flow.z0;
        if (i > 0 || flow.A0 > 0) {
            if (z) {
                flow.B0 = flow.A0;
                flow.C0 = i;
            } else {
                flow.B0 = i;
                flow.C0 = flow.A0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i, int i2) {
        r(this.o, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void r(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (virtualLayout == null) {
            setMeasuredDimension(0, 0);
        } else {
            virtualLayout.a0(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.E0, virtualLayout.F0);
        }
    }

    public void setFirstHorizontalBias(float f) {
        this.o.Q0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.o.K0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.o.R0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.o.L0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.o.W0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.o.O0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.o.U0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.o.I0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.o.S0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.o.M0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.o.T0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.o.N0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.o.Z0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.o.a1 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        androidx.constraintlayout.core.widgets.Flow flow = this.o;
        flow.x0 = i;
        flow.y0 = i;
        flow.z0 = i;
        flow.A0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.o.y0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.o.B0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.o.C0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.o.x0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.o.X0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.o.P0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.o.V0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.o.J0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.o.Y0 = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
