package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DimensionDependency extends DependencyNode {
    public int m;

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.e = DependencyNode.Type.e;
        } else {
            this.e = DependencyNode.Type.f;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            Dependency dependency = (Dependency) it.next();
            dependency.a(dependency);
        }
    }
}
