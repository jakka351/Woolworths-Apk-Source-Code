package androidx.constraintlayout.core;

import YU.a;
import androidx.constraintlayout.core.ArrayRow;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    public final ArrayRow b;
    public final Cache c;

    /* renamed from: a, reason: collision with root package name */
    public int f2259a = 0;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.b = arrayRow;
        this.c = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final boolean a(SolverVariable solverVariable) {
        int i = this.h;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.f2259a; i2++) {
                if (this.e[i] == solverVariable.e) {
                    return true;
                }
                i = this.f[i];
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final SolverVariable b(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2259a; i3++) {
            if (i3 == i) {
                return this.c.c[this.e[i2]];
            }
            i2 = this.f[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void c(SolverVariable solverVariable, float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            g(solverVariable, true);
            return;
        }
        int i = this.h;
        ArrayRow arrayRow = this.b;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = solverVariable.e;
            this.f[0] = -1;
            solverVariable.o++;
            solverVariable.a(arrayRow);
            this.f2259a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.e;
            if (i2 >= iArr.length) {
                this.j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f2259a; i4++) {
            int i5 = this.e[i];
            int i6 = solverVariable.e;
            if (i5 == i6) {
                this.g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f[i];
        }
        int length = this.i;
        int i7 = length + 1;
        if (this.j) {
            int[] iArr2 = this.e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.e;
        if (length >= iArr3.length && this.f2259a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.d * 2;
            this.d = i9;
            this.j = false;
            this.i = length - 1;
            this.g = Arrays.copyOf(this.g, i9);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[length] = solverVariable.e;
        this.g[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f[length] = this.h;
            this.h = length;
        }
        solverVariable.o++;
        solverVariable.a(arrayRow);
        int i10 = this.f2259a + 1;
        this.f2259a = i10;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i10 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f2259a; i2++) {
            SolverVariable solverVariable = this.c.c[this.e[i]];
            if (solverVariable != null) {
                solverVariable.b(this.b);
            }
            i = this.f[i];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.f2259a = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float d(SolverVariable solverVariable) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f2259a; i2++) {
            if (this.e[i] == solverVariable.e) {
                return this.g[i];
            }
            i = this.f[i];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void e(float f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f2259a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] / f;
            i = this.f[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void f(SolverVariable solverVariable, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.h;
            ArrayRow arrayRow = this.b;
            if (i == -1) {
                this.h = 0;
                this.g[0] = f;
                this.e[0] = solverVariable.e;
                this.f[0] = -1;
                solverVariable.o++;
                solverVariable.a(arrayRow);
                this.f2259a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.e;
                if (i2 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f2259a; i4++) {
                int i5 = this.e[i];
                int i6 = solverVariable.e;
                if (i5 == i6) {
                    float[] fArr = this.g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == BitmapDescriptorFactory.HUE_RED) {
                        if (i == this.h) {
                            this.h = this.f[i];
                        } else {
                            int[] iArr2 = this.f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.b(arrayRow);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        solverVariable.o--;
                        this.f2259a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f[i];
            }
            int length = this.i;
            int i7 = length + 1;
            if (this.j) {
                int[] iArr3 = this.e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.e;
            if (length >= iArr4.length && this.f2259a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.d * 2;
                this.d = i9;
                this.j = false;
                this.i = length - 1;
                this.g = Arrays.copyOf(this.g, i9);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[length] = solverVariable.e;
            this.g[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f[length] = this.h;
                this.h = length;
            }
            solverVariable.o++;
            solverVariable.a(arrayRow);
            this.f2259a++;
            if (!this.j) {
                this.i++;
            }
            int i10 = this.i;
            int[] iArr8 = this.e;
            if (i10 >= iArr8.length) {
                this.j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float g(SolverVariable solverVariable, boolean z) {
        int i = this.h;
        if (i == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2259a) {
            if (this.e[i] == solverVariable.e) {
                if (i == this.h) {
                    this.h = this.f[i];
                } else {
                    int[] iArr = this.f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.b(this.b);
                }
                solverVariable.o--;
                this.f2259a--;
                this.e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.g[i];
            }
            i2++;
            i3 = i;
            i = this.f[i];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final int h() {
        return this.f2259a;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float i(ArrayRow arrayRow, boolean z) {
        float fD = d(arrayRow.f2260a);
        g(arrayRow.f2260a, z);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.d;
        int iH = arrayRowVariables.h();
        for (int i = 0; i < iH; i++) {
            SolverVariable solverVariableB = arrayRowVariables.b(i);
            f(solverVariableB, arrayRowVariables.d(solverVariableB) * fD, z);
        }
        return fD;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void invert() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f2259a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float j(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2259a; i3++) {
            if (i3 == i) {
                return this.g[i2];
            }
            i2 = this.f[i2];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final String toString() {
        int i = this.h;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f2259a; i2++) {
            StringBuilder sbS = a.s(android.support.v4.media.session.a.j(this.g[i], " : ", a.s(a.g(string, " -> "))));
            sbS.append(this.c.c[this.e[i]]);
            string = sbS.toString();
            i = this.f[i];
        }
        return string;
    }
}
