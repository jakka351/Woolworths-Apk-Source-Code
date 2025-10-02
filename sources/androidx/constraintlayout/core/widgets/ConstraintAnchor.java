package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ConstraintAnchor {
    public int b;
    public boolean c;
    public final ConstraintWidget d;
    public final Type e;
    public ConstraintAnchor f;
    public SolverVariable i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f2310a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

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

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        static {
            Type type = new Type("NONE", 0);
            Type type2 = new Type("LEFT", 1);
            d = type2;
            Type type3 = new Type("TOP", 2);
            e = type3;
            Type type4 = new Type("RIGHT", 3);
            f = type4;
            Type type5 = new Type("BOTTOM", 4);
            g = type5;
            Type type6 = new Type("BASELINE", 5);
            h = type6;
            Type type7 = new Type("CENTER", 6);
            i = type7;
            Type type8 = new Type("CENTER_X", 7);
            j = type8;
            Type type9 = new Type("CENTER_Y", 8);
            k = type9;
            l = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) l.clone();
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.d = constraintWidget;
        this.e = type;
    }

    public final void a(ConstraintAnchor constraintAnchor, int i) {
        b(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            j();
            return true;
        }
        if (!z && !i(constraintAnchor)) {
            return false;
        }
        this.f = constraintAnchor;
        if (constraintAnchor.f2310a == null) {
            constraintAnchor.f2310a = new HashSet();
        }
        HashSet hashSet = this.f.f2310a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, WidgetGroup widgetGroup, ArrayList arrayList) {
        HashSet hashSet = this.f2310a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Grouping.a(((ConstraintAnchor) it.next()).d, i, arrayList, widgetGroup);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        ConstraintAnchor constraintAnchor;
        if (this.d.j0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (constraintAnchor = this.f) == null || constraintAnchor.d.j0 != 8) ? this.g : i;
    }

    public final ConstraintAnchor f() {
        Type type = this.e;
        int iOrdinal = type.ordinal();
        ConstraintWidget constraintWidget = this.d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.M;
            case 2:
                return constraintWidget.N;
            case 3:
                return constraintWidget.K;
            case 4:
                return constraintWidget.L;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f2310a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConstraintAnchor) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        ConstraintWidget constraintWidget = constraintAnchor.d;
        Type type = constraintAnchor.e;
        Type type2 = Type.h;
        Type type3 = this.e;
        if (type == type3) {
            return type3 != type2 || (constraintWidget.F && this.d.F);
        }
        int iOrdinal = type3.ordinal();
        Type type4 = Type.f;
        Type type5 = Type.d;
        Type type6 = Type.k;
        Type type7 = Type.j;
        switch (iOrdinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = type == type5 || type == type4;
                return constraintWidget instanceof Guideline ? z || type == type7 : z;
            case 2:
            case 4:
                boolean z2 = type == Type.e || type == Type.g;
                return constraintWidget instanceof Guideline ? z2 || type == type6 : z2;
            case 5:
                return (type == type5 || type == type4) ? false : true;
            case 6:
                return (type == type2 || type == type7 || type == type6) ? false : true;
            default:
                throw new AssertionError(type3.name());
        }
    }

    public final void j() {
        HashSet hashSet;
        ConstraintAnchor constraintAnchor = this.f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f2310a) != null) {
            hashSet.remove(this);
            if (this.f.f2310a.size() == 0) {
                this.f.f2310a = null;
            }
        }
        this.f2310a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        SolverVariable solverVariable = this.i;
        if (solverVariable == null) {
            this.i = new SolverVariable(SolverVariable.Type.d);
        } else {
            solverVariable.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.l0 + ":" + this.e.toString();
    }
}
