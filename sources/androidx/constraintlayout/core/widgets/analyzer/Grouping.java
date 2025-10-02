package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Grouping {
    public static WidgetGroup a(ConstraintWidget constraintWidget, int i, ArrayList arrayList, WidgetGroup widgetGroup) {
        int i2;
        int i3 = i == 0 ? constraintWidget.t0 : constraintWidget.u0;
        if (i3 != -1 && (widgetGroup == null || i3 != widgetGroup.b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                WidgetGroup widgetGroup2 = (WidgetGroup) arrayList.get(i4);
                if (widgetGroup2.b == i3) {
                    if (widgetGroup != null) {
                        widgetGroup.c(i, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if (constraintWidget instanceof HelperWidget) {
                HelperWidget helperWidget = (HelperWidget) constraintWidget;
                int i5 = 0;
                while (true) {
                    if (i5 >= helperWidget.w0) {
                        i2 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = helperWidget.v0[i5];
                    if ((i == 0 && (i2 = constraintWidget2.t0) != -1) || (i == 1 && (i2 = constraintWidget2.u0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        WidgetGroup widgetGroup3 = (WidgetGroup) arrayList.get(i6);
                        if (widgetGroup3.b == i2) {
                            widgetGroup = widgetGroup3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup();
                widgetGroup.f2324a = new ArrayList();
                widgetGroup.d = null;
                widgetGroup.e = -1;
                int i7 = WidgetGroup.f;
                WidgetGroup.f = i7 + 1;
                widgetGroup.b = i7;
                widgetGroup.c = i;
            }
            arrayList.add(widgetGroup);
        }
        int i8 = widgetGroup.b;
        ArrayList arrayList2 = widgetGroup.f2324a;
        if (arrayList2.contains(constraintWidget)) {
            return widgetGroup;
        }
        arrayList2.add(constraintWidget);
        if (constraintWidget instanceof Guideline) {
            Guideline guideline = (Guideline) constraintWidget;
            guideline.y0.c(guideline.z0 == 0 ? 1 : 0, widgetGroup, arrayList);
        }
        if (i == 0) {
            constraintWidget.t0 = i8;
            constraintWidget.K.c(i, widgetGroup, arrayList);
            constraintWidget.M.c(i, widgetGroup, arrayList);
        } else {
            constraintWidget.u0 = i8;
            constraintWidget.L.c(i, widgetGroup, arrayList);
            constraintWidget.O.c(i, widgetGroup, arrayList);
            constraintWidget.N.c(i, widgetGroup, arrayList);
        }
        constraintWidget.R.c(i, widgetGroup, arrayList);
        return widgetGroup;
    }

    public static boolean b(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.g;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.d;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == dimensionBehaviour6 || (dimensionBehaviour3 == dimensionBehaviour5 && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == dimensionBehaviour6 || (dimensionBehaviour4 == dimensionBehaviour5 && dimensionBehaviour2 != dimensionBehaviour6));
    }
}
