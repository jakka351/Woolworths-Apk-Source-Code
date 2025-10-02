package androidx.constraintlayout.motion.widget;

import YU.a;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.ArcCurveFit;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class MotionController {
    public KeyTrigger[] A;
    public final View b;
    public final int c;
    public CurveFit[] j;
    public ArcCurveFit k;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap x;
    public HashMap y;
    public HashMap z;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2336a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final MotionPaths f = new MotionPaths();
    public final MotionPaths g = new MotionPaths();
    public final MotionConstrainedPoint h = new MotionConstrainedPoint();
    public final MotionConstrainedPoint i = new MotionConstrainedPoint();
    public float l = Float.NaN;
    public float m = BitmapDescriptorFactory.HUE_RED;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList u = new ArrayList();
    public final float[] v = new float[1];
    public final ArrayList w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public MotionController(View view) {
        this.b = view;
        this.c = view.getId();
        view.getLayoutParams();
    }

    public static void k(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(Key key) {
        this.w.add(key);
    }

    public final float b(float[] fArr, float f) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.n;
            if (f3 != 1.0d) {
                float f4 = this.m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        Easing easing = this.f.d;
        Iterator it = this.u.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            MotionPaths motionPaths = (MotionPaths) it.next();
            Easing easing2 = motionPaths.d;
            if (easing2 != null) {
                float f6 = motionPaths.f;
                if (f6 < f) {
                    easing = easing2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = motionPaths.f;
                }
            }
        }
        if (easing != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) easing.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.b(d);
            }
        }
        return f;
    }

    public final void c(double d, float[] fArr, float[] fArr2) {
        float f;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].d(dArr, d);
        this.j[0].f(dArr2, d);
        float f2 = BitmapDescriptorFactory.HUE_RED;
        Arrays.fill(fArr2, BitmapDescriptorFactory.HUE_RED);
        int[] iArr = this.o;
        MotionPaths motionPaths = this.f;
        float f3 = motionPaths.h;
        float f4 = motionPaths.i;
        float f5 = motionPaths.j;
        float f6 = motionPaths.k;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f10;
                f2 = f11;
            } else if (i2 == 2) {
                f4 = f10;
                f9 = f11;
            } else if (i2 == 3) {
                f5 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f6 = f10;
                f8 = f11;
            }
        }
        float fCos = (f7 / 2.0f) + f2;
        float fSin = (f8 / 2.0f) + f9;
        MotionController motionController = motionPaths.p;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.c(d, fArr3, fArr4);
            float f12 = fArr3[0];
            float f13 = fArr3[1];
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float fSin2 = (float) (((Math.sin(d3) * d2) + f12) - (f5 / 2.0f));
            float fCos2 = (float) ((f13 - (Math.cos(d3) * d2)) - (f6 / 2.0f));
            double d4 = f2;
            double d5 = f9;
            f = 2.0f;
            f4 = fCos2;
            fCos = (float) ((Math.cos(d3) * d5) + (Math.sin(d3) * d4) + f14);
            fSin = (float) ((Math.sin(d3) * d5) + (f15 - (Math.cos(d3) * d4)));
            f3 = fSin2;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f5 / f) + f3 + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = (f6 / f) + f4 + BitmapDescriptorFactory.HUE_RED;
        fArr2[0] = fCos;
        fArr2[1] = fSin;
    }

    public final void d(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.v;
        float fB = b(fArr2, f);
        CurveFit[] curveFitArr = this.j;
        MotionPaths motionPaths = this.f;
        int i = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths2 = this.g;
            float f4 = motionPaths2.h - motionPaths.h;
            float f5 = motionPaths2.i - motionPaths.i;
            float f6 = motionPaths2.j - motionPaths.j;
            float f7 = (motionPaths2.k - motionPaths.k) + f5;
            fArr[0] = ((f6 + f4) * f2) + ((1.0f - f2) * f4);
            fArr[1] = (f7 * f3) + ((1.0f - f3) * f5);
            return;
        }
        double d = fB;
        curveFitArr[0].f(this.q, d);
        this.j[0].d(this.p, d);
        float f8 = fArr2[0];
        while (true) {
            dArr = this.q;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * f8;
            i++;
        }
        ArcCurveFit arcCurveFit = this.k;
        if (arcCurveFit == null) {
            int[] iArr = this.o;
            double[] dArr2 = this.p;
            motionPaths.getClass();
            MotionPaths.e(f2, f3, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.p;
        if (dArr3.length > 0) {
            arcCurveFit.d(dArr3, d);
            this.k.f(this.q, d);
            int[] iArr2 = this.o;
            double[] dArr4 = this.q;
            double[] dArr5 = this.p;
            motionPaths.getClass();
            MotionPaths.e(f2, f3, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final float e() {
        return this.g.h;
    }

    public final float f() {
        return this.g.i;
    }

    public final float g() {
        return this.f.h;
    }

    public final float h() {
        return this.f.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i(float f, long j, View view, KeyCache keyCache) {
        boolean zF;
        boolean z;
        float f2;
        ViewTimeCycle.PathRotate pathRotate;
        float f3;
        boolean z2;
        double d;
        float f4;
        float f5;
        float f6;
        float fSin;
        float f7;
        ViewTimeCycle.PathRotate pathRotate2 = null;
        float fB = b(null, f);
        int i = this.E;
        if (i != -1) {
            float f8 = 1.0f / i;
            float fFloor = ((float) Math.floor(fB / f8)) * f8;
            float f9 = (fB % f8) / f8;
            if (!Float.isNaN(this.F)) {
                f9 = (f9 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fB = ((interpolator != null ? interpolator.getInterpolation(f9) : ((double) f9) > 0.5d ? 1.0f : BitmapDescriptorFactory.HUE_RED) * f8) + fFloor;
        }
        HashMap map = this.y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((ViewSpline) it.next()).g(view, fB);
            }
        }
        HashMap map2 = this.x;
        if (map2 != null) {
            ViewTimeCycle.PathRotate pathRotate3 = null;
            zF = false;
            for (ViewTimeCycle viewTimeCycle : map2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate3 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    zF |= viewTimeCycle.f(fB, j, view, keyCache);
                }
            }
            pathRotate2 = pathRotate3;
        } else {
            zF = false;
        }
        CurveFit[] curveFitArr = this.j;
        MotionPaths motionPaths = this.f;
        if (curveFitArr != null) {
            double d2 = fB;
            curveFitArr[0].d(this.p, d2);
            this.j[0].f(this.q, d2);
            ArcCurveFit arcCurveFit = this.k;
            if (arcCurveFit != null) {
                double[] dArr = this.p;
                f2 = BitmapDescriptorFactory.HUE_RED;
                if (dArr.length > 0) {
                    arcCurveFit.d(dArr, d2);
                    this.k.f(this.q, d2);
                }
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (this.H) {
                pathRotate = pathRotate2;
                f3 = 1.0f;
                z2 = zF;
                d = d2;
                f4 = 2.0f;
            } else {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f4 = 2.0f;
                double[] dArr3 = this.q;
                f3 = 1.0f;
                boolean z3 = this.d;
                float f10 = motionPaths.h;
                float fCos = motionPaths.i;
                float f11 = motionPaths.j;
                int i2 = 1;
                float f12 = motionPaths.k;
                pathRotate = pathRotate2;
                if (iArr.length != 0) {
                    f5 = f11;
                    if (motionPaths.s.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        motionPaths.s = new double[i3];
                        motionPaths.t = new double[i3];
                    }
                } else {
                    f5 = f11;
                }
                Arrays.fill(motionPaths.s, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = motionPaths.s;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    motionPaths.t[i5] = dArr3[i4];
                }
                float f13 = Float.NaN;
                float f14 = f2;
                float f15 = f14;
                float f16 = f15;
                float f17 = f16;
                int i6 = 0;
                while (true) {
                    double[] dArr5 = motionPaths.s;
                    f6 = f12;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        f7 = f10;
                    } else {
                        f7 = f10;
                        float f18 = (float) (Double.isNaN(motionPaths.s[i6]) ? 0.0d : motionPaths.s[i6] + 0.0d);
                        float f19 = (float) motionPaths.t[i6];
                        if (i6 == i2) {
                            f15 = f19;
                            f12 = f6;
                            f10 = f18;
                        } else if (i6 == 2) {
                            f14 = f19;
                            f10 = f7;
                            f12 = f6;
                            fCos = f18;
                        } else if (i6 == 3) {
                            f16 = f19;
                            f10 = f7;
                            f12 = f6;
                            f5 = f18;
                        } else if (i6 == 4) {
                            f17 = f19;
                            f10 = f7;
                            f12 = f18;
                        } else if (i6 == 5) {
                            f10 = f7;
                            f12 = f6;
                            f13 = f18;
                        }
                        i6++;
                        i2 = 1;
                    }
                    f10 = f7;
                    f12 = f6;
                    i6++;
                    i2 = 1;
                }
                float f20 = f10;
                MotionController motionController = motionPaths.p;
                if (motionController != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    motionController.c(d2, fArr, fArr2);
                    float f21 = fArr[0];
                    float f22 = fArr[1];
                    float f23 = fArr2[0];
                    float f24 = fArr2[1];
                    z2 = zF;
                    d = d2;
                    double d3 = f20;
                    double d4 = fCos;
                    fSin = (float) (((Math.sin(d4) * d3) + f21) - (f5 / 2.0f));
                    fCos = (float) ((f22 - (Math.cos(d4) * d3)) - (f6 / 2.0f));
                    double d5 = f15;
                    double d6 = f14;
                    float fCos2 = (float) ((Math.cos(d4) * d3 * d6) + (Math.sin(d4) * d5) + f23);
                    float fSin2 = (float) ((Math.sin(d4) * d3 * d6) + (f24 - (Math.cos(d4) * d5)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f13)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + f13));
                    }
                } else {
                    fSin = f20;
                    z2 = zF;
                    d = d2;
                    if (!Float.isNaN(f13)) {
                        view.setRotation(f13 + ((float) Math.toDegrees(Math.atan2((f17 / 2.0f) + f14, (f16 / 2.0f) + f15))) + f2);
                    }
                }
                float f25 = fSin;
                if (view instanceof FloatLayout) {
                    ((FloatLayout) view).a(f25, fCos, f25 + f5, fCos + f6);
                } else {
                    float f26 = f25 + 0.5f;
                    int i7 = (int) f26;
                    float f27 = fCos + 0.5f;
                    int i8 = (int) f27;
                    int i9 = (int) (f26 + f5);
                    int i10 = (int) (f27 + f6);
                    int i11 = i9 - i7;
                    int i12 = i10 - i8;
                    if (i11 != view.getMeasuredWidth() || i12 != view.getMeasuredHeight() || z3) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    view.layout(i7, i8, i9, i10);
                }
                this.d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view.getParent()).findViewById(this.C);
                }
                if (this.D != null) {
                    float bottom = (this.D.getBottom() + r1.getTop()) / f4;
                    float right = (this.D.getRight() + this.D.getLeft()) / f4;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap map3 = this.y;
            if (map3 != null) {
                for (SplineSet splineSet : map3.values()) {
                    if (splineSet instanceof ViewSpline.PathRotate) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view.setRotation(((ViewSpline.PathRotate) splineSet).a(fB) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr7 = this.q;
                double d7 = dArr7[0];
                double d8 = dArr7[1];
                ViewTimeCycle.PathRotate pathRotate4 = pathRotate;
                view.setRotation(pathRotate4.d(fB, j, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d8, d7))));
                z = z2 | pathRotate4.h;
            } else {
                z = z2;
            }
            int i13 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.j;
                if (i13 >= curveFitArr2.length) {
                    break;
                }
                CurveFit curveFit = curveFitArr2[i13];
                float[] fArr3 = this.t;
                curveFit.c(d, fArr3);
                CustomSupport.b((ConstraintAttribute) motionPaths.q.get(this.r[i13 - 1]), view, fArr3);
                i13++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.h;
            if (motionConstrainedPoint.e == 0) {
                if (fB <= f2) {
                    view.setVisibility(motionConstrainedPoint.f);
                } else {
                    MotionConstrainedPoint motionConstrainedPoint2 = this.i;
                    if (fB >= f3) {
                        view.setVisibility(motionConstrainedPoint2.f);
                    } else if (motionConstrainedPoint2.f != motionConstrainedPoint.f) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i14 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.A;
                    if (i14 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i14].h(view, fB);
                    i14++;
                }
            }
        } else {
            boolean z4 = zF;
            float f28 = motionPaths.h;
            MotionPaths motionPaths2 = this.g;
            float fA = a.a(motionPaths2.h, f28, fB, f28);
            float f29 = motionPaths.i;
            float fA2 = a.a(motionPaths2.i, f29, fB, f29);
            float f30 = motionPaths.j;
            float f31 = motionPaths2.j;
            float fA3 = a.a(f31, f30, fB, f30);
            float f32 = motionPaths.k;
            float f33 = motionPaths2.k;
            float f34 = fA + 0.5f;
            int i15 = (int) f34;
            float f35 = fA2 + 0.5f;
            int i16 = (int) f35;
            int i17 = (int) (f34 + fA3);
            int iA = (int) (f35 + a.a(f33, f32, fB, f32));
            int i18 = i17 - i15;
            int i19 = iA - i16;
            if (f31 != f30 || f33 != f32 || this.d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.d = false;
            }
            view.layout(i15, i16, i17, iA);
            z = z4;
        }
        HashMap map4 = this.z;
        if (map4 != null) {
            for (ViewOscillator viewOscillator : map4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr8 = this.q;
                    view.setRotation(((ViewOscillator.PathRotateSet) viewOscillator).a(fB) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    viewOscillator.j(view, fB);
                }
            }
        }
        return z;
    }

    public final void j(MotionPaths motionPaths) {
        motionPaths.d((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    public final void l(int i, int i2, long j) {
        ArrayList arrayList;
        HashSet hashSet;
        String[] strArr;
        Iterator it;
        char c;
        int i3;
        int i4;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle viewTimeCycleE;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        HashSet hashSet2;
        ViewSpline viewSplineF;
        ConstraintAttribute constraintAttribute3;
        MotionConstrainedPoint motionConstrainedPoint;
        float f;
        ArrayList arrayList2;
        float fMin;
        float fA;
        new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashMap map = new HashMap();
        int i5 = this.B;
        MotionPaths motionPaths = this.f;
        int i6 = -1;
        if (i5 != -1) {
            motionPaths.m = i5;
        }
        MotionConstrainedPoint motionConstrainedPoint2 = this.h;
        float f2 = motionConstrainedPoint2.h;
        MotionConstrainedPoint motionConstrainedPoint3 = this.i;
        if (MotionConstrainedPoint.c(f2, motionConstrainedPoint3.h)) {
            hashSet4.add("alpha");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.i, motionConstrainedPoint3.i)) {
            hashSet4.add("elevation");
        }
        int i7 = motionConstrainedPoint2.f;
        int i8 = motionConstrainedPoint3.f;
        if (i7 != i8 && motionConstrainedPoint2.e == 0 && (i7 == 0 || i8 == 0)) {
            hashSet4.add("alpha");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.j, motionConstrainedPoint3.j)) {
            hashSet4.add("rotation");
        }
        if (!Float.isNaN(motionConstrainedPoint2.s) || !Float.isNaN(motionConstrainedPoint3.s)) {
            hashSet4.add("transitionPathRotate");
        }
        if (!Float.isNaN(motionConstrainedPoint2.t) || !Float.isNaN(motionConstrainedPoint3.t)) {
            hashSet4.add("progress");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.k, motionConstrainedPoint3.k)) {
            hashSet4.add("rotationX");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.d, motionConstrainedPoint3.d)) {
            hashSet4.add("rotationY");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.n, motionConstrainedPoint3.n)) {
            hashSet4.add("transformPivotX");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.o, motionConstrainedPoint3.o)) {
            hashSet4.add("transformPivotY");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.l, motionConstrainedPoint3.l)) {
            hashSet4.add("scaleX");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.m, motionConstrainedPoint3.m)) {
            hashSet4.add("scaleY");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.p, motionConstrainedPoint3.p)) {
            hashSet4.add("translationX");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.q, motionConstrainedPoint3.q)) {
            hashSet4.add("translationY");
        }
        if (MotionConstrainedPoint.c(motionConstrainedPoint2.r, motionConstrainedPoint3.r)) {
            hashSet4.add("translationZ");
        }
        float f3 = Float.NaN;
        MotionPaths motionPaths2 = this.g;
        ArrayList arrayList3 = this.u;
        ArrayList arrayList4 = this.w;
        int i9 = 0;
        if (arrayList4 != null) {
            Iterator it2 = arrayList4.iterator();
            ArrayList arrayList5 = null;
            while (it2.hasNext()) {
                Key key = (Key) it2.next();
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    MotionPaths motionPaths3 = new MotionPaths();
                    motionPaths3.e = i9;
                    motionPaths3.l = f3;
                    motionPaths3.m = i6;
                    motionPaths3.n = i6;
                    motionPaths3.o = f3;
                    f = f3;
                    motionPaths3.p = null;
                    motionPaths3.q = new LinkedHashMap();
                    motionPaths3.r = i9;
                    motionPaths3.s = new double[18];
                    motionPaths3.t = new double[18];
                    if (motionPaths.n != i6) {
                        float f4 = keyPosition.f2329a / 100.0f;
                        motionPaths3.f = f4;
                        motionPaths3.e = keyPosition.h;
                        motionPaths3.r = keyPosition.m;
                        float f5 = Float.isNaN(keyPosition.i) ? f4 : keyPosition.i;
                        float f6 = Float.isNaN(keyPosition.j) ? f4 : keyPosition.j;
                        arrayList2 = arrayList4;
                        float f7 = motionPaths2.j - motionPaths.j;
                        float f8 = motionPaths2.k;
                        float f9 = motionPaths.k;
                        motionPaths3.g = motionPaths3.f;
                        motionPaths3.j = (int) ((f7 * f5) + r15);
                        motionPaths3.k = (int) (((f8 - f9) * f6) + f9);
                        motionConstrainedPoint = motionConstrainedPoint3;
                        if (keyPosition.m != 2) {
                            float f10 = Float.isNaN(keyPosition.k) ? f4 : keyPosition.k;
                            float f11 = motionPaths2.h;
                            float f12 = motionPaths.h;
                            motionPaths3.h = a.a(f11, f12, f10, f12);
                            if (!Float.isNaN(keyPosition.l)) {
                                f4 = keyPosition.l;
                            }
                            float f13 = motionPaths2.i;
                            float f14 = motionPaths.i;
                            motionPaths3.i = a.a(f13, f14, f4, f14);
                        } else {
                            if (Float.isNaN(keyPosition.k)) {
                                float f15 = motionPaths2.h;
                                float f16 = motionPaths.h;
                                fMin = a.a(f15, f16, f4, f16);
                            } else {
                                fMin = Math.min(f6, f5) * keyPosition.k;
                            }
                            motionPaths3.h = fMin;
                            if (Float.isNaN(keyPosition.l)) {
                                float f17 = motionPaths2.i;
                                float f18 = motionPaths.i;
                                fA = a.a(f17, f18, f4, f18);
                            } else {
                                fA = keyPosition.l;
                            }
                            motionPaths3.i = fA;
                        }
                        motionPaths3.n = motionPaths.n;
                        motionPaths3.d = Easing.c(keyPosition.f);
                        motionPaths3.m = keyPosition.g;
                    } else {
                        motionConstrainedPoint = motionConstrainedPoint3;
                        arrayList2 = arrayList4;
                        int i10 = keyPosition.m;
                        if (i10 == 1) {
                            float f19 = keyPosition.f2329a / 100.0f;
                            motionPaths3.f = f19;
                            motionPaths3.e = keyPosition.h;
                            float f20 = Float.isNaN(keyPosition.i) ? f19 : keyPosition.i;
                            float f21 = Float.isNaN(keyPosition.j) ? f19 : keyPosition.j;
                            float f22 = motionPaths2.j - motionPaths.j;
                            float f23 = f19;
                            float f24 = motionPaths2.k - motionPaths.k;
                            motionPaths3.g = motionPaths3.f;
                            if (!Float.isNaN(keyPosition.k)) {
                                f23 = keyPosition.k;
                            }
                            float f25 = (motionPaths.j / 2.0f) + motionPaths.h;
                            float f26 = motionPaths.i;
                            float f27 = motionPaths.k;
                            float f28 = ((motionPaths2.j / 2.0f) + motionPaths2.h) - f25;
                            float f29 = ((motionPaths2.k / 2.0f) + motionPaths2.i) - ((f27 / 2.0f) + f26);
                            float f30 = f28 * f23;
                            float f31 = (f22 * f20) / 2.0f;
                            motionPaths3.h = (int) ((r7 + f30) - f31);
                            float f32 = f23 * f29;
                            float f33 = (f24 * f21) / 2.0f;
                            motionPaths3.i = (int) ((f26 + f32) - f33);
                            motionPaths3.j = (int) (r7 + r12);
                            motionPaths3.k = (int) (f27 + r15);
                            float f34 = Float.isNaN(keyPosition.l) ? BitmapDescriptorFactory.HUE_RED : keyPosition.l;
                            float f35 = (-f29) * f34;
                            float f36 = f28 * f34;
                            motionPaths3.r = 1;
                            float f37 = (int) ((motionPaths.h + f30) - f31);
                            float f38 = (int) ((motionPaths.i + f32) - f33);
                            motionPaths3.h = f37 + f35;
                            motionPaths3.i = f38 + f36;
                            motionPaths3.n = motionPaths3.n;
                            motionPaths3.d = Easing.c(keyPosition.f);
                            motionPaths3.m = keyPosition.g;
                        } else if (i10 == 2) {
                            float f39 = keyPosition.f2329a / 100.0f;
                            motionPaths3.f = f39;
                            motionPaths3.e = keyPosition.h;
                            float f40 = Float.isNaN(keyPosition.i) ? f39 : keyPosition.i;
                            float f41 = Float.isNaN(keyPosition.j) ? f39 : keyPosition.j;
                            float f42 = motionPaths2.j;
                            float f43 = motionPaths.j;
                            float f44 = f42 - f43;
                            float f45 = motionPaths2.k;
                            float f46 = motionPaths.k;
                            float f47 = f45 - f46;
                            motionPaths3.g = motionPaths3.f;
                            float f48 = (f43 / 2.0f) + motionPaths.h;
                            float f49 = motionPaths.i;
                            float f50 = (f42 / 2.0f) + motionPaths2.h;
                            float f51 = ((f45 / 2.0f) + motionPaths2.i) - ((f46 / 2.0f) + f49);
                            float f52 = f44 * f40;
                            motionPaths3.h = (int) ((((f50 - f48) * f39) + r7) - (f52 / 2.0f));
                            float f53 = f47 * f41;
                            motionPaths3.i = (int) (((f51 * f39) + f49) - (f53 / 2.0f));
                            motionPaths3.j = (int) (f43 + f52);
                            motionPaths3.k = (int) (f46 + f53);
                            motionPaths3.r = 2;
                            if (!Float.isNaN(keyPosition.k)) {
                                motionPaths3.h = (int) (keyPosition.k * (i - ((int) motionPaths3.j)));
                            }
                            if (!Float.isNaN(keyPosition.l)) {
                                motionPaths3.i = (int) (keyPosition.l * (i2 - ((int) motionPaths3.k)));
                            }
                            motionPaths3.n = motionPaths3.n;
                            motionPaths3.d = Easing.c(keyPosition.f);
                            motionPaths3.m = keyPosition.g;
                        } else if (i10 != 3) {
                            float f54 = keyPosition.f2329a / 100.0f;
                            motionPaths3.f = f54;
                            motionPaths3.e = keyPosition.h;
                            float f55 = Float.isNaN(keyPosition.i) ? f54 : keyPosition.i;
                            float f56 = Float.isNaN(keyPosition.j) ? f54 : keyPosition.j;
                            float f57 = motionPaths2.j;
                            float f58 = motionPaths.j;
                            float f59 = f57 - f58;
                            float f60 = motionPaths2.k;
                            float f61 = motionPaths.k;
                            float f62 = f60 - f61;
                            motionPaths3.g = motionPaths3.f;
                            float f63 = (f58 / 2.0f) + motionPaths.h;
                            float f64 = motionPaths.i;
                            float f65 = ((f57 / 2.0f) + motionPaths2.h) - f63;
                            float f66 = ((f60 / 2.0f) + motionPaths2.i) - ((f61 / 2.0f) + f64);
                            float f67 = (f59 * f55) / 2.0f;
                            motionPaths3.h = (int) (((f65 * f54) + r7) - f67);
                            float f68 = (f62 * f56) / 2.0f;
                            motionPaths3.i = (int) (((f66 * f54) + f64) - f68);
                            motionPaths3.j = (int) (f58 + r29);
                            motionPaths3.k = (int) (f61 + r32);
                            float f69 = Float.isNaN(keyPosition.k) ? f54 : keyPosition.k;
                            float f70 = Float.isNaN(f) ? BitmapDescriptorFactory.HUE_RED : f;
                            float f71 = f69;
                            float f72 = Float.isNaN(keyPosition.l) ? f54 : keyPosition.l;
                            float f73 = Float.isNaN(f) ? BitmapDescriptorFactory.HUE_RED : f;
                            float f74 = f72;
                            motionPaths3.r = 0;
                            motionPaths3.h = (int) (((f73 * f66) + ((f71 * f65) + motionPaths.h)) - f67);
                            motionPaths3.i = (int) (((f66 * f74) + ((f65 * f70) + motionPaths.i)) - f68);
                            motionPaths3.d = Easing.c(keyPosition.f);
                            motionPaths3.m = keyPosition.g;
                        } else {
                            float f75 = keyPosition.f2329a / 100.0f;
                            motionPaths3.f = f75;
                            motionPaths3.e = keyPosition.h;
                            float f76 = Float.isNaN(keyPosition.i) ? f75 : keyPosition.i;
                            float f77 = Float.isNaN(keyPosition.j) ? f75 : keyPosition.j;
                            float f78 = motionPaths2.j;
                            float f79 = motionPaths.j;
                            float f80 = f78 - f79;
                            float f81 = motionPaths2.k;
                            float f82 = motionPaths.k;
                            float f83 = f81 - f82;
                            motionPaths3.g = motionPaths3.f;
                            float f84 = (f79 / 2.0f) + motionPaths.h;
                            float f85 = (f82 / 2.0f) + motionPaths.i;
                            float f86 = (f78 / 2.0f) + motionPaths2.h;
                            float f87 = (f81 / 2.0f) + motionPaths2.i;
                            if (f84 > f86) {
                                f84 = f86;
                                f86 = f84;
                            }
                            if (f85 <= f87) {
                                f85 = f87;
                                f87 = f85;
                            }
                            float f88 = f86 - f84;
                            float f89 = f85 - f87;
                            float f90 = (f80 * f76) / 2.0f;
                            motionPaths3.h = (int) (((f88 * f75) + r7) - f90);
                            float f91 = (f83 * f77) / 2.0f;
                            motionPaths3.i = (int) (((f89 * f75) + r7) - f91);
                            motionPaths3.j = (int) (f79 + r29);
                            motionPaths3.k = (int) (f82 + r32);
                            float f92 = Float.isNaN(keyPosition.k) ? f75 : keyPosition.k;
                            float f93 = Float.isNaN(f) ? BitmapDescriptorFactory.HUE_RED : f;
                            float f94 = f92;
                            float f95 = Float.isNaN(keyPosition.l) ? f75 : keyPosition.l;
                            float f96 = Float.isNaN(f) ? BitmapDescriptorFactory.HUE_RED : f;
                            float f97 = f95;
                            motionPaths3.r = 0;
                            motionPaths3.h = (int) (((f96 * f89) + ((f94 * f88) + motionPaths.h)) - f90);
                            motionPaths3.i = (int) (((f89 * f97) + ((f88 * f93) + motionPaths.i)) - f91);
                            motionPaths3.d = Easing.c(keyPosition.f);
                            motionPaths3.m = keyPosition.g;
                        }
                    }
                    if (Collections.binarySearch(arrayList3, motionPaths3) == 0) {
                        Log.e("MotionController", " KeyPath position \"" + motionPaths3.g + "\" outside of range");
                    }
                    arrayList3.add((-r7) - 1, motionPaths3);
                    int i11 = keyPosition.e;
                    if (i11 != -1) {
                        this.e = i11;
                    }
                } else {
                    motionConstrainedPoint = motionConstrainedPoint3;
                    f = f3;
                    arrayList2 = arrayList4;
                    if (key instanceof KeyCycle) {
                        key.d(hashSet5);
                    } else if (key instanceof KeyTimeCycle) {
                        key.d(hashSet3);
                    } else if (key instanceof KeyTrigger) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        ArrayList arrayList6 = arrayList5;
                        arrayList6.add((KeyTrigger) key);
                        arrayList5 = arrayList6;
                    } else {
                        key.f(map);
                        key.d(hashSet4);
                    }
                }
                f3 = f;
                arrayList4 = arrayList2;
                motionConstrainedPoint3 = motionConstrainedPoint;
                i6 = -1;
                i9 = 0;
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        MotionConstrainedPoint motionConstrainedPoint4 = motionConstrainedPoint3;
        float f98 = f3;
        ArrayList arrayList7 = arrayList4;
        if (arrayList != null) {
            this.A = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        if (hashSet4.isEmpty()) {
            hashSet = hashSet3;
        } else {
            this.y = new HashMap();
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        Key key2 = (Key) it4.next();
                        HashSet hashSet6 = hashSet3;
                        HashMap map2 = key2.d;
                        if (map2 != null && (constraintAttribute3 = (ConstraintAttribute) map2.get(str2)) != null) {
                            sparseArray.append(key2.f2329a, constraintAttribute3);
                        }
                        hashSet3 = hashSet6;
                    }
                    hashSet2 = hashSet3;
                    ViewSpline.CustomSet customSet = new ViewSpline.CustomSet();
                    String str3 = str.split(",")[1];
                    customSet.f = sparseArray;
                    viewSplineF = customSet;
                } else {
                    hashSet2 = hashSet3;
                    viewSplineF = ViewSpline.f(str);
                }
                if (viewSplineF != null) {
                    viewSplineF.e = str;
                    this.y.put(str, viewSplineF);
                }
                hashSet3 = hashSet2;
            }
            hashSet = hashSet3;
            if (arrayList7 != null) {
                Iterator it5 = arrayList7.iterator();
                while (it5.hasNext()) {
                    Key key3 = (Key) it5.next();
                    if (key3 instanceof KeyAttributes) {
                        key3.a(this.y);
                    }
                }
            }
            motionConstrainedPoint2.a(0, this.y);
            motionConstrainedPoint4.a(100, this.y);
            for (String str4 : this.y.keySet()) {
                int iIntValue = (!map.containsKey(str4) || (num = (Integer) map.get(str4)) == null) ? 0 : num.intValue();
                SplineSet splineSet = (SplineSet) this.y.get(str4);
                if (splineSet != null) {
                    splineSet.e(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.x == null) {
                this.x = new HashMap();
            }
            Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                String str5 = (String) it6.next();
                if (!this.x.containsKey(str5)) {
                    if (str5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str6 = str5.split(",")[1];
                        Iterator it7 = arrayList7.iterator();
                        while (it7.hasNext()) {
                            Key key4 = (Key) it7.next();
                            HashMap map3 = key4.d;
                            if (map3 != null && (constraintAttribute2 = (ConstraintAttribute) map3.get(str6)) != null) {
                                sparseArray2.append(key4.f2329a, constraintAttribute2);
                            }
                        }
                        ViewTimeCycle.CustomSet customSet2 = new ViewTimeCycle.CustomSet();
                        customSet2.m = new SparseArray();
                        customSet2.k = str5.split(",")[1];
                        customSet2.l = sparseArray2;
                        viewTimeCycleE = customSet2;
                    } else {
                        viewTimeCycleE = ViewTimeCycle.e(j, str5);
                    }
                    if (viewTimeCycleE != null) {
                        viewTimeCycleE.f = str5;
                        this.x.put(str5, viewTimeCycleE);
                    }
                }
            }
            if (arrayList7 != null) {
                Iterator it8 = arrayList7.iterator();
                while (it8.hasNext()) {
                    Key key5 = (Key) it8.next();
                    if (key5 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key5).h(this.x);
                    }
                }
            }
            for (String str7 : this.x.keySet()) {
                ((ViewTimeCycle) this.x.get(str7)).c(map.containsKey(str7) ? ((Integer) map.get(str7)).intValue() : 0);
            }
        }
        int size = arrayList3.size();
        int i12 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i12];
        motionPathsArr[0] = motionPaths;
        motionPathsArr[size + 1] = motionPaths2;
        if (arrayList3.size() > 0 && this.e == -1) {
            this.e = 0;
        }
        Iterator it9 = arrayList3.iterator();
        int i13 = 1;
        while (it9.hasNext()) {
            motionPathsArr[i13] = (MotionPaths) it9.next();
            i13++;
        }
        HashSet hashSet7 = new HashSet();
        for (String str8 : motionPaths2.q.keySet()) {
            if (motionPaths.q.containsKey(str8)) {
                if (!hashSet4.contains("CUSTOM," + str8)) {
                    hashSet7.add(str8);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet7.toArray(new String[0]);
        this.r = strArr2;
        this.s = new int[strArr2.length];
        int i14 = 0;
        while (true) {
            strArr = this.r;
            if (i14 >= strArr.length) {
                break;
            }
            String str9 = strArr[i14];
            this.s[i14] = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= i12) {
                    break;
                }
                if (motionPathsArr[i15].q.containsKey(str9) && (constraintAttribute = (ConstraintAttribute) motionPathsArr[i15].q.get(str9)) != null) {
                    int[] iArr = this.s;
                    iArr[i14] = constraintAttribute.c() + iArr[i14];
                    break;
                }
                i15++;
            }
            i14++;
        }
        boolean z = motionPathsArr[0].m != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        int i16 = 1;
        while (i16 < i12) {
            MotionPaths motionPaths4 = motionPathsArr[i16];
            MotionPaths motionPaths5 = motionPathsArr[i16 - 1];
            boolean zB = MotionPaths.b(motionPaths4.h, motionPaths5.h);
            boolean zB2 = MotionPaths.b(motionPaths4.i, motionPaths5.i);
            boolean z2 = z;
            zArr[0] = MotionPaths.b(motionPaths4.g, motionPaths5.g) | zArr[0];
            boolean z3 = zB | zB2 | z2;
            zArr[1] = zArr[1] | z3;
            zArr[2] = zArr[2] | z3;
            zArr[3] = zArr[3] | MotionPaths.b(motionPaths4.j, motionPaths5.j);
            zArr[4] = zArr[4] | MotionPaths.b(motionPaths4.k, motionPaths5.k);
            i16++;
            z = z2;
        }
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                i17++;
            }
        }
        this.o = new int[i17];
        int iMax = Math.max(2, i17);
        this.p = new double[iMax];
        this.q = new double[iMax];
        int i19 = 0;
        for (int i20 = 1; i20 < length; i20++) {
            if (zArr[i20]) {
                this.o[i19] = i20;
                i19++;
            }
        }
        int[] iArr2 = {i12, this.o.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i12];
        int i21 = 0;
        while (i21 < i12) {
            MotionPaths motionPaths6 = motionPathsArr[i21];
            double[] dArr3 = dArr[i21];
            int[] iArr3 = this.o;
            HashSet hashSet8 = hashSet5;
            MotionPaths[] motionPathsArr2 = motionPathsArr;
            float[] fArr = {motionPaths6.g, motionPaths6.h, motionPaths6.i, motionPaths6.j, motionPaths6.k, motionPaths6.l};
            int i22 = 0;
            int i23 = 0;
            while (i22 < iArr3.length) {
                if (iArr3[i22] < 6) {
                    i4 = i21;
                    dArr3[i23] = fArr[r10];
                    i23++;
                } else {
                    i4 = i21;
                }
                i22++;
                i21 = i4;
            }
            int i24 = i21;
            dArr2[i24] = motionPathsArr2[i24].f;
            i21 = i24 + 1;
            hashSet5 = hashSet8;
            motionPathsArr = motionPathsArr2;
        }
        HashSet hashSet9 = hashSet5;
        MotionPaths[] motionPathsArr3 = motionPathsArr;
        int i25 = 0;
        while (true) {
            int[] iArr4 = this.o;
            if (i25 >= iArr4.length) {
                break;
            }
            if (iArr4[i25] < 6) {
                String strO = a.o(new StringBuilder(), MotionPaths.u[this.o[i25]], " [");
                for (int i26 = 0; i26 < i12; i26++) {
                    StringBuilder sbS = a.s(strO);
                    sbS.append(dArr[i26][i25]);
                    strO = sbS.toString();
                }
            }
            i25++;
        }
        this.j = new CurveFit[this.r.length + 1];
        int i27 = 0;
        while (true) {
            String[] strArr3 = this.r;
            if (i27 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i27];
            int i28 = 0;
            int i29 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i28 < i12) {
                if (motionPathsArr3[i28].q.containsKey(str10)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i12];
                        ConstraintAttribute constraintAttribute4 = (ConstraintAttribute) motionPathsArr3[i28].q.get(str10);
                        dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i12, constraintAttribute4 == null ? 0 : constraintAttribute4.c());
                    }
                    MotionPaths motionPaths7 = motionPathsArr3[i28];
                    double[] dArr6 = dArr4;
                    double[][] dArr7 = dArr5;
                    dArr6[i29] = motionPaths7.f;
                    double[] dArr8 = dArr7[i29];
                    ConstraintAttribute constraintAttribute5 = (ConstraintAttribute) motionPaths7.q.get(str10);
                    if (constraintAttribute5 != null) {
                        if (constraintAttribute5.c() == 1) {
                            dArr8[0] = constraintAttribute5.a();
                        } else {
                            int iC = constraintAttribute5.c();
                            constraintAttribute5.b(new float[iC]);
                            int i30 = 0;
                            int i31 = 0;
                            while (i30 < iC) {
                                double[] dArr9 = dArr8;
                                dArr9[i31] = r13[i30];
                                i30++;
                                dArr8 = dArr9;
                                i31++;
                                i27 = i27;
                            }
                        }
                    }
                    i3 = i27;
                    i29++;
                    dArr4 = dArr6;
                    dArr5 = dArr7;
                } else {
                    i3 = i27;
                }
                i28++;
                i27 = i3;
            }
            int i32 = i27;
            double[] dArrCopyOf = Arrays.copyOf(dArr4, i29);
            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr5, i29);
            int i33 = i32 + 1;
            this.j[i33] = CurveFit.a(this.e, dArrCopyOf, dArr10);
            i27 = i33;
        }
        this.j[0] = CurveFit.a(this.e, dArr2, dArr);
        if (motionPathsArr3[0].m != -1) {
            int[] iArr5 = new int[i12];
            double[] dArr11 = new double[i12];
            double[][] dArr12 = (double[][]) Array.newInstance((Class<?>) cls, i12, 2);
            for (int i34 = 0; i34 < i12; i34++) {
                iArr5[i34] = motionPathsArr3[i34].m;
                dArr11[i34] = r7.f;
                double[] dArr13 = dArr12[i34];
                dArr13[0] = r7.h;
                dArr13[1] = r7.i;
            }
            this.k = new ArcCurveFit(iArr5, dArr11, dArr12);
        }
        this.z = new HashMap();
        if (arrayList7 != null) {
            Iterator it10 = hashSet9.iterator();
            float f99 = f98;
            while (it10.hasNext()) {
                String str11 = (String) it10.next();
                ViewOscillator viewOscillatorI = ViewOscillator.i(str11);
                if (viewOscillatorI != null) {
                    if (viewOscillatorI.e == 1 && Float.isNaN(f99)) {
                        float[] fArr2 = new float[2];
                        float f100 = 1.0f / 99;
                        double d = 0.0d;
                        double d2 = 0.0d;
                        int i35 = 0;
                        float fHypot = BitmapDescriptorFactory.HUE_RED;
                        while (i35 < 100) {
                            float f101 = i35 * f100;
                            double d3 = d;
                            double dA = f101;
                            Easing easing = motionPaths.d;
                            Iterator it11 = arrayList3.iterator();
                            float f102 = f98;
                            float f103 = BitmapDescriptorFactory.HUE_RED;
                            while (it11.hasNext()) {
                                Iterator it12 = it10;
                                MotionPaths motionPaths8 = (MotionPaths) it11.next();
                                float[] fArr3 = fArr2;
                                Easing easing2 = motionPaths8.d;
                                if (easing2 != null) {
                                    float f104 = motionPaths8.f;
                                    if (f104 < f101) {
                                        f103 = f104;
                                        easing = easing2;
                                    } else if (Float.isNaN(f102)) {
                                        f102 = motionPaths8.f;
                                    }
                                }
                                it10 = it12;
                                fArr2 = fArr3;
                            }
                            Iterator it13 = it10;
                            float[] fArr4 = fArr2;
                            if (easing != null) {
                                if (Float.isNaN(f102)) {
                                    f102 = 1.0f;
                                }
                                dA = (((float) easing.a((f101 - f103) / r20)) * (f102 - f103)) + f103;
                            }
                            this.j[0].d(this.p, dA);
                            this.f.c(dA, this.o, this.p, fArr4, 0);
                            if (i35 > 0) {
                                c = 0;
                                fHypot += (float) Math.hypot(d2 - fArr4[1], d3 - fArr4[0]);
                            } else {
                                c = 0;
                            }
                            d = fArr4[c];
                            d2 = fArr4[1];
                            i35++;
                            it10 = it13;
                            fArr2 = fArr4;
                        }
                        it = it10;
                        f99 = fHypot;
                        viewOscillatorI.b = str11;
                        this.z.put(str11, viewOscillatorI);
                        it10 = it;
                    } else {
                        it = it10;
                        viewOscillatorI.b = str11;
                        this.z.put(str11, viewOscillatorI);
                        it10 = it;
                    }
                }
            }
            Iterator it14 = arrayList7.iterator();
            while (it14.hasNext()) {
                Key key6 = (Key) it14.next();
                if (key6 instanceof KeyCycle) {
                    ((KeyCycle) key6).h(this.z);
                }
            }
            Iterator it15 = this.z.values().iterator();
            while (it15.hasNext()) {
                ((ViewOscillator) it15.next()).h();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        MotionPaths motionPaths = this.f;
        sb.append(motionPaths.h);
        sb.append(" y: ");
        sb.append(motionPaths.i);
        sb.append(" end: x: ");
        MotionPaths motionPaths2 = this.g;
        sb.append(motionPaths2.h);
        sb.append(" y: ");
        sb.append(motionPaths2.i);
        return sb.toString();
    }
}
