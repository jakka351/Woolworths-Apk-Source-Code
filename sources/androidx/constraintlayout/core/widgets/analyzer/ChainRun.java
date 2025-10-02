package androidx.constraintlayout.core.widgets.analyzer;

import YU.a;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ChainRun extends WidgetRun {
    public final ArrayList k;
    public int l;

    public ChainRun(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        super(constraintWidget);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        ConstraintWidget constraintWidget3 = this.b;
        ConstraintWidget constraintWidgetR = constraintWidget3.r(i);
        while (true) {
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidgetR;
            if (constraintWidget3 == null) {
                break;
            } else {
                constraintWidgetR = constraintWidget3.r(this.f);
            }
        }
        this.b = constraintWidget2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? constraintWidget2.d : i2 == 1 ? constraintWidget2.e : null);
        ConstraintWidget constraintWidgetQ = constraintWidget2.q(this.f);
        while (constraintWidgetQ != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? constraintWidgetQ.d : i3 == 1 ? constraintWidgetQ.e : null);
            constraintWidgetQ = constraintWidgetQ.q(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it.next();
            int i4 = this.f;
            if (i4 == 0) {
                widgetRun.b.b = this;
            } else if (i4 == 1) {
                widgetRun.b.c = this;
            }
        }
        if (this.f == 0 && ((ConstraintWidgetContainer) this.b.W).A0 && arrayList.size() > 1) {
            this.b = ((WidgetRun) a.c(1, arrayList)).b;
        }
        this.l = this.f == 0 ? this.b.m0 : this.b.n0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.constraintlayout.core.widgets.analyzer.Dependency r29) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.ChainRun.a(androidx.constraintlayout.core.widgets.analyzer.Dependency):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(0)).b;
        ConstraintWidget constraintWidget2 = ((WidgetRun) arrayList.get(size - 1)).b;
        int i = this.f;
        DependencyNode dependencyNode = this.i;
        DependencyNode dependencyNode2 = this.h;
        if (i == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.K;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.M;
            DependencyNode dependencyNodeI = WidgetRun.i(constraintAnchor, 0);
            int iE = constraintAnchor.e();
            ConstraintWidget constraintWidgetM = m();
            if (constraintWidgetM != null) {
                iE = constraintWidgetM.K.e();
            }
            if (dependencyNodeI != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeI, iE);
            }
            DependencyNode dependencyNodeI2 = WidgetRun.i(constraintAnchor2, 0);
            int iE2 = constraintAnchor2.e();
            ConstraintWidget constraintWidgetN = n();
            if (constraintWidgetN != null) {
                iE2 = constraintWidgetN.M.e();
            }
            if (dependencyNodeI2 != null) {
                WidgetRun.b(dependencyNode, dependencyNodeI2, -iE2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.L;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.N;
            DependencyNode dependencyNodeI3 = WidgetRun.i(constraintAnchor3, 1);
            int iE3 = constraintAnchor3.e();
            ConstraintWidget constraintWidgetM2 = m();
            if (constraintWidgetM2 != null) {
                iE3 = constraintWidgetM2.L.e();
            }
            if (dependencyNodeI3 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeI3, iE3);
            }
            DependencyNode dependencyNodeI4 = WidgetRun.i(constraintAnchor4, 1);
            int iE4 = constraintAnchor4.e();
            ConstraintWidget constraintWidgetN2 = n();
            if (constraintWidgetN2 != null) {
                iE4 = constraintWidgetN2.N.e();
            }
            if (dependencyNodeI4 != null) {
                WidgetRun.b(dependencyNode, dependencyNodeI4, -iE4);
            }
        }
        dependencyNode2.f2319a = this;
        dependencyNode.f2319a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((WidgetRun) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.i.f + ((WidgetRun) arrayList.get(i)).j() + j + r5.h.f;
        }
        return j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((WidgetRun) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(i)).b;
            if (constraintWidget.j0 != 8) {
                return constraintWidget;
            }
            i++;
        }
    }

    public final ConstraintWidget n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = ((WidgetRun) arrayList.get(size)).b;
            if (constraintWidget.j0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it.next();
            sb.append("<");
            sb.append(widgetRun);
            sb.append("> ");
        }
        return sb.toString();
    }
}
