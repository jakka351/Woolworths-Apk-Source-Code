package androidx.constraintlayout.core.dsl;

import YU.a;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Constraint {
    public static final int q;

    /* renamed from: a, reason: collision with root package name */
    public final String f2267a;
    public final HAnchor b = new HAnchor(this, HSide.d);
    public final HAnchor c = new HAnchor(this, HSide.e);
    public final VAnchor d = new VAnchor(this, VSide.d);
    public final VAnchor e = new VAnchor(this, VSide.e);
    public final HAnchor f = new HAnchor(this, HSide.f);
    public final HAnchor g = new HAnchor(this, HSide.g);
    public final VAnchor h = new VAnchor(this, VSide.f);
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;

    public class Anchor {
        public final String toString() {
            return a.A("[", "]");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Behaviour {
        public static final /* synthetic */ Behaviour[] d = {new Behaviour("SPREAD", 0), new Behaviour("WRAP", 1), new Behaviour("PERCENT", 2), new Behaviour("RATIO", 3), new Behaviour("RESOLVED", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        Behaviour EF5;

        public static Behaviour valueOf(String str) {
            return (Behaviour) Enum.valueOf(Behaviour.class, str);
        }

        public static Behaviour[] values() {
            return (Behaviour[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ChainMode {
        public static final ChainMode d;
        public static final ChainMode e;
        public static final ChainMode f;
        public static final /* synthetic */ ChainMode[] g;

        static {
            ChainMode chainMode = new ChainMode("SPREAD", 0);
            d = chainMode;
            ChainMode chainMode2 = new ChainMode("SPREAD_INSIDE", 1);
            e = chainMode2;
            ChainMode chainMode3 = new ChainMode("PACKED", 2);
            f = chainMode3;
            g = new ChainMode[]{chainMode, chainMode2, chainMode3};
        }

        public static ChainMode valueOf(String str) {
            return (ChainMode) Enum.valueOf(ChainMode.class, str);
        }

        public static ChainMode[] values() {
            return (ChainMode[]) g.clone();
        }
    }

    public class HAnchor extends Anchor {
        public HAnchor(Constraint constraint, HSide hSide) {
            Side.valueOf(hSide.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HSide {
        public static final HSide d;
        public static final HSide e;
        public static final HSide f;
        public static final HSide g;
        public static final /* synthetic */ HSide[] h;

        static {
            HSide hSide = new HSide("LEFT", 0);
            d = hSide;
            HSide hSide2 = new HSide("RIGHT", 1);
            e = hSide2;
            HSide hSide3 = new HSide("START", 2);
            f = hSide3;
            HSide hSide4 = new HSide("END", 3);
            g = hSide4;
            h = new HSide[]{hSide, hSide2, hSide3, hSide4};
        }

        public static HSide valueOf(String str) {
            return (HSide) Enum.valueOf(HSide.class, str);
        }

        public static HSide[] values() {
            return (HSide[]) h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Side {
        public static final Side d;
        public static final Side e;
        public static final Side f;
        public static final Side g;
        public static final Side h;
        public static final Side i;
        public static final Side j;
        public static final /* synthetic */ Side[] k;

        static {
            Side side = new Side("LEFT", 0);
            d = side;
            Side side2 = new Side("RIGHT", 1);
            e = side2;
            Side side3 = new Side("TOP", 2);
            f = side3;
            Side side4 = new Side("BOTTOM", 3);
            g = side4;
            Side side5 = new Side("START", 4);
            h = side5;
            Side side6 = new Side("END", 5);
            i = side6;
            Side side7 = new Side("BASELINE", 6);
            j = side7;
            k = new Side[]{side, side2, side3, side4, side5, side6, side7};
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) k.clone();
        }
    }

    public class VAnchor extends Anchor {
        public VAnchor(Constraint constraint, VSide vSide) {
            Side.valueOf(vSide.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VSide {
        public static final VSide d;
        public static final VSide e;
        public static final VSide f;
        public static final /* synthetic */ VSide[] g;

        static {
            VSide vSide = new VSide("TOP", 0);
            d = vSide;
            VSide vSide2 = new VSide("BOTTOM", 1);
            e = vSide2;
            VSide vSide3 = new VSide("BASELINE", 2);
            f = vSide3;
            g = new VSide[]{vSide, vSide2, vSide3};
        }

        public static VSide valueOf(String str) {
            return (VSide) Enum.valueOf(VSide.class, str);
        }

        public static VSide[] values() {
            return (VSide[]) g.clone();
        }
    }

    static {
        new Constraint();
        q = Integer.MIN_VALUE;
        HashMap map = new HashMap();
        map.put(ChainMode.d, "spread");
        map.put(ChainMode.e, "spread_inside");
        map.put(ChainMode.f, "packed");
    }

    public Constraint() {
        int i = q;
        this.i = i;
        this.j = i;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.f2267a = "parent";
    }

    public static void a(float f, String str, StringBuilder sb) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f);
        sb.append(",\n");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(a.o(new StringBuilder(), this.f2267a, ":{\n"));
        this.b.getClass();
        this.c.getClass();
        this.d.getClass();
        this.e.getClass();
        this.f.getClass();
        this.g.getClass();
        this.h.getClass();
        int i = this.i;
        int i2 = q;
        if (i != i2) {
            sb.append("width:");
            sb.append(i);
            sb.append(",\n");
        }
        int i3 = this.j;
        if (i3 != i2) {
            sb.append("height:");
            sb.append(i3);
            sb.append(",\n");
        }
        a(this.k, "horizontalBias", sb);
        a(this.l, "verticalBias", sb);
        a(this.m, "verticalWeight", sb);
        a(this.n, "horizontalWeight", sb);
        float f = this.o;
        if (!Double.isNaN(f)) {
            sb.append("width:'");
            sb.append((int) f);
            sb.append("%',\n");
        }
        float f2 = this.p;
        if (!Double.isNaN(f2)) {
            sb.append("height:'");
            sb.append((int) f2);
            sb.append("%',\n");
        }
        sb.append("},\n");
        return sb.toString();
    }
}
