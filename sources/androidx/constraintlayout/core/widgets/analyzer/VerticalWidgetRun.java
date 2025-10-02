package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class VerticalWidgetRun extends WidgetRun {
    public final DependencyNode k;
    public BaselineDimensionDependency l;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2323a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f2323a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2323a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2323a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.k = dependencyNode;
        this.l = null;
        this.h.e = DependencyNode.Type.i;
        this.i.e = DependencyNode.Type.j;
        dependencyNode.e = DependencyNode.Type.k;
        this.f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.b;
            l(constraintWidget.L, constraintWidget.N, 1);
            return;
        }
        DimensionDependency dimensionDependency = this.e;
        boolean z = dimensionDependency.c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f;
        if (z && !dimensionDependency.j && this.d == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.b;
            int i2 = constraintWidget2.t;
            if (i2 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.W;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.e.e.j) {
                        dimensionDependency.d((int) ((r1.g * constraintWidget2.A) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                DimensionDependency dimensionDependency2 = constraintWidget2.d.e;
                if (dimensionDependency2.j) {
                    int i3 = constraintWidget2.a0;
                    if (i3 == -1) {
                        f = dimensionDependency2.g;
                        f2 = constraintWidget2.Z;
                    } else if (i3 == 0) {
                        f3 = dimensionDependency2.g * constraintWidget2.Z;
                        i = (int) (f3 + 0.5f);
                        dimensionDependency.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        dimensionDependency.d(i);
                    } else {
                        f = dimensionDependency2.g;
                        f2 = constraintWidget2.Z;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    dimensionDependency.d(i);
                }
            }
        }
        DependencyNode dependencyNode = this.h;
        boolean z2 = dependencyNode.c;
        ArrayList arrayList = dependencyNode.l;
        if (z2) {
            DependencyNode dependencyNode2 = this.i;
            boolean z3 = dependencyNode2.c;
            ArrayList arrayList2 = dependencyNode2.l;
            if (z3) {
                if (dependencyNode.j && dependencyNode2.j && dimensionDependency.j) {
                    return;
                }
                if (!dimensionDependency.j && this.d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.b;
                    if (constraintWidget4.s == 0 && !constraintWidget4.D()) {
                        DependencyNode dependencyNode3 = (DependencyNode) arrayList.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) arrayList2.get(0);
                        int i4 = dependencyNode3.g + dependencyNode.f;
                        int i5 = dependencyNode4.g + dependencyNode2.f;
                        dependencyNode.d(i4);
                        dependencyNode2.d(i5);
                        dimensionDependency.d(i5 - i4);
                        return;
                    }
                }
                if (!dimensionDependency.j && this.d == dimensionBehaviour && this.f2325a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    DependencyNode dependencyNode5 = (DependencyNode) arrayList.get(0);
                    int i6 = (((DependencyNode) arrayList2.get(0)).g + dependencyNode2.f) - (dependencyNode5.g + dependencyNode.f);
                    int i7 = dimensionDependency.m;
                    if (i6 < i7) {
                        dimensionDependency.d(i6);
                    } else {
                        dimensionDependency.d(i7);
                    }
                }
                if (dimensionDependency.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) arrayList.get(0);
                    DependencyNode dependencyNode7 = (DependencyNode) arrayList2.get(0);
                    int i8 = dependencyNode6.g;
                    int i9 = dependencyNode.f + i8;
                    int i10 = dependencyNode7.g;
                    int i11 = dependencyNode2.f + i10;
                    float f4 = this.b.h0;
                    if (dependencyNode6 == dependencyNode7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    dependencyNode.d((int) ((((i10 - i8) - dimensionDependency.g) * f4) + i8 + 0.5f));
                    dependencyNode2.d(dependencyNode.g + dimensionDependency.g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.b;
        boolean z = constraintWidget5.f2311a;
        DimensionDependency dimensionDependency = this.e;
        if (z) {
            dimensionDependency.d(constraintWidget5.p());
        }
        boolean z2 = dimensionDependency.j;
        ArrayList arrayList = dimensionDependency.k;
        ArrayList arrayList2 = dimensionDependency.l;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.g;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f;
        DependencyNode dependencyNode = this.i;
        DependencyNode dependencyNode2 = this.h;
        if (!z2) {
            ConstraintWidget constraintWidget6 = this.b;
            this.d = constraintWidget6.V[1];
            if (constraintWidget6.F) {
                this.l = new BaselineDimensionDependency(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.d;
            if (dimensionBehaviour4 != dimensionBehaviour3) {
                if (dimensionBehaviour4 == dimensionBehaviour && (constraintWidget4 = this.b.W) != null && constraintWidget4.V[1] == dimensionBehaviour2) {
                    int iP = (constraintWidget4.p() - this.b.L.e()) - this.b.N.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.e.h, this.b.L.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.e.i, -this.b.N.e());
                    dimensionDependency.d(iP);
                    return;
                }
                if (dimensionBehaviour4 == dimensionBehaviour2) {
                    dimensionDependency.d(this.b.p());
                }
            }
        } else if (this.d == dimensionBehaviour && (constraintWidget2 = (constraintWidget = this.b).W) != null && constraintWidget2.V[1] == dimensionBehaviour2) {
            WidgetRun.b(dependencyNode2, constraintWidget2.e.h, constraintWidget.L.e());
            WidgetRun.b(dependencyNode, constraintWidget2.e.i, -this.b.N.e());
            return;
        }
        boolean z3 = dimensionDependency.j;
        DependencyNode dependencyNode3 = this.k;
        if (z3) {
            ConstraintWidget constraintWidget7 = this.b;
            if (constraintWidget7.f2311a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.S;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f != null) {
                    if (constraintWidget7.D()) {
                        dependencyNode2.f = this.b.S[2].e();
                        dependencyNode.f = -this.b.S[3].e();
                    } else {
                        DependencyNode dependencyNodeH = WidgetRun.h(this.b.S[2]);
                        if (dependencyNodeH != null) {
                            WidgetRun.b(dependencyNode2, dependencyNodeH, this.b.S[2].e());
                        }
                        DependencyNode dependencyNodeH2 = WidgetRun.h(this.b.S[3]);
                        if (dependencyNodeH2 != null) {
                            WidgetRun.b(dependencyNode, dependencyNodeH2, -this.b.S[3].e());
                        }
                        dependencyNode2.b = true;
                        dependencyNode.b = true;
                    }
                    ConstraintWidget constraintWidget8 = this.b;
                    if (constraintWidget8.F) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget8.d0);
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = WidgetRun.h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH3, this.b.S[2].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                        ConstraintWidget constraintWidget9 = this.b;
                        if (constraintWidget9.F) {
                            WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget9.d0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f != null) {
                    DependencyNode dependencyNodeH4 = WidgetRun.h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH4, -this.b.S[3].e());
                        WidgetRun.b(dependencyNode2, dependencyNode, -dimensionDependency.g);
                    }
                    ConstraintWidget constraintWidget10 = this.b;
                    if (constraintWidget10.F) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget10.d0);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f != null) {
                    DependencyNode dependencyNodeH5 = WidgetRun.h(constraintAnchor4);
                    if (dependencyNodeH5 != null) {
                        WidgetRun.b(dependencyNode3, dependencyNodeH5, 0);
                        WidgetRun.b(dependencyNode2, dependencyNode3, -this.b.d0);
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof Helper) || constraintWidget7.W == null || constraintWidget7.n(ConstraintAnchor.Type.i).f != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.b;
                WidgetRun.b(dependencyNode2, constraintWidget11.W.e.h, constraintWidget11.x());
                WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                ConstraintWidget constraintWidget12 = this.b;
                if (constraintWidget12.F) {
                    WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget12.d0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != dimensionBehaviour3) {
            dimensionDependency.b(this);
        } else {
            ConstraintWidget constraintWidget13 = this.b;
            int i = constraintWidget13.t;
            if (i == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.W;
                if (constraintWidget14 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget14.e.e;
                    arrayList2.add(dimensionDependency2);
                    dimensionDependency2.k.add(dimensionDependency);
                    dimensionDependency.b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                }
            } else if (i == 3 && !constraintWidget13.D()) {
                ConstraintWidget constraintWidget15 = this.b;
                if (constraintWidget15.s != 3) {
                    DimensionDependency dimensionDependency3 = constraintWidget15.d.e;
                    arrayList2.add(dimensionDependency3);
                    dimensionDependency3.k.add(dimensionDependency);
                    dimensionDependency.b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.S;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f != null) {
            if (constraintWidget16.D()) {
                dependencyNode2.f = this.b.S[2].e();
                dependencyNode.f = -this.b.S[3].e();
            } else {
                DependencyNode dependencyNodeH6 = WidgetRun.h(this.b.S[2]);
                DependencyNode dependencyNodeH7 = WidgetRun.h(this.b.S[3]);
                if (dependencyNodeH6 != null) {
                    dependencyNodeH6.b(this);
                }
                if (dependencyNodeH7 != null) {
                    dependencyNodeH7.b(this);
                }
                this.j = WidgetRun.RunType.e;
            }
            if (this.b.F) {
                c(dependencyNode3, dependencyNode2, 1, this.l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode dependencyNodeH8 = WidgetRun.h(constraintAnchor5);
            if (dependencyNodeH8 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeH8, this.b.S[2].e());
                c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                if (this.b.F) {
                    c(dependencyNode3, dependencyNode2, 1, this.l);
                }
                if (this.d == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.b;
                    if (constraintWidget17.Z > BitmapDescriptorFactory.HUE_RED) {
                        HorizontalWidgetRun horizontalWidgetRun = constraintWidget17.d;
                        if (horizontalWidgetRun.d == dimensionBehaviour3) {
                            horizontalWidgetRun.e.k.add(dimensionDependency);
                            arrayList2.add(this.b.d.e);
                            dimensionDependency.f2319a = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f != null) {
                DependencyNode dependencyNodeH9 = WidgetRun.h(constraintAnchor7);
                if (dependencyNodeH9 != null) {
                    WidgetRun.b(dependencyNode, dependencyNodeH9, -this.b.S[3].e());
                    c(dependencyNode2, dependencyNode, -1, dimensionDependency);
                    if (this.b.F) {
                        c(dependencyNode3, dependencyNode2, 1, this.l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f != null) {
                    DependencyNode dependencyNodeH10 = WidgetRun.h(constraintAnchor8);
                    if (dependencyNodeH10 != null) {
                        WidgetRun.b(dependencyNode3, dependencyNodeH10, 0);
                        c(dependencyNode2, dependencyNode3, -1, this.l);
                        c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                    }
                } else if (!(constraintWidget16 instanceof Helper) && (constraintWidget3 = constraintWidget16.W) != null) {
                    WidgetRun.b(dependencyNode2, constraintWidget3.e.h, constraintWidget16.x());
                    c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                    if (this.b.F) {
                        c(dependencyNode3, dependencyNode2, 1, this.l);
                    }
                    if (this.d == dimensionBehaviour3) {
                        ConstraintWidget constraintWidget18 = this.b;
                        if (constraintWidget18.Z > BitmapDescriptorFactory.HUE_RED) {
                            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget18.d;
                            if (horizontalWidgetRun2.d == dimensionBehaviour3) {
                                horizontalWidgetRun2.e.k.add(dimensionDependency);
                                arrayList2.add(this.b.d.e);
                                dimensionDependency.f2319a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            dimensionDependency.c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.j) {
            this.b.c0 = dependencyNode.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.f || this.b.t == 0;
    }

    public final void m() {
        this.g = false;
        DependencyNode dependencyNode = this.h;
        dependencyNode.c();
        dependencyNode.j = false;
        DependencyNode dependencyNode2 = this.i;
        dependencyNode2.c();
        dependencyNode2.j = false;
        DependencyNode dependencyNode3 = this.k;
        dependencyNode3.c();
        dependencyNode3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.l0;
    }
}
