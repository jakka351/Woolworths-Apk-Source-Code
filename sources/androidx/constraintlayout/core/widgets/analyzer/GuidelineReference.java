package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* loaded from: classes2.dex */
class GuidelineReference extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.c && !dependencyNode.j) {
            dependencyNode.d((int) ((((DependencyNode) dependencyNode.l.get(0)).g * ((Guideline) this.b).v0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget = this.b;
        Guideline guideline = (Guideline) constraintWidget;
        int i = guideline.w0;
        int i2 = guideline.x0;
        int i3 = guideline.z0;
        DependencyNode dependencyNode = this.h;
        if (i3 == 1) {
            if (i != -1) {
                dependencyNode.l.add(constraintWidget.W.d.h);
                this.b.W.d.h.k.add(dependencyNode);
                dependencyNode.f = i;
            } else if (i2 != -1) {
                dependencyNode.l.add(constraintWidget.W.d.i);
                this.b.W.d.i.k.add(dependencyNode);
                dependencyNode.f = -i2;
            } else {
                dependencyNode.b = true;
                dependencyNode.l.add(constraintWidget.W.d.i);
                this.b.W.d.i.k.add(dependencyNode);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            dependencyNode.l.add(constraintWidget.W.e.h);
            this.b.W.e.h.k.add(dependencyNode);
            dependencyNode.f = i;
        } else if (i2 != -1) {
            dependencyNode.l.add(constraintWidget.W.e.i);
            this.b.W.e.i.k.add(dependencyNode);
            dependencyNode.f = -i2;
        } else {
            dependencyNode.b = true;
            dependencyNode.l.add(constraintWidget.W.e.i);
            this.b.W.e.i.k.add(dependencyNode);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.b;
        int i = ((Guideline) constraintWidget).z0;
        DependencyNode dependencyNode = this.h;
        if (i == 1) {
            constraintWidget.b0 = dependencyNode.g;
        } else {
            constraintWidget.c0 = dependencyNode.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
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
