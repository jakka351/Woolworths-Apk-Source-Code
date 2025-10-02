package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class HorizontalWidgetRun extends WidgetRun {
    public static final int[] k = new int[2];

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2321a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f2321a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2321a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2321a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.h.e = DependencyNode.Type.g;
        this.i.e = DependencyNode.Type.h;
        this.f = 0;
    }

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.constraintlayout.core.widgets.analyzer.Dependency r24) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.a(androidx.constraintlayout.core.widgets.analyzer.Dependency):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.b;
        boolean z = constraintWidget5.f2311a;
        DimensionDependency dimensionDependency = this.e;
        if (z) {
            dimensionDependency.d(constraintWidget5.v());
        }
        boolean z2 = dimensionDependency.j;
        ArrayList arrayList = dimensionDependency.k;
        ArrayList arrayList2 = dimensionDependency.l;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.g;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.d;
        DependencyNode dependencyNode = this.i;
        DependencyNode dependencyNode2 = this.h;
        if (!z2) {
            ConstraintWidget constraintWidget6 = this.b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidget6.V[0];
            this.d = dimensionBehaviour6;
            if (dimensionBehaviour6 != dimensionBehaviour4) {
                if (dimensionBehaviour6 == dimensionBehaviour3 && (constraintWidget4 = constraintWidget6.W) != null && ((dimensionBehaviour2 = constraintWidget4.V[0]) == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour3)) {
                    int iV = (constraintWidget4.v() - this.b.K.e()) - this.b.M.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.d.h, this.b.K.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.d.i, -this.b.M.e());
                    dimensionDependency.d(iV);
                    return;
                }
                if (dimensionBehaviour6 == dimensionBehaviour5) {
                    dimensionDependency.d(constraintWidget6.v());
                }
            }
        } else if (this.d == dimensionBehaviour3 && (constraintWidget2 = (constraintWidget = this.b).W) != null && ((dimensionBehaviour = constraintWidget2.V[0]) == dimensionBehaviour5 || dimensionBehaviour == dimensionBehaviour3)) {
            WidgetRun.b(dependencyNode2, constraintWidget2.d.h, constraintWidget.K.e());
            WidgetRun.b(dependencyNode, constraintWidget2.d.i, -this.b.M.e());
            return;
        }
        if (dimensionDependency.j) {
            ConstraintWidget constraintWidget7 = this.b;
            if (constraintWidget7.f2311a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.S;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f != null) {
                    if (constraintWidget7.C()) {
                        dependencyNode2.f = this.b.S[0].e();
                        dependencyNode.f = -this.b.S[1].e();
                        return;
                    }
                    DependencyNode dependencyNodeH = WidgetRun.h(this.b.S[0]);
                    if (dependencyNodeH != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH, this.b.S[0].e());
                    }
                    DependencyNode dependencyNodeH2 = WidgetRun.h(this.b.S[1]);
                    if (dependencyNodeH2 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH2, -this.b.S[1].e());
                    }
                    dependencyNode2.b = true;
                    dependencyNode.b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = WidgetRun.h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        WidgetRun.b(dependencyNode2, dependencyNodeH3, this.b.S[0].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f != null) {
                    DependencyNode dependencyNodeH4 = WidgetRun.h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        WidgetRun.b(dependencyNode, dependencyNodeH4, -this.b.S[1].e());
                        WidgetRun.b(dependencyNode2, dependencyNode, -dimensionDependency.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof Helper) || constraintWidget7.W == null || constraintWidget7.n(ConstraintAnchor.Type.i).f != null) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.b;
                WidgetRun.b(dependencyNode2, constraintWidget8.W.d.h, constraintWidget8.w());
                WidgetRun.b(dependencyNode, dependencyNode2, dimensionDependency.g);
                return;
            }
        }
        if (this.d == dimensionBehaviour4) {
            ConstraintWidget constraintWidget9 = this.b;
            int i = constraintWidget9.s;
            if (i == 2) {
                ConstraintWidget constraintWidget10 = constraintWidget9.W;
                if (constraintWidget10 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget10.e.e;
                    arrayList2.add(dimensionDependency2);
                    dimensionDependency2.k.add(dimensionDependency);
                    dimensionDependency.b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                }
            } else if (i == 3) {
                if (constraintWidget9.t == 3) {
                    dependencyNode2.f2319a = this;
                    dependencyNode.f2319a = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget9.e;
                    verticalWidgetRun.h.f2319a = this;
                    verticalWidgetRun.i.f2319a = this;
                    dimensionDependency.f2319a = this;
                    if (constraintWidget9.D()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(dimensionDependency);
                        VerticalWidgetRun verticalWidgetRun2 = this.b.e;
                        verticalWidgetRun2.e.f2319a = this;
                        arrayList2.add(verticalWidgetRun2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(dimensionDependency);
                        this.b.e.i.k.add(dimensionDependency);
                    } else if (this.b.C()) {
                        this.b.e.e.l.add(dimensionDependency);
                        arrayList.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(dimensionDependency);
                    }
                } else {
                    DimensionDependency dimensionDependency3 = constraintWidget9.e.e;
                    arrayList2.add(dimensionDependency3);
                    dimensionDependency3.k.add(dimensionDependency);
                    this.b.e.h.k.add(dimensionDependency);
                    this.b.e.i.k.add(dimensionDependency);
                    dimensionDependency.b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                    dependencyNode2.l.add(dimensionDependency);
                    dependencyNode.l.add(dimensionDependency);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f != null) {
            if (constraintWidget11.C()) {
                dependencyNode2.f = this.b.S[0].e();
                dependencyNode.f = -this.b.S[1].e();
                return;
            }
            DependencyNode dependencyNodeH5 = WidgetRun.h(this.b.S[0]);
            DependencyNode dependencyNodeH6 = WidgetRun.h(this.b.S[1]);
            if (dependencyNodeH5 != null) {
                dependencyNodeH5.b(this);
            }
            if (dependencyNodeH6 != null) {
                dependencyNodeH6.b(this);
            }
            this.j = WidgetRun.RunType.e;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode dependencyNodeH7 = WidgetRun.h(constraintAnchor4);
            if (dependencyNodeH7 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeH7, this.b.S[0].e());
                c(dependencyNode, dependencyNode2, 1, dimensionDependency);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f != null) {
            DependencyNode dependencyNodeH8 = WidgetRun.h(constraintAnchor6);
            if (dependencyNodeH8 != null) {
                WidgetRun.b(dependencyNode, dependencyNodeH8, -this.b.S[1].e());
                c(dependencyNode2, dependencyNode, -1, dimensionDependency);
                return;
            }
            return;
        }
        if ((constraintWidget11 instanceof Helper) || (constraintWidget3 = constraintWidget11.W) == null) {
            return;
        }
        WidgetRun.b(dependencyNode2, constraintWidget3.d.h, constraintWidget11.w());
        c(dependencyNode, dependencyNode2, 1, dimensionDependency);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.j) {
            this.b.b0 = dependencyNode.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.f || this.b.s == 0;
    }

    public final void n() {
        this.g = false;
        DependencyNode dependencyNode = this.h;
        dependencyNode.c();
        dependencyNode.j = false;
        DependencyNode dependencyNode2 = this.i;
        dependencyNode2.c();
        dependencyNode2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.l0;
    }
}
