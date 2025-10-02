package androidx.constraintlayout.core;

import android.support.v4.media.session.a;
import androidx.constraintlayout.core.ArrayRow;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class PriorityGoalRow extends ArrayRow {
    public SolverVariable[] f;
    public SolverVariable[] g;
    public int h;
    public GoalVariableAccessor i;

    /* renamed from: androidx.constraintlayout.core.PriorityGoalRow$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.e - solverVariable2.e;
        }
    }

    public class GoalVariableAccessor {

        /* renamed from: a, reason: collision with root package name */
        public SolverVariable f2265a;

        public GoalVariableAccessor() {
        }

        public final String toString() {
            String strJ = "[ ";
            if (this.f2265a != null) {
                for (int i = 0; i < 9; i++) {
                    strJ = a.j(this.f2265a.k[i], " ", YU.a.s(strJ));
                }
            }
            StringBuilder sbT = YU.a.t(strJ, "] ");
            sbT.append(this.f2265a);
            return sbT.toString();
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public final SolverVariable a(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            SolverVariable[] solverVariableArr = this.f;
            SolverVariable solverVariable = solverVariableArr[i2];
            if (!zArr[solverVariable.e]) {
                GoalVariableAccessor goalVariableAccessor = this.i;
                goalVariableAccessor.f2265a = solverVariable;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = goalVariableAccessor.f2265a.k[i3];
                        if (f <= BitmapDescriptorFactory.HUE_RED) {
                            if (f < BitmapDescriptorFactory.HUE_RED) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = solverVariable2.k[i3];
                            float f3 = goalVariableAccessor.f2265a.k[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final boolean e() {
        return this.h == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final void i(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        SolverVariable solverVariable = arrayRow.f2260a;
        if (solverVariable == null) {
            return;
        }
        float[] fArr = solverVariable.k;
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.d;
        int iH = arrayRowVariables.h();
        for (int i = 0; i < iH; i++) {
            SolverVariable solverVariableB = arrayRowVariables.b(i);
            float fJ = arrayRowVariables.j(i);
            GoalVariableAccessor goalVariableAccessor = this.i;
            goalVariableAccessor.f2265a = solverVariableB;
            if (solverVariableB.d) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = goalVariableAccessor.f2265a.k;
                    float f = (fArr[i2] * fJ) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        goalVariableAccessor.f2265a.k[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    PriorityGoalRow.this.k(goalVariableAccessor.f2265a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != BitmapDescriptorFactory.HUE_RED) {
                        float f3 = f2 * fJ;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        goalVariableAccessor.f2265a.k[i3] = f3;
                    } else {
                        goalVariableAccessor.f2265a.k[i3] = 0.0f;
                    }
                }
                j(solverVariableB);
            }
            this.b = (arrayRow.b * fJ) + this.b;
        }
        k(solverVariable);
    }

    public final void j(SolverVariable solverVariable) {
        int i;
        int i2 = this.h + 1;
        SolverVariable[] solverVariableArr = this.f;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f = solverVariableArr2;
            this.g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f;
        int i3 = this.h;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && solverVariableArr3[i3].e > solverVariable.e) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new AnonymousClass1());
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        solverVariable.d = true;
        solverVariable.a(this);
    }

    public final void k(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == solverVariable) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        solverVariable.d = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final String toString() {
        GoalVariableAccessor goalVariableAccessor = this.i;
        String strJ = a.j(this.b, ") : ", new StringBuilder(" goal -> ("));
        for (int i = 0; i < this.h; i++) {
            goalVariableAccessor.f2265a = this.f[i];
            strJ = strJ + goalVariableAccessor + " ";
        }
        return strJ;
    }
}
