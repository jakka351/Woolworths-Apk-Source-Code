package androidx.constraintlayout.core.widgets;

import YU.a;
import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ConstraintWidget {
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final ConstraintAnchor K;
    public final ConstraintAnchor L;
    public final ConstraintAnchor M;
    public final ConstraintAnchor N;
    public final ConstraintAnchor O;
    public final ConstraintAnchor P;
    public final ConstraintAnchor Q;
    public final ConstraintAnchor R;
    public final ConstraintAnchor[] S;
    public final ArrayList T;
    public final boolean[] U;
    public DimensionBehaviour[] V;
    public ConstraintWidget W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2311a;
    public int a0;
    public ChainRun b;
    public int b0;
    public ChainRun c;
    public int c0;
    public HorizontalWidgetRun d;
    public int d0;
    public VerticalWidgetRun e;
    public int e0;
    public final boolean[] f;
    public int f0;
    public boolean g;
    public float g0;
    public int h;
    public float h0;
    public int i;
    public Object i0;
    public final WidgetFrame j;
    public int j0;
    public String k;
    public boolean k0;
    public boolean l;
    public String l0;
    public boolean m;
    public int m0;
    public boolean n;
    public int n0;
    public boolean o;
    public final float[] o0;
    public int p;
    public final ConstraintWidget[] p0;
    public int q;
    public final ConstraintWidget[] q0;
    public int r;
    public ConstraintWidget r0;
    public int s;
    public ConstraintWidget s0;
    public int t;
    public int t0;
    public final int[] u;
    public int u0;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2312a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f2312a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2312a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2312a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2312a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2312a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2312a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2312a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2312a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2312a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DimensionBehaviour {
        public static final DimensionBehaviour d;
        public static final DimensionBehaviour e;
        public static final DimensionBehaviour f;
        public static final DimensionBehaviour g;
        public static final /* synthetic */ DimensionBehaviour[] h;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            d = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            e = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            f = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            g = dimensionBehaviour4;
            h = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) h.clone();
        }
    }

    public ConstraintWidget() {
        this.f2311a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new WidgetFrame(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.d);
        this.K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.e);
        this.L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.f);
        this.M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.g);
        this.N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.h);
        this.O = constraintAnchor5;
        this.P = new ConstraintAnchor(this, ConstraintAnchor.Type.j);
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.k);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.i);
        this.R = constraintAnchor6;
        this.S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.T = new ArrayList();
        this.U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.d;
        this.V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = BitmapDescriptorFactory.HUE_RED;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = null;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = new float[]{-1.0f, -1.0f};
        this.p0 = new ConstraintWidget[]{null, null};
        this.q0 = new ConstraintWidget[]{null, null};
        this.r0 = null;
        this.s0 = null;
        this.t0 = -1;
        this.u0 = -1;
        d();
    }

    public static void L(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        a.x(i, str, " :   ", ",\n", sb);
    }

    public static void M(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void t(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, DimensionBehaviour dimensionBehaviour) {
        sb.append(str);
        sb.append(" :  {\n");
        String string = dimensionBehaviour.toString();
        if (!"FIXED".equals(string)) {
            androidx.constraintlayout.core.state.a.B(sb, "      behavior", " :   ", string, ",\n");
        }
        L(i, 0, "      size", sb);
        L(i2, 0, "      min", sb);
        L(i3, Integer.MAX_VALUE, "      max", sb);
        L(i4, 0, "      matchMin", sb);
        L(i5, 0, "      matchDef", sb);
        M(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void u(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f == null) {
            return;
        }
        androidx.compose.ui.input.pointer.a.w(sb, "    ", str, " : [ '");
        sb.append(constraintAnchor.f);
        sb.append("'");
        if (constraintAnchor.h != Integer.MIN_VALUE || constraintAnchor.g != 0) {
            sb.append(",");
            sb.append(constraintAnchor.g);
            if (constraintAnchor.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final void A(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        n(type).b(constraintWidget.n(type2), i, i2, true);
    }

    public final boolean B(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return (constraintAnchor4 == null || constraintAnchor4.f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).f) == null || constraintAnchor2.f != constraintAnchor) ? false : true;
    }

    public final boolean C() {
        ConstraintAnchor constraintAnchor = this.K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public final boolean D() {
        ConstraintAnchor constraintAnchor = this.L;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.N;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public final boolean E() {
        return this.g && this.j0 != 8;
    }

    public boolean F() {
        if (this.l) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public boolean G() {
        if (this.m) {
            return true;
        }
        return this.L.c && this.N.c;
    }

    public void H() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = Float.NaN;
        this.X = 0;
        this.Y = 0;
        this.Z = BitmapDescriptorFactory.HUE_RED;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.d;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.i0 = null;
        this.j0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float[] fArr = this.o0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void I() {
        ConstraintWidget constraintWidget = this.W;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            ((ConstraintWidgetContainer) constraintWidget).getClass();
        }
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) arrayList.get(i)).j();
        }
    }

    public final void J() {
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) arrayList.get(i);
            constraintAnchor.c = false;
            constraintAnchor.b = 0;
        }
    }

    public void K(Cache cache) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void N(int i) {
        this.d0 = i;
        this.F = i > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
  0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L90
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L90
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r5
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L86
            int r2 = r9.length()
            if (r2 <= 0) goto L86
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L86:
            r9 = r0
        L87:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8f
            r8.Z = r9
            r8.a0 = r5
        L8f:
            return
        L90:
            r8.Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.O(java.lang.String):void");
    }

    public final void P(int i, int i2) {
        if (this.l) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        this.l = true;
    }

    public final void Q(int i, int i2) {
        if (this.m) {
            return;
        }
        this.L.l(i);
        this.N.l(i2);
        this.c0 = i;
        this.Y = i2 - i;
        if (this.F) {
            this.O.l(i + this.d0);
        }
        this.m = true;
    }

    public final void R(int i) {
        this.Y = i;
        int i2 = this.f0;
        if (i < i2) {
            this.Y = i2;
        }
    }

    public final void S(DimensionBehaviour dimensionBehaviour) {
        this.V[0] = dimensionBehaviour;
    }

    public final void T(float f, int i, int i2, int i3) {
        this.s = i;
        this.v = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.w = i3;
        this.x = f;
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f || i != 0) {
            return;
        }
        this.s = 2;
    }

    public final void U(DimensionBehaviour dimensionBehaviour) {
        this.V[1] = dimensionBehaviour;
    }

    public final void V(float f, int i, int i2, int i3) {
        this.t = i;
        this.y = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.z = i3;
        this.A = f;
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f || i != 0) {
            return;
        }
        this.t = 2;
    }

    public final void W(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public void X(boolean z, boolean z2) {
        int i;
        int i2;
        HorizontalWidgetRun horizontalWidgetRun = this.d;
        boolean z3 = z & horizontalWidgetRun.g;
        VerticalWidgetRun verticalWidgetRun = this.e;
        boolean z4 = z2 & verticalWidgetRun.g;
        int i3 = horizontalWidgetRun.h.g;
        int i4 = verticalWidgetRun.h.g;
        int i5 = horizontalWidgetRun.i.g;
        int i6 = verticalWidgetRun.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.b0 = i3;
        }
        if (z4) {
            this.c0 = i4;
        }
        if (this.j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.d;
        if (z3) {
            if (this.V[0] == dimensionBehaviour && i8 < (i2 = this.X)) {
                i8 = i2;
            }
            this.X = i8;
            int i10 = this.e0;
            if (i8 < i10) {
                this.X = i10;
            }
        }
        if (z4) {
            if (this.V[1] == dimensionBehaviour && i9 < (i = this.Y)) {
                i9 = i;
            }
            this.Y = i9;
            int i11 = this.f0;
            if (i9 < i11) {
                this.Y = i11;
            }
        }
    }

    public void Y(LinearSystem linearSystem, boolean z) {
        int i;
        int i2;
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        linearSystem.getClass();
        int iN = LinearSystem.n(this.K);
        int iN2 = LinearSystem.n(this.L);
        int iN3 = LinearSystem.n(this.M);
        int iN4 = LinearSystem.n(this.N);
        if (z && (horizontalWidgetRun = this.d) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.h;
            if (dependencyNode.j) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.i;
                if (dependencyNode2.j) {
                    iN = dependencyNode.g;
                    iN3 = dependencyNode2.g;
                }
            }
        }
        if (z && (verticalWidgetRun = this.e) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.h;
            if (dependencyNode3.j) {
                DependencyNode dependencyNode4 = verticalWidgetRun.i;
                if (dependencyNode4.j) {
                    iN2 = dependencyNode3.g;
                    iN4 = dependencyNode4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.b0 = iN;
        this.c0 = iN2;
        if (this.j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.d;
        if (dimensionBehaviour == dimensionBehaviour2 && i4 < (i2 = this.X)) {
            i4 = i2;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i5 < (i = this.Y)) {
            i5 = i;
        }
        this.X = i4;
        this.Y = i5;
        int i6 = this.f0;
        if (i5 < i6) {
            this.Y = i6;
        }
        int i7 = this.e0;
        if (i4 < i7) {
            this.X = i7;
        }
        int i8 = this.w;
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.f;
        if (i8 > 0 && dimensionBehaviour == dimensionBehaviour3) {
            this.X = Math.min(this.X, i8);
        }
        int i9 = this.z;
        if (i9 > 0 && this.V[1] == dimensionBehaviour3) {
            this.Y = Math.min(this.Y, i9);
        }
        int i10 = this.X;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.Y;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void d() {
        ConstraintAnchor constraintAnchor = this.K;
        ArrayList arrayList = this.T;
        arrayList.add(constraintAnchor);
        arrayList.add(this.L);
        arrayList.add(this.M);
        arrayList.add(this.N);
        arrayList.add(this.P);
        arrayList.add(this.Q);
        arrayList.add(this.R);
        arrayList.add(this.O);
    }

    public final void e(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.a(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            f(linearSystem, constraintWidgetContainer.e0(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.K.f2310a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((ConstraintAnchor) it.next()).d.e(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.M.f2310a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((ConstraintAnchor) it2.next()).d.e(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.L.f2310a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((ConstraintAnchor) it3.next()).d.e(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.N.f2310a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((ConstraintAnchor) it4.next()).d.e(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.O.f2310a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((ConstraintAnchor) it5.next()).d.e(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018d  */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [int] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v56, types: [androidx.constraintlayout.core.widgets.ConstraintWidgetContainer] */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r61v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(androidx.constraintlayout.core.LinearSystem r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 1983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.f(androidx.constraintlayout.core.LinearSystem, boolean):void");
    }

    public boolean g() {
        return this.j0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x048e A[PHI: r3
  0x048e: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x047e, B:282:0x0484, B:283:0x0486, B:285:0x048a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(androidx.constraintlayout.core.LinearSystem r30, boolean r31, boolean r32, boolean r33, boolean r34, androidx.constraintlayout.core.SolverVariable r35, androidx.constraintlayout.core.SolverVariable r36, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r37, boolean r38, androidx.constraintlayout.core.widgets.ConstraintAnchor r39, androidx.constraintlayout.core.widgets.ConstraintAnchor r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.h(androidx.constraintlayout.core.LinearSystem, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void i(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        boolean z;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.k;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.j;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.d;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.e;
        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.f;
        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.g;
        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.i;
        if (type == type9) {
            if (type2 != type9) {
                if (type2 == type5 || type2 == type7) {
                    i(type5, constraintWidget, type2, 0);
                    i(type7, constraintWidget, type2, 0);
                    n(type9).a(constraintWidget.n(type2), 0);
                    return;
                } else {
                    if (type2 == type6 || type2 == type8) {
                        i(type6, constraintWidget, type2, 0);
                        i(type8, constraintWidget, type2, 0);
                        n(type9).a(constraintWidget.n(type2), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor constraintAnchorN = n(type5);
            ConstraintAnchor constraintAnchorN2 = n(type7);
            ConstraintAnchor constraintAnchorN3 = n(type6);
            ConstraintAnchor constraintAnchorN4 = n(type8);
            boolean z2 = true;
            if ((constraintAnchorN == null || !constraintAnchorN.h()) && (constraintAnchorN2 == null || !constraintAnchorN2.h())) {
                i(type5, constraintWidget, type5, 0);
                i(type7, constraintWidget, type7, 0);
                z = true;
            } else {
                z = false;
            }
            if ((constraintAnchorN3 == null || !constraintAnchorN3.h()) && (constraintAnchorN4 == null || !constraintAnchorN4.h())) {
                i(type6, constraintWidget, type6, 0);
                i(type8, constraintWidget, type8, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                n(type9).a(constraintWidget.n(type9), 0);
                return;
            } else if (z) {
                n(type4).a(constraintWidget.n(type4), 0);
                return;
            } else {
                if (z2) {
                    n(type3).a(constraintWidget.n(type3), 0);
                    return;
                }
                return;
            }
        }
        if (type == type4 && (type2 == type5 || type2 == type7)) {
            ConstraintAnchor constraintAnchorN5 = n(type5);
            ConstraintAnchor constraintAnchorN6 = constraintWidget.n(type2);
            ConstraintAnchor constraintAnchorN7 = n(type7);
            constraintAnchorN5.a(constraintAnchorN6, 0);
            constraintAnchorN7.a(constraintAnchorN6, 0);
            n(type4).a(constraintAnchorN6, 0);
            return;
        }
        if (type == type3 && (type2 == type6 || type2 == type8)) {
            ConstraintAnchor constraintAnchorN8 = constraintWidget.n(type2);
            n(type6).a(constraintAnchorN8, 0);
            n(type8).a(constraintAnchorN8, 0);
            n(type3).a(constraintAnchorN8, 0);
            return;
        }
        if (type == type4 && type2 == type4) {
            n(type5).a(constraintWidget.n(type5), 0);
            n(type7).a(constraintWidget.n(type7), 0);
            n(type4).a(constraintWidget.n(type2), 0);
            return;
        }
        if (type == type3 && type2 == type3) {
            n(type6).a(constraintWidget.n(type6), 0);
            n(type8).a(constraintWidget.n(type8), 0);
            n(type3).a(constraintWidget.n(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorN9 = n(type);
        ConstraintAnchor constraintAnchorN10 = constraintWidget.n(type2);
        if (constraintAnchorN9.i(constraintAnchorN10)) {
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.h;
            if (type == type10) {
                ConstraintAnchor constraintAnchorN11 = n(type6);
                ConstraintAnchor constraintAnchorN12 = n(type8);
                if (constraintAnchorN11 != null) {
                    constraintAnchorN11.j();
                }
                if (constraintAnchorN12 != null) {
                    constraintAnchorN12.j();
                }
            } else if (type == type6 || type == type8) {
                ConstraintAnchor constraintAnchorN13 = n(type10);
                if (constraintAnchorN13 != null) {
                    constraintAnchorN13.j();
                }
                ConstraintAnchor constraintAnchorN14 = n(type9);
                if (constraintAnchorN14.f != constraintAnchorN10) {
                    constraintAnchorN14.j();
                }
                ConstraintAnchor constraintAnchorF = n(type).f();
                ConstraintAnchor constraintAnchorN15 = n(type3);
                if (constraintAnchorN15.h()) {
                    constraintAnchorF.j();
                    constraintAnchorN15.j();
                }
            } else if (type == type5 || type == type7) {
                ConstraintAnchor constraintAnchorN16 = n(type9);
                if (constraintAnchorN16.f != constraintAnchorN10) {
                    constraintAnchorN16.j();
                }
                ConstraintAnchor constraintAnchorF2 = n(type).f();
                ConstraintAnchor constraintAnchorN17 = n(type4);
                if (constraintAnchorN17.h()) {
                    constraintAnchorF2.j();
                    constraintAnchorN17.j();
                }
            }
            constraintAnchorN9.a(constraintAnchorN10, i);
        }
    }

    public final void j(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.d == this) {
            i(constraintAnchor.e, constraintAnchor2.d, constraintAnchor2.e, i);
        }
    }

    public void k(ConstraintWidget constraintWidget, HashMap map) {
        this.p = constraintWidget.p;
        this.q = constraintWidget.q;
        this.s = constraintWidget.s;
        this.t = constraintWidget.t;
        int[] iArr = constraintWidget.u;
        int i = iArr[0];
        int[] iArr2 = this.u;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.v = constraintWidget.v;
        this.w = constraintWidget.w;
        this.y = constraintWidget.y;
        this.z = constraintWidget.z;
        this.A = constraintWidget.A;
        this.B = constraintWidget.B;
        this.C = constraintWidget.C;
        int[] iArr3 = constraintWidget.D;
        this.D = Arrays.copyOf(iArr3, iArr3.length);
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.V = (DimensionBehaviour[]) Arrays.copyOf(this.V, 2);
        this.W = this.W == null ? null : (ConstraintWidget) map.get(constraintWidget.W);
        this.X = constraintWidget.X;
        this.Y = constraintWidget.Y;
        this.Z = constraintWidget.Z;
        this.a0 = constraintWidget.a0;
        this.b0 = constraintWidget.b0;
        this.c0 = constraintWidget.c0;
        this.d0 = constraintWidget.d0;
        this.e0 = constraintWidget.e0;
        this.f0 = constraintWidget.f0;
        this.g0 = constraintWidget.g0;
        this.h0 = constraintWidget.h0;
        this.i0 = constraintWidget.i0;
        this.j0 = constraintWidget.j0;
        this.k0 = constraintWidget.k0;
        this.l0 = constraintWidget.l0;
        this.m0 = constraintWidget.m0;
        this.n0 = constraintWidget.n0;
        float[] fArr = constraintWidget.o0;
        float f = fArr[0];
        float[] fArr2 = this.o0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        ConstraintWidget[] constraintWidgetArr = constraintWidget.p0;
        ConstraintWidget constraintWidget2 = constraintWidgetArr[0];
        ConstraintWidget[] constraintWidgetArr2 = this.p0;
        constraintWidgetArr2[0] = constraintWidget2;
        constraintWidgetArr2[1] = constraintWidgetArr[1];
        ConstraintWidget[] constraintWidgetArr3 = constraintWidget.q0;
        ConstraintWidget constraintWidget3 = constraintWidgetArr3[0];
        ConstraintWidget[] constraintWidgetArr4 = this.q0;
        constraintWidgetArr4[0] = constraintWidget3;
        constraintWidgetArr4[1] = constraintWidgetArr3[1];
        ConstraintWidget constraintWidget4 = constraintWidget.r0;
        this.r0 = constraintWidget4 == null ? null : (ConstraintWidget) map.get(constraintWidget4);
        ConstraintWidget constraintWidget5 = constraintWidget.s0;
        this.s0 = constraintWidget5 != null ? (ConstraintWidget) map.get(constraintWidget5) : null;
    }

    public final void l(LinearSystem linearSystem) {
        linearSystem.k(this.K);
        linearSystem.k(this.L);
        linearSystem.k(this.M);
        linearSystem.k(this.N);
        if (this.d0 > 0) {
            linearSystem.k(this.O);
        }
    }

    public final void m() {
        if (this.d == null) {
            this.d = new HorizontalWidgetRun(this);
        }
        if (this.e == null) {
            this.e = new VerticalWidgetRun(this);
        }
    }

    public ConstraintAnchor n(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final DimensionBehaviour o(int i) {
        if (i == 0) {
            return this.V[0];
        }
        if (i == 1) {
            return this.V[1];
        }
        return null;
    }

    public final int p() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final ConstraintWidget q(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.N).f) != null && constraintAnchor2.f == constraintAnchor) {
                return constraintAnchor2.d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.d;
    }

    public final ConstraintWidget r(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.L).f) != null && constraintAnchor2.f == constraintAnchor) {
                return constraintAnchor2.d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.K;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.d;
    }

    public void s(StringBuilder sb) {
        sb.append("  " + this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.Y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.b0);
        sb.append("\n");
        sb.append("    actualTop:" + this.c0);
        sb.append("\n");
        u(sb, "left", this.K);
        u(sb, "top", this.L);
        u(sb, "right", this.M);
        u(sb, "bottom", this.N);
        u(sb, "baseline", this.O);
        u(sb, "centerX", this.P);
        u(sb, "centerY", this.Q);
        int i = this.X;
        int i2 = this.e0;
        int i3 = this.D[0];
        int i4 = this.v;
        int i5 = this.s;
        float f = this.x;
        DimensionBehaviour dimensionBehaviour = this.V[0];
        float[] fArr = this.o0;
        float f2 = fArr[0];
        t(sb, "    width", i, i2, i3, i4, i5, f, dimensionBehaviour);
        int i6 = this.Y;
        int i7 = this.f0;
        int i8 = this.D[1];
        int i9 = this.y;
        int i10 = this.t;
        float f3 = this.A;
        DimensionBehaviour dimensionBehaviour2 = this.V[1];
        float f4 = fArr[1];
        t(sb, "    height", i6, i7, i8, i9, i10, f3, dimensionBehaviour2);
        float f5 = this.Z;
        int i11 = this.a0;
        if (f5 != BitmapDescriptorFactory.HUE_RED) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        M(sb, "    horizontalBias", this.g0, 0.5f);
        M(sb, "    verticalBias", this.h0, 0.5f);
        L(this.m0, 0, "    horizontalChainStyle", sb);
        L(this.n0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public String toString() {
        StringBuilder sbS = a.s("");
        sbS.append(this.l0 != null ? a.o(new StringBuilder("id: "), this.l0, " ") : "");
        sbS.append("(");
        sbS.append(this.b0);
        sbS.append(", ");
        sbS.append(this.c0);
        sbS.append(") - (");
        sbS.append(this.X);
        sbS.append(" x ");
        return a.m(sbS, this.Y, ")");
    }

    public final int v() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int w() {
        ConstraintWidget constraintWidget = this.W;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.b0 : ((ConstraintWidgetContainer) constraintWidget).D0 + this.b0;
    }

    public final int x() {
        ConstraintWidget constraintWidget = this.W;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.c0 : ((ConstraintWidgetContainer) constraintWidget).E0 + this.c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            if (r3 == 0) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            if (r3 == 0) goto L36
            r3 = r2
            goto L37
        L36:
            r3 = r1
        L37:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.y(int):boolean");
    }

    public final boolean z(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i == 0) {
            ConstraintAnchor constraintAnchor5 = this.K;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f;
            if (constraintAnchor6 == null || !constraintAnchor6.c || (constraintAnchor4 = (constraintAnchor3 = this.M).f) == null || !constraintAnchor4.c) {
                return false;
            }
            return (constraintAnchor4.d() - constraintAnchor3.e()) - (constraintAnchor5.e() + constraintAnchor5.f.d()) >= i2;
        }
        ConstraintAnchor constraintAnchor7 = this.L;
        ConstraintAnchor constraintAnchor8 = constraintAnchor7.f;
        if (constraintAnchor8 == null || !constraintAnchor8.c || (constraintAnchor2 = (constraintAnchor = this.N).f) == null || !constraintAnchor2.c) {
            return false;
        }
        return (constraintAnchor2.d() - constraintAnchor.e()) - (constraintAnchor7.e() + constraintAnchor7.f.d()) >= i2;
    }

    public ConstraintWidget(int i, int i2) {
        this.f2311a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new WidgetFrame(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.d);
        this.K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.e);
        this.L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.f);
        this.M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.g);
        this.N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.h);
        this.O = constraintAnchor5;
        this.P = new ConstraintAnchor(this, ConstraintAnchor.Type.j);
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.k);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.i);
        this.R = constraintAnchor6;
        this.S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.T = new ArrayList();
        this.U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.d;
        this.V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.W = null;
        this.Z = BitmapDescriptorFactory.HUE_RED;
        this.a0 = -1;
        this.d0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = null;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = new float[]{-1.0f, -1.0f};
        this.p0 = new ConstraintWidget[]{null, null};
        this.q0 = new ConstraintWidget[]{null, null};
        this.r0 = null;
        this.s0 = null;
        this.t0 = -1;
        this.u0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.X = i;
        this.Y = i2;
        d();
    }
}
