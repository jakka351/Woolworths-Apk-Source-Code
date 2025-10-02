package androidx.constraintlayout.core.widgets.analyzer;

import YU.a;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class WidgetGroup {
    public static int f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2324a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public static class MeasureResult {
    }

    public final void a(ArrayList arrayList) {
        int size = this.f2324a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                WidgetGroup widgetGroup = (WidgetGroup) arrayList.get(i);
                if (this.e == widgetGroup.b) {
                    c(this.c, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(LinearSystem linearSystem, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f2324a;
        if (arrayList.size() == 0) {
            return 0;
        }
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) ((ConstraintWidget) arrayList.get(0)).W;
        linearSystem.t();
        constraintWidgetContainer.f(linearSystem, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ConstraintWidget) arrayList.get(i2)).f(linearSystem, false);
        }
        if (i == 0 && constraintWidgetContainer.F0 > 0) {
            Chain.a(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i == 1 && constraintWidgetContainer.G0 > 0) {
            Chain.a(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i3);
            MeasureResult measureResult = new MeasureResult();
            new WeakReference(constraintWidget);
            LinearSystem.n(constraintWidget.K);
            LinearSystem.n(constraintWidget.L);
            LinearSystem.n(constraintWidget.M);
            LinearSystem.n(constraintWidget.N);
            LinearSystem.n(constraintWidget.O);
            this.d.add(measureResult);
        }
        if (i == 0) {
            iN = LinearSystem.n(constraintWidgetContainer.K);
            iN2 = LinearSystem.n(constraintWidgetContainer.M);
            linearSystem.t();
        } else {
            iN = LinearSystem.n(constraintWidgetContainer.L);
            iN2 = LinearSystem.n(constraintWidgetContainer.N);
            linearSystem.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, WidgetGroup widgetGroup) {
        int i2 = widgetGroup.b;
        Iterator it = this.f2324a.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            ArrayList arrayList = widgetGroup.f2324a;
            if (!arrayList.contains(constraintWidget)) {
                arrayList.add(constraintWidget);
            }
            if (i == 0) {
                constraintWidget.t0 = i2;
            } else {
                constraintWidget.u0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strM = a.m(sb, this.b, "] <");
        Iterator it = this.f2324a.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            StringBuilder sbT = a.t(strM, " ");
            sbT.append(constraintWidget.l0);
            strM = sbT.toString();
        }
        return a.g(strM, " >");
    }
}
