package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ArrayRow implements LinearSystem.Row {
    public final ArrayRowVariables d;

    /* renamed from: a, reason: collision with root package name */
    public SolverVariable f2260a = null;
    public float b = BitmapDescriptorFactory.HUE_RED;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public interface ArrayRowVariables {
        boolean a(SolverVariable solverVariable);

        SolverVariable b(int i);

        void c(SolverVariable solverVariable, float f);

        void clear();

        float d(SolverVariable solverVariable);

        void e(float f);

        void f(SolverVariable solverVariable, float f, boolean z);

        float g(SolverVariable solverVariable, boolean z);

        int h();

        float i(ArrayRow arrayRow, boolean z);

        void invert();

        float j(int i);
    }

    public ArrayRow(Cache cache) {
        this.d = new ArrayLinkedVariables(this, cache);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(LinearSystem linearSystem, int i) {
        this.d.c(linearSystem.j(i), 1.0f);
        this.d.c(linearSystem.j(i), -1.0f);
    }

    public final void c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.c(solverVariable, 1.0f);
            this.d.c(solverVariable2, -1.0f);
            this.d.c(solverVariable3, -1.0f);
        } else {
            this.d.c(solverVariable, -1.0f);
            this.d.c(solverVariable2, 1.0f);
            this.d.c(solverVariable3, 1.0f);
        }
    }

    public final void d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.c(solverVariable, 1.0f);
            this.d.c(solverVariable2, -1.0f);
            this.d.c(solverVariable3, 1.0f);
        } else {
            this.d.c(solverVariable, -1.0f);
            this.d.c(solverVariable2, 1.0f);
            this.d.c(solverVariable3, -1.0f);
        }
    }

    public boolean e() {
        return this.f2260a == null && this.b == BitmapDescriptorFactory.HUE_RED && this.d.h() == 0;
    }

    public final SolverVariable f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iH = this.d.h();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < iH; i++) {
            float fJ = this.d.j(i);
            if (fJ < BitmapDescriptorFactory.HUE_RED) {
                SolverVariable solverVariableB = this.d.b(i);
                if ((zArr == null || !zArr[solverVariableB.e]) && solverVariableB != solverVariable && (((type = solverVariableB.l) == SolverVariable.Type.e || type == SolverVariable.Type.f) && fJ < f)) {
                    f = fJ;
                    solverVariable2 = solverVariableB;
                }
            }
        }
        return solverVariable2;
    }

    public final void g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f2260a;
        if (solverVariable2 != null) {
            this.d.c(solverVariable2, -1.0f);
            this.f2260a.f = -1;
            this.f2260a = null;
        }
        float fG = this.d.g(solverVariable, true) * (-1.0f);
        this.f2260a = solverVariable;
        if (fG == 1.0f) {
            return;
        }
        this.b /= fG;
        this.d.e(fG);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public final SolverVariable getKey() {
        return this.f2260a;
    }

    public final void h(LinearSystem linearSystem, SolverVariable solverVariable, boolean z) {
        if (solverVariable.i) {
            float fD = this.d.d(solverVariable);
            this.b = (solverVariable.h * fD) + this.b;
            this.d.g(solverVariable, z);
            if (z) {
                solverVariable.b(this);
            }
            if (this.d.h() == 0) {
                this.e = true;
                linearSystem.b = true;
            }
        }
    }

    public void i(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        float fI = this.d.i(arrayRow, z);
        this.b = (arrayRow.b * fI) + this.b;
        if (z) {
            arrayRow.f2260a.b(this);
        }
        if (this.f2260a == null || this.d.h() != 0) {
            return;
        }
        this.e = true;
        linearSystem.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.f2260a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r10.f2260a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = YU.a.g(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = YU.a.s(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r10.d
            int r5 = r5.h()
        L3c:
            if (r3 >= r5) goto L9c
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r10.d
            androidx.constraintlayout.core.SolverVariable r6 = r6.b(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r10.d
            float r7 = r7.j(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = YU.a.g(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = YU.a.g(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = YU.a.g(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = YU.a.g(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = YU.a.g(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.ArrayRow.toString():java.lang.String");
    }
}
