package androidx.constraintlayout.core.motion;

import YU.a;
import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.ArcCurveFit;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.state.WidgetFrame;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class Motion implements TypedValues {
    public Motion D;

    /* renamed from: a, reason: collision with root package name */
    public final MotionWidget f2269a;
    public CurveFit[] g;
    public ArcCurveFit h;
    public int[] l;
    public double[] m;
    public double[] n;
    public String[] o;
    public int[] p;
    public HashMap u;
    public HashMap v;
    public HashMap w;
    public MotionKeyTrigger[] x;
    public int b = 0;
    public final MotionPaths c = new MotionPaths();
    public final MotionPaths d = new MotionPaths();
    public final MotionConstrainedPoint e = new MotionConstrainedPoint();
    public final MotionConstrainedPoint f = new MotionConstrainedPoint();
    public float i = Float.NaN;
    public float j = BitmapDescriptorFactory.HUE_RED;
    public float k = 1.0f;
    public final float[] q = new float[4];
    public final ArrayList r = new ArrayList();
    public final float[] s = new float[1];
    public final ArrayList t = new ArrayList();
    public int y = -1;
    public final int z = -1;
    public int A = -1;
    public float B = Float.NaN;
    public DifferentialInterpolator C = null;

    /* renamed from: androidx.constraintlayout.core.motion.Motion$1, reason: invalid class name */
    class AnonymousClass1 implements DifferentialInterpolator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Easing f2270a;

        public AnonymousClass1(Easing easing) {
            this.f2270a = easing;
        }
    }

    public Motion(MotionWidget motionWidget) {
        this.f2269a = motionWidget;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean a(int i, int i2) {
        if (i == 509) {
            this.y = i2;
            return true;
        }
        if (i != 610) {
            return i == 704;
        }
        this.A = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean b(int i, boolean z) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean c(float f, int i) {
        if (602 == i) {
            this.B = f;
            return true;
        }
        if (600 != i) {
            return false;
        }
        this.i = f;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean d(int i, String str) {
        if (705 == i || 611 == i) {
            this.C = new AnonymousClass1(Easing.c(str));
            return true;
        }
        if (605 != i) {
            return false;
        }
        this.c.m = str;
        return true;
    }

    public final int e(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrG = this.g[0].g();
        ArrayList arrayList = this.r;
        if (iArr != null) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((MotionPaths) it.next()).q;
                i++;
            }
        }
        if (iArr2 != null) {
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                iArr2[i2] = (int) (((MotionPaths) it2.next()).f * 100.0f);
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < dArrG.length; i4++) {
            this.g[0].d(this.m, dArrG[i4]);
            this.c.c(dArrG[i4], this.l, this.m, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    public final void f(float[] fArr, int i) {
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / (i2 - 1);
        HashMap map = this.v;
        SplineSet splineSet = map == null ? null : (SplineSet) map.get("translationX");
        HashMap map2 = this.v;
        SplineSet splineSet2 = map2 == null ? null : (SplineSet) map2.get("translationY");
        HashMap map3 = this.w;
        KeyCycleOscillator keyCycleOscillator = map3 == null ? null : (KeyCycleOscillator) map3.get("translationX");
        HashMap map4 = this.w;
        KeyCycleOscillator keyCycleOscillator2 = map4 != null ? (KeyCycleOscillator) map4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float fMin = i3 * f2;
            float f3 = this.k;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            if (f3 != f) {
                float f5 = this.j;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, f);
                }
            }
            double dA = fMin;
            Easing easing = this.c.d;
            Iterator it = this.r.iterator();
            float f6 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths motionPaths = (MotionPaths) it.next();
                Easing easing2 = motionPaths.d;
                if (easing2 != null) {
                    float f7 = motionPaths.e;
                    if (f7 < fMin) {
                        f4 = f7;
                        easing = easing2;
                    } else if (Float.isNaN(f6)) {
                        f6 = motionPaths.e;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                dA = (((float) easing.a((fMin - f4) / r16)) * (f6 - f4)) + f4;
            }
            this.g[0].d(this.m, dA);
            ArcCurveFit arcCurveFit = this.h;
            if (arcCurveFit != null) {
                double[] dArr = this.m;
                if (dArr.length > 0) {
                    arcCurveFit.d(dArr, dA);
                }
            }
            int i4 = i3 * 2;
            this.c.c(dA, this.l, this.m, fArr, i4);
            if (keyCycleOscillator != null) {
                fArr[i4] = keyCycleOscillator.a(fMin) + fArr[i4];
            } else if (splineSet != null) {
                fArr[i4] = splineSet.a(fMin) + fArr[i4];
            }
            if (keyCycleOscillator2 != null) {
                int i5 = i4 + 1;
                fArr[i5] = keyCycleOscillator2.a(fMin) + fArr[i5];
            } else if (splineSet2 != null) {
                int i6 = i4 + 1;
                fArr[i6] = splineSet2.a(fMin) + fArr[i6];
            }
            i3++;
            i2 = i;
            f = 1.0f;
        }
    }

    public final float g(float[] fArr, float f) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.k;
            if (f3 != 1.0d) {
                float f4 = this.j;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        Easing easing = this.c.d;
        Iterator it = this.r.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            MotionPaths motionPaths = (MotionPaths) it.next();
            Easing easing2 = motionPaths.d;
            if (easing2 != null) {
                float f6 = motionPaths.e;
                if (f6 < f) {
                    easing = easing2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = motionPaths.e;
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

    public final void h(double d, float[] fArr, float[] fArr2) {
        float f;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.g[0].d(dArr, d);
        this.g[0].f(dArr2, d);
        float f2 = BitmapDescriptorFactory.HUE_RED;
        Arrays.fill(fArr2, BitmapDescriptorFactory.HUE_RED);
        int[] iArr = this.l;
        MotionPaths motionPaths = this.c;
        float f3 = motionPaths.g;
        float f4 = motionPaths.h;
        float f5 = motionPaths.i;
        float f6 = motionPaths.j;
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
        Motion motion = motionPaths.o;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.h(d, fArr3, fArr4);
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

    public final void i(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.s;
        float fG = g(fArr2, f);
        CurveFit[] curveFitArr = this.g;
        MotionPaths motionPaths = this.c;
        int i = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths2 = this.d;
            float f4 = motionPaths2.g - motionPaths.g;
            float f5 = motionPaths2.h - motionPaths.h;
            float f6 = motionPaths2.i - motionPaths.i;
            float f7 = (motionPaths2.j - motionPaths.j) + f5;
            fArr[0] = ((f6 + f4) * f2) + ((1.0f - f2) * f4);
            fArr[1] = (f7 * f3) + ((1.0f - f3) * f5);
            return;
        }
        double d = fG;
        curveFitArr[0].f(this.n, d);
        this.g[0].d(this.m, d);
        float f8 = fArr2[0];
        while (true) {
            dArr = this.n;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * f8;
            i++;
        }
        ArcCurveFit arcCurveFit = this.h;
        if (arcCurveFit == null) {
            int[] iArr = this.l;
            motionPaths.getClass();
            MotionPaths.d(f2, f3, fArr, iArr, dArr);
            return;
        }
        double[] dArr2 = this.m;
        if (dArr2.length > 0) {
            arcCurveFit.d(dArr2, d);
            this.h.f(this.n, d);
            int[] iArr2 = this.l;
            double[] dArr3 = this.n;
            motionPaths.getClass();
            MotionPaths.d(f2, f3, fArr, iArr2, dArr3);
        }
    }

    public final float j() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = BitmapDescriptorFactory.HUE_RED;
        while (i < 100) {
            float f2 = i * f;
            double dA = f2;
            Easing easing = this.c.d;
            Iterator it = this.r.iterator();
            float f3 = Float.NaN;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            while (it.hasNext()) {
                MotionPaths motionPaths = (MotionPaths) it.next();
                Easing easing2 = motionPaths.d;
                if (easing2 != null) {
                    float f5 = motionPaths.e;
                    if (f5 < f2) {
                        easing = easing2;
                        f4 = f5;
                    } else if (Float.isNaN(f3)) {
                        f3 = motionPaths.e;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                dA = (((float) easing.a((f2 - f4) / r17)) * (f3 - f4)) + f4;
            }
            double d3 = dA;
            this.g[0].d(this.m, d3);
            int i2 = i;
            this.c.c(d3, this.l, this.m, fArr, 0);
            if (i2 > 0) {
                fHypot += (float) Math.hypot(d2 - fArr[1], d - fArr[0]);
            }
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
        }
        return fHypot;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(androidx.constraintlayout.core.motion.MotionWidget r33, float r34) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.Motion.k(androidx.constraintlayout.core.motion.MotionWidget, float):void");
    }

    public final void l(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.d;
        motionPaths.e = 1.0f;
        motionPaths.f = 1.0f;
        WidgetFrame widgetFrame = this.f2269a.f2271a;
        int i = widgetFrame.b;
        float f = i;
        int i2 = widgetFrame.c;
        float f2 = widgetFrame.d - i;
        float f3 = widgetFrame.e - i2;
        motionPaths.g = f;
        motionPaths.h = i2;
        motionPaths.i = f2;
        motionPaths.j = f3;
        WidgetFrame widgetFrame2 = motionWidget.f2271a;
        int i3 = widgetFrame2.b;
        float f4 = i3;
        int i4 = widgetFrame2.c;
        float f5 = widgetFrame2.d - i3;
        float f6 = widgetFrame2.e - i4;
        motionPaths.g = f4;
        motionPaths.h = i4;
        motionPaths.i = f5;
        motionPaths.j = f6;
        motionPaths.a(motionWidget);
        this.f.c(motionWidget);
    }

    public final void m(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.c;
        motionPaths.e = BitmapDescriptorFactory.HUE_RED;
        motionPaths.f = BitmapDescriptorFactory.HUE_RED;
        WidgetFrame widgetFrame = motionWidget.f2271a;
        int i = widgetFrame.b;
        float f = i;
        int i2 = widgetFrame.c;
        float f2 = widgetFrame.d - i;
        float f3 = widgetFrame.e - i2;
        motionPaths.g = f;
        motionPaths.h = i2;
        motionPaths.i = f2;
        motionPaths.j = f3;
        motionPaths.a(motionWidget);
        this.e.c(motionWidget);
        TypedBundle typedBundle = motionWidget.f2271a.t;
        if (typedBundle != null) {
            typedBundle.d(this);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v136, types: [androidx.constraintlayout.core.motion.utils.SplineSet] */
    /* JADX WARN: Type inference failed for: r1v137, types: [androidx.constraintlayout.core.motion.utils.SplineSet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v140, types: [androidx.constraintlayout.core.motion.utils.SplineSet, androidx.constraintlayout.core.motion.utils.SplineSet$CustomSpline] */
    public final void n(int i, int i2) {
        String str;
        ArrayList arrayList;
        HashSet hashSet;
        char c;
        int i3;
        CustomVariable customVariable;
        SplineSet splineSetB;
        CustomVariable customVariable2;
        Integer num;
        Object obj;
        Object obj2;
        char c2;
        HashSet hashSet2;
        ?? B;
        CustomVariable customVariable3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        float fMin;
        float fA;
        new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashMap map = new HashMap();
        Motion motion = this.D;
        MotionPaths motionPaths = this.d;
        MotionPaths motionPaths2 = this.c;
        if (motion != null) {
            motionPaths2.e(motion, motion.c);
            Motion motion2 = this.D;
            motionPaths.e(motion2, motion2.d);
        }
        int i4 = this.y;
        if (i4 != -1 && motionPaths2.l == -1) {
            motionPaths2.l = i4;
        }
        MotionConstrainedPoint motionConstrainedPoint = this.e;
        float f = motionConstrainedPoint.d;
        MotionConstrainedPoint motionConstrainedPoint2 = this.f;
        String str7 = "alpha";
        if (MotionConstrainedPoint.b(f, motionConstrainedPoint2.d)) {
            hashSet4.add("alpha");
        }
        String str8 = "translationZ";
        if (MotionConstrainedPoint.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)) {
            hashSet4.add("translationZ");
        }
        int i5 = motionConstrainedPoint.e;
        int i6 = motionConstrainedPoint2.e;
        if (i5 != i6 && (i5 == 4 || i6 == 4)) {
            hashSet4.add("alpha");
        }
        if (MotionConstrainedPoint.b(motionConstrainedPoint.f, motionConstrainedPoint2.f)) {
            hashSet4.add("rotationZ");
        }
        if (!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) {
            hashSet4.add("pathRotate");
        }
        if (!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) {
            hashSet4.add("progress");
        }
        if (MotionConstrainedPoint.b(motionConstrainedPoint.g, motionConstrainedPoint2.g)) {
            hashSet4.add("rotationX");
        }
        Object obj3 = "rotationX";
        if (MotionConstrainedPoint.b(motionConstrainedPoint.h, motionConstrainedPoint2.h)) {
            hashSet4.add("rotationY");
        }
        Object obj4 = "rotationY";
        if (MotionConstrainedPoint.b(motionConstrainedPoint.k, motionConstrainedPoint2.k)) {
            hashSet4.add("pivotX");
        }
        Object obj5 = "rotationZ";
        if (MotionConstrainedPoint.b(motionConstrainedPoint.l, motionConstrainedPoint2.l)) {
            hashSet4.add("pivotY");
        }
        Object obj6 = "progress";
        String str9 = "scaleX";
        if (MotionConstrainedPoint.b(motionConstrainedPoint.i, motionConstrainedPoint2.i)) {
            hashSet4.add("scaleX");
        }
        Object obj7 = "pivotX";
        String str10 = "scaleY";
        if (MotionConstrainedPoint.b(motionConstrainedPoint.j, motionConstrainedPoint2.j)) {
            hashSet4.add("scaleY");
        }
        Object obj8 = "pivotY";
        if (MotionConstrainedPoint.b(motionConstrainedPoint.m, motionConstrainedPoint2.m)) {
            hashSet4.add("translationX");
        }
        Object obj9 = "translationX";
        String str11 = "translationY";
        if (MotionConstrainedPoint.b(motionConstrainedPoint.n, motionConstrainedPoint2.n)) {
            hashSet4.add("translationY");
        }
        if (MotionConstrainedPoint.b(motionConstrainedPoint.o, motionConstrainedPoint2.o)) {
            hashSet4.add("translationZ");
        }
        String str12 = "elevation";
        if (MotionConstrainedPoint.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)) {
            hashSet4.add("elevation");
        }
        ArrayList arrayList2 = this.r;
        ArrayList arrayList3 = this.t;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            ArrayList arrayList4 = null;
            while (it.hasNext()) {
                MotionKey motionKey = (MotionKey) it.next();
                String str13 = str11;
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    MotionPaths motionPaths3 = new MotionPaths();
                    str6 = str8;
                    motionPaths3.k = Float.NaN;
                    motionPaths3.l = -1;
                    motionPaths3.m = null;
                    str3 = str9;
                    motionPaths3.n = Float.NaN;
                    motionPaths3.o = null;
                    motionPaths3.p = new HashMap();
                    motionPaths3.q = 0;
                    motionPaths3.r = new double[18];
                    motionPaths3.s = new double[18];
                    if (motionPaths2.m != null) {
                        float f2 = motionKeyPosition.f2274a / 100.0f;
                        motionPaths3.e = f2;
                        motionPaths3.q = motionKeyPosition.i;
                        float f3 = Float.isNaN(motionKeyPosition.e) ? f2 : motionKeyPosition.e;
                        str5 = str10;
                        float f4 = Float.isNaN(motionKeyPosition.f) ? f2 : motionKeyPosition.f;
                        str2 = str12;
                        float f5 = motionPaths.i - motionPaths2.i;
                        float f6 = motionPaths.j;
                        float f7 = motionPaths2.j;
                        motionPaths3.f = motionPaths3.e;
                        motionPaths3.i = (int) ((f5 * f3) + r5);
                        motionPaths3.j = (int) (((f6 - f7) * f4) + f7);
                        int i7 = motionKeyPosition.i;
                        str4 = str7;
                        if (i7 == 1) {
                            float f8 = Float.isNaN(motionKeyPosition.g) ? f2 : motionKeyPosition.g;
                            float f9 = motionPaths.g;
                            float f10 = motionPaths2.g;
                            motionPaths3.g = a.a(f9, f10, f8, f10);
                            if (!Float.isNaN(motionKeyPosition.h)) {
                                f2 = motionKeyPosition.h;
                            }
                            float f11 = motionPaths.h;
                            float f12 = motionPaths2.h;
                            motionPaths3.h = a.a(f11, f12, f2, f12);
                        } else if (i7 != 2) {
                            float f13 = Float.isNaN(motionKeyPosition.g) ? f2 : motionKeyPosition.g;
                            float f14 = motionPaths.g;
                            float f15 = motionPaths2.g;
                            motionPaths3.g = a.a(f14, f15, f13, f15);
                            if (!Float.isNaN(motionKeyPosition.h)) {
                                f2 = motionKeyPosition.h;
                            }
                            float f16 = motionPaths.h;
                            float f17 = motionPaths2.h;
                            motionPaths3.h = a.a(f16, f17, f2, f17);
                        } else {
                            if (Float.isNaN(motionKeyPosition.g)) {
                                float f18 = motionPaths.g;
                                float f19 = motionPaths2.g;
                                fMin = a.a(f18, f19, f2, f19);
                            } else {
                                fMin = motionKeyPosition.g * Math.min(f4, f3);
                            }
                            motionPaths3.g = fMin;
                            if (Float.isNaN(motionKeyPosition.h)) {
                                float f20 = motionPaths.h;
                                float f21 = motionPaths2.h;
                                fA = a.a(f20, f21, f2, f21);
                            } else {
                                fA = motionKeyPosition.h;
                            }
                            motionPaths3.h = fA;
                        }
                        motionPaths3.m = motionPaths2.m;
                        motionPaths3.d = Easing.c(motionKeyPosition.d);
                        motionPaths3.l = -1;
                    } else {
                        str2 = str12;
                        str4 = str7;
                        str5 = str10;
                        int i8 = motionKeyPosition.i;
                        if (i8 == 1) {
                            float f22 = motionKeyPosition.f2274a / 100.0f;
                            motionPaths3.e = f22;
                            float f23 = Float.isNaN(motionKeyPosition.e) ? f22 : motionKeyPosition.e;
                            float f24 = Float.isNaN(motionKeyPosition.f) ? f22 : motionKeyPosition.f;
                            float f25 = motionPaths.i - motionPaths2.i;
                            float f26 = f22;
                            float f27 = motionPaths.j - motionPaths2.j;
                            motionPaths3.f = motionPaths3.e;
                            if (!Float.isNaN(motionKeyPosition.g)) {
                                f26 = motionKeyPosition.g;
                            }
                            float f28 = (motionPaths2.i / 2.0f) + motionPaths2.g;
                            float f29 = motionPaths2.h;
                            float f30 = motionPaths2.j;
                            float f31 = ((motionPaths.i / 2.0f) + motionPaths.g) - f28;
                            float f32 = ((motionPaths.j / 2.0f) + motionPaths.h) - ((f30 / 2.0f) + f29);
                            float f33 = f31 * f26;
                            float f34 = (f25 * f23) / 2.0f;
                            motionPaths3.g = (int) ((r5 + f33) - f34);
                            float f35 = f26 * f32;
                            float f36 = (f27 * f24) / 2.0f;
                            motionPaths3.h = (int) ((f29 + f35) - f36);
                            motionPaths3.i = (int) (r5 + r12);
                            motionPaths3.j = (int) (f30 + r13);
                            float f37 = Float.isNaN(motionKeyPosition.h) ? BitmapDescriptorFactory.HUE_RED : motionKeyPosition.h;
                            float f38 = (-f32) * f37;
                            float f39 = f31 * f37;
                            motionPaths3.q = 1;
                            float f40 = (int) ((motionPaths2.g + f33) - f34);
                            float f41 = (int) ((motionPaths2.h + f35) - f36);
                            motionPaths3.g = f40 + f38;
                            motionPaths3.h = f41 + f39;
                            motionPaths3.m = motionPaths3.m;
                            motionPaths3.d = Easing.c(motionKeyPosition.d);
                            motionPaths3.l = -1;
                        } else if (i8 != 2) {
                            float f42 = motionKeyPosition.f2274a / 100.0f;
                            motionPaths3.e = f42;
                            float f43 = Float.isNaN(motionKeyPosition.e) ? f42 : motionKeyPosition.e;
                            float f44 = Float.isNaN(motionKeyPosition.f) ? f42 : motionKeyPosition.f;
                            float f45 = motionPaths.i;
                            float f46 = motionPaths2.i;
                            float f47 = f45 - f46;
                            float f48 = motionPaths.j;
                            float f49 = motionPaths2.j;
                            float f50 = f48 - f49;
                            motionPaths3.f = motionPaths3.e;
                            float f51 = (f46 / 2.0f) + motionPaths2.g;
                            float f52 = motionPaths2.h;
                            float f53 = ((f45 / 2.0f) + motionPaths.g) - f51;
                            float f54 = ((f48 / 2.0f) + motionPaths.h) - ((f49 / 2.0f) + f52);
                            float f55 = (f47 * f43) / 2.0f;
                            motionPaths3.g = (int) (((f53 * f42) + r5) - f55);
                            float f56 = (f50 * f44) / 2.0f;
                            motionPaths3.h = (int) (((f54 * f42) + f52) - f56);
                            motionPaths3.i = (int) (f46 + r42);
                            motionPaths3.j = (int) (f49 + r45);
                            float f57 = Float.isNaN(motionKeyPosition.g) ? f42 : motionKeyPosition.g;
                            float f58 = Float.isNaN(Float.NaN) ? BitmapDescriptorFactory.HUE_RED : Float.NaN;
                            float f59 = f57;
                            float f60 = Float.isNaN(motionKeyPosition.h) ? f42 : motionKeyPosition.h;
                            float f61 = Float.isNaN(Float.NaN) ? BitmapDescriptorFactory.HUE_RED : Float.NaN;
                            float f62 = f60;
                            motionPaths3.q = 0;
                            motionPaths3.g = (int) (((f61 * f54) + ((f59 * f53) + motionPaths2.g)) - f55);
                            motionPaths3.h = (int) (((f54 * f62) + ((f53 * f58) + motionPaths2.h)) - f56);
                            motionPaths3.d = Easing.c(motionKeyPosition.d);
                            motionPaths3.l = -1;
                        } else {
                            float f63 = motionKeyPosition.f2274a / 100.0f;
                            motionPaths3.e = f63;
                            float f64 = Float.isNaN(motionKeyPosition.e) ? f63 : motionKeyPosition.e;
                            float f65 = Float.isNaN(motionKeyPosition.f) ? f63 : motionKeyPosition.f;
                            float f66 = motionPaths.i;
                            float f67 = motionPaths2.i;
                            float f68 = f66 - f67;
                            float f69 = motionPaths.j;
                            float f70 = motionPaths2.j;
                            float f71 = f69 - f70;
                            motionPaths3.f = motionPaths3.e;
                            float f72 = (f67 / 2.0f) + motionPaths2.g;
                            float f73 = motionPaths2.h;
                            float f74 = (f66 / 2.0f) + motionPaths.g;
                            float f75 = ((f69 / 2.0f) + motionPaths.h) - ((f70 / 2.0f) + f73);
                            float f76 = f68 * f64;
                            motionPaths3.g = (int) ((((f74 - f72) * f63) + r5) - (f76 / 2.0f));
                            float f77 = f71 * f65;
                            motionPaths3.h = (int) (((f75 * f63) + f73) - (f77 / 2.0f));
                            motionPaths3.i = (int) (f67 + f76);
                            motionPaths3.j = (int) (f70 + f77);
                            motionPaths3.q = 2;
                            if (!Float.isNaN(motionKeyPosition.g)) {
                                motionPaths3.g = (int) (motionKeyPosition.g * (i - ((int) motionPaths3.i)));
                            }
                            if (!Float.isNaN(motionKeyPosition.h)) {
                                motionPaths3.h = (int) (motionKeyPosition.h * (i2 - ((int) motionPaths3.j)));
                            }
                            motionPaths3.m = motionPaths3.m;
                            motionPaths3.d = Easing.c(motionKeyPosition.d);
                            motionPaths3.l = -1;
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    MotionPaths motionPaths4 = null;
                    while (it2.hasNext()) {
                        MotionPaths motionPaths5 = (MotionPaths) it2.next();
                        if (motionPaths3.f == motionPaths5.f) {
                            motionPaths4 = motionPaths5;
                        }
                    }
                    if (motionPaths4 != null) {
                        arrayList2.remove(motionPaths4);
                    }
                    if (Collections.binarySearch(arrayList2, motionPaths3) == 0) {
                        Utils.a("MotionController", " KeyPath position \"" + motionPaths3.f + "\" outside of range");
                    }
                    arrayList2.add((-r5) - 1, motionPaths3);
                    int i9 = motionKeyPosition.c;
                    if (i9 != -1) {
                        this.b = i9;
                    }
                } else {
                    str2 = str12;
                    str3 = str9;
                    str4 = str7;
                    str5 = str10;
                    str6 = str8;
                    if (motionKey instanceof MotionKeyCycle) {
                        motionKey.f(hashSet5);
                    } else if (motionKey instanceof MotionKeyTimeCycle) {
                        motionKey.f(hashSet3);
                    } else if (motionKey instanceof MotionKeyTrigger) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        ArrayList arrayList5 = arrayList4;
                        arrayList5.add((MotionKeyTrigger) motionKey);
                        arrayList4 = arrayList5;
                    } else {
                        motionKey.g(map);
                        motionKey.f(hashSet4);
                    }
                }
                str11 = str13;
                str9 = str3;
                str8 = str6;
                str10 = str5;
                str12 = str2;
                str7 = str4;
            }
            str = str12;
            arrayList = arrayList4;
        } else {
            str = "elevation";
            arrayList = null;
        }
        String str14 = str9;
        String str15 = str7;
        String str16 = str10;
        String str17 = str8;
        String str18 = str11;
        if (arrayList != null) {
            this.x = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        if (hashSet4.isEmpty()) {
            hashSet = hashSet3;
            c = 3;
        } else {
            this.v = new HashMap();
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                String str19 = (String) it3.next();
                if (str19.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str20 = str19.split(",")[1];
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        MotionKey motionKey2 = (MotionKey) it4.next();
                        HashSet hashSet6 = hashSet3;
                        HashMap map2 = motionKey2.b;
                        if (map2 != null && (customVariable3 = (CustomVariable) map2.get(str20)) != null) {
                            customVar.a(motionKey2.f2274a, customVariable3);
                        }
                        hashSet3 = hashSet6;
                    }
                    hashSet2 = hashSet3;
                    B = new SplineSet.CustomSpline();
                    String str21 = str19.split(",")[1];
                    B.f = customVar;
                } else {
                    hashSet2 = hashSet3;
                    B = SplineSet.b(str19);
                }
                B.e = str19;
                this.v.put(str19, B);
                hashSet3 = hashSet2;
            }
            hashSet = hashSet3;
            c = 3;
            if (arrayList3 != null) {
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    MotionKey motionKey3 = (MotionKey) it5.next();
                    if (motionKey3 instanceof MotionKeyAttributes) {
                        HashMap map3 = this.v;
                        MotionKeyAttributes motionKeyAttributes = (MotionKeyAttributes) motionKey3;
                        for (String str22 : map3.keySet()) {
                            SplineSet splineSet = (SplineSet) map3.get(str22);
                            if (splineSet != null) {
                                Iterator it6 = it5;
                                if (str22.startsWith("CUSTOM")) {
                                    CustomVariable customVariable4 = (CustomVariable) motionKeyAttributes.b.get(str22.substring(7));
                                    if (customVariable4 != null) {
                                        ((SplineSet.CustomSpline) splineSet).f.a(motionKeyAttributes.f2274a, customVariable4);
                                    }
                                    it5 = it6;
                                } else {
                                    switch (str22.hashCode()) {
                                        case -1249320806:
                                            obj = obj3;
                                            obj2 = obj7;
                                            if (str22.equals(obj)) {
                                                c2 = 0;
                                                break;
                                            } else {
                                                c2 = 65535;
                                                break;
                                            }
                                        case -1249320805:
                                            Object obj10 = obj4;
                                            obj2 = obj7;
                                            if (str22.equals(obj10)) {
                                                obj4 = obj10;
                                                obj = obj3;
                                                c2 = 1;
                                                break;
                                            } else {
                                                obj4 = obj10;
                                                obj = obj3;
                                                c2 = 65535;
                                                break;
                                            }
                                        case -1249320804:
                                            Object obj11 = obj5;
                                            obj2 = obj7;
                                            if (str22.equals(obj11)) {
                                                obj5 = obj11;
                                                obj = obj3;
                                                c2 = 2;
                                                break;
                                            } else {
                                                obj5 = obj11;
                                                obj = obj3;
                                                c2 = 65535;
                                                break;
                                            }
                                        case -1225497657:
                                            obj2 = obj7;
                                            Object obj12 = obj9;
                                            if (str22.equals(obj12)) {
                                                c2 = 3;
                                                obj9 = obj12;
                                                obj = obj3;
                                                break;
                                            } else {
                                                obj9 = obj12;
                                                obj = obj3;
                                                c2 = 65535;
                                                break;
                                            }
                                        case -1225497656:
                                            obj2 = obj7;
                                            if (str22.equals(str18)) {
                                                c2 = 4;
                                                obj = obj3;
                                                break;
                                            }
                                            obj = obj3;
                                            c2 = 65535;
                                            break;
                                        case -1225497655:
                                            obj2 = obj7;
                                            String str23 = str17;
                                            if (str22.equals(str23)) {
                                                c2 = 5;
                                                str17 = str23;
                                                obj = obj3;
                                                break;
                                            } else {
                                                str17 = str23;
                                                obj = obj3;
                                                c2 = 65535;
                                                break;
                                            }
                                        case -1001078227:
                                            Object obj13 = obj6;
                                            obj2 = obj7;
                                            if (str22.equals(obj13)) {
                                                obj6 = obj13;
                                                obj = obj3;
                                                c2 = 6;
                                                break;
                                            } else {
                                                obj6 = obj13;
                                                obj = obj3;
                                                c2 = 65535;
                                                break;
                                            }
                                        case -987906986:
                                            Object obj14 = obj7;
                                            c2 = 7;
                                            if (str22.equals(obj14)) {
                                                obj2 = obj14;
                                                obj = obj3;
                                                break;
                                            } else {
                                                obj2 = obj14;
                                                obj = obj3;
                                                c2 = 65535;
                                                break;
                                            }
                                        case -987906985:
                                            Object obj15 = obj8;
                                            if (str22.equals(obj15)) {
                                                obj2 = obj7;
                                                c2 = '\b';
                                                obj8 = obj15;
                                                obj = obj3;
                                                break;
                                            } else {
                                                obj8 = obj15;
                                                obj = obj3;
                                                obj2 = obj7;
                                                c2 = 65535;
                                                break;
                                            }
                                        case -908189618:
                                            String str24 = str14;
                                            if (str22.equals(str24)) {
                                                obj2 = obj7;
                                                c2 = '\t';
                                                str14 = str24;
                                                obj = obj3;
                                                break;
                                            } else {
                                                str14 = str24;
                                                obj = obj3;
                                                obj2 = obj7;
                                                c2 = 65535;
                                                break;
                                            }
                                        case -908189617:
                                            String str25 = str16;
                                            if (str22.equals(str25)) {
                                                obj2 = obj7;
                                                c2 = '\n';
                                                str16 = str25;
                                                obj = obj3;
                                                break;
                                            } else {
                                                str16 = str25;
                                                obj = obj3;
                                                obj2 = obj7;
                                                c2 = 65535;
                                                break;
                                            }
                                        case -4379043:
                                            String str26 = str;
                                            if (str22.equals(str26)) {
                                                obj2 = obj7;
                                                c2 = 11;
                                                str = str26;
                                                obj = obj3;
                                                break;
                                            } else {
                                                str = str26;
                                                obj = obj3;
                                                obj2 = obj7;
                                                c2 = 65535;
                                                break;
                                            }
                                        case 92909918:
                                            String str27 = str15;
                                            if (str22.equals(str27)) {
                                                obj2 = obj7;
                                                c2 = '\f';
                                                str15 = str27;
                                                obj = obj3;
                                                break;
                                            } else {
                                                str15 = str27;
                                                obj = obj3;
                                                obj2 = obj7;
                                                c2 = 65535;
                                                break;
                                            }
                                        case 803192288:
                                            if (str22.equals("pathRotate")) {
                                                obj2 = obj7;
                                                c2 = '\r';
                                                obj = obj3;
                                                break;
                                            }
                                            obj = obj3;
                                            obj2 = obj7;
                                            c2 = 65535;
                                            break;
                                        default:
                                            obj = obj3;
                                            obj2 = obj7;
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.g)) {
                                                splineSet.c(motionKeyAttributes.g, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.h)) {
                                                splineSet.c(motionKeyAttributes.h, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.f)) {
                                                splineSet.c(motionKeyAttributes.f, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.n)) {
                                                splineSet.c(motionKeyAttributes.n, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case 4:
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.o)) {
                                                splineSet.c(motionKeyAttributes.o, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.p)) {
                                                splineSet.c(motionKeyAttributes.p, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case 6:
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.q)) {
                                                splineSet.c(motionKeyAttributes.q, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case 7:
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.g)) {
                                                splineSet.c(motionKeyAttributes.i, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case '\b':
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.h)) {
                                                splineSet.c(motionKeyAttributes.j, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case '\t':
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.l)) {
                                                splineSet.c(motionKeyAttributes.l, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case '\n':
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.m)) {
                                                splineSet.c(motionKeyAttributes.m, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case 11:
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.e)) {
                                                splineSet.c(motionKeyAttributes.e, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case '\f':
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.d)) {
                                                splineSet.c(motionKeyAttributes.d, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        case '\r':
                                            obj3 = obj;
                                            if (!Float.isNaN(motionKeyAttributes.k)) {
                                                splineSet.c(motionKeyAttributes.k, motionKeyAttributes.f2274a);
                                                break;
                                            }
                                            break;
                                        default:
                                            obj3 = obj;
                                            System.err.println("not supported by KeyAttributes ".concat(str22));
                                            break;
                                    }
                                    it5 = it6;
                                    obj7 = obj2;
                                }
                            }
                        }
                    }
                    it5 = it5;
                    obj7 = obj7;
                }
            }
            motionConstrainedPoint.a(0, this.v);
            motionConstrainedPoint2.a(100, this.v);
            for (String str28 : this.v.keySet()) {
                int iIntValue = (!map.containsKey(str28) || (num = (Integer) map.get(str28)) == null) ? 0 : num.intValue();
                SplineSet splineSet2 = (SplineSet) this.v.get(str28);
                if (splineSet2 != null) {
                    splineSet2.e(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.u == null) {
                this.u = new HashMap();
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                String str29 = (String) it7.next();
                if (!this.u.containsKey(str29)) {
                    if (str29.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str30 = str29.split(",")[1];
                        Iterator it8 = arrayList3.iterator();
                        while (it8.hasNext()) {
                            MotionKey motionKey4 = (MotionKey) it8.next();
                            HashMap map4 = motionKey4.b;
                            if (map4 != null && (customVariable2 = (CustomVariable) map4.get(str30)) != null) {
                                customVar2.a(motionKey4.f2274a, customVariable2);
                            }
                        }
                        SplineSet.CustomSpline customSpline = new SplineSet.CustomSpline();
                        String str31 = str29.split(",")[1];
                        customSpline.f = customVar2;
                        splineSetB = customSpline;
                    } else {
                        splineSetB = SplineSet.b(str29);
                    }
                    splineSetB.e = str29;
                }
            }
            if (arrayList3 != null) {
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    MotionKey motionKey5 = (MotionKey) it9.next();
                    if (motionKey5 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) motionKey5).h(this.u);
                    }
                }
            }
            for (String str32 : this.u.keySet()) {
                ((TimeCycleSplineSet) this.u.get(str32)).c(map.containsKey(str32) ? ((Integer) map.get(str32)).intValue() : 0);
            }
        }
        int size = arrayList2.size();
        int i10 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i10];
        motionPathsArr[0] = motionPaths2;
        motionPathsArr[size + 1] = motionPaths;
        if (arrayList2.size() > 0 && this.b == -1) {
            this.b = 0;
        }
        Iterator it10 = arrayList2.iterator();
        int i11 = 1;
        while (it10.hasNext()) {
            motionPathsArr[i11] = (MotionPaths) it10.next();
            i11++;
        }
        HashSet hashSet7 = new HashSet();
        for (String str33 : motionPaths.p.keySet()) {
            if (motionPaths2.p.containsKey(str33)) {
                if (!hashSet4.contains("CUSTOM," + str33)) {
                    hashSet7.add(str33);
                }
            }
        }
        String[] strArr = (String[]) hashSet7.toArray(new String[0]);
        this.o = strArr;
        this.p = new int[strArr.length];
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.o;
            if (i12 < strArr2.length) {
                String str34 = strArr2[i12];
                this.p[i12] = 0;
                int i13 = 0;
                while (true) {
                    if (i13 >= i10) {
                        break;
                    }
                    if (!motionPathsArr[i13].p.containsKey(str34) || (customVariable = (CustomVariable) motionPathsArr[i13].p.get(str34)) == null) {
                        i13++;
                    } else {
                        int[] iArr = this.p;
                        iArr[i12] = customVariable.e() + iArr[i12];
                    }
                }
                i12++;
            } else {
                boolean z = motionPathsArr[0].l != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i14 = 1; i14 < i10; i14++) {
                    MotionPaths motionPaths6 = motionPathsArr[i14];
                    MotionPaths motionPaths7 = motionPathsArr[i14 - 1];
                    boolean zB = MotionPaths.b(motionPaths6.g, motionPaths7.g);
                    boolean zB2 = MotionPaths.b(motionPaths6.h, motionPaths7.h);
                    zArr[0] = zArr[0] | MotionPaths.b(motionPaths6.f, motionPaths7.f);
                    zArr[1] = zArr[1] | (zB || zB2 || z);
                    zArr[2] = (zB || zB2 || z) | zArr[2];
                    zArr[c] = zArr[c] | MotionPaths.b(motionPaths6.i, motionPaths7.i);
                    zArr[4] = MotionPaths.b(motionPaths6.j, motionPaths7.j) | zArr[4];
                }
                int i15 = 0;
                for (int i16 = 1; i16 < length; i16++) {
                    if (zArr[i16]) {
                        i15++;
                    }
                }
                this.l = new int[i15];
                int iMax = Math.max(2, i15);
                this.m = new double[iMax];
                this.n = new double[iMax];
                int i17 = 0;
                for (int i18 = 1; i18 < length; i18++) {
                    if (zArr[i18]) {
                        this.l[i17] = i18;
                        i17++;
                    }
                }
                int[] iArr2 = {i10, this.l.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i10];
                int i19 = 0;
                while (i19 < i10) {
                    MotionPaths motionPaths8 = motionPathsArr[i19];
                    double[] dArr3 = dArr[i19];
                    int[] iArr3 = this.l;
                    float f78 = motionPaths8.f;
                    float f79 = motionPaths8.g;
                    float f80 = motionPaths8.h;
                    float f81 = motionPaths8.i;
                    float f82 = motionPaths8.j;
                    float f83 = motionPaths8.k;
                    HashSet hashSet8 = hashSet5;
                    MotionPaths[] motionPathsArr2 = motionPathsArr;
                    float[] fArr = new float[6];
                    fArr[0] = f78;
                    fArr[1] = f79;
                    fArr[2] = f80;
                    fArr[c] = f81;
                    fArr[4] = f82;
                    fArr[5] = f83;
                    int i20 = 0;
                    for (int i21 : iArr3) {
                        if (i21 < 6) {
                            dArr3[i20] = fArr[r11];
                            i20++;
                        }
                    }
                    dArr2[i19] = motionPathsArr2[i19].e;
                    i19++;
                    hashSet5 = hashSet8;
                    motionPathsArr = motionPathsArr2;
                }
                HashSet hashSet9 = hashSet5;
                MotionPaths[] motionPathsArr3 = motionPathsArr;
                int i22 = 0;
                while (true) {
                    int[] iArr4 = this.l;
                    if (i22 < iArr4.length) {
                        if (iArr4[i22] < 6) {
                            String strO = a.o(new StringBuilder(), MotionPaths.t[this.l[i22]], " [");
                            for (int i23 = 0; i23 < i10; i23++) {
                                StringBuilder sbS = a.s(strO);
                                sbS.append(dArr[i23][i22]);
                                strO = sbS.toString();
                            }
                        }
                        i22++;
                    } else {
                        this.g = new CurveFit[this.o.length + 1];
                        int i24 = 0;
                        while (true) {
                            String[] strArr3 = this.o;
                            if (i24 >= strArr3.length) {
                                this.g[0] = CurveFit.a(this.b, dArr2, dArr);
                                if (motionPathsArr3[0].l != -1) {
                                    int[] iArr5 = new int[i10];
                                    double[] dArr4 = new double[i10];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i10, 2);
                                    for (int i25 = 0; i25 < i10; i25++) {
                                        iArr5[i25] = motionPathsArr3[i25].l;
                                        dArr4[i25] = r5.e;
                                        double[] dArr6 = dArr5[i25];
                                        dArr6[0] = r5.g;
                                        dArr6[1] = r5.h;
                                    }
                                    this.h = new ArcCurveFit(iArr5, dArr4, dArr5);
                                }
                                this.w = new HashMap();
                                if (arrayList3 != null) {
                                    Iterator it11 = hashSet9.iterator();
                                    float fJ = Float.NaN;
                                    while (it11.hasNext()) {
                                        String str35 = (String) it11.next();
                                        KeyCycleOscillator keyCycleOscillatorC = KeyCycleOscillator.c(str35);
                                        if (keyCycleOscillatorC.e == 1 && Float.isNaN(fJ)) {
                                            fJ = j();
                                        }
                                        keyCycleOscillatorC.b = str35;
                                        this.w.put(str35, keyCycleOscillatorC);
                                    }
                                    Iterator it12 = arrayList3.iterator();
                                    while (it12.hasNext()) {
                                        MotionKey motionKey6 = (MotionKey) it12.next();
                                        if (motionKey6 instanceof MotionKeyCycle) {
                                            ((MotionKeyCycle) motionKey6).h(this.w);
                                        }
                                    }
                                    Iterator it13 = this.w.values().iterator();
                                    while (it13.hasNext()) {
                                        ((KeyCycleOscillator) it13.next()).h();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str36 = strArr3[i24];
                            int i26 = 0;
                            int i27 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i26 < i10) {
                                if (motionPathsArr3[i26].p.containsKey(str36)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i10];
                                        CustomVariable customVariable5 = (CustomVariable) motionPathsArr3[i26].p.get(str36);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i10, customVariable5 == null ? 0 : customVariable5.e());
                                    }
                                    MotionPaths motionPaths9 = motionPathsArr3[i26];
                                    dArr7[i27] = motionPaths9.e;
                                    double[] dArr9 = dArr8[i27];
                                    CustomVariable customVariable6 = (CustomVariable) motionPaths9.p.get(str36);
                                    if (customVariable6 != null) {
                                        if (customVariable6.e() == 1) {
                                            dArr9[0] = customVariable6.c();
                                        } else {
                                            int iE = customVariable6.e();
                                            customVariable6.d(new float[iE]);
                                            int i28 = 0;
                                            int i29 = 0;
                                            while (i28 < iE) {
                                                dArr9[i29] = r14[i28];
                                                i28++;
                                                dArr7 = dArr7;
                                                dArr8 = dArr8;
                                                i29++;
                                                i24 = i24;
                                            }
                                        }
                                    }
                                    i3 = i24;
                                    i27++;
                                    dArr7 = dArr7;
                                    dArr8 = dArr8;
                                } else {
                                    i3 = i24;
                                }
                                i26++;
                                i24 = i3;
                            }
                            int i30 = i24;
                            double[] dArrCopyOf = Arrays.copyOf(dArr7, i27);
                            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i27);
                            int i31 = i30 + 1;
                            this.g[i31] = CurveFit.a(this.b, dArrCopyOf, dArr10);
                            i24 = i31;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        MotionPaths motionPaths = this.c;
        sb.append(motionPaths.g);
        sb.append(" y: ");
        sb.append(motionPaths.h);
        sb.append(" end: x: ");
        MotionPaths motionPaths2 = this.d;
        sb.append(motionPaths2.g);
        sb.append(" y: ");
        sb.append(motionPaths2.h);
        return sb.toString();
    }
}
