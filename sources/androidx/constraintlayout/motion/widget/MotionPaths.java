package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
class MotionPaths implements Comparable<MotionPaths> {
    public static final String[] u = {"position", "x", "y", "width", "height", "pathRotate"};
    public Easing d;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int e = 0;
    public float l = Float.NaN;
    public int m = -1;
    public int n = -1;
    public float o = Float.NaN;
    public MotionController p = null;
    public LinkedHashMap q = new LinkedHashMap();
    public int r = 0;
    public double[] s = new double[18];
    public double[] t = new double[18];

    public static boolean b(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    public static void e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((BitmapDescriptorFactory.HUE_RED * f4) / 2.0f);
        float f9 = f5 - ((BitmapDescriptorFactory.HUE_RED * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + BitmapDescriptorFactory.HUE_RED;
    }

    public final void a(ConstraintSet.Constraint constraint) {
        int iOrdinal;
        this.d = Easing.c(constraint.d.d);
        ConstraintSet.Motion motion = constraint.d;
        this.m = motion.e;
        this.n = motion.b;
        this.l = motion.h;
        this.e = motion.f;
        this.o = constraint.e.C;
        for (String str : constraint.g.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) constraint.g.get(str);
            if (constraintAttribute != null && (iOrdinal = constraintAttribute.c.ordinal()) != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.q.put(str, constraintAttribute);
            }
        }
    }

    public final void c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.h;
        float fCos = this.i;
        float f = this.j;
        float f2 = this.k;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f3;
            } else if (i3 == 2) {
                fCos = f3;
            } else if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        MotionController motionController = this.p;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.c(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) (((Math.sin(d4) * d3) + d2) - (f / 2.0f));
            fCos = (float) ((f5 - (Math.cos(d4) * d3)) - (f2 / 2.0f));
        }
        fArr[i] = (f / 2.0f) + fSin + BitmapDescriptorFactory.HUE_RED;
        fArr[i + 1] = (f2 / 2.0f) + fCos + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // java.lang.Comparable
    public final int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.g, motionPaths.g);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
    }

    public final void f(MotionController motionController, MotionPaths motionPaths) {
        double d = (((this.j / 2.0f) + this.h) - motionPaths.h) - (motionPaths.j / 2.0f);
        double d2 = (((this.k / 2.0f) + this.i) - motionPaths.i) - (motionPaths.k / 2.0f);
        this.p = motionController;
        this.h = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.o)) {
            this.i = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.i = (float) Math.toRadians(this.o);
        }
    }
}
