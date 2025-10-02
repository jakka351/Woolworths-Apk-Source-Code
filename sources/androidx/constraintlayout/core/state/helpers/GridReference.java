package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class GridReference extends HelperReference {
    public String A0;
    public String B0;
    public int C0;
    public GridCore o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public float w0;
    public float x0;
    public String y0;
    public String z0;

    public GridReference(State state, State.Helper helper) {
        super(state, helper);
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.s0 = 0;
        if (helper == State.Helper.k) {
            this.u0 = 1;
        } else if (helper == State.Helper.l) {
            this.v0 = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() throws NumberFormatException {
        s();
        GridCore gridCore = this.o0;
        int i = this.t0;
        gridCore.getClass();
        if ((i == 0 || i == 1) && gridCore.V0 != i) {
            gridCore.V0 = i;
        }
        int i2 = this.u0;
        if (i2 != 0) {
            GridCore gridCore2 = this.o0;
            if (i2 > 50) {
                gridCore2.getClass();
            } else if (gridCore2.M0 != i2) {
                gridCore2.M0 = i2;
                gridCore2.m0();
                gridCore2.i0();
            }
        }
        int i3 = this.v0;
        if (i3 != 0) {
            GridCore gridCore3 = this.o0;
            if (i3 > 50) {
                gridCore3.getClass();
            } else if (gridCore3.O0 != i3) {
                gridCore3.O0 = i3;
                gridCore3.m0();
                gridCore3.i0();
            }
        }
        float f = this.w0;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            GridCore gridCore4 = this.o0;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                gridCore4.getClass();
            } else if (gridCore4.P0 != f) {
                gridCore4.P0 = f;
            }
        }
        float f2 = this.x0;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            GridCore gridCore5 = this.o0;
            if (f2 < BitmapDescriptorFactory.HUE_RED) {
                gridCore5.getClass();
            } else if (gridCore5.Q0 != f2) {
                gridCore5.Q0 = f2;
            }
        }
        String str = this.y0;
        if (str != null && !str.isEmpty()) {
            GridCore gridCore6 = this.o0;
            String str2 = this.y0;
            String str3 = gridCore6.R0;
            if (str3 == null || !str3.equals(str2)) {
                gridCore6.R0 = str2;
            }
        }
        String str4 = this.z0;
        if (str4 != null && !str4.isEmpty()) {
            GridCore gridCore7 = this.o0;
            String str5 = this.z0;
            String str6 = gridCore7.S0;
            if (str6 == null || !str6.equals(str5)) {
                gridCore7.S0 = str5;
            }
        }
        String str7 = this.A0;
        if (str7 != null && !str7.isEmpty()) {
            GridCore gridCore8 = this.o0;
            String str8 = this.A0;
            String str9 = gridCore8.T0;
            if (str9 == null || !str9.equals(str8.toString())) {
                gridCore8.K0 = false;
                gridCore8.T0 = str8.toString();
            }
        }
        String str10 = this.B0;
        if (str10 != null && !str10.isEmpty()) {
            GridCore gridCore9 = this.o0;
            String str11 = this.B0;
            String str12 = gridCore9.U0;
            if (str12 == null || !str12.equals(str11)) {
                gridCore9.K0 = false;
                gridCore9.U0 = str11;
            }
        }
        GridCore gridCore10 = this.o0;
        gridCore10.a1 = this.C0;
        int i4 = this.p0;
        gridCore10.z0 = i4;
        gridCore10.B0 = i4;
        gridCore10.C0 = i4;
        gridCore10.A0 = this.q0;
        gridCore10.x0 = this.r0;
        gridCore10.y0 = this.s0;
        r();
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public final HelperWidget s() {
        int[][] iArrK0;
        int[][] iArrK02;
        boolean[][] zArr;
        if (this.o0 == null) {
            GridCore gridCore = new GridCore();
            gridCore.K0 = false;
            gridCore.W0 = 0;
            gridCore.Y0 = new HashSet();
            gridCore.c1 = 0;
            gridCore.m0();
            int[][] iArr = gridCore.Z0;
            boolean z = iArr != null && iArr.length == gridCore.w0 && (zArr = gridCore.X0) != null && zArr.length == gridCore.L0 && zArr[0].length == gridCore.N0;
            if (!z) {
                gridCore.i0();
            }
            if (z) {
                for (int i = 0; i < gridCore.X0.length; i++) {
                    int i2 = 0;
                    while (true) {
                        boolean[][] zArr2 = gridCore.X0;
                        if (i2 < zArr2[0].length) {
                            zArr2[i][i2] = true;
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < gridCore.Z0.length; i3++) {
                    int i4 = 0;
                    while (true) {
                        int[][] iArr2 = gridCore.Z0;
                        if (i4 < iArr2[0].length) {
                            iArr2[i3][i4] = -1;
                            i4++;
                        }
                    }
                }
            }
            gridCore.W0 = 0;
            String str = gridCore.U0;
            if (str != null && !str.trim().isEmpty() && (iArrK02 = gridCore.k0(gridCore.U0, false)) != null) {
                gridCore.g0(iArrK02);
            }
            String str2 = gridCore.T0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrK0 = gridCore.k0(gridCore.T0, true)) != null) {
                gridCore.h0(iArrK0);
            }
            this.o0 = gridCore;
        }
        return this.o0;
    }
}
