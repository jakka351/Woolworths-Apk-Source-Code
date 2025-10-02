package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* loaded from: classes2.dex */
public class VirtualLayout extends HelperWidget {
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public boolean D0 = false;
    public int E0 = 0;
    public int F0 = 0;
    public final BasicMeasure.Measure G0 = new BasicMeasure.Measure();
    public BasicMeasure.Measurer H0 = null;

    public void a0(int i, int i2, int i3, int i4) {
    }

    public final void b0(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure.Measurer measurer;
        ConstraintWidget constraintWidget2;
        while (true) {
            measurer = this.H0;
            if (measurer != null || (constraintWidget2 = this.W) == null) {
                break;
            } else {
                this.H0 = ((ConstraintWidgetContainer) constraintWidget2).z0;
            }
        }
        BasicMeasure.Measure measure = this.G0;
        measure.f2317a = dimensionBehaviour;
        measure.b = dimensionBehaviour2;
        measure.c = i;
        measure.d = i2;
        measurer.b(constraintWidget, measure);
        constraintWidget.W(measure.e);
        constraintWidget.R(measure.f);
        constraintWidget.F = measure.h;
        constraintWidget.N(measure.g);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    public final void c() {
        for (int i = 0; i < this.w0; i++) {
            ConstraintWidget constraintWidget = this.v0[i];
            if (constraintWidget != null) {
                constraintWidget.H = true;
            }
        }
    }
}
