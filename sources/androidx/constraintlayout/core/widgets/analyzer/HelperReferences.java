package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
class HelperReferences extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        Barrier barrier = (Barrier) this.b;
        int i = barrier.x0;
        DependencyNode dependencyNode = this.h;
        Iterator it = dependencyNode.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((DependencyNode) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            dependencyNode.d(i3 + barrier.z0);
        } else {
            dependencyNode.d(i2 + barrier.z0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof Barrier) {
            DependencyNode dependencyNode = this.h;
            dependencyNode.b = true;
            ArrayList arrayList = dependencyNode.l;
            Barrier barrier = (Barrier) constraintWidget;
            int i = barrier.x0;
            boolean z = barrier.y0;
            int i2 = 0;
            if (i == 0) {
                dependencyNode.e = DependencyNode.Type.g;
                while (i2 < barrier.w0) {
                    ConstraintWidget constraintWidget2 = barrier.v0[i2];
                    if (z || constraintWidget2.j0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.d.h;
                        dependencyNode2.k.add(dependencyNode);
                        arrayList.add(dependencyNode2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                dependencyNode.e = DependencyNode.Type.h;
                while (i2 < barrier.w0) {
                    ConstraintWidget constraintWidget3 = barrier.v0[i2];
                    if (z || constraintWidget3.j0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.d.i;
                        dependencyNode3.k.add(dependencyNode);
                        arrayList.add(dependencyNode3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                dependencyNode.e = DependencyNode.Type.i;
                while (i2 < barrier.w0) {
                    ConstraintWidget constraintWidget4 = barrier.v0[i2];
                    if (z || constraintWidget4.j0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.e.h;
                        dependencyNode4.k.add(dependencyNode);
                        arrayList.add(dependencyNode4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            dependencyNode.e = DependencyNode.Type.j;
            while (i2 < barrier.w0) {
                ConstraintWidget constraintWidget5 = barrier.v0[i2];
                if (z || constraintWidget5.j0 != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.e.i;
                    dependencyNode5.k.add(dependencyNode);
                    arrayList.add(dependencyNode5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof Barrier) {
            int i = ((Barrier) constraintWidget).x0;
            DependencyNode dependencyNode = this.h;
            if (i == 0 || i == 1) {
                constraintWidget.b0 = dependencyNode.g;
            } else {
                constraintWidget.c0 = dependencyNode.g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return false;
    }

    public final void m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.h;
        dependencyNode2.k.add(dependencyNode);
        dependencyNode.l.add(dependencyNode2);
    }
}
