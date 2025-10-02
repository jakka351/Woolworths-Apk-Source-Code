package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class BasicMeasure {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2316a = new ArrayList();
    public final Measure b = new Measure();
    public final ConstraintWidgetContainer c;

    public static class Measure {

        /* renamed from: a, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f2317a;
        public ConstraintWidget.DimensionBehaviour b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    public interface Measurer {
        void a();

        void b(ConstraintWidget constraintWidget, Measure measure);
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.c = constraintWidgetContainer;
    }

    public final boolean a(int i, ConstraintWidget constraintWidget, Measurer measurer) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        int[] iArr = constraintWidget.u;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        Measure measure = this.b;
        measure.f2317a = dimensionBehaviour;
        measure.b = dimensionBehaviourArr[1];
        measure.c = constraintWidget.v();
        measure.d = constraintWidget.p();
        measure.i = false;
        measure.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.f2317a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f;
        boolean z = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z2 = measure.b == dimensionBehaviour3;
        boolean z3 = z && constraintWidget.Z > BitmapDescriptorFactory.HUE_RED;
        boolean z4 = z2 && constraintWidget.Z > BitmapDescriptorFactory.HUE_RED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.d;
        if (z3 && iArr[0] == 4) {
            measure.f2317a = dimensionBehaviour4;
        }
        if (z4 && iArr[1] == 4) {
            measure.b = dimensionBehaviour4;
        }
        measurer.b(constraintWidget, measure);
        constraintWidget.W(measure.e);
        constraintWidget.R(measure.f);
        constraintWidget.F = measure.h;
        constraintWidget.N(measure.g);
        measure.j = 0;
        return measure.i;
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        if (constraintWidgetContainer.B0 != null) {
            System.nanoTime();
        }
        int i4 = constraintWidgetContainer.e0;
        int i5 = constraintWidgetContainer.f0;
        constraintWidgetContainer.e0 = 0;
        constraintWidgetContainer.f0 = 0;
        constraintWidgetContainer.W(i2);
        constraintWidgetContainer.R(i3);
        if (i4 < 0) {
            constraintWidgetContainer.e0 = 0;
        } else {
            constraintWidgetContainer.e0 = i4;
        }
        if (i5 < 0) {
            constraintWidgetContainer.f0 = 0;
        } else {
            constraintWidgetContainer.f0 = i5;
        }
        ConstraintWidgetContainer constraintWidgetContainer2 = this.c;
        constraintWidgetContainer2.y0 = i;
        constraintWidgetContainer2.Z();
        if (constraintWidgetContainer.B0 != null) {
            System.nanoTime();
            constraintWidgetContainer.B0.getClass();
        }
    }

    public final void c(ConstraintWidgetContainer constraintWidgetContainer) {
        ArrayList arrayList = this.f2316a;
        arrayList.clear();
        int size = constraintWidgetContainer.v0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) constraintWidgetContainer.v0.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        constraintWidgetContainer.x0.b = true;
    }
}
