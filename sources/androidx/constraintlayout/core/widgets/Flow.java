package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {
    public ConstraintWidget[] f1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public int N0 = -1;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public float T0 = 0.5f;
    public int U0 = 0;
    public int V0 = 0;
    public int W0 = 2;
    public int X0 = 2;
    public int Y0 = 0;
    public int Z0 = -1;
    public int a1 = 0;
    public final ArrayList b1 = new ArrayList();
    public ConstraintWidget[] c1 = null;
    public ConstraintWidget[] d1 = null;
    public int[] e1 = null;
    public int g1 = 0;

    public class WidgetsList {

        /* renamed from: a, reason: collision with root package name */
        public int f2313a;
        public ConstraintAnchor d;
        public ConstraintAnchor e;
        public ConstraintAnchor f;
        public ConstraintAnchor g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int q;
        public ConstraintWidget b = null;
        public int c = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;

        public WidgetsList(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.f2313a = i;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = Flow.this.B0;
            this.i = Flow.this.x0;
            this.j = Flow.this.C0;
            this.k = Flow.this.y0;
            this.q = i2;
        }

        public final void a(ConstraintWidget constraintWidget) {
            int i = this.f2313a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f;
            Flow flow = Flow.this;
            if (i == 0) {
                int iD0 = flow.d0(constraintWidget, this.q);
                if (constraintWidget.V[0] == dimensionBehaviour) {
                    this.p++;
                    iD0 = 0;
                }
                this.l = iD0 + (constraintWidget.j0 != 8 ? flow.U0 : 0) + this.l;
                int iC0 = flow.c0(constraintWidget, this.q);
                if (this.b == null || this.c < iC0) {
                    this.b = constraintWidget;
                    this.c = iC0;
                    this.m = iC0;
                }
            } else {
                int iD02 = flow.d0(constraintWidget, this.q);
                int iC02 = flow.c0(constraintWidget, this.q);
                if (constraintWidget.V[1] == dimensionBehaviour) {
                    this.p++;
                    iC02 = 0;
                }
                this.m = iC02 + (constraintWidget.j0 != 8 ? flow.V0 : 0) + this.m;
                if (this.b == null || this.c < iD02) {
                    this.b = constraintWidget;
                    this.c = iD02;
                    this.l = iD02;
                }
            }
            this.o++;
        }

        public final void b(int i, boolean z, boolean z2) {
            Flow flow;
            int i2;
            int i3;
            ConstraintWidget constraintWidget;
            boolean z3;
            int i4;
            int i5;
            char c;
            float f;
            float f2;
            float f3;
            int i6;
            float f4;
            float f5;
            int i7;
            int i8 = this.o;
            int i9 = 0;
            while (true) {
                flow = Flow.this;
                if (i9 >= i8 || (i7 = this.n + i9) >= flow.g1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = flow.f1[i7];
                if (constraintWidget2 != null) {
                    constraintWidget2.I();
                }
                i9++;
            }
            if (i8 == 0 || this.b == null) {
                return;
            }
            boolean z4 = z2 && i == 0;
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = this.n + (z ? (i8 - 1) - i12 : i12);
                if (i13 >= flow.g1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = flow.f1[i13];
                if (constraintWidget3 != null && constraintWidget3.j0 == 0) {
                    if (i10 == -1) {
                        i10 = i12;
                    }
                    i11 = i12;
                }
            }
            if (this.f2313a == 0) {
                ConstraintWidget constraintWidget4 = this.b;
                constraintWidget4.n0 = flow.J0;
                ConstraintAnchor constraintAnchor = constraintWidget4.N;
                ConstraintAnchor constraintAnchor2 = constraintWidget4.L;
                int i14 = this.i;
                if (i > 0) {
                    i14 += flow.V0;
                }
                constraintAnchor2.a(this.e, i14);
                if (z2) {
                    constraintAnchor.a(this.g, this.k);
                }
                if (i > 0) {
                    this.e.d.N.a(constraintAnchor2, 0);
                }
                if (flow.X0 != 3 || constraintWidget4.F) {
                    constraintWidget = constraintWidget4;
                } else {
                    for (int i15 = 0; i15 < i8; i15++) {
                        int i16 = this.n + (z ? (i8 - 1) - i15 : i15);
                        if (i16 >= flow.g1) {
                            break;
                        }
                        constraintWidget = flow.f1[i16];
                        if (constraintWidget.F) {
                            break;
                        }
                    }
                    constraintWidget = constraintWidget4;
                }
                int i17 = 0;
                ConstraintWidget constraintWidget5 = null;
                while (i17 < i8) {
                    int i18 = z ? (i8 - 1) - i17 : i17;
                    int i19 = this.n + i18;
                    if (i19 >= flow.g1) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = flow.f1[i19];
                    if (constraintWidget6 == null) {
                        i5 = i8;
                        z3 = z4;
                        i4 = i11;
                        c = 3;
                    } else {
                        ConstraintAnchor constraintAnchor3 = constraintWidget6.N;
                        ConstraintAnchor constraintAnchor4 = constraintWidget6.L;
                        ConstraintAnchor constraintAnchor5 = constraintWidget6.K;
                        z3 = z4;
                        if (i17 == 0) {
                            i4 = i11;
                            constraintWidget6.j(constraintAnchor5, this.d, this.h);
                        } else {
                            i4 = i11;
                        }
                        if (i18 == 0) {
                            int i20 = flow.I0;
                            if (z) {
                                f = 1.0f;
                                f2 = 1.0f - flow.O0;
                            } else {
                                f = 1.0f;
                                f2 = flow.O0;
                            }
                            if (this.n == 0) {
                                i6 = flow.K0;
                                f3 = f2;
                                if (i6 != -1) {
                                    if (z) {
                                        f5 = flow.Q0;
                                        f4 = f - f5;
                                        constraintWidget6.m0 = i6;
                                        constraintWidget6.g0 = f4;
                                    } else {
                                        f4 = flow.Q0;
                                        constraintWidget6.m0 = i6;
                                        constraintWidget6.g0 = f4;
                                    }
                                }
                            } else {
                                f3 = f2;
                            }
                            if (!z2 || (i6 = flow.M0) == -1) {
                                i6 = i20;
                                f4 = f3;
                            } else if (z) {
                                f5 = flow.S0;
                                f4 = f - f5;
                            } else {
                                f4 = flow.S0;
                            }
                            constraintWidget6.m0 = i6;
                            constraintWidget6.g0 = f4;
                        }
                        if (i17 == i8 - 1) {
                            i5 = i8;
                            constraintWidget6.j(constraintWidget6.M, this.f, this.j);
                        } else {
                            i5 = i8;
                        }
                        if (constraintWidget5 != null) {
                            ConstraintAnchor constraintAnchor6 = constraintWidget5.M;
                            constraintAnchor5.a(constraintAnchor6, flow.U0);
                            if (i17 == i10) {
                                int i21 = this.h;
                                if (constraintAnchor5.h()) {
                                    constraintAnchor5.h = i21;
                                }
                            }
                            constraintAnchor6.a(constraintAnchor5, 0);
                            if (i17 == i4 + 1) {
                                int i22 = this.j;
                                if (constraintAnchor6.h()) {
                                    constraintAnchor6.h = i22;
                                }
                            }
                        }
                        if (constraintWidget6 != constraintWidget4) {
                            int i23 = flow.X0;
                            c = 3;
                            if (i23 == 3 && constraintWidget.F && constraintWidget6 != constraintWidget && constraintWidget6.F) {
                                constraintWidget6.O.a(constraintWidget.O, 0);
                            } else if (i23 == 0) {
                                constraintAnchor4.a(constraintAnchor2, 0);
                            } else if (i23 == 1) {
                                constraintAnchor3.a(constraintAnchor, 0);
                            } else if (z3) {
                                constraintAnchor4.a(this.e, this.i);
                                constraintAnchor3.a(this.g, this.k);
                            } else {
                                constraintAnchor4.a(constraintAnchor2, 0);
                                constraintAnchor3.a(constraintAnchor, 0);
                            }
                        } else {
                            c = 3;
                        }
                        constraintWidget5 = constraintWidget6;
                    }
                    i17++;
                    z4 = z3;
                    i11 = i4;
                    i8 = i5;
                }
                return;
            }
            int i24 = i8;
            boolean z5 = z4;
            int i25 = i11;
            ConstraintWidget constraintWidget7 = this.b;
            constraintWidget7.m0 = flow.I0;
            ConstraintAnchor constraintAnchor7 = constraintWidget7.K;
            ConstraintAnchor constraintAnchor8 = constraintWidget7.M;
            int i26 = this.h;
            if (i > 0) {
                i26 += flow.U0;
            }
            if (z) {
                constraintAnchor8.a(this.f, i26);
                if (z2) {
                    constraintAnchor7.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.K.a(constraintAnchor8, 0);
                }
            } else {
                constraintAnchor7.a(this.d, i26);
                if (z2) {
                    constraintAnchor8.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.M.a(constraintAnchor7, 0);
                }
            }
            int i27 = 0;
            ConstraintWidget constraintWidget8 = null;
            while (true) {
                int i28 = i24;
                if (i27 >= i28 || (i2 = this.n + i27) >= flow.g1) {
                    return;
                }
                ConstraintWidget constraintWidget9 = flow.f1[i2];
                if (constraintWidget9 == null) {
                    i24 = i28;
                } else {
                    ConstraintAnchor constraintAnchor9 = constraintWidget9.L;
                    ConstraintAnchor constraintAnchor10 = constraintWidget9.M;
                    ConstraintAnchor constraintAnchor11 = constraintWidget9.K;
                    if (i27 == 0) {
                        constraintWidget9.j(constraintAnchor9, this.e, this.i);
                        int i29 = flow.J0;
                        float f6 = flow.P0;
                        if (this.n == 0) {
                            int i30 = flow.L0;
                            i24 = i28;
                            i3 = -1;
                            if (i30 != -1) {
                                f6 = flow.R0;
                            }
                            i29 = i30;
                            constraintWidget9.n0 = i29;
                            constraintWidget9.h0 = f6;
                        } else {
                            i24 = i28;
                            i3 = -1;
                        }
                        if (z2 && (i30 = flow.N0) != i3) {
                            f6 = flow.T0;
                            i29 = i30;
                        }
                        constraintWidget9.n0 = i29;
                        constraintWidget9.h0 = f6;
                    } else {
                        i24 = i28;
                    }
                    if (i27 == i24 - 1) {
                        constraintWidget9.j(constraintWidget9.N, this.g, this.k);
                    }
                    if (constraintWidget8 != null) {
                        ConstraintAnchor constraintAnchor12 = constraintWidget8.N;
                        constraintAnchor9.a(constraintAnchor12, flow.V0);
                        if (i27 == i10) {
                            int i31 = this.i;
                            if (constraintAnchor9.h()) {
                                constraintAnchor9.h = i31;
                            }
                        }
                        constraintAnchor12.a(constraintAnchor9, 0);
                        if (i27 == i25 + 1) {
                            int i32 = this.k;
                            if (constraintAnchor12.h()) {
                                constraintAnchor12.h = i32;
                            }
                        }
                    }
                    if (constraintWidget9 == constraintWidget7) {
                        constraintWidget8 = constraintWidget9;
                    } else if (z) {
                        int i33 = flow.W0;
                        if (i33 == 0) {
                            constraintAnchor10.a(constraintAnchor8, 0);
                        } else if (i33 == 1) {
                            constraintAnchor11.a(constraintAnchor7, 0);
                        } else if (i33 == 2) {
                            constraintAnchor11.a(constraintAnchor7, 0);
                            constraintAnchor10.a(constraintAnchor8, 0);
                        }
                        constraintWidget8 = constraintWidget9;
                    } else {
                        int i34 = flow.W0;
                        if (i34 == 0) {
                            constraintAnchor11.a(constraintAnchor7, 0);
                        } else if (i34 == 1) {
                            constraintAnchor10.a(constraintAnchor8, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                constraintAnchor11.a(this.d, this.h);
                                constraintAnchor10.a(this.f, this.j);
                            } else {
                                constraintAnchor11.a(constraintAnchor7, 0);
                                constraintAnchor10.a(constraintAnchor8, 0);
                            }
                        }
                        constraintWidget8 = constraintWidget9;
                    }
                }
                i27++;
            }
        }

        public final int c() {
            return this.f2313a == 1 ? this.m - Flow.this.V0 : this.m;
        }

        public final int d() {
            return this.f2313a == 0 ? this.l - Flow.this.U0 : this.l;
        }

        public final void e(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.n;
                int i7 = i6 + i5;
                Flow flow = Flow.this;
                if (i7 >= flow.g1) {
                    break;
                }
                ConstraintWidget constraintWidget = flow.f1[i6 + i5];
                int i8 = this.f2313a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f;
                if (i8 == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour2 && constraintWidget.s == 0) {
                            flow.b0(constraintWidget, dimensionBehaviour, i4, dimensionBehaviourArr[1], constraintWidget.p());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.V;
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour2 && constraintWidget.t == 0) {
                        int i9 = i4;
                        flow.b0(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.v(), dimensionBehaviour, i9);
                        i4 = i9;
                    }
                }
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i10 = this.o;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = this.n + i11;
                Flow flow2 = Flow.this;
                if (i12 >= flow2.g1) {
                    return;
                }
                ConstraintWidget constraintWidget2 = flow2.f1[i12];
                if (this.f2313a == 0) {
                    int iV = constraintWidget2.v();
                    int i13 = flow2.U0;
                    if (constraintWidget2.j0 == 8) {
                        i13 = 0;
                    }
                    this.l = iV + i13 + this.l;
                    int iC0 = flow2.c0(constraintWidget2, this.q);
                    if (this.b == null || this.c < iC0) {
                        this.b = constraintWidget2;
                        this.c = iC0;
                        this.m = iC0;
                    }
                } else {
                    int iD0 = flow2.d0(constraintWidget2, this.q);
                    int iC02 = flow2.c0(constraintWidget2, this.q);
                    int i14 = flow2.V0;
                    if (constraintWidget2.j0 == 8) {
                        i14 = 0;
                    }
                    this.m = iC02 + i14 + this.m;
                    if (this.b == null || this.c < iD0) {
                        this.b = constraintWidget2;
                        this.c = iD0;
                        this.l = iD0;
                    }
                }
            }
        }

        public final void f(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.f2313a = i;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(int r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.a0(int, int, int, int):void");
    }

    public final int c0(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.V[1] == ConstraintWidget.DimensionBehaviour.f) {
            int i2 = constraintWidget.t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.A * i);
                if (i3 != constraintWidget.p()) {
                    constraintWidget.g = true;
                    b0(constraintWidget, constraintWidget.V[0], constraintWidget.v(), ConstraintWidget.DimensionBehaviour.d, i3);
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.p();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.v() * constraintWidget2.Z) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.p();
    }

    public final int d0(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.f) {
            int i2 = constraintWidget.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.x * i);
                if (i3 != constraintWidget.v()) {
                    constraintWidget.g = true;
                    b0(constraintWidget, ConstraintWidget.DimensionBehaviour.d, i3, constraintWidget.V[1], constraintWidget.p());
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.v();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.p() * constraintWidget2.Z) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.v();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void f(LinearSystem linearSystem, boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        super.f(linearSystem, z);
        ConstraintWidget constraintWidget2 = this.W;
        boolean z2 = constraintWidget2 != null && ((ConstraintWidgetContainer) constraintWidget2).A0;
        int i2 = this.Y0;
        ArrayList arrayList = this.b1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((WidgetsList) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((WidgetsList) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.e1 != null && this.d1 != null && this.c1 != null) {
                for (int i5 = 0; i5 < this.g1; i5++) {
                    this.f1[i5].I();
                }
                int[] iArr = this.e1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.O0;
                ConstraintWidget constraintWidget3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.O0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    ConstraintWidget constraintWidget4 = this.d1[i];
                    if (constraintWidget4 != null) {
                        ConstraintAnchor constraintAnchor = constraintWidget4.K;
                        if (constraintWidget4.j0 != 8) {
                            if (i8 == 0) {
                                constraintWidget4.j(constraintAnchor, this.K, this.B0);
                                constraintWidget4.m0 = this.I0;
                                constraintWidget4.g0 = f;
                            }
                            if (i8 == i6 - 1) {
                                constraintWidget4.j(constraintWidget4.M, this.M, this.C0);
                            }
                            if (i8 > 0 && constraintWidget3 != null) {
                                ConstraintAnchor constraintAnchor2 = constraintWidget3.M;
                                constraintWidget4.j(constraintAnchor, constraintAnchor2, this.U0);
                                constraintWidget3.j(constraintAnchor2, constraintAnchor, 0);
                            }
                            constraintWidget3 = constraintWidget4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    ConstraintWidget constraintWidget5 = this.c1[i9];
                    if (constraintWidget5 != null) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget5.L;
                        if (constraintWidget5.j0 != 8) {
                            if (i9 == 0) {
                                constraintWidget5.j(constraintAnchor3, this.L, this.x0);
                                constraintWidget5.n0 = this.J0;
                                constraintWidget5.h0 = this.P0;
                            }
                            if (i9 == i7 - 1) {
                                constraintWidget5.j(constraintWidget5.N, this.N, this.y0);
                            }
                            if (i9 > 0 && constraintWidget3 != null) {
                                ConstraintAnchor constraintAnchor4 = constraintWidget3.N;
                                constraintWidget5.j(constraintAnchor3, constraintAnchor4, this.V0);
                                constraintWidget3.j(constraintAnchor4, constraintAnchor3, 0);
                            }
                            constraintWidget3 = constraintWidget5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.a1 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.f1;
                        if (i12 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i12]) != null && constraintWidget.j0 != 8) {
                            ConstraintWidget constraintWidget6 = this.d1[i10];
                            ConstraintWidget constraintWidget7 = this.c1[i11];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.j(constraintWidget.K, constraintWidget6.K, 0);
                                constraintWidget.j(constraintWidget.M, constraintWidget6.M, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.j(constraintWidget.L, constraintWidget7.L, 0);
                                constraintWidget.j(constraintWidget.N, constraintWidget7.N, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((WidgetsList) arrayList.get(0)).b(0, z2, true);
        }
        this.D0 = false;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void k(ConstraintWidget constraintWidget, HashMap map) {
        super.k(constraintWidget, map);
        Flow flow = (Flow) constraintWidget;
        this.I0 = flow.I0;
        this.J0 = flow.J0;
        this.K0 = flow.K0;
        this.L0 = flow.L0;
        this.M0 = flow.M0;
        this.N0 = flow.N0;
        this.O0 = flow.O0;
        this.P0 = flow.P0;
        this.Q0 = flow.Q0;
        this.R0 = flow.R0;
        this.S0 = flow.S0;
        this.T0 = flow.T0;
        this.U0 = flow.U0;
        this.V0 = flow.V0;
        this.W0 = flow.W0;
        this.X0 = flow.X0;
        this.Y0 = flow.Y0;
        this.Z0 = flow.Z0;
        this.a1 = flow.a1;
    }
}
