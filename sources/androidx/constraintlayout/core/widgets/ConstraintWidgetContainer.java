package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ConstraintWidgetContainer extends WidgetContainer {
    public boolean A0;
    public Metrics B0;
    public LinearSystem C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public ChainHead[] H0;
    public ChainHead[] I0;
    public int J0;
    public boolean K0;
    public boolean L0;
    public WeakReference M0;
    public WeakReference N0;
    public WeakReference O0;
    public WeakReference P0;
    public HashSet Q0;
    public BasicMeasure.Measure R0;
    public BasicMeasure w0;
    public DependencyGraph x0;
    public int y0;
    public BasicMeasure.Measurer z0;

    public ConstraintWidgetContainer() {
        this.v0 = new ArrayList();
        this.w0 = new BasicMeasure(this);
        this.x0 = new DependencyGraph(this);
        this.z0 = null;
        this.A0 = false;
        this.C0 = new LinearSystem();
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = new ChainHead[4];
        this.I0 = new ChainHead[4];
        this.J0 = 257;
        this.K0 = false;
        this.L0 = false;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = new HashSet();
        this.R0 = new BasicMeasure.Measure();
    }

    public static void d0(ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, BasicMeasure.Measure measure) {
        int i;
        int i2;
        if (measurer == null) {
            return;
        }
        int i3 = constraintWidget.j0;
        int[] iArr = constraintWidget.u;
        if (i3 == 8 || (constraintWidget instanceof Guideline) || (constraintWidget instanceof Barrier)) {
            measure.e = 0;
            measure.f = 0;
            return;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        measure.f2317a = dimensionBehaviourArr[0];
        measure.b = dimensionBehaviourArr[1];
        measure.c = constraintWidget.v();
        measure.d = constraintWidget.p();
        measure.i = false;
        measure.j = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.f2317a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = measure.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.Z > BitmapDescriptorFactory.HUE_RED;
        boolean z4 = z2 && constraintWidget.Z > BitmapDescriptorFactory.HUE_RED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.d;
        if (z && constraintWidget.y(0) && constraintWidget.s == 0 && !z3) {
            measure.f2317a = dimensionBehaviour3;
            if (z2 && constraintWidget.t == 0) {
                measure.f2317a = dimensionBehaviour4;
            }
            z = false;
        }
        if (z2 && constraintWidget.y(1) && constraintWidget.t == 0 && !z4) {
            measure.b = dimensionBehaviour3;
            if (z && constraintWidget.s == 0) {
                measure.b = dimensionBehaviour4;
            }
            z2 = false;
        }
        if (constraintWidget.F()) {
            measure.f2317a = dimensionBehaviour4;
            z = false;
        }
        if (constraintWidget.G()) {
            measure.b = dimensionBehaviour4;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                measure.f2317a = dimensionBehaviour4;
            } else if (!z2) {
                if (measure.b == dimensionBehaviour4) {
                    i2 = measure.d;
                } else {
                    measure.f2317a = dimensionBehaviour3;
                    measurer.b(constraintWidget, measure);
                    i2 = measure.f;
                }
                measure.f2317a = dimensionBehaviour4;
                measure.c = (int) (constraintWidget.Z * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                measure.b = dimensionBehaviour4;
            } else if (!z) {
                if (measure.f2317a == dimensionBehaviour4) {
                    i = measure.c;
                } else {
                    measure.b = dimensionBehaviour3;
                    measurer.b(constraintWidget, measure);
                    i = measure.e;
                }
                measure.b = dimensionBehaviour4;
                if (constraintWidget.a0 == -1) {
                    measure.d = (int) (i / constraintWidget.Z);
                } else {
                    measure.d = (int) (constraintWidget.Z * i);
                }
            }
        }
        measurer.b(constraintWidget, measure);
        constraintWidget.W(measure.e);
        constraintWidget.R(measure.f);
        constraintWidget.F = measure.h;
        constraintWidget.N(measure.g);
        measure.j = 0;
    }

    @Override // androidx.constraintlayout.core.widgets.WidgetContainer, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void H() {
        this.C0.t();
        this.D0 = 0;
        this.E0 = 0;
        super.H();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void X(boolean z, boolean z2) {
        super.X(z, z2);
        int size = this.v0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.v0.get(i)).X(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0885 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08f4 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x096b A[PHI: r15 r23
  0x096b: PHI (r15v10 boolean) = (r15v9 boolean), (r15v14 boolean), (r15v14 boolean), (r15v14 boolean) binds: [B:532:0x0931, B:540:0x0953, B:541:0x0955, B:543:0x095b] A[DONT_GENERATE, DONT_INLINE]
  0x096b: PHI (r23v6 boolean) = (r23v5 boolean), (r23v7 boolean), (r23v7 boolean), (r23v7 boolean) binds: [B:532:0x0931, B:540:0x0953, B:541:0x0955, B:543:0x095b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0972 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    @Override // androidx.constraintlayout.core.widgets.WidgetContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z() {
        /*
            Method dump skipped, instructions count: 2453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.Z():void");
    }

    public final void a0(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i2 = this.F0 + 1;
            ChainHead[] chainHeadArr = this.I0;
            if (i2 >= chainHeadArr.length) {
                this.I0 = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
            }
            ChainHead[] chainHeadArr2 = this.I0;
            int i3 = this.F0;
            chainHeadArr2[i3] = new ChainHead(constraintWidget, 0, this.A0);
            this.F0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.G0 + 1;
            ChainHead[] chainHeadArr3 = this.H0;
            if (i4 >= chainHeadArr3.length) {
                this.H0 = (ChainHead[]) Arrays.copyOf(chainHeadArr3, chainHeadArr3.length * 2);
            }
            ChainHead[] chainHeadArr4 = this.H0;
            int i5 = this.G0;
            chainHeadArr4[i5] = new ChainHead(constraintWidget, 1, this.A0);
            this.G0 = i5 + 1;
        }
    }

    public final void b0(LinearSystem linearSystem) {
        ConstraintWidgetContainer constraintWidgetContainer;
        LinearSystem linearSystem2;
        HashSet hashSet = this.Q0;
        boolean zE0 = e0(64);
        f(linearSystem, zE0);
        int size = this.v0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.v0.get(i);
            boolean[] zArr = constraintWidget.U;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof Barrier) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.v0.get(i2);
                if (constraintWidget2 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget2;
                    for (int i3 = 0; i3 < barrier.w0; i3++) {
                        ConstraintWidget constraintWidget3 = barrier.v0[i3];
                        if (barrier.y0 || constraintWidget3.g()) {
                            int i4 = barrier.x0;
                            if (i4 == 0 || i4 == 1) {
                                constraintWidget3.U[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                constraintWidget3.U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) this.v0.get(i5);
            constraintWidget4.getClass();
            boolean z2 = constraintWidget4 instanceof VirtualLayout;
            if (z2 || (constraintWidget4 instanceof Guideline)) {
                if (z2) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.f(linearSystem, zE0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VirtualLayout virtualLayout = (VirtualLayout) ((ConstraintWidget) it.next());
                for (int i6 = 0; i6 < virtualLayout.w0; i6++) {
                    if (hashSet.contains(virtualLayout.v0[i6])) {
                        virtualLayout.f(linearSystem, zE0);
                        hashSet.remove(virtualLayout);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ConstraintWidget) it2.next()).f(linearSystem, zE0);
                }
                hashSet.clear();
            }
        }
        boolean z3 = LinearSystem.q;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.e;
        if (z3) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) this.v0.get(i7);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof VirtualLayout) && !(constraintWidget5 instanceof Guideline)) {
                    hashSet2.add(constraintWidget5);
                }
            }
            constraintWidgetContainer = this;
            linearSystem2 = linearSystem;
            constraintWidgetContainer.e(this, linearSystem2, hashSet2, this.V[0] == dimensionBehaviour ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) it3.next();
                Optimizer.a(this, linearSystem2, constraintWidget6);
                constraintWidget6.f(linearSystem2, zE0);
            }
        } else {
            constraintWidgetContainer = this;
            linearSystem2 = linearSystem;
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget7 = (ConstraintWidget) constraintWidgetContainer.v0.get(i8);
                if (constraintWidget7 instanceof ConstraintWidgetContainer) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.d;
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget7.S(dimensionBehaviour4);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget7.U(dimensionBehaviour4);
                    }
                    constraintWidget7.f(linearSystem2, zE0);
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget7.S(dimensionBehaviour2);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget7.U(dimensionBehaviour3);
                    }
                } else {
                    Optimizer.a(this, linearSystem2, constraintWidget7);
                    if (!(constraintWidget7 instanceof VirtualLayout) && !(constraintWidget7 instanceof Guideline)) {
                        constraintWidget7.f(linearSystem2, zE0);
                    }
                }
            }
        }
        if (constraintWidgetContainer.F0 > 0) {
            Chain.a(this, linearSystem2, null, 0);
        }
        if (constraintWidgetContainer.G0 > 0) {
            Chain.a(this, linearSystem2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    public final void c0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ?? r17;
        boolean z;
        ArrayList arrayList;
        BasicMeasure.Measurer measurer;
        boolean z2;
        int i8;
        int i9;
        boolean zF;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        int i10;
        int i11;
        int i12;
        BasicMeasure.Measurer measurer2;
        boolean z3;
        boolean z4;
        int i13;
        BasicMeasure.Measurer measurer3;
        int i14;
        boolean z5;
        boolean z6;
        int i15;
        HorizontalWidgetRun horizontalWidgetRun;
        VerticalWidgetRun verticalWidgetRun;
        boolean z7;
        int i16;
        int i17;
        Metrics metrics;
        this.D0 = i6;
        this.E0 = i7;
        BasicMeasure basicMeasure = this.w0;
        ConstraintWidgetContainer constraintWidgetContainer = basicMeasure.c;
        ArrayList arrayList2 = basicMeasure.f2316a;
        BasicMeasure.Measurer measurer4 = this.z0;
        DependencyGraph dependencyGraph = this.x0;
        int size = this.v0.size();
        int iV = v();
        int iP = p();
        boolean zB = Optimizer.b(i, 128);
        boolean z8 = zB || Optimizer.b(i, 64);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f;
        if (z8) {
            int i18 = 0;
            while (i18 < size) {
                r17 = 1;
                ConstraintWidget constraintWidget = (ConstraintWidget) this.v0.get(i18);
                boolean z9 = z8;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                boolean z10 = (dimensionBehaviourArr[0] == dimensionBehaviour) && (dimensionBehaviourArr[1] == dimensionBehaviour) && constraintWidget.Z > BitmapDescriptorFactory.HUE_RED;
                if ((constraintWidget.C() && z10) || ((constraintWidget.D() && z10) || (constraintWidget instanceof VirtualLayout) || constraintWidget.C() || constraintWidget.D())) {
                    z = false;
                    break;
                } else {
                    i18++;
                    z8 = z9;
                }
            }
            r17 = 1;
            z = z8;
        } else {
            r17 = 1;
            z = z8;
        }
        if (!z || (metrics = LinearSystem.r) == null) {
            arrayList = arrayList2;
            measurer = measurer4;
        } else {
            arrayList = arrayList2;
            measurer = measurer4;
            metrics.f2263a++;
        }
        boolean z11 = z & (((i2 == 1073741824 && i4 == 1073741824) || zB) ? r17 : false);
        if (z11) {
            int iMin = Math.min(this.D[0], i3);
            z2 = z11;
            int iMin2 = Math.min(this.D[r17], i5);
            if (i2 != 1073741824 || v() == iMin) {
                z7 = r17;
            } else {
                W(iMin);
                z7 = r17;
                dependencyGraph.b = z7;
            }
            if (i4 == 1073741824 && p() != iMin2) {
                R(iMin2);
                dependencyGraph.b = z7;
            }
            if (i2 == 1073741824 && i4 == 1073741824) {
                zF = dependencyGraph.e(zB);
                i17 = 1073741824;
                i8 = size;
                i9 = 2;
            } else {
                ConstraintWidgetContainer constraintWidgetContainer2 = dependencyGraph.f2318a;
                if (dependencyGraph.b) {
                    Iterator it = constraintWidgetContainer2.v0.iterator();
                    while (it.hasNext()) {
                        ConstraintWidget constraintWidget2 = (ConstraintWidget) it.next();
                        constraintWidget2.m();
                        constraintWidget2.f2311a = false;
                        Iterator it2 = it;
                        HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget2.d;
                        horizontalWidgetRun2.e.j = false;
                        horizontalWidgetRun2.g = false;
                        horizontalWidgetRun2.n();
                        VerticalWidgetRun verticalWidgetRun2 = constraintWidget2.e;
                        verticalWidgetRun2.e.j = false;
                        verticalWidgetRun2.g = false;
                        verticalWidgetRun2.m();
                        it = it2;
                        size = size;
                    }
                    i16 = 0;
                    i8 = size;
                    constraintWidgetContainer2.m();
                    constraintWidgetContainer2.f2311a = false;
                    HorizontalWidgetRun horizontalWidgetRun3 = constraintWidgetContainer2.d;
                    horizontalWidgetRun3.e.j = false;
                    horizontalWidgetRun3.g = false;
                    horizontalWidgetRun3.n();
                    VerticalWidgetRun verticalWidgetRun3 = constraintWidgetContainer2.e;
                    verticalWidgetRun3.e.j = false;
                    verticalWidgetRun3.g = false;
                    verticalWidgetRun3.m();
                    dependencyGraph.c();
                } else {
                    i16 = 0;
                    i8 = size;
                }
                dependencyGraph.b(dependencyGraph.d);
                constraintWidgetContainer2.b0 = i16;
                constraintWidgetContainer2.c0 = i16;
                constraintWidgetContainer2.d.h.d(i16);
                constraintWidgetContainer2.e.h.d(i16);
                i17 = 1073741824;
                if (i2 == 1073741824) {
                    zF = dependencyGraph.f(i16, zB);
                    i9 = 1;
                } else {
                    i9 = 0;
                    zF = true;
                }
                if (i4 == 1073741824) {
                    zF &= dependencyGraph.f(1, zB);
                    i9++;
                }
            }
            if (zF) {
                X(i2 == i17, i4 == i17);
            }
        } else {
            z2 = z11;
            i8 = size;
            i9 = 0;
            zF = false;
        }
        if (!zF || i9 != 2) {
            int i19 = this.J0;
            if (i8 > 0) {
                int size2 = this.v0.size();
                boolean zE0 = e0(64);
                BasicMeasure.Measurer measurer5 = this.z0;
                int i20 = 0;
                while (i20 < size2) {
                    ConstraintWidget constraintWidget3 = (ConstraintWidget) this.v0.get(i20);
                    if ((constraintWidget3 instanceof Guideline) || (constraintWidget3 instanceof Barrier) || constraintWidget3.H || (zE0 && (horizontalWidgetRun = constraintWidget3.d) != null && (verticalWidgetRun = constraintWidget3.e) != null && horizontalWidgetRun.e.j && verticalWidgetRun.e.j)) {
                        i15 = size2;
                    } else {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviourO = constraintWidget3.o(0);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviourO2 = constraintWidget3.o(1);
                        i15 = size2;
                        boolean z12 = dimensionBehaviourO == dimensionBehaviour && constraintWidget3.s != 1 && dimensionBehaviourO2 == dimensionBehaviour && constraintWidget3.t != 1;
                        if (!z12 && e0(1) && !(constraintWidget3 instanceof VirtualLayout)) {
                            if (dimensionBehaviourO == dimensionBehaviour && constraintWidget3.s == 0 && dimensionBehaviourO2 != dimensionBehaviour && !constraintWidget3.C()) {
                                z12 = true;
                            }
                            if (dimensionBehaviourO2 == dimensionBehaviour && constraintWidget3.t == 0 && dimensionBehaviourO != dimensionBehaviour && !constraintWidget3.C()) {
                                z12 = true;
                            }
                            if ((dimensionBehaviourO == dimensionBehaviour || dimensionBehaviourO2 == dimensionBehaviour) && constraintWidget3.Z > BitmapDescriptorFactory.HUE_RED) {
                                z12 = true;
                            }
                        }
                        if (!z12) {
                            basicMeasure.a(0, constraintWidget3, measurer5);
                        }
                    }
                    i20++;
                    size2 = i15;
                }
                measurer5.a();
            }
            if (this.B0 != null) {
                System.nanoTime();
            }
            basicMeasure.c(this);
            int size3 = arrayList.size();
            if (i8 > 0) {
                basicMeasure.b(this, 0, iV, iP);
            }
            if (size3 > 0) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.V;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr2[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.e;
                boolean z13 = dimensionBehaviour2 == dimensionBehaviour3;
                boolean z14 = dimensionBehaviourArr2[1] == dimensionBehaviour3;
                int iMax = Math.max(v(), constraintWidgetContainer.e0);
                int iMax2 = Math.max(p(), constraintWidgetContainer.f0);
                int i21 = 0;
                boolean z15 = false;
                while (true) {
                    type = ConstraintAnchor.Type.g;
                    type2 = ConstraintAnchor.Type.f;
                    if (i21 >= size3) {
                        break;
                    }
                    ConstraintWidget constraintWidget4 = (ConstraintWidget) arrayList.get(i21);
                    boolean z16 = z13;
                    if (constraintWidget4 instanceof VirtualLayout) {
                        int iV2 = constraintWidget4.v();
                        z4 = z14;
                        int iP2 = constraintWidget4.p();
                        i13 = i21;
                        measurer3 = measurer;
                        boolean zA = z15 | basicMeasure.a(1, constraintWidget4, measurer3);
                        int iV3 = constraintWidget4.v();
                        i14 = i19;
                        int iP3 = constraintWidget4.p();
                        if (iV3 != iV2) {
                            constraintWidget4.W(iV3);
                            if (z16 && constraintWidget4.w() + constraintWidget4.X > iMax) {
                                iMax = Math.max(iMax, constraintWidget4.n(type2).e() + constraintWidget4.w() + constraintWidget4.X);
                            }
                            z5 = true;
                        } else {
                            z5 = zA;
                        }
                        if (iP3 != iP2) {
                            constraintWidget4.R(iP3);
                            if (z4 && constraintWidget4.x() + constraintWidget4.Y > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget4.n(type).e() + constraintWidget4.x() + constraintWidget4.Y);
                            }
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        z15 = ((VirtualLayout) constraintWidget4).D0 | z6;
                    } else {
                        z4 = z14;
                        i13 = i21;
                        measurer3 = measurer;
                        i14 = i19;
                    }
                    BasicMeasure.Measurer measurer6 = measurer3;
                    i21 = i13 + 1;
                    i19 = i14;
                    measurer = measurer6;
                    z13 = z16;
                    z14 = z4;
                }
                boolean z17 = z13;
                boolean z18 = z14;
                BasicMeasure.Measurer measurer7 = measurer;
                int i22 = i19;
                boolean z19 = z15;
                int i23 = 0;
                while (i23 < 2) {
                    boolean z20 = z19;
                    int i24 = 0;
                    while (i24 < size3) {
                        ConstraintWidget constraintWidget5 = (ConstraintWidget) arrayList.get(i24);
                        if ((!(constraintWidget5 instanceof Helper) || (constraintWidget5 instanceof VirtualLayout)) && !(constraintWidget5 instanceof Guideline)) {
                            i10 = i24;
                            if (constraintWidget5.j0 != 8 && ((!z2 || !constraintWidget5.d.e.j || !constraintWidget5.e.e.j) && !(constraintWidget5 instanceof VirtualLayout))) {
                                int iV4 = constraintWidget5.v();
                                int iP4 = constraintWidget5.p();
                                i11 = size3;
                                int i25 = constraintWidget5.d0;
                                boolean zA2 = z20 | basicMeasure.a(i23 == 1 ? 2 : 1, constraintWidget5, measurer7);
                                i12 = i23;
                                int iV5 = constraintWidget5.v();
                                measurer2 = measurer7;
                                int iP5 = constraintWidget5.p();
                                if (iV5 != iV4) {
                                    constraintWidget5.W(iV5);
                                    if (z17 && constraintWidget5.w() + constraintWidget5.X > iMax) {
                                        iMax = Math.max(iMax, constraintWidget5.n(type2).e() + constraintWidget5.w() + constraintWidget5.X);
                                    }
                                    zA2 = true;
                                }
                                if (iP5 != iP4) {
                                    constraintWidget5.R(iP5);
                                    if (z18 && constraintWidget5.x() + constraintWidget5.Y > iMax2) {
                                        iMax2 = Math.max(iMax2, constraintWidget5.n(type).e() + constraintWidget5.x() + constraintWidget5.Y);
                                    }
                                    z3 = true;
                                } else {
                                    z3 = zA2;
                                }
                                z20 = (!constraintWidget5.F || i25 == constraintWidget5.d0) ? z3 : true;
                            }
                            i24 = i10 + 1;
                            size3 = i11;
                            i23 = i12;
                            measurer7 = measurer2;
                        } else {
                            i10 = i24;
                        }
                        i11 = size3;
                        i12 = i23;
                        measurer2 = measurer7;
                        i24 = i10 + 1;
                        size3 = i11;
                        i23 = i12;
                        measurer7 = measurer2;
                    }
                    int i26 = size3;
                    int i27 = i23;
                    BasicMeasure.Measurer measurer8 = measurer7;
                    if (!z20) {
                        break;
                    }
                    i23 = i27 + 1;
                    basicMeasure.b(this, i23, iV, iP);
                    size3 = i26;
                    measurer7 = measurer8;
                    z19 = false;
                }
                i19 = i22;
            }
            this.J0 = i19;
            LinearSystem.q = e0(512);
        }
        if (this.B0 != null) {
            System.nanoTime();
        }
    }

    public final boolean e0(int i) {
        return (this.J0 & i) == i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void s(StringBuilder sb) {
        sb.append(this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.Y);
        sb.append("\n");
        Iterator it = this.v0.iterator();
        while (it.hasNext()) {
            ((ConstraintWidget) it.next()).s(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
