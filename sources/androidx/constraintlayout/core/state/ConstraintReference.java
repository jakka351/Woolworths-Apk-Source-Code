package androidx.constraintlayout.core.state;

import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ConstraintReference implements Reference {

    /* renamed from: a, reason: collision with root package name */
    public Object f2294a;
    public final State b;
    public float b0;
    public float c0;
    public Dimension e0;
    public Dimension f0;
    public Measurable g0;
    public ConstraintWidget h0;
    public final HashMap i0;
    public HashMap j0;
    public TypedBundle k0;
    public Object c = null;
    public int d = 0;
    public int e = 0;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = 0.5f;
    public float i = 0.5f;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = 0;
    public Object J = null;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public ConstraintReference T = null;
    public Object U = null;
    public Object V = null;
    public ConstraintReference W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;
    public Object a0 = null;
    public State.Constraint d0 = null;

    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2295a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            f2295a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2295a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2295a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2295a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2295a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2295a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2295a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2295a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2295a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2295a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2295a[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2295a[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2295a[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2295a[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2295a[16] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2295a[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2295a[14] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2295a[19] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f2295a[17] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f2295a[18] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public interface ConstraintReferenceFactory {
    }

    public static class IncorrectConstraintException extends Exception {
        @Override // java.lang.Throwable
        public final String getMessage() {
            throw null;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            throw null;
        }
    }

    public ConstraintReference(State state) {
        String str = Dimension.h;
        Dimension dimension = new Dimension(str);
        String str2 = Dimension.i;
        dimension.f = str2;
        this.e0 = dimension;
        Dimension dimension2 = new Dimension(str);
        dimension2.f = str2;
        this.f0 = dimension2;
        this.i0 = new HashMap();
        this.j0 = new HashMap();
        this.k0 = null;
        this.b = state;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget a() {
        if (this.h0 == null) {
            ConstraintWidget constraintWidget = new ConstraintWidget(this.e0.d, this.f0.d);
            this.h0 = constraintWidget;
            constraintWidget.i0 = this.g0;
        }
        return this.h0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.constraintlayout.core.state.helpers.Facade, java.lang.Object] */
    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() throws NumberFormatException {
        if (this.h0 == null) {
            return;
        }
        ?? r0 = this.c;
        if (r0 != 0) {
            r0.apply();
        }
        this.e0.a(this.h0, 0);
        this.f0.a(this.h0, 1);
        this.J = j(this.J);
        this.K = j(this.K);
        this.L = j(this.L);
        this.M = j(this.M);
        this.N = j(this.N);
        this.O = j(this.O);
        this.P = j(this.P);
        this.Q = j(this.Q);
        this.R = j(this.R);
        this.S = j(this.S);
        this.U = j(this.U);
        this.V = j(this.V);
        this.X = j(this.X);
        this.Y = j(this.Y);
        this.Z = j(this.Z);
        d(this.h0, this.J, State.Constraint.d);
        d(this.h0, this.K, State.Constraint.e);
        d(this.h0, this.L, State.Constraint.f);
        d(this.h0, this.M, State.Constraint.g);
        d(this.h0, this.N, State.Constraint.h);
        d(this.h0, this.O, State.Constraint.i);
        d(this.h0, this.P, State.Constraint.j);
        d(this.h0, this.Q, State.Constraint.k);
        d(this.h0, this.R, State.Constraint.l);
        d(this.h0, this.S, State.Constraint.m);
        d(this.h0, this.T, State.Constraint.n);
        d(this.h0, this.U, State.Constraint.o);
        d(this.h0, this.V, State.Constraint.p);
        d(this.h0, this.W, State.Constraint.q);
        d(this.h0, this.X, State.Constraint.r);
        d(this.h0, this.Y, State.Constraint.s);
        d(this.h0, this.Z, State.Constraint.t);
        d(this.h0, this.a0, State.Constraint.u);
        int i = this.d;
        if (i != 0) {
            this.h0.m0 = i;
        }
        int i2 = this.e;
        if (i2 != 0) {
            this.h0.n0 = i2;
        }
        float f = this.f;
        if (f != -1.0f) {
            this.h0.o0[0] = f;
        }
        float f2 = this.g;
        if (f2 != -1.0f) {
            this.h0.o0[1] = f2;
        }
        ConstraintWidget constraintWidget = this.h0;
        constraintWidget.g0 = this.h;
        constraintWidget.h0 = this.i;
        WidgetFrame widgetFrame = constraintWidget.j;
        widgetFrame.f = this.x;
        widgetFrame.g = this.y;
        widgetFrame.h = this.z;
        widgetFrame.i = this.A;
        widgetFrame.j = this.B;
        widgetFrame.k = this.C;
        widgetFrame.l = this.D;
        widgetFrame.m = this.E;
        widgetFrame.n = this.G;
        widgetFrame.o = this.H;
        widgetFrame.p = this.F;
        int i3 = this.I;
        widgetFrame.r = i3;
        constraintWidget.j0 = i3;
        widgetFrame.t = this.k0;
        HashMap map = this.i0;
        if (map != null) {
            for (String str : map.keySet()) {
                this.h0.j.f(902, ((Integer) map.get(str)).intValue(), str);
            }
        }
        HashMap map2 = this.j0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.h0.j.g(str2, 901, ((Float) this.j0.get(str2)).floatValue());
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final void b(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.h0 = constraintWidget;
        constraintWidget.i0 = this.g0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.core.state.helpers.Facade, java.lang.Object] */
    @Override // androidx.constraintlayout.core.state.Reference
    public final Facade c() {
        return this.c;
    }

    public final void d(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget constraintWidgetA = obj instanceof Reference ? ((Reference) obj).a() : null;
        if (constraintWidgetA == null) {
            return;
        }
        int i = AnonymousClass1.f2295a[constraint.ordinal()];
        int iOrdinal = constraint.ordinal();
        if (iOrdinal == 19) {
            float f = this.b0;
            int i2 = (int) this.c0;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.i;
            constraintWidget.A(type, constraintWidgetA, type, i2, 0);
            constraintWidget.E = f;
            return;
        }
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.g;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.e;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.h;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.d;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.f;
        switch (iOrdinal) {
            case 0:
                constraintWidget.n(type5).b(constraintWidgetA.n(type5), this.j, this.p, false);
                break;
            case 1:
                constraintWidget.n(type5).b(constraintWidgetA.n(type6), this.j, this.p, false);
                break;
            case 2:
                constraintWidget.n(type6).b(constraintWidgetA.n(type5), this.k, this.q, false);
                break;
            case 3:
                constraintWidget.n(type6).b(constraintWidgetA.n(type6), this.k, this.q, false);
                break;
            case 4:
                constraintWidget.n(type5).b(constraintWidgetA.n(type5), this.l, this.r, false);
                break;
            case 5:
                constraintWidget.n(type5).b(constraintWidgetA.n(type6), this.l, this.r, false);
                break;
            case 6:
                constraintWidget.n(type6).b(constraintWidgetA.n(type5), this.m, this.s, false);
                break;
            case 7:
                constraintWidget.n(type6).b(constraintWidgetA.n(type6), this.m, this.s, false);
                break;
            case 8:
                constraintWidget.n(type3).b(constraintWidgetA.n(type3), this.n, this.t, false);
                break;
            case 9:
                constraintWidget.n(type3).b(constraintWidgetA.n(type2), this.n, this.t, false);
                break;
            case 10:
                constraintWidget.A(type3, constraintWidgetA, type4, this.n, this.t);
                break;
            case 11:
                constraintWidget.n(type2).b(constraintWidgetA.n(type3), this.o, this.u, false);
                break;
            case 12:
                constraintWidget.n(type2).b(constraintWidgetA.n(type2), this.o, this.u, false);
                break;
            case 13:
                constraintWidget.A(type2, constraintWidgetA, type4, this.o, this.u);
                break;
            case 14:
                constraintWidget.A(type4, constraintWidgetA, type4, this.v, this.w);
                break;
            case 15:
                constraintWidget.A(type4, constraintWidgetA, type3, this.v, this.w);
                break;
            case 16:
                constraintWidget.A(type4, constraintWidgetA, type2, this.v, this.w);
                break;
        }
    }

    public final void e(Object obj) {
        this.d0 = State.Constraint.p;
        this.V = obj;
    }

    public final void f() {
        State.Constraint constraint = this.d0;
        if (constraint == null) {
            this.J = null;
            this.K = null;
            this.j = 0;
            this.L = null;
            this.M = null;
            this.k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.m = 0;
            this.R = null;
            this.S = null;
            this.n = 0;
            this.U = null;
            this.V = null;
            this.o = 0;
            this.X = null;
            this.a0 = null;
            this.h = 0.5f;
            this.i = 0.5f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            return;
        }
        int iOrdinal = constraint.ordinal();
        if (iOrdinal == 19) {
            this.a0 = null;
            return;
        }
        switch (iOrdinal) {
            case 0:
            case 1:
                this.J = null;
                this.K = null;
                this.j = 0;
                this.p = 0;
                break;
            case 2:
            case 3:
                this.L = null;
                this.M = null;
                this.k = 0;
                this.q = 0;
                break;
            case 4:
            case 5:
                this.N = null;
                this.O = null;
                this.l = 0;
                this.r = 0;
                break;
            case 6:
            case 7:
                this.P = null;
                this.Q = null;
                this.m = 0;
                this.s = 0;
                break;
            case 8:
            case 9:
            case 10:
                this.R = null;
                this.S = null;
                this.T = null;
                this.n = 0;
                this.t = 0;
                break;
            case 11:
            case 12:
            case 13:
                this.U = null;
                this.V = null;
                this.W = null;
                this.o = 0;
                this.u = 0;
                break;
            case 14:
                this.X = null;
                break;
        }
    }

    public final void g() {
        if (this.N != null) {
            this.d0 = State.Constraint.h;
        } else {
            this.d0 = State.Constraint.i;
        }
        f();
        if (this.P != null) {
            this.d0 = State.Constraint.j;
        } else {
            this.d0 = State.Constraint.k;
        }
        f();
        if (this.J != null) {
            this.d0 = State.Constraint.d;
        } else {
            this.d0 = State.Constraint.e;
        }
        f();
        if (this.L != null) {
            this.d0 = State.Constraint.f;
        } else {
            this.d0 = State.Constraint.g;
        }
        f();
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public final Object getKey() {
        return this.f2294a;
    }

    public final void h() {
        if (this.R != null) {
            this.d0 = State.Constraint.l;
        } else {
            this.d0 = State.Constraint.m;
        }
        f();
        this.d0 = State.Constraint.r;
        f();
        if (this.U != null) {
            this.d0 = State.Constraint.o;
        } else {
            this.d0 = State.Constraint.p;
        }
        f();
    }

    public final void i(Object obj) {
        this.d0 = State.Constraint.k;
        this.Q = obj;
    }

    public final Object j(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof ConstraintReference) ? (Reference) this.b.c.get(obj) : obj;
    }

    public ConstraintReference k(int i) {
        State.Constraint constraint = this.d0;
        if (constraint == null) {
            this.j = i;
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            return this;
        }
        int iOrdinal = constraint.ordinal();
        if (iOrdinal == 19) {
            this.c0 = i;
            return this;
        }
        switch (iOrdinal) {
            case 0:
            case 1:
                this.j = i;
                break;
            case 2:
            case 3:
                this.k = i;
                break;
            case 4:
            case 5:
                this.l = i;
                break;
            case 6:
            case 7:
                this.m = i;
                break;
            case 8:
            case 9:
            case 10:
                this.n = i;
                break;
            case 11:
            case 12:
            case 13:
                this.o = i;
                break;
            case 14:
            case 15:
            case 16:
                this.v = i;
                break;
        }
        return this;
    }

    public ConstraintReference l(Float f) {
        return k(this.b.d(f));
    }

    public final void m(int i) {
        State.Constraint constraint = this.d0;
        if (constraint == null) {
            this.p = i;
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            return;
        }
        switch (constraint.ordinal()) {
            case 0:
            case 1:
                this.p = i;
                break;
            case 2:
            case 3:
                this.q = i;
                break;
            case 4:
            case 5:
                this.r = i;
                break;
            case 6:
            case 7:
                this.s = i;
                break;
            case 8:
            case 9:
            case 10:
                this.t = i;
                break;
            case 11:
            case 12:
            case 13:
                this.u = i;
                break;
            case 14:
            case 15:
            case 16:
                this.w = i;
                break;
        }
    }

    public final void n(Float f) {
        m(this.b.d(f));
    }

    public final void o(Object obj) {
        this.d0 = State.Constraint.h;
        this.N = obj;
    }

    public final void p(Object obj) {
        this.d0 = State.Constraint.l;
        this.R = obj;
    }
}
