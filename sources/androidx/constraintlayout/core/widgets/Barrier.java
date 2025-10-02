package androidx.constraintlayout.core.widgets;

import YU.a;
import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Barrier extends HelperWidget {
    public int x0 = 0;
    public boolean y0 = true;
    public int z0 = 0;
    public boolean A0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean F() {
        return this.A0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean G() {
        return this.A0;
    }

    public final boolean a0() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.w0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.v0[i4];
            if ((this.y0 || constraintWidget.g()) && ((((i2 = this.x0) == 0 || i2 == 1) && !constraintWidget.F()) || (((i3 = this.x0) == 2 || i3 == 3) && !constraintWidget.G()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.w0; i5++) {
            ConstraintWidget constraintWidget2 = this.v0[i5];
            if (this.y0 || constraintWidget2.g()) {
                ConstraintAnchor.Type type = ConstraintAnchor.Type.g;
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.e;
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f;
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.d;
                if (!z2) {
                    int i6 = this.x0;
                    if (i6 == 0) {
                        iMax = constraintWidget2.n(type4).d();
                    } else if (i6 == 1) {
                        iMax = constraintWidget2.n(type3).d();
                    } else if (i6 == 2) {
                        iMax = constraintWidget2.n(type2).d();
                    } else if (i6 == 3) {
                        iMax = constraintWidget2.n(type).d();
                    }
                    z2 = true;
                }
                int i7 = this.x0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.n(type4).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.n(type3).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.n(type2).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.n(type).d());
                }
            }
        }
        int i8 = iMax + this.z0;
        int i9 = this.x0;
        if (i9 == 0 || i9 == 1) {
            P(i8, i8);
        } else {
            Q(i8, i8);
        }
        this.A0 = true;
        return true;
    }

    public final int b0() {
        int i = this.x0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void f(LinearSystem linearSystem, boolean z) {
        boolean z2;
        int i;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        ConstraintAnchor constraintAnchor = this.K;
        constraintAnchorArr[0] = constraintAnchor;
        int i2 = 2;
        ConstraintAnchor constraintAnchor2 = this.L;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.M;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.N;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.i = linearSystem.k(constraintAnchor5);
        }
        int i3 = this.x0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i3];
        if (!this.A0) {
            a0();
        }
        if (this.A0) {
            this.A0 = false;
            int i4 = this.x0;
            if (i4 == 0 || i4 == 1) {
                linearSystem.d(constraintAnchor.i, this.b0);
                linearSystem.d(constraintAnchor3.i, this.b0);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    linearSystem.d(constraintAnchor2.i, this.c0);
                    linearSystem.d(constraintAnchor4.i, this.c0);
                    return;
                }
                return;
            }
        }
        for (int i5 = 0; i5 < this.w0; i5++) {
            ConstraintWidget constraintWidget = this.v0[i5];
            if (this.y0 || constraintWidget.g()) {
                int i6 = this.x0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f;
                if (((i6 == 0 || i6 == 1) && constraintWidget.V[0] == dimensionBehaviour && constraintWidget.K.f != null && constraintWidget.M.f != null) || ((i6 == 2 || i6 == 3) && constraintWidget.V[1] == dimensionBehaviour && constraintWidget.L.f != null && constraintWidget.N.f != null)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = constraintAnchor.g() || constraintAnchor3.g();
        boolean z4 = constraintAnchor2.g() || constraintAnchor4.g();
        int i7 = !(!z2 && (((i = this.x0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.w0) {
            ConstraintWidget constraintWidget2 = this.v0[i8];
            if (this.y0 || constraintWidget2.g()) {
                SolverVariable solverVariableK = linearSystem.k(constraintWidget2.S[this.x0]);
                ConstraintAnchor[] constraintAnchorArr2 = constraintWidget2.S;
                int i9 = this.x0;
                ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[i9];
                constraintAnchor7.i = solverVariableK;
                ConstraintAnchor constraintAnchor8 = constraintAnchor7.f;
                int i10 = (constraintAnchor8 == null || constraintAnchor8.d != this) ? 0 : constraintAnchor7.g;
                if (i9 == 0 || i9 == i2) {
                    SolverVariable solverVariable = constraintAnchor6.i;
                    int i11 = this.z0 - i10;
                    ArrayRow arrayRowL = linearSystem.l();
                    SolverVariable solverVariableM = linearSystem.m();
                    solverVariableM.g = 0;
                    arrayRowL.d(solverVariable, solverVariableK, solverVariableM, i11);
                    linearSystem.c(arrayRowL);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor6.i;
                    int i12 = this.z0 + i10;
                    ArrayRow arrayRowL2 = linearSystem.l();
                    SolverVariable solverVariableM2 = linearSystem.m();
                    solverVariableM2.g = 0;
                    arrayRowL2.c(solverVariable2, solverVariableK, solverVariableM2, i12);
                    linearSystem.c(arrayRowL2);
                }
                linearSystem.e(constraintAnchor6.i, solverVariableK, this.z0 + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.x0;
        if (i13 == 0) {
            linearSystem.e(constraintAnchor3.i, constraintAnchor.i, 0, 8);
            linearSystem.e(constraintAnchor.i, this.W.M.i, 0, 4);
            linearSystem.e(constraintAnchor.i, this.W.K.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            linearSystem.e(constraintAnchor.i, constraintAnchor3.i, 0, 8);
            linearSystem.e(constraintAnchor.i, this.W.K.i, 0, 4);
            linearSystem.e(constraintAnchor.i, this.W.M.i, 0, 0);
        } else if (i13 == 2) {
            linearSystem.e(constraintAnchor4.i, constraintAnchor2.i, 0, 8);
            linearSystem.e(constraintAnchor2.i, this.W.N.i, 0, 4);
            linearSystem.e(constraintAnchor2.i, this.W.L.i, 0, 0);
        } else if (i13 == 3) {
            linearSystem.e(constraintAnchor2.i, constraintAnchor4.i, 0, 8);
            linearSystem.e(constraintAnchor2.i, this.W.L.i, 0, 4);
            linearSystem.e(constraintAnchor2.i, this.W.N.i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean g() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void k(ConstraintWidget constraintWidget, HashMap map) {
        super.k(constraintWidget, map);
        Barrier barrier = (Barrier) constraintWidget;
        this.x0 = barrier.x0;
        this.y0 = barrier.y0;
        this.z0 = barrier.z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String strO = a.o(new StringBuilder("[Barrier] "), this.l0, " {");
        for (int i = 0; i < this.w0; i++) {
            ConstraintWidget constraintWidget = this.v0[i];
            if (i > 0) {
                strO = a.g(strO, ", ");
            }
            StringBuilder sbS = a.s(strO);
            sbS.append(constraintWidget.l0);
            strO = sbS.toString();
        }
        return a.g(strO, "}");
    }
}
