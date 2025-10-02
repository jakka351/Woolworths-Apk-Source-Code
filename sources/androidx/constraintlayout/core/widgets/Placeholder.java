package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* loaded from: classes2.dex */
public class Placeholder extends VirtualLayout {
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public final void a0(int i, int i2, int i3, int i4) {
        int iV = this.B0 + this.C0;
        int iP = this.x0 + this.y0;
        if (this.w0 > 0) {
            iV += this.v0[0].v();
            iP += this.v0[0].p();
        }
        int iMax = Math.max(this.e0, iV);
        int iMax2 = Math.max(this.f0, iP);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(iMax, i2) : i == 0 ? iMax : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(iMax2, i4) : i3 == 0 ? iMax2 : 0;
        }
        this.E0 = i2;
        this.F0 = i4;
        W(i2);
        R(i4);
        this.D0 = this.w0 > 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void f(LinearSystem linearSystem, boolean z) {
        super.f(linearSystem, z);
        if (this.w0 > 0) {
            ConstraintWidget constraintWidget = this.v0[0];
            constraintWidget.I();
            constraintWidget.h0 = 0.5f;
            constraintWidget.g0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.d;
            constraintWidget.i(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f;
            constraintWidget.i(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.e;
            constraintWidget.i(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.g;
            constraintWidget.i(type4, this, type4, 0);
        }
    }
}
