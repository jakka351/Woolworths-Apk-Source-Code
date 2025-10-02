package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes2.dex */
public abstract class WidgetRun implements Dependency {

    /* renamed from: a, reason: collision with root package name */
    public int f2325a;
    public ConstraintWidget b;
    public RunGroup c;
    public ConstraintWidget.DimensionBehaviour d;
    public final DimensionDependency e = new DimensionDependency(this);
    public int f = 0;
    public boolean g = false;
    public final DependencyNode h = new DependencyNode(this);
    public final DependencyNode i = new DependencyNode(this);
    public RunType j = RunType.d;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2326a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f2326a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2326a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2326a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2326a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2326a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunType {
        public static final RunType d;
        public static final RunType e;
        public static final /* synthetic */ RunType[] f;

        static {
            RunType runType = new RunType("NONE", 0);
            d = runType;
            RunType runType2 = new RunType("START", 1);
            RunType runType3 = new RunType("END", 2);
            RunType runType4 = new RunType("CENTER", 3);
            e = runType4;
            f = new RunType[]{runType, runType2, runType3, runType4};
        }

        public static RunType valueOf(String str) {
            return (RunType) Enum.valueOf(RunType.class, str);
        }

        public static RunType[] values() {
            return (RunType[]) f.clone();
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.b = constraintWidget;
    }

    public static void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.f = i;
        dependencyNode2.k.add(dependencyNode);
    }

    public static DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        int iOrdinal = constraintAnchor2.e.ordinal();
        if (iOrdinal == 1) {
            return constraintWidget.d.h;
        }
        if (iOrdinal == 2) {
            return constraintWidget.e.h;
        }
        if (iOrdinal == 3) {
            return constraintWidget.d.i;
        }
        if (iOrdinal == 4) {
            return constraintWidget.e.i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return constraintWidget.e.k;
    }

    public static DependencyNode i(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        WidgetRun widgetRun = i == 0 ? constraintWidget.d : constraintWidget.e;
        int iOrdinal = constraintAnchor2.e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return widgetRun.h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return widgetRun.i;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void a(Dependency dependency) {
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, DimensionDependency dimensionDependency) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.l.add(this.e);
        dependencyNode.h = i;
        dependencyNode.i = dimensionDependency;
        dependencyNode2.k.add(dependencyNode);
        dimensionDependency.k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.b;
            int i3 = constraintWidget.w;
            int iMax = Math.max(constraintWidget.v, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.b;
            int i4 = constraintWidget2.z;
            int iMax2 = Math.max(constraintWidget2.y, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(androidx.constraintlayout.core.widgets.ConstraintAnchor r13, androidx.constraintlayout.core.widgets.ConstraintAnchor r14, int r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.l(androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int):void");
    }
}
