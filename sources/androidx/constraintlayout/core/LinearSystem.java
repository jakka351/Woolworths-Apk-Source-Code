package androidx.constraintlayout.core;

import androidx.constraintlayout.core.Pools;
import androidx.constraintlayout.core.PriorityGoalRow.GoalVariableAccessor;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class LinearSystem {
    public static boolean q = false;
    public static Metrics r;
    public final PriorityGoalRow d;
    public final Cache m;
    public ArrayRow p;

    /* renamed from: a, reason: collision with root package name */
    public int f2262a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public SolverVariable[] n = new SolverVariable[1000];
    public int o = 0;
    public ArrayRow[] g = new ArrayRow[32];

    public interface Row {
        SolverVariable a(boolean[] zArr);

        SolverVariable getKey();
    }

    public static class ValuesRow extends ArrayRow {
    }

    public LinearSystem() {
        s();
        Cache cache = new Cache();
        new Pools.SimplePool();
        cache.f2261a = new Pools.SimplePool();
        cache.b = new Pools.SimplePool();
        cache.c = new SolverVariable[32];
        this.m = cache;
        PriorityGoalRow priorityGoalRow = new PriorityGoalRow(cache);
        priorityGoalRow.f = new SolverVariable[128];
        priorityGoalRow.g = new SolverVariable[128];
        priorityGoalRow.h = 0;
        priorityGoalRow.i = priorityGoalRow.new GoalVariableAccessor();
        this.d = priorityGoalRow;
        this.p = new ArrayRow(cache);
    }

    public static int n(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).i;
        if (solverVariable != null) {
            return (int) (solverVariable.h + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final SolverVariable a(SolverVariable.Type type) {
        Pools.SimplePool simplePool = this.m.b;
        int i = simplePool.b;
        SolverVariable solverVariable = null;
        if (i > 0) {
            int i2 = i - 1;
            ?? r3 = simplePool.f2264a;
            ?? r4 = r3[i2];
            r3[i2] = 0;
            simplePool.b = i2;
            solverVariable = r4;
        }
        SolverVariable solverVariable2 = solverVariable;
        if (solverVariable2 == null) {
            solverVariable2 = new SolverVariable(type);
            solverVariable2.l = type;
        } else {
            solverVariable2.c();
            solverVariable2.l = type;
        }
        int i3 = this.o;
        int i4 = this.f2262a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f2262a = i5;
            this.n = (SolverVariable[]) Arrays.copyOf(this.n, i5);
        }
        SolverVariable[] solverVariableArr = this.n;
        int i6 = this.o;
        this.o = i6 + 1;
        solverVariableArr[i6] = solverVariable2;
        return solverVariable2;
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        ArrayRow arrayRowL = l();
        if (solverVariable2 == solverVariable3) {
            arrayRowL.d.c(solverVariable, 1.0f);
            arrayRowL.d.c(solverVariable4, 1.0f);
            arrayRowL.d.c(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            arrayRowL.d.c(solverVariable, 1.0f);
            arrayRowL.d.c(solverVariable2, -1.0f);
            arrayRowL.d.c(solverVariable3, -1.0f);
            arrayRowL.d.c(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                arrayRowL.b = (-i) + i2;
            }
        } else if (f <= BitmapDescriptorFactory.HUE_RED) {
            arrayRowL.d.c(solverVariable, -1.0f);
            arrayRowL.d.c(solverVariable2, 1.0f);
            arrayRowL.b = i;
        } else if (f >= 1.0f) {
            arrayRowL.d.c(solverVariable4, -1.0f);
            arrayRowL.d.c(solverVariable3, 1.0f);
            arrayRowL.b = -i2;
        } else {
            float f2 = 1.0f - f;
            arrayRowL.d.c(solverVariable, f2 * 1.0f);
            arrayRowL.d.c(solverVariable2, f2 * (-1.0f));
            arrayRowL.d.c(solverVariable3, (-1.0f) * f);
            arrayRowL.d.c(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                arrayRowL.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            arrayRowL.b(this, i3);
        }
        c(arrayRowL);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.constraintlayout.core.ArrayRow r18) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.LinearSystem.c(androidx.constraintlayout.core.ArrayRow):void");
    }

    public final void d(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f;
        if (i2 == -1) {
            solverVariable.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                SolverVariable solverVariable2 = this.m.c[i3];
            }
            return;
        }
        if (i2 == -1) {
            ArrayRow arrayRowL = l();
            arrayRowL.f2260a = solverVariable;
            float f = i;
            solverVariable.h = f;
            arrayRowL.b = f;
            arrayRowL.e = true;
            c(arrayRowL);
            return;
        }
        ArrayRow arrayRow = this.g[i2];
        if (arrayRow.e) {
            arrayRow.b = i;
            return;
        }
        if (arrayRow.d.h() == 0) {
            arrayRow.e = true;
            arrayRow.b = i;
            return;
        }
        ArrayRow arrayRowL2 = l();
        if (i < 0) {
            arrayRowL2.b = i * (-1);
            arrayRowL2.d.c(solverVariable, 1.0f);
        } else {
            arrayRowL2.b = i;
            arrayRowL2.d.c(solverVariable, -1.0f);
        }
        c(arrayRowL2);
    }

    public final void e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (i2 == 8 && solverVariable2.i && solverVariable.f == -1) {
            solverVariable.d(this, solverVariable2.h + i);
            return;
        }
        ArrayRow arrayRowL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            arrayRowL.b = i;
        }
        if (z) {
            arrayRowL.d.c(solverVariable, 1.0f);
            arrayRowL.d.c(solverVariable2, -1.0f);
        } else {
            arrayRowL.d.c(solverVariable, -1.0f);
            arrayRowL.d.c(solverVariable2, 1.0f);
        }
        if (i2 != 8) {
            arrayRowL.b(this, i2);
        }
        c(arrayRowL);
    }

    public final void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow arrayRowL = l();
        SolverVariable solverVariableM = m();
        solverVariableM.g = 0;
        arrayRowL.c(solverVariable, solverVariable2, solverVariableM, i);
        if (i2 != 8) {
            arrayRowL.d.c(j(i2), (int) (arrayRowL.d.d(solverVariableM) * (-1.0f)));
        }
        c(arrayRowL);
    }

    public final void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow arrayRowL = l();
        SolverVariable solverVariableM = m();
        solverVariableM.g = 0;
        arrayRowL.d(solverVariable, solverVariable2, solverVariableM, i);
        if (i2 != 8) {
            arrayRowL.d.c(j(i2), (int) (arrayRowL.d.d(solverVariableM) * (-1.0f)));
        }
        c(arrayRowL);
    }

    public final void h(ArrayRow arrayRow) {
        int i;
        if (arrayRow.e) {
            arrayRow.f2260a.d(this, arrayRow.b);
        } else {
            ArrayRow[] arrayRowArr = this.g;
            int i2 = this.k;
            arrayRowArr[i2] = arrayRow;
            SolverVariable solverVariable = arrayRow.f2260a;
            solverVariable.f = i2;
            this.k = i2 + 1;
            solverVariable.e(this, arrayRow);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow2 = this.g[i3];
                if (arrayRow2 != null && arrayRow2.e) {
                    arrayRow2.f2260a.d(this, arrayRow2.b);
                    this.m.f2261a.a(arrayRow2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        ArrayRow[] arrayRowArr2 = this.g;
                        int i6 = i4 - 1;
                        ArrayRow arrayRow3 = arrayRowArr2[i4];
                        arrayRowArr2[i6] = arrayRow3;
                        SolverVariable solverVariable2 = arrayRow3.f2260a;
                        if (solverVariable2.f == i4) {
                            solverVariable2.f = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            ArrayRow arrayRow = this.g[i];
            arrayRow.f2260a.h = arrayRow.b;
        }
    }

    public final SolverVariable j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.f);
        float[] fArr = solverVariableA.k;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        solverVariableA.e = i2;
        solverVariableA.g = i;
        this.m.c[i2] = solverVariableA;
        PriorityGoalRow priorityGoalRow = this.d;
        priorityGoalRow.i.f2265a = solverVariableA;
        Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
        fArr[solverVariableA.g] = 1.0f;
        priorityGoalRow.j(solverVariableA);
        return solverVariableA;
    }

    public final SolverVariable k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof ConstraintAnchor)) {
            return null;
        }
        ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
        SolverVariable solverVariable = constraintAnchor.i;
        if (solverVariable == null) {
            constraintAnchor.k();
            solverVariable = constraintAnchor.i;
        }
        int i = solverVariable.e;
        Cache cache = this.m;
        if (i != -1 && i <= this.c && cache.c[i] != null) {
            return solverVariable;
        }
        if (i != -1) {
            solverVariable.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        solverVariable.e = i2;
        solverVariable.l = SolverVariable.Type.d;
        cache.c[i2] = solverVariable;
        return solverVariable;
    }

    public final ArrayRow l() {
        Object obj;
        Cache cache = this.m;
        Pools.SimplePool simplePool = cache.f2261a;
        int i = simplePool.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = simplePool.f2264a;
            obj = objArr[i2];
            objArr[i2] = null;
            simplePool.b = i2;
        } else {
            obj = null;
        }
        ArrayRow arrayRow = (ArrayRow) obj;
        if (arrayRow == null) {
            return new ArrayRow(cache);
        }
        arrayRow.f2260a = null;
        arrayRow.d.clear();
        arrayRow.b = BitmapDescriptorFactory.HUE_RED;
        arrayRow.e = false;
        return arrayRow;
    }

    public final SolverVariable m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.e);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        solverVariableA.e = i;
        this.m.c[i] = solverVariableA;
        return solverVariableA;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (ArrayRow[]) Arrays.copyOf(this.g, i);
        Cache cache = this.m;
        cache.c = (SolverVariable[]) Arrays.copyOf(cache.c, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
        Metrics metrics = r;
        if (metrics != null) {
            metrics.b = Math.max(metrics.b, i2);
            long j = r.b;
        }
    }

    public final void p() {
        PriorityGoalRow priorityGoalRow = this.d;
        if (priorityGoalRow.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(priorityGoalRow);
            return;
        }
        Metrics metrics = r;
        if (metrics != null) {
            metrics.c++;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(priorityGoalRow);
                return;
            }
        }
        i();
    }

    public final void q(PriorityGoalRow priorityGoalRow) {
        Metrics metrics = r;
        if (metrics != null) {
            metrics.f = Math.max(metrics.f, this.j);
            Metrics metrics2 = r;
            metrics2.g = Math.max(metrics2.g, this.k);
        }
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            ArrayRow arrayRow = this.g[i];
            SolverVariable.Type type = arrayRow.f2260a.l;
            SolverVariable.Type type2 = SolverVariable.Type.d;
            if (type != type2) {
                float f = arrayRow.b;
                float f2 = BitmapDescriptorFactory.HUE_RED;
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f3 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.k) {
                            ArrayRow arrayRow2 = this.g[i3];
                            if (arrayRow2.f2260a.l != type2 && !arrayRow2.e && arrayRow2.b < f2) {
                                int iH = arrayRow2.d.h();
                                int i7 = 0;
                                while (i7 < iH) {
                                    SolverVariable solverVariableB = arrayRow2.d.b(i7);
                                    float f4 = f2;
                                    float fD = arrayRow2.d.d(solverVariableB);
                                    if (fD > f4) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f5 = solverVariableB.j[i8] / fD;
                                            if ((f5 < f3 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = solverVariableB.e;
                                                i4 = i3;
                                                f3 = f5;
                                            }
                                        }
                                    }
                                    i7++;
                                    f2 = f4;
                                }
                            }
                            i3++;
                            f2 = f2;
                        }
                        float f6 = f2;
                        if (i4 != -1) {
                            ArrayRow arrayRow3 = this.g[i4];
                            arrayRow3.f2260a.f = -1;
                            arrayRow3.g(this.m.c[i5]);
                            SolverVariable solverVariable = arrayRow3.f2260a;
                            solverVariable.f = i4;
                            solverVariable.e(this, arrayRow3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.j / 2) {
                            z = true;
                        }
                        f2 = f6;
                    }
                }
            }
            i++;
        }
        r(priorityGoalRow);
        i();
    }

    public final void r(Row row) {
        for (int i = 0; i < this.j; i++) {
            this.i[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.j * 2) {
                return;
            }
            if (row.getKey() != null) {
                this.i[row.getKey().e] = true;
            }
            SolverVariable solverVariableA = row.a(this.i);
            if (solverVariableA != null) {
                boolean[] zArr = this.i;
                int i3 = solverVariableA.e;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (solverVariableA != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.k; i5++) {
                    ArrayRow arrayRow = this.g[i5];
                    if (arrayRow.f2260a.l != SolverVariable.Type.d && !arrayRow.e && arrayRow.d.a(solverVariableA)) {
                        float fD = arrayRow.d.d(solverVariableA);
                        if (fD < BitmapDescriptorFactory.HUE_RED) {
                            float f2 = (-arrayRow.b) / fD;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    ArrayRow arrayRow2 = this.g[i4];
                    arrayRow2.f2260a.f = -1;
                    arrayRow2.g(solverVariableA);
                    SolverVariable solverVariable = arrayRow2.f2260a;
                    solverVariable.f = i4;
                    solverVariable.e(this, arrayRow2);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            ArrayRow arrayRow = this.g[i];
            if (arrayRow != null) {
                this.m.f2261a.a(arrayRow);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        Cache cache;
        int i = 0;
        while (true) {
            cache = this.m;
            SolverVariable[] solverVariableArr = cache.c;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.c();
            }
            i++;
        }
        Pools.SimplePool simplePool = cache.b;
        SolverVariable[] solverVariableArr2 = this.n;
        int length = this.o;
        simplePool.getClass();
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            SolverVariable solverVariable2 = solverVariableArr2[i2];
            int i3 = simplePool.b;
            Object[] objArr = simplePool.f2264a;
            if (i3 < objArr.length) {
                objArr[i3] = solverVariable2;
                simplePool.b = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill(cache.c, (Object) null);
        this.c = 0;
        PriorityGoalRow priorityGoalRow = this.d;
        priorityGoalRow.h = 0;
        priorityGoalRow.b = BitmapDescriptorFactory.HUE_RED;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            ArrayRow arrayRow = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new ArrayRow(cache);
    }
}
