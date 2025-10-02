package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class DependencyNode implements Dependency {
    public final WidgetRun d;
    public int f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public WidgetRun f2319a = null;
    public boolean b = false;
    public boolean c = false;
    public Type e = Type.d;
    public int h = 1;
    public DimensionDependency i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final Type h;
        public static final Type i;
        public static final Type j;
        public static final Type k;
        public static final /* synthetic */ Type[] l;

        static {
            Type type = new Type("UNKNOWN", 0);
            d = type;
            Type type2 = new Type("HORIZONTAL_DIMENSION", 1);
            e = type2;
            Type type3 = new Type("VERTICAL_DIMENSION", 2);
            f = type3;
            Type type4 = new Type("LEFT", 3);
            g = type4;
            Type type5 = new Type("RIGHT", 4);
            h = type5;
            Type type6 = new Type("TOP", 5);
            i = type6;
            Type type7 = new Type("BOTTOM", 6);
            j = type7;
            Type type8 = new Type("BASELINE", 7);
            k = type8;
            l = new Type[]{type, type2, type3, type4, type5, type6, type7, type8};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) l.clone();
        }
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.d = widgetRun;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void a(Dependency dependency) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).j) {
                return;
            }
        }
        this.c = true;
        WidgetRun widgetRun = this.f2319a;
        if (widgetRun != null) {
            widgetRun.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        DependencyNode dependencyNode = null;
        int i = 0;
        while (it2.hasNext()) {
            DependencyNode dependencyNode2 = (DependencyNode) it2.next();
            if (!(dependencyNode2 instanceof DimensionDependency)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.j) {
            DimensionDependency dimensionDependency = this.i;
            if (dimensionDependency != null) {
                if (!dimensionDependency.j) {
                    return;
                } else {
                    this.f = this.h * dimensionDependency.g;
                }
            }
            d(dependencyNode.g + this.f);
        }
        WidgetRun widgetRun2 = this.f2319a;
        if (widgetRun2 != null) {
            widgetRun2.a(this);
        }
    }

    public final void b(WidgetRun widgetRun) {
        this.k.add(widgetRun);
        if (this.j) {
            widgetRun.a(widgetRun);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.l0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
