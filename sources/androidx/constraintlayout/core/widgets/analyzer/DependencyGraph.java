package androidx.constraintlayout.core.widgets.analyzer;

import YU.a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class DependencyGraph {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintWidgetContainer f2318a;
    public final ConstraintWidgetContainer d;
    public BasicMeasure.Measurer f;
    public final BasicMeasure.Measure g;
    public final ArrayList h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        new ArrayList();
        this.f = null;
        this.g = new BasicMeasure.Measure();
        this.h = new ArrayList();
        this.f2318a = constraintWidgetContainer;
        this.d = constraintWidgetContainer;
    }

    public final void a(DependencyNode dependencyNode, int i, ArrayList arrayList, RunGroup runGroup) {
        WidgetRun widgetRun = dependencyNode.d;
        RunGroup runGroup2 = widgetRun.c;
        DependencyNode dependencyNode2 = widgetRun.i;
        DependencyNode dependencyNode3 = widgetRun.h;
        if (runGroup2 == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f2318a;
            if (widgetRun == constraintWidgetContainer.d || widgetRun == constraintWidgetContainer.e) {
                return;
            }
            if (runGroup == null) {
                runGroup = new RunGroup();
                runGroup.f2322a = null;
                runGroup.b = new ArrayList();
                runGroup.f2322a = widgetRun;
                arrayList.add(runGroup);
            }
            widgetRun.c = runGroup;
            runGroup.b.add(widgetRun);
            Iterator it = dependencyNode3.k.iterator();
            while (it.hasNext()) {
                Dependency dependency = (Dependency) it.next();
                if (dependency instanceof DependencyNode) {
                    a((DependencyNode) dependency, i, arrayList, runGroup);
                }
            }
            Iterator it2 = dependencyNode2.k.iterator();
            while (it2.hasNext()) {
                Dependency dependency2 = (Dependency) it2.next();
                if (dependency2 instanceof DependencyNode) {
                    a((DependencyNode) dependency2, i, arrayList, runGroup);
                }
            }
            if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator it3 = ((VerticalWidgetRun) widgetRun).k.k.iterator();
                while (it3.hasNext()) {
                    Dependency dependency3 = (Dependency) it3.next();
                    if (dependency3 instanceof DependencyNode) {
                        a((DependencyNode) dependency3, i, arrayList, runGroup);
                    }
                }
            }
            Iterator it4 = dependencyNode3.l.iterator();
            while (it4.hasNext()) {
                a((DependencyNode) it4.next(), i, arrayList, runGroup);
            }
            Iterator it5 = dependencyNode2.l.iterator();
            while (it5.hasNext()) {
                a((DependencyNode) it5.next(), i, arrayList, runGroup);
            }
            if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator it6 = ((VerticalWidgetRun) widgetRun).k.l.iterator();
                while (it6.hasNext()) {
                    a((DependencyNode) it6.next(), i, arrayList, runGroup);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r25) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.DependencyGraph.b(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer):void");
    }

    public final void c() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ConstraintWidgetContainer constraintWidgetContainer = this.d;
        constraintWidgetContainer.d.f();
        constraintWidgetContainer.e.f();
        arrayList.add(constraintWidgetContainer.d);
        arrayList.add(constraintWidgetContainer.e);
        Iterator it = constraintWidgetContainer.v0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (constraintWidget instanceof Guideline) {
                GuidelineReference guidelineReference = new GuidelineReference(constraintWidget);
                constraintWidget.d.f();
                constraintWidget.e.f();
                guidelineReference.f = ((Guideline) constraintWidget).z0;
                arrayList.add(guidelineReference);
            } else {
                if (constraintWidget.C()) {
                    if (constraintWidget.b == null) {
                        constraintWidget.b = new ChainRun(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.b);
                } else {
                    arrayList.add(constraintWidget.d);
                }
                if (constraintWidget.D()) {
                    if (constraintWidget.c == null) {
                        constraintWidget.c = new ChainRun(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.c);
                } else {
                    arrayList.add(constraintWidget.e);
                }
                if (constraintWidget instanceof HelperWidget) {
                    arrayList.add(new HelperReferences(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((WidgetRun) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it3.next();
            if (widgetRun.b != constraintWidgetContainer) {
                widgetRun.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ConstraintWidgetContainer constraintWidgetContainer2 = this.f2318a;
        g(constraintWidgetContainer2.d, 0, arrayList2);
        g(constraintWidgetContainer2.e, 1, arrayList2);
        this.b = false;
    }

    public final int d(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            WidgetRun widgetRun = ((RunGroup) arrayList2.get(i3)).f2322a;
            if (!(widgetRun instanceof ChainRun) ? !(i != 0 ? (widgetRun instanceof VerticalWidgetRun) : (widgetRun instanceof HorizontalWidgetRun)) : ((ChainRun) widgetRun).f != i) {
                DependencyNode dependencyNode = (i == 0 ? constraintWidgetContainer2.d : constraintWidgetContainer2.e).h;
                DependencyNode dependencyNode2 = (i == 0 ? constraintWidgetContainer2.d : constraintWidgetContainer2.e).i;
                DependencyNode dependencyNode3 = widgetRun.h;
                DependencyNode dependencyNode4 = widgetRun.i;
                boolean zContains = dependencyNode3.l.contains(dependencyNode);
                boolean zContains2 = dependencyNode4.l.contains(dependencyNode2);
                long j2 = widgetRun.j();
                if (zContains && zContains2) {
                    long jB = RunGroup.b(dependencyNode3, j);
                    long jA = RunGroup.a(dependencyNode4, j);
                    long j3 = jB - j2;
                    int i4 = dependencyNode4.f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j3 >= (-i4)) {
                        j3 += i4;
                    }
                    long j4 = dependencyNode3.f;
                    long j5 = ((-jA) - j2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    ConstraintWidget constraintWidget = widgetRun.b;
                    if (i == 0) {
                        f = constraintWidget.g0;
                    } else if (i == 1) {
                        f = constraintWidget.h0;
                    } else {
                        constraintWidget.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > BitmapDescriptorFactory.HUE_RED ? (long) ((j3 / (1.0f - f)) + (j5 / f)) : 0L;
                    jMax = (dependencyNode3.f + ((((long) ((f2 * f) + 0.5f)) + j2) + ((long) a.a(1.0f, f, f2, 0.5f)))) - dependencyNode4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    jMax = zContains ? Math.max(RunGroup.b(dependencyNode3, dependencyNode3.f), dependencyNode3.f + j2) : zContains2 ? Math.max(-RunGroup.a(dependencyNode4, dependencyNode4.f), (-dependencyNode4.f) + j2) : (widgetRun.j() + dependencyNode3.f) - dependencyNode4.f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3++;
            constraintWidgetContainer2 = constraintWidgetContainer;
            arrayList2 = arrayList;
            size = i2;
            j = 0;
        }
        return (int) jMax2;
    }

    public final boolean e(boolean z) {
        boolean z2;
        boolean z3 = this.b;
        boolean z4 = false;
        ConstraintWidgetContainer constraintWidgetContainer = this.f2318a;
        if (z3 || this.c) {
            Iterator it = constraintWidgetContainer.v0.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                constraintWidget.m();
                constraintWidget.f2311a = false;
                constraintWidget.d.n();
                constraintWidget.e.m();
            }
            constraintWidgetContainer.m();
            constraintWidgetContainer.f2311a = false;
            constraintWidgetContainer.d.n();
            constraintWidgetContainer.e.m();
            this.c = false;
        }
        b(this.d);
        constraintWidgetContainer.b0 = 0;
        constraintWidgetContainer.c0 = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourO = constraintWidgetContainer.o(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourO2 = constraintWidgetContainer.o(1);
        if (this.b) {
            c();
        }
        int iW = constraintWidgetContainer.w();
        int iX = constraintWidgetContainer.x();
        constraintWidgetContainer.d.h.d(iW);
        constraintWidgetContainer.e.h.d(iX);
        i();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.d;
        ArrayList arrayList = this.e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e;
        if (dimensionBehaviourO == dimensionBehaviour2 || dimensionBehaviourO2 == dimensionBehaviour2) {
            if (z) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((WidgetRun) it2.next()).k()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && dimensionBehaviourO == dimensionBehaviour2) {
                constraintWidgetContainer.S(dimensionBehaviour);
                constraintWidgetContainer.W(d(constraintWidgetContainer, 0));
                constraintWidgetContainer.d.e.d(constraintWidgetContainer.v());
            }
            if (z && dimensionBehaviourO2 == dimensionBehaviour2) {
                constraintWidgetContainer.U(dimensionBehaviour);
                constraintWidgetContainer.R(d(constraintWidgetContainer, 1));
                constraintWidgetContainer.e.e.d(constraintWidgetContainer.p());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidgetContainer.V[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.g;
        if (dimensionBehaviour3 == dimensionBehaviour || dimensionBehaviour3 == dimensionBehaviour4) {
            int iV = constraintWidgetContainer.v() + iW;
            constraintWidgetContainer.d.i.d(iV);
            constraintWidgetContainer.d.e.d(iV - iW);
            i();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer.V[1];
            if (dimensionBehaviour5 == dimensionBehaviour || dimensionBehaviour5 == dimensionBehaviour4) {
                int iP = constraintWidgetContainer.p() + iX;
                constraintWidgetContainer.e.i.d(iP);
                constraintWidgetContainer.e.e.d(iP - iX);
            }
            i();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it3.next();
            if (widgetRun.b != constraintWidgetContainer || widgetRun.g) {
                widgetRun.e();
            }
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z4 = true;
                break;
            }
            WidgetRun widgetRun2 = (WidgetRun) it4.next();
            if (z2 || widgetRun2.b != constraintWidgetContainer) {
                if (!widgetRun2.h.j || ((!widgetRun2.i.j && !(widgetRun2 instanceof GuidelineReference)) || (!widgetRun2.e.j && !(widgetRun2 instanceof ChainRun) && !(widgetRun2 instanceof GuidelineReference)))) {
                    break;
                }
            }
        }
        constraintWidgetContainer.S(dimensionBehaviourO);
        constraintWidgetContainer.U(dimensionBehaviourO2);
        return z4;
    }

    public final boolean f(int i, boolean z) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidgetContainer constraintWidgetContainer = this.f2318a;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourO = constraintWidgetContainer.o(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourO2 = constraintWidgetContainer.o(1);
        int iW = constraintWidgetContainer.w();
        int iX = constraintWidgetContainer.x();
        ArrayList arrayList = this.e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.d;
        if (z && (dimensionBehaviourO == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.e) || dimensionBehaviourO2 == dimensionBehaviour)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun widgetRun = (WidgetRun) it.next();
                if (widgetRun.f == i && !widgetRun.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && dimensionBehaviourO == dimensionBehaviour) {
                    constraintWidgetContainer.S(dimensionBehaviour2);
                    constraintWidgetContainer.W(d(constraintWidgetContainer, 0));
                    constraintWidgetContainer.d.e.d(constraintWidgetContainer.v());
                }
            } else if (z && dimensionBehaviourO2 == dimensionBehaviour) {
                constraintWidgetContainer.U(dimensionBehaviour2);
                constraintWidgetContainer.R(d(constraintWidgetContainer, 1));
                constraintWidgetContainer.e.e.d(constraintWidgetContainer.p());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.g;
        if (i == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer.V[0];
            if (dimensionBehaviour4 == dimensionBehaviour2 || dimensionBehaviour4 == dimensionBehaviour3) {
                int iV = constraintWidgetContainer.v() + iW;
                constraintWidgetContainer.d.i.d(iV);
                constraintWidgetContainer.d.e.d(iV - iW);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer.V[1];
            if (dimensionBehaviour5 == dimensionBehaviour2 || dimensionBehaviour5 == dimensionBehaviour3) {
                int iP = constraintWidgetContainer.p() + iX;
                constraintWidgetContainer.e.i.d(iP);
                constraintWidgetContainer.e.e.d(iP - iX);
                z2 = true;
            }
            z2 = false;
        }
        i();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WidgetRun widgetRun2 = (WidgetRun) it2.next();
            if (widgetRun2.f == i && (widgetRun2.b != constraintWidgetContainer || widgetRun2.g)) {
                widgetRun2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z3 = true;
                break;
            }
            WidgetRun widgetRun3 = (WidgetRun) it3.next();
            if (widgetRun3.f == i && (z2 || widgetRun3.b != constraintWidgetContainer)) {
                if (!widgetRun3.h.j || !widgetRun3.i.j || (!(widgetRun3 instanceof ChainRun) && !widgetRun3.e.j)) {
                    break;
                }
            }
        }
        constraintWidgetContainer.S(dimensionBehaviourO);
        constraintWidgetContainer.U(dimensionBehaviourO2);
        return z3;
    }

    public final void g(WidgetRun widgetRun, int i, ArrayList arrayList) {
        DependencyNode dependencyNode = widgetRun.h;
        DependencyNode dependencyNode2 = widgetRun.i;
        Iterator it = dependencyNode.k.iterator();
        while (it.hasNext()) {
            Dependency dependency = (Dependency) it.next();
            if (dependency instanceof DependencyNode) {
                a((DependencyNode) dependency, i, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                a(((WidgetRun) dependency).h, i, arrayList, null);
            }
        }
        Iterator it2 = dependencyNode2.k.iterator();
        while (it2.hasNext()) {
            Dependency dependency2 = (Dependency) it2.next();
            if (dependency2 instanceof DependencyNode) {
                a((DependencyNode) dependency2, i, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                a(((WidgetRun) dependency2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((VerticalWidgetRun) widgetRun).k.k.iterator();
            while (it3.hasNext()) {
                Dependency dependency3 = (Dependency) it3.next();
                if (dependency3 instanceof DependencyNode) {
                    a((DependencyNode) dependency3, i, arrayList, null);
                }
            }
        }
    }

    public final void h(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure.Measure measure = this.g;
        measure.f2317a = dimensionBehaviour;
        measure.b = dimensionBehaviour2;
        measure.c = i;
        measure.d = i2;
        this.f.b(constraintWidget, measure);
        constraintWidget.W(measure.e);
        constraintWidget.R(measure.f);
        constraintWidget.F = measure.h;
        constraintWidget.N(measure.g);
    }

    public final void i() {
        BaselineDimensionDependency baselineDimensionDependency;
        Iterator it = this.f2318a.v0.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (!constraintWidget.f2311a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = constraintWidget.s;
                int i2 = constraintWidget.t;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.e;
                boolean z2 = dimensionBehaviour == dimensionBehaviour4 || (dimensionBehaviour == dimensionBehaviour3 && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour4 || (dimensionBehaviour2 == dimensionBehaviour3 && i2 == 1)) {
                    z = true;
                }
                DimensionDependency dimensionDependency = constraintWidget.d.e;
                boolean z3 = dimensionDependency.j;
                DimensionDependency dimensionDependency2 = constraintWidget.e.e;
                boolean z4 = dimensionDependency2.j;
                boolean z5 = z2;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.d;
                if (z3 && z4) {
                    h(constraintWidget, dimensionBehaviour5, dimensionDependency.g, dimensionBehaviour5, dimensionDependency2.g);
                    constraintWidget.f2311a = true;
                } else if (z3 && z) {
                    h(constraintWidget, dimensionBehaviour5, dimensionDependency.g, dimensionBehaviour4, dimensionDependency2.g);
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget.e.e.m = constraintWidget.p();
                    } else {
                        constraintWidget.e.e.d(constraintWidget.p());
                        constraintWidget.f2311a = true;
                    }
                } else if (z4 && z5) {
                    h(constraintWidget, dimensionBehaviour4, dimensionDependency.g, dimensionBehaviour5, dimensionDependency2.g);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget.d.e.m = constraintWidget.v();
                    } else {
                        constraintWidget.d.e.d(constraintWidget.v());
                        constraintWidget.f2311a = true;
                    }
                }
                if (constraintWidget.f2311a && (baselineDimensionDependency = constraintWidget.e.l) != null) {
                    baselineDimensionDependency.d(constraintWidget.d0);
                }
            }
        }
    }
}
