package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class Direct {

    /* renamed from: a, reason: collision with root package name */
    public static final BasicMeasure.Measure f2320a = new BasicMeasure.Measure();

    public static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.W;
        ConstraintWidgetContainer constraintWidgetContainer = constraintWidget2 != null ? (ConstraintWidgetContainer) constraintWidget2 : null;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.d;
        if (constraintWidgetContainer != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer.V[0];
        }
        if (constraintWidgetContainer != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer.V[1];
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.e;
        boolean z = dimensionBehaviour == dimensionBehaviour3 || constraintWidget.F() || dimensionBehaviour == dimensionBehaviour7 || (dimensionBehaviour == dimensionBehaviour6 && constraintWidget.s == 0 && constraintWidget.Z == BitmapDescriptorFactory.HUE_RED && constraintWidget.y(0)) || (dimensionBehaviour == dimensionBehaviour6 && constraintWidget.s == 1 && constraintWidget.z(0, constraintWidget.v()));
        boolean z2 = dimensionBehaviour2 == dimensionBehaviour3 || constraintWidget.G() || dimensionBehaviour2 == dimensionBehaviour7 || (dimensionBehaviour2 == dimensionBehaviour6 && constraintWidget.t == 0 && constraintWidget.Z == BitmapDescriptorFactory.HUE_RED && constraintWidget.y(1)) || (dimensionBehaviour2 == dimensionBehaviour6 && constraintWidget.t == 1 && constraintWidget.z(1, constraintWidget.p()));
        return (constraintWidget.Z > BitmapDescriptorFactory.HUE_RED && (z || z2)) || (z && z2);
    }

    public static void b(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        boolean z2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.n) {
            return;
        }
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.E() && a(constraintWidget)) {
            ConstraintWidgetContainer.d0(constraintWidget, measurer, new BasicMeasure.Measure());
        }
        ConstraintAnchor constraintAnchorN = constraintWidget.n(ConstraintAnchor.Type.d);
        ConstraintAnchor constraintAnchorN2 = constraintWidget.n(ConstraintAnchor.Type.f);
        int iD = constraintAnchorN.d();
        int iD2 = constraintAnchorN2.d();
        HashSet hashSet = constraintAnchorN.f2310a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f;
        if (hashSet != null && constraintAnchorN.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor constraintAnchor5 = (ConstraintAnchor) it.next();
                ConstraintWidget constraintWidget2 = constraintAnchor5.d;
                int i2 = i + 1;
                boolean zA = a(constraintWidget2);
                ConstraintAnchor constraintAnchor6 = constraintWidget2.K;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.M;
                if (constraintWidget2.E() && zA) {
                    z2 = true;
                    ConstraintWidgetContainer.d0(constraintWidget2, measurer, new BasicMeasure.Measure());
                } else {
                    z2 = true;
                }
                boolean z3 = ((constraintAnchor5 == constraintAnchor6 && (constraintAnchor4 = constraintAnchor7.f) != null && constraintAnchor4.c) || (constraintAnchor5 == constraintAnchor7 && (constraintAnchor3 = constraintAnchor6.f) != null && constraintAnchor3.c)) ? z2 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.V[0];
                if (dimensionBehaviour2 != dimensionBehaviour || zA) {
                    if (!constraintWidget2.E()) {
                        if (constraintAnchor5 == constraintAnchor6 && constraintAnchor7.f == null) {
                            int iE = constraintAnchor6.e() + iD;
                            constraintWidget2.P(iE, constraintWidget2.v() + iE);
                            b(i2, constraintWidget2, measurer, z);
                        } else if (constraintAnchor5 == constraintAnchor7 && constraintAnchor6.f == null) {
                            int iE2 = iD - constraintAnchor7.e();
                            constraintWidget2.P(iE2 - constraintWidget2.v(), iE2);
                            b(i2, constraintWidget2, measurer, z);
                        } else if (z3 && !constraintWidget2.C()) {
                            c(i2, constraintWidget2, measurer, z);
                        }
                    }
                } else if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.w >= 0 && constraintWidget2.v >= 0 && (constraintWidget2.j0 == 8 || (constraintWidget2.s == 0 && constraintWidget2.Z == BitmapDescriptorFactory.HUE_RED))) {
                    if (!constraintWidget2.C() && !constraintWidget2.H && z3 && !constraintWidget2.C()) {
                        d(i2, constraintWidget, measurer, constraintWidget2, z);
                    }
                }
            }
        }
        if (constraintWidget instanceof Guideline) {
            return;
        }
        HashSet hashSet2 = constraintAnchorN2.f2310a;
        if (hashSet2 != null && constraintAnchorN2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor constraintAnchor8 = (ConstraintAnchor) it2.next();
                ConstraintWidget constraintWidget3 = constraintAnchor8.d;
                int i3 = i + 1;
                boolean zA2 = a(constraintWidget3);
                ConstraintAnchor constraintAnchor9 = constraintWidget3.K;
                ConstraintAnchor constraintAnchor10 = constraintWidget3.M;
                if (constraintWidget3.E() && zA2) {
                    ConstraintWidgetContainer.d0(constraintWidget3, measurer, new BasicMeasure.Measure());
                }
                boolean z4 = (constraintAnchor8 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor10.f) != null && constraintAnchor2.c) || (constraintAnchor8 == constraintAnchor10 && (constraintAnchor = constraintAnchor9.f) != null && constraintAnchor.c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.V[0];
                if (dimensionBehaviour3 != dimensionBehaviour || zA2) {
                    if (!constraintWidget3.E()) {
                        if (constraintAnchor8 == constraintAnchor9 && constraintAnchor10.f == null) {
                            int iE3 = constraintAnchor9.e() + iD2;
                            constraintWidget3.P(iE3, constraintWidget3.v() + iE3);
                            b(i3, constraintWidget3, measurer, z);
                        } else if (constraintAnchor8 == constraintAnchor10 && constraintAnchor9.f == null) {
                            int iE4 = iD2 - constraintAnchor10.e();
                            constraintWidget3.P(iE4 - constraintWidget3.v(), iE4);
                            b(i3, constraintWidget3, measurer, z);
                        } else if (z4 && !constraintWidget3.C()) {
                            c(i3, constraintWidget3, measurer, z);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.w >= 0 && constraintWidget3.v >= 0) {
                    if (constraintWidget3.j0 == 8 || (constraintWidget3.s == 0 && constraintWidget3.Z == BitmapDescriptorFactory.HUE_RED)) {
                        if (!constraintWidget3.C() && !constraintWidget3.H && z4 && !constraintWidget3.C()) {
                            d(i3, constraintWidget, measurer, constraintWidget3, z);
                        }
                    }
                }
            }
        }
        constraintWidget.n = true;
    }

    public static void c(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, boolean z) {
        float f = constraintWidget.g0;
        ConstraintAnchor constraintAnchor = constraintWidget.K;
        int iD = constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.M;
        int iD2 = constraintAnchor2.f.d();
        int iE = constraintAnchor.e() + iD;
        int iE2 = iD2 - constraintAnchor2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iV = constraintWidget.v();
        int i2 = (iD2 - iD) - iV;
        if (iD > iD2) {
            i2 = (iD - iD2) - iV;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iD;
        int i4 = i3 + iV;
        if (iD > iD2) {
            i4 = i3 - iV;
        }
        constraintWidget.P(i3, i4);
        b(i + 1, constraintWidget, measurer, z);
    }

    public static void d(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2, boolean z) {
        float f = constraintWidget2.g0;
        ConstraintAnchor constraintAnchor = constraintWidget2.K;
        int iE = constraintAnchor.e() + constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.M;
        int iD = constraintAnchor2.f.d() - constraintAnchor2.e();
        if (iD >= iE) {
            int iV = constraintWidget2.v();
            if (constraintWidget2.j0 != 8) {
                int i2 = constraintWidget2.s;
                if (i2 == 2) {
                    iV = (int) (constraintWidget2.g0 * 0.5f * (constraintWidget instanceof ConstraintWidgetContainer ? constraintWidget.v() : constraintWidget.W.v()));
                } else if (i2 == 0) {
                    iV = iD - iE;
                }
                iV = Math.max(constraintWidget2.v, iV);
                int i3 = constraintWidget2.w;
                if (i3 > 0) {
                    iV = Math.min(i3, iV);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iV)) + 0.5f));
            constraintWidget2.P(i4, iV + i4);
            b(i + 1, constraintWidget2, measurer, z);
        }
    }

    public static void e(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer) {
        float f = constraintWidget.h0;
        ConstraintAnchor constraintAnchor = constraintWidget.L;
        int iD = constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.N;
        int iD2 = constraintAnchor2.f.d();
        int iE = constraintAnchor.e() + iD;
        int iE2 = iD2 - constraintAnchor2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iP = constraintWidget.p();
        int i2 = (iD2 - iD) - iP;
        if (iD > iD2) {
            i2 = (iD - iD2) - iP;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iD + i3;
        int i5 = i4 + iP;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iP;
        }
        constraintWidget.Q(i4, i5);
        g(i + 1, constraintWidget, measurer);
    }

    public static void f(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2) {
        float f = constraintWidget2.h0;
        ConstraintAnchor constraintAnchor = constraintWidget2.L;
        int iE = constraintAnchor.e() + constraintAnchor.f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.N;
        int iD = constraintAnchor2.f.d() - constraintAnchor2.e();
        if (iD >= iE) {
            int iP = constraintWidget2.p();
            if (constraintWidget2.j0 != 8) {
                int i2 = constraintWidget2.t;
                if (i2 == 2) {
                    iP = (int) (f * 0.5f * (constraintWidget instanceof ConstraintWidgetContainer ? constraintWidget.p() : constraintWidget.W.p()));
                } else if (i2 == 0) {
                    iP = iD - iE;
                }
                iP = Math.max(constraintWidget2.y, iP);
                int i3 = constraintWidget2.z;
                if (i3 > 0) {
                    iP = Math.min(i3, iP);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iP)) + 0.5f));
            constraintWidget2.Q(i4, iP + i4);
            g(i + 1, constraintWidget2, measurer);
        }
    }

    public static void g(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer) {
        boolean z;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.o) {
            return;
        }
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.E() && a(constraintWidget)) {
            ConstraintWidgetContainer.d0(constraintWidget, measurer, new BasicMeasure.Measure());
        }
        ConstraintAnchor constraintAnchorN = constraintWidget.n(ConstraintAnchor.Type.e);
        ConstraintAnchor constraintAnchorN2 = constraintWidget.n(ConstraintAnchor.Type.g);
        int iD = constraintAnchorN.d();
        int iD2 = constraintAnchorN2.d();
        HashSet hashSet = constraintAnchorN.f2310a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f;
        if (hashSet != null && constraintAnchorN.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor constraintAnchor5 = (ConstraintAnchor) it.next();
                ConstraintWidget constraintWidget2 = constraintAnchor5.d;
                int i2 = i + 1;
                boolean zA = a(constraintWidget2);
                ConstraintAnchor constraintAnchor6 = constraintWidget2.L;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.N;
                if (constraintWidget2.E() && zA) {
                    ConstraintWidgetContainer.d0(constraintWidget2, measurer, new BasicMeasure.Measure());
                }
                boolean z2 = (constraintAnchor5 == constraintAnchor6 && (constraintAnchor4 = constraintAnchor7.f) != null && constraintAnchor4.c) || (constraintAnchor5 == constraintAnchor7 && (constraintAnchor3 = constraintAnchor6.f) != null && constraintAnchor3.c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.V[1];
                if (dimensionBehaviour2 != dimensionBehaviour || zA) {
                    if (!constraintWidget2.E()) {
                        if (constraintAnchor5 == constraintAnchor6 && constraintAnchor7.f == null) {
                            int iE = constraintAnchor6.e() + iD;
                            constraintWidget2.Q(iE, constraintWidget2.p() + iE);
                            g(i2, constraintWidget2, measurer);
                        } else if (constraintAnchor5 == constraintAnchor7 && constraintAnchor6.f == null) {
                            int iE2 = iD - constraintAnchor7.e();
                            constraintWidget2.Q(iE2 - constraintWidget2.p(), iE2);
                            g(i2, constraintWidget2, measurer);
                        } else if (z2 && !constraintWidget2.D()) {
                            e(i2, constraintWidget2, measurer);
                        }
                    }
                } else if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.z >= 0 && constraintWidget2.y >= 0 && (constraintWidget2.j0 == 8 || (constraintWidget2.t == 0 && constraintWidget2.Z == BitmapDescriptorFactory.HUE_RED))) {
                    if (!constraintWidget2.D() && !constraintWidget2.H && z2 && !constraintWidget2.D()) {
                        f(i2, constraintWidget, measurer, constraintWidget2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (constraintWidget instanceof Guideline) {
            return;
        }
        HashSet hashSet2 = constraintAnchorN2.f2310a;
        if (hashSet2 != null && constraintAnchorN2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor constraintAnchor8 = (ConstraintAnchor) it2.next();
                ConstraintWidget constraintWidget3 = constraintAnchor8.d;
                int i3 = i + 1;
                boolean zA2 = a(constraintWidget3);
                ConstraintAnchor constraintAnchor9 = constraintWidget3.L;
                ConstraintAnchor constraintAnchor10 = constraintWidget3.N;
                if (constraintWidget3.E() && zA2) {
                    ConstraintWidgetContainer.d0(constraintWidget3, measurer, new BasicMeasure.Measure());
                }
                boolean z4 = (constraintAnchor8 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor10.f) != null && constraintAnchor2.c) || (constraintAnchor8 == constraintAnchor10 && (constraintAnchor = constraintAnchor9.f) != null && constraintAnchor.c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.V[1];
                if (dimensionBehaviour3 != dimensionBehaviour || zA2) {
                    if (!constraintWidget3.E()) {
                        if (constraintAnchor8 == constraintAnchor9 && constraintAnchor10.f == null) {
                            int iE3 = constraintAnchor9.e() + iD2;
                            constraintWidget3.Q(iE3, constraintWidget3.p() + iE3);
                            g(i3, constraintWidget3, measurer);
                        } else if (constraintAnchor8 == constraintAnchor10 && constraintAnchor9.f == null) {
                            int iE4 = iD2 - constraintAnchor10.e();
                            constraintWidget3.Q(iE4 - constraintWidget3.p(), iE4);
                            g(i3, constraintWidget3, measurer);
                        } else if (z4 && !constraintWidget3.D()) {
                            e(i3, constraintWidget3, measurer);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.z >= 0 && constraintWidget3.y >= 0 && (constraintWidget3.j0 == 8 || (constraintWidget3.t == 0 && constraintWidget3.Z == BitmapDescriptorFactory.HUE_RED))) {
                    if (!constraintWidget3.D() && !constraintWidget3.H && z4 && !constraintWidget3.D()) {
                        f(i3, constraintWidget, measurer, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorN3 = constraintWidget.n(ConstraintAnchor.Type.h);
        if (constraintAnchorN3.f2310a != null && constraintAnchorN3.c) {
            int iD3 = constraintAnchorN3.d();
            Iterator it3 = constraintAnchorN3.f2310a.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor constraintAnchor11 = (ConstraintAnchor) it3.next();
                ConstraintWidget constraintWidget4 = constraintAnchor11.d;
                int i4 = i + 1;
                boolean zA3 = a(constraintWidget4);
                ConstraintAnchor constraintAnchor12 = constraintWidget4.O;
                if (constraintWidget4.E() && zA3) {
                    ConstraintWidgetContainer.d0(constraintWidget4, measurer, new BasicMeasure.Measure());
                }
                if (constraintWidget4.V[z3 ? 1 : 0] != dimensionBehaviour || zA3) {
                    if (!constraintWidget4.E()) {
                        if (constraintAnchor11 == constraintAnchor12) {
                            int iE5 = constraintAnchor11.e() + iD3;
                            if (constraintWidget4.F) {
                                int i5 = iE5 - constraintWidget4.d0;
                                int i6 = constraintWidget4.Y + i5;
                                constraintWidget4.c0 = i5;
                                constraintWidget4.L.l(i5);
                                constraintWidget4.N.l(i6);
                                constraintAnchor12.l(iE5);
                                z = z3 ? 1 : 0;
                                constraintWidget4.m = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            g(i4, constraintWidget4, measurer);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        constraintWidget.o = z3;
    }
}
