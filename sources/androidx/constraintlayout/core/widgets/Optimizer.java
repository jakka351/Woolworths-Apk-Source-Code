package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes2.dex */
public class Optimizer {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f2315a = new boolean[3];

    public static void a(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        constraintWidget.p = -1;
        ConstraintAnchor constraintAnchor = constraintWidget.O;
        ConstraintAnchor constraintAnchor2 = constraintWidget.N;
        ConstraintAnchor constraintAnchor3 = constraintWidget.L;
        ConstraintAnchor constraintAnchor4 = constraintWidget.M;
        ConstraintAnchor constraintAnchor5 = constraintWidget.K;
        constraintWidget.q = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidgetContainer.V[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.g;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.e;
        if (dimensionBehaviour != dimensionBehaviour3 && constraintWidget.V[0] == dimensionBehaviour2) {
            int i = constraintAnchor5.g;
            int iV = constraintWidgetContainer.v() - constraintAnchor4.g;
            constraintAnchor5.i = linearSystem.k(constraintAnchor5);
            constraintAnchor4.i = linearSystem.k(constraintAnchor4);
            linearSystem.d(constraintAnchor5.i, i);
            linearSystem.d(constraintAnchor4.i, iV);
            constraintWidget.p = 2;
            constraintWidget.b0 = i;
            int i2 = iV - i;
            constraintWidget.X = i2;
            int i3 = constraintWidget.e0;
            if (i2 < i3) {
                constraintWidget.X = i3;
            }
        }
        if (constraintWidgetContainer.V[1] == dimensionBehaviour3 || constraintWidget.V[1] != dimensionBehaviour2) {
            return;
        }
        int i4 = constraintAnchor3.g;
        int iP = constraintWidgetContainer.p() - constraintAnchor2.g;
        constraintAnchor3.i = linearSystem.k(constraintAnchor3);
        constraintAnchor2.i = linearSystem.k(constraintAnchor2);
        linearSystem.d(constraintAnchor3.i, i4);
        linearSystem.d(constraintAnchor2.i, iP);
        if (constraintWidget.d0 > 0 || constraintWidget.j0 == 8) {
            SolverVariable solverVariableK = linearSystem.k(constraintAnchor);
            constraintAnchor.i = solverVariableK;
            linearSystem.d(solverVariableK, constraintWidget.d0 + i4);
        }
        constraintWidget.q = 2;
        constraintWidget.c0 = i4;
        int i5 = iP - i4;
        constraintWidget.Y = i5;
        int i6 = constraintWidget.f0;
        if (i5 < i6) {
            constraintWidget.Y = i6;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
