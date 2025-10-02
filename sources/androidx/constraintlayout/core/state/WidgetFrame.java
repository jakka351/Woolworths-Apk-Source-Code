package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class WidgetFrame {

    /* renamed from: a, reason: collision with root package name */
    public ConstraintWidget f2304a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public final HashMap s;
    public TypedBundle t;

    public WidgetFrame() {
        this.f2304a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap();
    }

    public static void a(float f, String str, StringBuilder sb) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void b(StringBuilder sb, int i, String str) {
        YU.a.x(i, str, ": ", ",\n", sb);
    }

    public static float c(float f, float f2, float f3, float f4) {
        boolean zIsNaN = Float.isNaN(f);
        boolean zIsNaN2 = Float.isNaN(f2);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f = f3;
        }
        if (zIsNaN2) {
            f2 = f3;
        }
        return YU.a.a(f2, f, f4, f);
    }

    public final boolean d() {
        return Float.isNaN(this.h) && Float.isNaN(this.i) && Float.isNaN(this.j) && Float.isNaN(this.k) && Float.isNaN(this.l) && Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p);
    }

    public final void e(StringBuilder sb, boolean z) {
        sb.append("{\n");
        b(sb, this.b, "left");
        b(sb, this.c, "top");
        b(sb, this.d, "right");
        b(sb, this.e, "bottom");
        a(this.f, "pivotX", sb);
        a(this.g, "pivotY", sb);
        a(this.h, "rotationX", sb);
        a(this.i, "rotationY", sb);
        a(this.j, "rotationZ", sb);
        a(this.k, "translationX", sb);
        a(this.l, "translationY", sb);
        a(this.m, "translationZ", sb);
        a(this.n, "scaleX", sb);
        a(this.o, "scaleY", sb);
        a(this.p, "alpha", sb);
        b(sb, this.r, "visibility");
        a(this.q, "interpolatedPos", sb);
        if (this.f2304a != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                ConstraintAnchor constraintAnchorN = this.f2304a.n(type);
                if (constraintAnchorN != null && constraintAnchorN.f != null) {
                    sb.append("Anchor");
                    sb.append(type.name());
                    sb.append(": ['");
                    String str = constraintAnchorN.f.d.k;
                    if (str == null) {
                        str = "#PARENT";
                    }
                    sb.append(str);
                    sb.append("', '");
                    sb.append(constraintAnchorN.f.e.name());
                    sb.append("', '");
                    sb.append(constraintAnchorN.g);
                    sb.append("'],\n");
                }
            }
        }
        if (z) {
            a(Float.NaN, "phone_orientation", sb);
        }
        if (z) {
            a(Float.NaN, "phone_orientation", sb);
        }
        HashMap map = this.s;
        if (map.size() != 0) {
            sb.append("custom : {\n");
            for (String str2 : map.keySet()) {
                CustomVariable customVariable = (CustomVariable) map.get(str2);
                sb.append(str2);
                sb.append(": ");
                switch (customVariable.b) {
                    case 900:
                        sb.append(customVariable.c);
                        sb.append(",\n");
                        break;
                    case 901:
                        sb.append(customVariable.d);
                        sb.append(",\n");
                        break;
                    case 902:
                        sb.append("'");
                        sb.append(CustomVariable.b(customVariable.c));
                        sb.append("',\n");
                        break;
                    case 903:
                        sb.append("'");
                        sb.append(customVariable.e);
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
    }

    public final void f(int i, int i2, String str) {
        HashMap map = this.s;
        if (map.containsKey(str)) {
            ((CustomVariable) map.get(str)).c = i2;
        } else {
            map.put(str, new CustomVariable(str, i, i2));
        }
    }

    public final void g(String str, int i, float f) {
        HashMap map = this.s;
        if (map.containsKey(str)) {
            ((CustomVariable) map.get(str)).d = f;
        } else {
            map.put(str, new CustomVariable(str, i, f));
        }
    }

    public final void h() {
        ConstraintWidget constraintWidget = this.f2304a;
        if (constraintWidget != null) {
            this.b = constraintWidget.w();
            this.c = this.f2304a.x();
            ConstraintWidget constraintWidget2 = this.f2304a;
            this.d = constraintWidget2.w() + constraintWidget2.X;
            ConstraintWidget constraintWidget3 = this.f2304a;
            this.e = constraintWidget3.x() + constraintWidget3.Y;
            i(this.f2304a.j);
        }
    }

    public final void i(WidgetFrame widgetFrame) {
        if (widgetFrame == null) {
            return;
        }
        this.f = widgetFrame.f;
        this.g = widgetFrame.g;
        this.h = widgetFrame.h;
        this.i = widgetFrame.i;
        this.j = widgetFrame.j;
        this.k = widgetFrame.k;
        this.l = widgetFrame.l;
        this.m = widgetFrame.m;
        this.n = widgetFrame.n;
        this.o = widgetFrame.o;
        this.p = widgetFrame.p;
        this.r = widgetFrame.r;
        this.t = widgetFrame.t;
        HashMap map = this.s;
        map.clear();
        for (CustomVariable customVariable : widgetFrame.s.values()) {
            map.put(customVariable.f2268a, new CustomVariable(customVariable));
        }
    }

    public WidgetFrame(ConstraintWidget constraintWidget) {
        this.f2304a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap();
        this.f2304a = constraintWidget;
    }

    public WidgetFrame(WidgetFrame widgetFrame) {
        this.f2304a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap();
        this.f2304a = widgetFrame.f2304a;
        this.b = widgetFrame.b;
        this.c = widgetFrame.c;
        this.d = widgetFrame.d;
        this.e = widgetFrame.e;
        i(widgetFrame);
    }
}
