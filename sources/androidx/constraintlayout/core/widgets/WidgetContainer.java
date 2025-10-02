package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class WidgetContainer extends ConstraintWidget {
    public ArrayList v0;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void H() {
        this.v0.clear();
        super.H();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void K(Cache cache) {
        super.K(cache);
        int size = this.v0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.v0.get(i)).K(cache);
        }
    }

    public void Z() {
        ArrayList arrayList = this.v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.v0.get(i);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).Z();
            }
        }
    }

    public final void a(ConstraintWidget constraintWidget) {
        this.v0.add(constraintWidget);
        ConstraintWidget constraintWidget2 = constraintWidget.W;
        if (constraintWidget2 != null) {
            ((WidgetContainer) constraintWidget2).v0.remove(constraintWidget);
            constraintWidget.H();
        }
        constraintWidget.W = this;
    }
}
