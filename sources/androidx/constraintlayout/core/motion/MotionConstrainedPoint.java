package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.state.WidgetFrame;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    public int e;
    public float d = 1.0f;
    public float f = BitmapDescriptorFactory.HUE_RED;
    public float g = BitmapDescriptorFactory.HUE_RED;
    public float h = BitmapDescriptorFactory.HUE_RED;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = BitmapDescriptorFactory.HUE_RED;
    public float n = BitmapDescriptorFactory.HUE_RED;
    public float o = BitmapDescriptorFactory.HUE_RED;
    public final LinkedHashMap p = new LinkedHashMap();

    public static boolean b(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(int i, HashMap map) {
        for (String str : map.keySet()) {
            SplineSet splineSet = (SplineSet) map.get(str);
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            float f = BitmapDescriptorFactory.HUE_RED;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.g)) {
                        f = this.g;
                    }
                    splineSet.c(f, i);
                    break;
                case 1:
                    if (!Float.isNaN(this.h)) {
                        f = this.h;
                    }
                    splineSet.c(f, i);
                    break;
                case 2:
                    if (!Float.isNaN(this.f)) {
                        f = this.f;
                    }
                    splineSet.c(f, i);
                    break;
                case 3:
                    if (!Float.isNaN(this.m)) {
                        f = this.m;
                    }
                    splineSet.c(f, i);
                    break;
                case 4:
                    if (!Float.isNaN(this.n)) {
                        f = this.n;
                    }
                    splineSet.c(f, i);
                    break;
                case 5:
                    if (!Float.isNaN(this.o)) {
                        f = this.o;
                    }
                    splineSet.c(f, i);
                    break;
                case 6:
                    splineSet.c(Float.isNaN(Float.NaN) ? 0.0f : Float.NaN, i);
                    break;
                case 7:
                    if (!Float.isNaN(this.k)) {
                        f = this.k;
                    }
                    splineSet.c(f, i);
                    break;
                case '\b':
                    if (!Float.isNaN(this.l)) {
                        f = this.l;
                    }
                    splineSet.c(f, i);
                    break;
                case '\t':
                    splineSet.c(Float.isNaN(this.i) ? 1.0f : this.i, i);
                    break;
                case '\n':
                    splineSet.c(Float.isNaN(this.j) ? 1.0f : this.j, i);
                    break;
                case 11:
                    splineSet.c(Float.isNaN(this.d) ? 1.0f : this.d, i);
                    break;
                case '\f':
                    splineSet.c(Float.isNaN(Float.NaN) ? 0.0f : Float.NaN, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.p;
                        if (linkedHashMap.containsKey(str2)) {
                            CustomVariable customVariable = (CustomVariable) linkedHashMap.get(str2);
                            if (splineSet instanceof SplineSet.CustomSpline) {
                                ((SplineSet.CustomSpline) splineSet).f.a(i, customVariable);
                                break;
                            } else {
                                Utils.a("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + customVariable.c() + splineSet);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Utils.a("MotionPaths", "UNKNOWN spline ".concat(str));
                        break;
                    }
            }
        }
    }

    public final void c(MotionWidget motionWidget) {
        int i;
        WidgetFrame widgetFrame = motionWidget.f2271a;
        int i2 = widgetFrame.b;
        int i3 = widgetFrame.d;
        int i4 = widgetFrame.e;
        int i5 = motionWidget.c.f2273a;
        this.e = i5;
        this.d = i5 != 4 ? BitmapDescriptorFactory.HUE_RED : widgetFrame.p;
        this.f = widgetFrame.j;
        this.g = widgetFrame.h;
        this.h = widgetFrame.i;
        this.i = widgetFrame.n;
        this.j = widgetFrame.o;
        this.k = widgetFrame.f;
        this.l = widgetFrame.g;
        this.m = widgetFrame.k;
        this.n = widgetFrame.l;
        this.o = widgetFrame.m;
        for (String str : widgetFrame.s.keySet()) {
            CustomVariable customVariable = (CustomVariable) motionWidget.f2271a.s.get(str);
            if (customVariable != null && (i = customVariable.b) != 903 && i != 904 && i != 906) {
                this.p.put(str, customVariable);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        motionConstrainedPoint.getClass();
        return Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }
}
