package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Guideline extends ConstraintWidget {
    public boolean A0;
    public float v0 = -1.0f;
    public int w0 = -1;
    public int x0 = -1;
    public ConstraintAnchor y0 = this.L;
    public int z0 = 0;

    /* renamed from: androidx.constraintlayout.core.widgets.Guideline$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2314a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f2314a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2314a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2314a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2314a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2314a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2314a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2314a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2314a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2314a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public Guideline() {
        this.T.clear();
        this.T.add(this.y0);
        int length = this.S.length;
        for (int i = 0; i < length; i++) {
            this.S[i] = this.y0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean F() {
        return this.A0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean G() {
        return this.A0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void Y(LinearSystem linearSystem, boolean z) {
        if (this.W == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.y0;
        linearSystem.getClass();
        int iN = LinearSystem.n(constraintAnchor);
        if (this.z0 == 1) {
            this.b0 = iN;
            this.c0 = 0;
            R(this.W.p());
            W(0);
            return;
        }
        this.b0 = 0;
        this.c0 = iN;
        W(this.W.v());
        R(0);
    }

    public final void Z(int i) {
        this.y0.l(i);
        this.A0 = true;
    }

    public final void a0(int i) {
        if (this.z0 == i) {
            return;
        }
        this.z0 = i;
        ArrayList arrayList = this.T;
        arrayList.clear();
        if (this.z0 == 1) {
            this.y0 = this.K;
        } else {
            this.y0 = this.L;
        }
        arrayList.add(this.y0);
        ConstraintAnchor[] constraintAnchorArr = this.S;
        int length = constraintAnchorArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            constraintAnchorArr[i2] = this.y0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void f(LinearSystem linearSystem, boolean z) {
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) this.W;
        if (constraintWidgetContainer == null) {
            return;
        }
        Object objN = constraintWidgetContainer.n(ConstraintAnchor.Type.d);
        Object objN2 = constraintWidgetContainer.n(ConstraintAnchor.Type.f);
        ConstraintWidget constraintWidget = this.W;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.e;
        boolean z2 = constraintWidget != null && constraintWidget.V[0] == dimensionBehaviour;
        if (this.z0 == 0) {
            objN = constraintWidgetContainer.n(ConstraintAnchor.Type.e);
            objN2 = constraintWidgetContainer.n(ConstraintAnchor.Type.g);
            ConstraintWidget constraintWidget2 = this.W;
            z2 = constraintWidget2 != null && constraintWidget2.V[1] == dimensionBehaviour;
        }
        if (this.A0) {
            ConstraintAnchor constraintAnchor = this.y0;
            if (constraintAnchor.c) {
                SolverVariable solverVariableK = linearSystem.k(constraintAnchor);
                linearSystem.d(solverVariableK, this.y0.d());
                if (this.w0 != -1) {
                    if (z2) {
                        linearSystem.f(linearSystem.k(objN2), solverVariableK, 0, 5);
                    }
                } else if (this.x0 != -1 && z2) {
                    SolverVariable solverVariableK2 = linearSystem.k(objN2);
                    linearSystem.f(solverVariableK, linearSystem.k(objN), 0, 5);
                    linearSystem.f(solverVariableK2, solverVariableK, 0, 5);
                }
                this.A0 = false;
                return;
            }
        }
        if (this.w0 != -1) {
            SolverVariable solverVariableK3 = linearSystem.k(this.y0);
            linearSystem.e(solverVariableK3, linearSystem.k(objN), this.w0, 8);
            if (z2) {
                linearSystem.f(linearSystem.k(objN2), solverVariableK3, 0, 5);
                return;
            }
            return;
        }
        if (this.x0 != -1) {
            SolverVariable solverVariableK4 = linearSystem.k(this.y0);
            SolverVariable solverVariableK5 = linearSystem.k(objN2);
            linearSystem.e(solverVariableK4, solverVariableK5, -this.x0, 8);
            if (z2) {
                linearSystem.f(solverVariableK4, linearSystem.k(objN), 0, 5);
                linearSystem.f(solverVariableK5, solverVariableK4, 0, 5);
                return;
            }
            return;
        }
        if (this.v0 != -1.0f) {
            SolverVariable solverVariableK6 = linearSystem.k(this.y0);
            SolverVariable solverVariableK7 = linearSystem.k(objN2);
            float f = this.v0;
            ArrayRow arrayRowL = linearSystem.l();
            arrayRowL.d.c(solverVariableK6, -1.0f);
            arrayRowL.d.c(solverVariableK7, f);
            linearSystem.c(arrayRowL);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean g() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void k(ConstraintWidget constraintWidget, HashMap map) {
        super.k(constraintWidget, map);
        Guideline guideline = (Guideline) constraintWidget;
        this.v0 = guideline.v0;
        this.w0 = guideline.w0;
        this.x0 = guideline.x0;
        a0(guideline.z0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final ConstraintAnchor n(ConstraintAnchor.Type type) {
        int iOrdinal = type.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.z0 == 0) {
                return this.y0;
            }
            return null;
        }
        if (this.z0 == 1) {
            return this.y0;
        }
        return null;
    }
}
