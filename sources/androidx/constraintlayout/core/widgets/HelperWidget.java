package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class HelperWidget extends ConstraintWidget implements Helper {
    public ConstraintWidget[] v0 = new ConstraintWidget[4];
    public int w0 = 0;

    public final void Z(int i, WidgetGroup widgetGroup, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.w0; i2++) {
            ConstraintWidget constraintWidget = this.v0[i2];
            ArrayList arrayList2 = widgetGroup.f2324a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i3 = 0; i3 < this.w0; i3++) {
            Grouping.a(this.v0[i3], i, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public final void a(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.w0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.v0;
        if (i > constraintWidgetArr.length) {
            this.v0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.v0;
        int i2 = this.w0;
        constraintWidgetArr2[i2] = constraintWidget;
        this.w0 = i2 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public final void b() {
        this.w0 = 0;
        Arrays.fill(this.v0, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void c() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void k(ConstraintWidget constraintWidget, HashMap map) {
        super.k(constraintWidget, map);
        HelperWidget helperWidget = (HelperWidget) constraintWidget;
        this.w0 = 0;
        int i = helperWidget.w0;
        for (int i2 = 0; i2 < i; i2++) {
            a((ConstraintWidget) map.get(helperWidget.v0[i2]));
        }
    }
}
