package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {

    /* renamed from: a, reason: collision with root package name */
    public int f2266a;
    public int[] b;
    public int[] c;
    public float[] d;
    public int[] e;
    public int[] f;
    public int g;
    public int h;

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final boolean a(SolverVariable solverVariable) {
        l(solverVariable);
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final SolverVariable b(int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                throw null;
            }
            i3 = this.f[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void c(SolverVariable solverVariable, float f) {
        if (f > -0.001f && f < 0.001f) {
            g(solverVariable, true);
            return;
        }
        int i = 0;
        if (this.g == 0) {
            k(0, solverVariable, f);
            throw null;
        }
        l(solverVariable);
        int i2 = this.g + 1;
        int i3 = this.f2266a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.c = Arrays.copyOf(this.c, i4);
            this.d = Arrays.copyOf(this.d, i4);
            this.e = Arrays.copyOf(this.e, i4);
            this.f = Arrays.copyOf(this.f, i4);
            this.b = Arrays.copyOf(this.b, i4);
            for (int i5 = this.f2266a; i5 < i4; i5++) {
                this.c[i5] = -1;
                this.b[i5] = -1;
            }
            this.f2266a = i4;
        }
        int i6 = this.g;
        int i7 = this.h;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.c[i7];
            int i11 = solverVariable.e;
            if (i10 == i11) {
                this.d[i7] = f;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.f[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f2266a) {
                i = -1;
                break;
            } else if (this.c[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        k(i, solverVariable, f);
        if (i8 != -1) {
            this.e[i] = i8;
            int[] iArr = this.f;
            iArr[i] = iArr[i8];
            iArr[i8] = i;
        } else {
            this.e[i] = -1;
            if (this.g > 0) {
                this.f[i] = this.h;
                this.h = i;
            } else {
                this.f[i] = -1;
            }
        }
        int i12 = this.f[i];
        if (i12 == -1) {
            throw null;
        }
        this.e[i12] = i;
        throw null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (b(i2) != null) {
                throw null;
            }
        }
        for (int i3 = 0; i3 < this.f2266a; i3++) {
            this.c[i3] = -1;
            this.b[i3] = -1;
        }
        this.g = 0;
        this.h = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float d(SolverVariable solverVariable) {
        l(solverVariable);
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void e(float f) {
        int i = this.g;
        int i2 = this.h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.d;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void f(SolverVariable solverVariable, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            l(solverVariable);
            c(solverVariable, f);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float g(SolverVariable solverVariable, boolean z) {
        l(solverVariable);
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final int h() {
        return this.g;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float i(ArrayRow arrayRow, boolean z) {
        d(arrayRow.f2260a);
        g(arrayRow.f2260a, z);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.d;
        int i = solverVariableValues.g;
        int i2 = 0;
        while (i > 0) {
            if (solverVariableValues.c[i2] != -1) {
                float f = solverVariableValues.d[i2];
                throw null;
            }
            i2++;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void invert() {
        int i = this.g;
        int i2 = this.h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.d;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float j(int i) {
        int i2 = this.g;
        int i3 = this.h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.d[i3];
            }
            i3 = this.f[i3];
            if (i3 == -1) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final void k(int i, SolverVariable solverVariable, float f) {
        this.c[i] = solverVariable.e;
        this.d[i] = f;
        this.e[i] = -1;
        this.f[i] = -1;
        throw null;
    }

    public final int l(SolverVariable solverVariable) {
        if (this.g == 0 || solverVariable == null) {
            return -1;
        }
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
