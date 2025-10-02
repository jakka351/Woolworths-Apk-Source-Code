package androidx.constraintlayout.compose;

import YU.a;
import android.util.Log;
import androidx.collection.IntIntPair;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ChainHead;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/Measurer2;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public class Measurer2 implements BasicMeasure.Measurer, DesignInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public LayoutInformationReceiver f2248a;
    public final ConstraintWidgetContainer b;
    public Map c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final State f;
    public final int[] g;
    public final int[] h;
    public float i;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Measurer2(Density density) {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.v0 = new ArrayList();
        constraintWidgetContainer.w0 = new BasicMeasure(constraintWidgetContainer);
        DependencyGraph dependencyGraph = new DependencyGraph(constraintWidgetContainer);
        constraintWidgetContainer.x0 = dependencyGraph;
        constraintWidgetContainer.z0 = null;
        constraintWidgetContainer.A0 = false;
        constraintWidgetContainer.C0 = new LinearSystem();
        constraintWidgetContainer.F0 = 0;
        constraintWidgetContainer.G0 = 0;
        constraintWidgetContainer.H0 = new ChainHead[4];
        constraintWidgetContainer.I0 = new ChainHead[4];
        constraintWidgetContainer.J0 = 257;
        constraintWidgetContainer.K0 = false;
        constraintWidgetContainer.L0 = false;
        constraintWidgetContainer.M0 = null;
        constraintWidgetContainer.N0 = null;
        constraintWidgetContainer.O0 = null;
        constraintWidgetContainer.P0 = null;
        constraintWidgetContainer.Q0 = new HashSet();
        constraintWidgetContainer.R0 = new BasicMeasure.Measure();
        constraintWidgetContainer.z0 = this;
        dependencyGraph.f = this;
        this.b = constraintWidgetContainer;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new State(density);
        this.g = new int[2];
        this.h = new int[2];
        this.i = Float.NaN;
    }

    public static void f(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int iOrdinal = dimensionBehaviour.ordinal();
        if (iOrdinal == 0) {
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        if (iOrdinal == 1) {
            iArr[0] = 0;
            iArr[1] = i4;
            return;
        }
        if (iOrdinal == 2) {
            boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
            iArr[0] = z3 ? i : 0;
            if (!z3) {
                i = i4;
            }
            iArr[1] = i;
            return;
        }
        if (iOrdinal == 3) {
            iArr[0] = i4;
            iArr[1] = i4;
        } else {
            throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.constraintlayout.core.widgets.ConstraintWidget r28, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r29) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer2.b(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
    }

    public final void c(long j) {
        int iH = Constraints.h(j);
        ConstraintWidgetContainer constraintWidgetContainer = this.b;
        constraintWidgetContainer.W(iH);
        constraintWidgetContainer.R(Constraints.g(j));
        this.i = Float.NaN;
    }

    public void d() {
        ConstraintWidget constraintWidget;
        StringBuilder sbS = a.s("{   root: {interpolated: { left:  0,  top:  0,");
        StringBuilder sb = new StringBuilder("  right:   ");
        ConstraintWidgetContainer constraintWidgetContainer = this.b;
        sb.append(constraintWidgetContainer.v());
        sb.append(" ,");
        sbS.append(sb.toString());
        sbS.append("  bottom:  " + constraintWidgetContainer.p() + " ,");
        sbS.append(" } }");
        Iterator it = constraintWidgetContainer.v0.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget2 = (ConstraintWidget) it.next();
            Object obj = constraintWidget2.i0;
            if (obj instanceof Measurable) {
                WidgetFrame widgetFrame = null;
                if (constraintWidget2.k == null) {
                    Measurable measurable = (Measurable) obj;
                    Object objA = LayoutIdKt.a(measurable);
                    if (objA == null) {
                        objA = ConstraintLayoutTagKt.a(measurable);
                    }
                    constraintWidget2.k = objA != null ? objA.toString() : null;
                }
                WidgetFrame widgetFrame2 = (WidgetFrame) this.e.get(MeasurerKt.a((Measurable) obj));
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.f2304a) != null) {
                    widgetFrame = constraintWidget.j;
                }
                if (widgetFrame != null) {
                    sbS.append(" " + constraintWidget2.k + ": {");
                    sbS.append(" interpolated : ");
                    widgetFrame.e(sbS, true);
                    sbS.append("}, ");
                }
            } else if (constraintWidget2 instanceof Guideline) {
                sbS.append(" " + constraintWidget2.k + ": {");
                Guideline guideline = (Guideline) constraintWidget2;
                if (guideline.z0 == 0) {
                    sbS.append(" type: 'hGuideline', ");
                } else {
                    sbS.append(" type: 'vGuideline', ");
                }
                sbS.append(" interpolated: ");
                sbS.append(" { left: " + guideline.w() + ", top: " + guideline.x() + ", right: " + (guideline.v() + guideline.w()) + ", bottom: " + (guideline.p() + guideline.x()) + " }");
                sbS.append("}, ");
            }
        }
        sbS.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = this.f2248a;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.j();
        }
    }

    public final long e(ConstraintWidget constraintWidget, long j) {
        Object obj = constraintWidget.i0;
        String str = constraintWidget.k;
        int i = 0;
        if (constraintWidget instanceof VirtualLayout) {
            int i2 = Constraints.f(j) ? 1073741824 : Constraints.d(j) ? Integer.MIN_VALUE : 0;
            if (Constraints.e(j)) {
                i = 1073741824;
            } else if (Constraints.c(j)) {
                i = Integer.MIN_VALUE;
            }
            VirtualLayout virtualLayout = (VirtualLayout) constraintWidget;
            virtualLayout.a0(i2, Constraints.h(j), i, Constraints.g(j));
            return IntIntPair.a(virtualLayout.E0, virtualLayout.F0);
        }
        if (obj instanceof Measurable) {
            Placeable placeableC0 = ((Measurable) obj).c0(j);
            this.c.put(obj, placeableC0);
            return IntIntPair.a(placeableC0.d, placeableC0.e);
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return IntIntPair.a(0, 0);
    }

    public final void g(Placeable.PlacementScope placementScope, List list, Map map) {
        Placeable placeable;
        Placeable.PlacementScope placementScope2;
        this.c = map;
        LinkedHashMap linkedHashMap = this.e;
        int i = 0;
        if (linkedHashMap.isEmpty()) {
            ArrayList arrayList = this.b.v0;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i2);
                Object obj = constraintWidget.i0;
                if (obj instanceof Measurable) {
                    WidgetFrame widgetFrame = constraintWidget.j;
                    widgetFrame.h();
                    linkedHashMap.put(MeasurerKt.a((Measurable) obj), new WidgetFrame(widgetFrame));
                }
            }
        }
        int size2 = list.size();
        while (i < size2) {
            Measurable measurable = (Measurable) list.get(i);
            final WidgetFrame widgetFrame2 = (WidgetFrame) linkedHashMap.get(MeasurerKt.a(measurable));
            if (widgetFrame2 == null || (placeable = (Placeable) this.c.get(measurable)) == null || widgetFrame2.r == 8) {
                placementScope2 = placementScope;
            } else if (widgetFrame2.d()) {
                int i3 = (int) 0;
                Placeable.PlacementScope.g(placementScope, placeable, IntOffsetKt.a(widgetFrame2.b - i3, widgetFrame2.c - i3));
                placementScope2 = placementScope;
            } else {
                Function1<GraphicsLayerScope, Unit> function1 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$placeWithFrameTransform$layerBlock$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj2;
                        WidgetFrame widgetFrame3 = widgetFrame2;
                        if (!Float.isNaN(widgetFrame3.f) || !Float.isNaN(widgetFrame3.g)) {
                            graphicsLayerScope.p0(TransformOriginKt.a(Float.isNaN(widgetFrame3.f) ? 0.5f : widgetFrame3.f, Float.isNaN(widgetFrame3.g) ? 0.5f : widgetFrame3.g));
                        }
                        if (!Float.isNaN(widgetFrame3.h)) {
                            graphicsLayerScope.e(widgetFrame3.h);
                        }
                        if (!Float.isNaN(widgetFrame3.i)) {
                            graphicsLayerScope.f(widgetFrame3.i);
                        }
                        if (!Float.isNaN(widgetFrame3.j)) {
                            graphicsLayerScope.g(widgetFrame3.j);
                        }
                        if (!Float.isNaN(widgetFrame3.k)) {
                            graphicsLayerScope.m(widgetFrame3.k);
                        }
                        if (!Float.isNaN(widgetFrame3.l)) {
                            graphicsLayerScope.c(widgetFrame3.l);
                        }
                        if (!Float.isNaN(widgetFrame3.m)) {
                            graphicsLayerScope.A(widgetFrame3.m);
                        }
                        if (!Float.isNaN(widgetFrame3.n) || !Float.isNaN(widgetFrame3.o)) {
                            graphicsLayerScope.j(Float.isNaN(widgetFrame3.n) ? 1.0f : widgetFrame3.n);
                            graphicsLayerScope.l(Float.isNaN(widgetFrame3.o) ? 1.0f : widgetFrame3.o);
                        }
                        if (!Float.isNaN(widgetFrame3.p)) {
                            graphicsLayerScope.b(widgetFrame3.p);
                        }
                        return Unit.f24250a;
                    }
                };
                int i4 = (int) 0;
                int i5 = widgetFrame2.b - i4;
                int i6 = widgetFrame2.c - i4;
                placementScope2 = placementScope;
                placementScope2.l(placeable, i5, i6, Float.isNaN(widgetFrame2.m) ? BitmapDescriptorFactory.HUE_RED : widgetFrame2.m, function1);
            }
            i++;
            placementScope = placementScope2;
        }
        LayoutInformationReceiver layoutInformationReceiver = this.f2248a;
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.g() : null) == LayoutInfoFlags.d) {
            d();
        }
    }

    public final long h(long j, LayoutDirection layoutDirection, ConstraintSet constraintSet, List list, LinkedHashMap linkedHashMap) throws NumberFormatException {
        androidx.constraintlayout.core.state.Dimension dimensionD;
        androidx.constraintlayout.core.state.Dimension dimensionD2;
        this.c = linkedHashMap;
        if (list.isEmpty()) {
            return IntSizeKt.a(Constraints.j(j), Constraints.i(j));
        }
        if (Constraints.f(j)) {
            dimensionD = androidx.constraintlayout.core.state.Dimension.b(Constraints.h(j));
        } else {
            dimensionD = androidx.constraintlayout.core.state.Dimension.d();
            int iJ = Constraints.j(j);
            if (iJ >= 0) {
                dimensionD.f2299a = iJ;
            }
        }
        State state = this.f;
        ConstraintReference constraintReference = state.f;
        ConstraintReference constraintReference2 = state.f;
        constraintReference.e0 = dimensionD;
        if (Constraints.e(j)) {
            dimensionD2 = androidx.constraintlayout.core.state.Dimension.b(Constraints.g(j));
        } else {
            dimensionD2 = androidx.constraintlayout.core.state.Dimension.d();
            int i = Constraints.i(j);
            if (i >= 0) {
                dimensionD2.f2299a = i;
            }
        }
        constraintReference2.f0 = dimensionD2;
        androidx.constraintlayout.core.state.Dimension dimension = constraintReference2.e0;
        ConstraintWidgetContainer constraintWidgetContainer = this.b;
        dimension.a(constraintWidgetContainer, 0);
        constraintReference2.f0.a(constraintWidgetContainer, 1);
        state.l = j;
        state.b = !(layoutDirection == LayoutDirection.e);
        this.c.clear();
        this.d.clear();
        this.e.clear();
        if (constraintSet.d(list)) {
            state.g();
            constraintSet.a(state, list);
            ConstraintLayoutKt.a(state, list);
            state.a(constraintWidgetContainer);
        } else {
            ConstraintLayoutKt.a(state, list);
        }
        c(j);
        constraintWidgetContainer.w0.c(constraintWidgetContainer);
        constraintWidgetContainer.J0 = 257;
        LinearSystem.q = constraintWidgetContainer.e0(512);
        constraintWidgetContainer.c0(constraintWidgetContainer.J0, 0, 0, 0, 0, 0, 0);
        return IntSizeKt.a(constraintWidgetContainer.v(), constraintWidgetContainer.p());
    }
}
