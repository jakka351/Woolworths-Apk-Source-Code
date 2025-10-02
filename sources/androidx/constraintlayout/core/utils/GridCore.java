package androidx.constraintlayout.core.utils;

import androidx.browser.trusted.a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class GridCore extends VirtualLayout {
    public ConstraintWidgetContainer I0;
    public ConstraintWidget[] J0;
    public boolean K0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public float P0;
    public float Q0;
    public String R0;
    public String S0;
    public String T0;
    public String U0;
    public int V0;
    public int W0;
    public boolean[][] X0;
    public HashSet Y0;
    public int[][] Z0;
    public int a1;
    public int[][] b1;
    public int c1;

    public static void c0(ConstraintWidget constraintWidget) {
        constraintWidget.o0[1] = -1.0f;
        constraintWidget.L.j();
        constraintWidget.N.j();
        constraintWidget.O.j();
    }

    public static float[] l0(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < strArrSplit.length) {
                try {
                    fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + strArrSplit[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public final void a0(int i, int i2, int i3, int i4) {
        int[][] iArrK0;
        this.I0 = (ConstraintWidgetContainer) this.W;
        if (this.L0 >= 1 && this.N0 >= 1) {
            this.W0 = 0;
            String str = this.U0;
            if (str != null && !str.trim().isEmpty() && (iArrK0 = k0(this.U0, false)) != null) {
                g0(iArrK0);
            }
            String str2 = this.T0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.b1 = k0(this.T0, true);
            }
            int iMax = Math.max(this.L0, this.N0);
            ConstraintWidget[] constraintWidgetArr = this.J0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f;
            if (constraintWidgetArr == null) {
                this.J0 = new ConstraintWidget[iMax];
                int i5 = 0;
                while (true) {
                    ConstraintWidget[] constraintWidgetArr2 = this.J0;
                    if (i5 >= constraintWidgetArr2.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget = new ConstraintWidget();
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                    dimensionBehaviourArr[0] = dimensionBehaviour;
                    dimensionBehaviourArr[1] = dimensionBehaviour;
                    constraintWidget.k = String.valueOf(constraintWidget.hashCode());
                    constraintWidgetArr2[i5] = constraintWidget;
                    i5++;
                }
            } else if (iMax != constraintWidgetArr.length) {
                ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    ConstraintWidget[] constraintWidgetArr4 = this.J0;
                    if (i6 < constraintWidgetArr4.length) {
                        constraintWidgetArr3[i6] = constraintWidgetArr4[i6];
                    } else {
                        ConstraintWidget constraintWidget2 = new ConstraintWidget();
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget2.V;
                        dimensionBehaviourArr2[0] = dimensionBehaviour;
                        dimensionBehaviourArr2[1] = dimensionBehaviour;
                        constraintWidget2.k = String.valueOf(constraintWidget2.hashCode());
                        constraintWidgetArr3[i6] = constraintWidget2;
                    }
                }
                while (true) {
                    ConstraintWidget[] constraintWidgetArr5 = this.J0;
                    if (iMax >= constraintWidgetArr5.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget3 = constraintWidgetArr5[iMax];
                    this.I0.v0.remove(constraintWidget3);
                    constraintWidget3.H();
                    iMax++;
                }
                this.J0 = constraintWidgetArr3;
            }
            int[][] iArr = this.b1;
            if (iArr != null) {
                h0(iArr);
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer = this.I0;
        ConstraintWidget[] constraintWidgetArr6 = this.J0;
        constraintWidgetContainer.getClass();
        for (ConstraintWidget constraintWidget4 : constraintWidgetArr6) {
            constraintWidgetContainer.a(constraintWidget4);
        }
    }

    public final void d0(ConstraintWidget constraintWidget, int i, int i2, int i3, int i4) {
        constraintWidget.K.a(this.J0[i2].K, 0);
        constraintWidget.L.a(this.J0[i].L, 0);
        constraintWidget.M.a(this.J0[(i2 + i4) - 1].M, 0);
        constraintWidget.N.a(this.J0[(i + i3) - 1].N, 0);
    }

    public final int e0(int i) {
        return this.V0 == 1 ? i / this.L0 : i % this.N0;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(androidx.constraintlayout.core.LinearSystem r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.utils.GridCore.f(androidx.constraintlayout.core.LinearSystem, boolean):void");
    }

    public final int f0(int i) {
        return this.V0 == 1 ? i % this.L0 : i / this.N0;
    }

    public final void g0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!j0(f0(iArr2[0]), e0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void h0(int[][] iArr) {
        if ((this.a1 & 2) > 0) {
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            int iF0 = f0(iArr[i][0]);
            int iE0 = e0(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!j0(iF0, iE0, iArr2[1], iArr2[2])) {
                break;
            }
            ConstraintWidget constraintWidget = this.v0[i];
            int[] iArr3 = iArr[i];
            d0(constraintWidget, iF0, iE0, iArr3[1], iArr3[2]);
            this.Y0.add(this.v0[i].k);
        }
    }

    public final void i0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.L0, this.N0);
        this.X0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.w0;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.Z0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean j0(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.X0;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final int[][] k0(String str, boolean z) {
        int i;
        int i2;
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new a(3));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.L0 != 1 && this.N0 != 1) {
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    String[] strArrSplit2 = strArrSplit[i3].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i3][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.a1 & 1) > 0) {
                        iArr[i3][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i3][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i3][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i3][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                String[] strArrSplit4 = strArrSplit[i6].trim().split(":");
                iArr[i6][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i6];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.N0 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i4 += iArr[i6][1];
                    if (z) {
                        i4--;
                    }
                }
                if (this.L0 == 1) {
                    iArr[i6][2] = Integer.parseInt(strArrSplit4[1]);
                    i5 += iArr[i6][2];
                    if (z) {
                        i5--;
                    }
                }
            }
            if (i4 != 0 && !this.K0 && (i2 = this.L0 + i4) <= 50 && this.M0 != i2) {
                this.M0 = i2;
                m0();
                i0();
            }
            if (i5 != 0 && !this.K0 && (i = this.N0 + i5) <= 50 && this.O0 != i) {
                this.O0 = i;
                m0();
                i0();
            }
            this.K0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void m0() {
        int i;
        int i2 = this.M0;
        if (i2 != 0 && (i = this.O0) != 0) {
            this.L0 = i2;
            this.N0 = i;
            return;
        }
        int i3 = this.O0;
        if (i3 > 0) {
            this.N0 = i3;
            this.L0 = ((this.w0 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.L0 = i2;
            this.N0 = ((this.w0 + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.w0) + 1.5d);
            this.L0 = iSqrt;
            this.N0 = ((this.w0 + iSqrt) - 1) / iSqrt;
        }
    }
}
