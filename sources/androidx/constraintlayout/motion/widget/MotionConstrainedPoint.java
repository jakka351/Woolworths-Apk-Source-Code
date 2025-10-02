package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    public int f;
    public float d = BitmapDescriptorFactory.HUE_RED;
    public int e = 0;
    public final LinkedHashMap g = new LinkedHashMap();
    public float h = 1.0f;
    public float i = BitmapDescriptorFactory.HUE_RED;
    public float j = BitmapDescriptorFactory.HUE_RED;
    public float k = BitmapDescriptorFactory.HUE_RED;
    public float l = 1.0f;
    public float m = 1.0f;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = BitmapDescriptorFactory.HUE_RED;
    public float q = BitmapDescriptorFactory.HUE_RED;
    public float r = BitmapDescriptorFactory.HUE_RED;
    public float s = Float.NaN;
    public float t = Float.NaN;

    public static boolean c(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(int i, HashMap map) {
        for (String str : map.keySet()) {
            ViewSpline viewSpline = (ViewSpline) map.get(str);
            if (viewSpline != null) {
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
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                float f = BitmapDescriptorFactory.HUE_RED;
                switch (c) {
                    case 0:
                        if (!Float.isNaN(this.k)) {
                            f = this.k;
                        }
                        viewSpline.c(f, i);
                        break;
                    case 1:
                        if (!Float.isNaN(this.d)) {
                            f = this.d;
                        }
                        viewSpline.c(f, i);
                        break;
                    case 2:
                        if (!Float.isNaN(this.p)) {
                            f = this.p;
                        }
                        viewSpline.c(f, i);
                        break;
                    case 3:
                        if (!Float.isNaN(this.q)) {
                            f = this.q;
                        }
                        viewSpline.c(f, i);
                        break;
                    case 4:
                        if (!Float.isNaN(this.r)) {
                            f = this.r;
                        }
                        viewSpline.c(f, i);
                        break;
                    case 5:
                        if (!Float.isNaN(this.t)) {
                            f = this.t;
                        }
                        viewSpline.c(f, i);
                        break;
                    case 6:
                        viewSpline.c(Float.isNaN(this.l) ? 1.0f : this.l, i);
                        break;
                    case 7:
                        viewSpline.c(Float.isNaN(this.m) ? 1.0f : this.m, i);
                        break;
                    case '\b':
                        if (!Float.isNaN(this.n)) {
                            f = this.n;
                        }
                        viewSpline.c(f, i);
                        break;
                    case '\t':
                        if (!Float.isNaN(this.o)) {
                            f = this.o;
                        }
                        viewSpline.c(f, i);
                        break;
                    case '\n':
                        if (!Float.isNaN(this.j)) {
                            f = this.j;
                        }
                        viewSpline.c(f, i);
                        break;
                    case 11:
                        if (!Float.isNaN(this.i)) {
                            f = this.i;
                        }
                        viewSpline.c(f, i);
                        break;
                    case '\f':
                        if (!Float.isNaN(this.s)) {
                            f = this.s;
                        }
                        viewSpline.c(f, i);
                        break;
                    case '\r':
                        viewSpline.c(Float.isNaN(this.h) ? 1.0f : this.h, i);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.g;
                            if (linkedHashMap.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = (ConstraintAttribute) linkedHashMap.get(str2);
                                if (viewSpline instanceof ViewSpline.CustomSet) {
                                    ((ViewSpline.CustomSet) viewSpline).f.append(i, constraintAttribute);
                                    break;
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + constraintAttribute.a() + viewSpline);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                            break;
                        }
                }
            }
        }
    }

    public final void b(View view) {
        this.f = view.getVisibility();
        this.h = view.getVisibility() != 0 ? BitmapDescriptorFactory.HUE_RED : view.getAlpha();
        this.i = view.getElevation();
        this.j = view.getRotation();
        this.k = view.getRotationX();
        this.d = view.getRotationY();
        this.l = view.getScaleX();
        this.m = view.getScaleY();
        this.n = view.getPivotX();
        this.o = view.getPivotY();
        this.p = view.getTranslationX();
        this.q = view.getTranslationY();
        this.r = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        motionConstrainedPoint.getClass();
        return Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public final void d(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        rect.width();
        rect.height();
        ConstraintSet.Constraint constraintK = constraintSet.k(i2);
        ConstraintSet.PropertySet propertySet = constraintK.c;
        ConstraintSet.Motion motion = constraintK.d;
        int i3 = propertySet.c;
        this.e = i3;
        int i4 = propertySet.b;
        this.f = i4;
        this.h = (i4 == 0 || i3 != 0) ? propertySet.d : BitmapDescriptorFactory.HUE_RED;
        ConstraintSet.Transform transform = constraintK.f;
        boolean z = transform.m;
        this.i = transform.n;
        this.j = transform.b;
        this.k = transform.c;
        this.d = transform.d;
        this.l = transform.e;
        this.m = transform.f;
        this.n = transform.g;
        this.o = transform.h;
        this.p = transform.j;
        this.q = transform.k;
        this.r = transform.l;
        Easing.c(motion.d);
        this.s = motion.h;
        this.t = constraintK.c.e;
        for (String str : constraintK.g.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) constraintK.g.get(str);
            int iOrdinal = constraintAttribute.c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.g.put(str, constraintAttribute);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.j + 90.0f;
            this.j = f;
            if (f > 180.0f) {
                this.j = f - 360.0f;
                return;
            }
            return;
        }
        this.j -= 90.0f;
    }
}
