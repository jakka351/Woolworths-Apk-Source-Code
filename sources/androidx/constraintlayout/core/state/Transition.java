package androidx.constraintlayout.core.state;

import androidx.camera.core.impl.e;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionPaths;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class Transition implements TypedValues {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2301a = new HashMap();
    public final HashMap b = new HashMap();
    public final TypedBundle c = new TypedBundle();
    public Easing d = null;
    public final int e = 400;
    public float f = BitmapDescriptorFactory.HUE_RED;
    public OnSwipe g = null;
    public final e h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;

    public static class KeyPosition {
    }

    public static class OnSwipe {
        public static final String[] r = {"top", "left", "right", "bottom", "middle", "start", "end"};
        public static final float[][] s = {new float[]{0.5f, BitmapDescriptorFactory.HUE_RED}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}};
        public static final String[] t = {"up", "down", "left", "right", "start", "end", "clockwise", "anticlockwise"};
        public static final String[] u = {"velocity", "spring"};
        public static final String[] v = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};
        public static final String[] w = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
        public static final float[][] x = {new float[]{BitmapDescriptorFactory.HUE_RED, -1.0f}, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}};

        /* renamed from: a, reason: collision with root package name */
        public String f2302a;
        public int b;
        public StopEngine c;
        public String d;
        public int e;
        public float f;
        public int g;
        public float h;
        public float i;
        public int j;
        public float k;
        public float l;
        public float m;
        public float n;
        public float o;
        public int p;
        public long q;
    }

    public static class WidgetState {

        /* renamed from: a, reason: collision with root package name */
        public WidgetFrame f2303a;
        public WidgetFrame b;
        public WidgetFrame c;
        public Motion d;
        public boolean e;
        public MotionWidget f;
        public MotionWidget g;
        public MotionWidget h;
        public int i;

        /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r32, int r33, float r34, androidx.constraintlayout.core.state.Transition r35) {
            /*
                Method dump skipped, instructions count: 906
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.Transition.WidgetState.a(int, int, float, androidx.constraintlayout.core.state.Transition):void");
        }
    }

    public Transition(e eVar) {
        this.h = eVar;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean a(int i, int i2) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean b(int i, boolean z) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean c(float f, int i) {
        if (i != 706) {
            return false;
        }
        this.f = f;
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean d(int i, String str) {
        if (i != 705) {
            return false;
        }
        this.d = Easing.c(str);
        return false;
    }

    public final float e(float f, float f2, float f3, int i, int i2) {
        float fAbs;
        float f4;
        HashMap map = this.b;
        Iterator it = map.values().iterator();
        WidgetState widgetState = it.hasNext() ? (WidgetState) it.next() : null;
        OnSwipe onSwipe = this.g;
        if (onSwipe == null || widgetState == null) {
            if (widgetState != null) {
                return (-f3) / widgetState.i;
            }
            return 1.0f;
        }
        String str = onSwipe.f2302a;
        float[][] fArr = OnSwipe.x;
        if (str == null) {
            float[] fArr2 = fArr[onSwipe.e];
            float f5 = widgetState.i;
            float f6 = fArr2[0];
            return ((f6 != BitmapDescriptorFactory.HUE_RED ? Math.abs(f6) * f2 : Math.abs(fArr2[1]) * f3) / f5) * this.g.f;
        }
        WidgetState widgetState2 = (WidgetState) map.get(str);
        OnSwipe onSwipe2 = this.g;
        float[] fArr3 = fArr[onSwipe2.e];
        float[] fArr4 = OnSwipe.s[onSwipe2.b];
        float[] fArr5 = new float[2];
        widgetState2.a(i, i2, f, this);
        widgetState2.d.i(f, fArr4[0], fArr4[1], fArr5);
        float f7 = fArr3[0];
        if (f7 != BitmapDescriptorFactory.HUE_RED) {
            fAbs = Math.abs(f7) * f2;
            f4 = fArr5[0];
        } else {
            fAbs = Math.abs(fArr3[1]) * f3;
            f4 = fArr5[1];
        }
        return (fAbs / f4) * this.g.f;
    }

    public final float f(long j) {
        OnSwipe onSwipe = this.g;
        if (onSwipe != null) {
            return onSwipe.c.b() ? onSwipe.o : onSwipe.c.getInterpolation((j - onSwipe.q) * 1.0E-9f);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final WidgetState g(int i, String str) {
        HashMap map = this.b;
        WidgetState widgetState = (WidgetState) map.get(str);
        if (widgetState == null) {
            widgetState = new WidgetState();
            widgetState.e = true;
            new KeyCache();
            widgetState.i = -1;
            WidgetFrame widgetFrame = new WidgetFrame();
            widgetState.f2303a = widgetFrame;
            WidgetFrame widgetFrame2 = new WidgetFrame();
            widgetState.b = widgetFrame2;
            WidgetFrame widgetFrame3 = new WidgetFrame();
            widgetState.c = widgetFrame3;
            MotionWidget motionWidget = new MotionWidget(widgetFrame);
            widgetState.f = motionWidget;
            MotionWidget motionWidget2 = new MotionWidget(widgetFrame2);
            widgetState.g = motionWidget2;
            widgetState.h = new MotionWidget(widgetFrame3);
            Motion motion = new Motion(motionWidget);
            widgetState.d = motion;
            motion.m(motionWidget);
            motion.l(motionWidget2);
            this.c.d(motion);
            TypedBundle typedBundle = motionWidget.f2271a.t;
            if (typedBundle != null) {
                typedBundle.d(motion);
            }
            map.put(str, widgetState);
        }
        return widgetState;
    }

    public final void h(float f, int i, int i2) {
        if (this.o) {
            this.m = (int) (((this.k - r0) * f) + this.i + 0.5f);
            this.n = (int) (((this.l - r0) * f) + this.j + 0.5f);
        }
        Easing easing = this.d;
        if (easing != null) {
            f = (float) easing.a(f);
        }
        HashMap map = this.b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((WidgetState) map.get((String) it.next())).a(i, i2, f, this);
        }
    }

    public final boolean i(float f, float f2) {
        OnSwipe onSwipe = this.g;
        if (onSwipe != null) {
            String str = onSwipe.d;
            if (str == null) {
                return true;
            }
            WidgetState widgetState = (WidgetState) this.b.get(str);
            if (widgetState == null) {
                System.err.println("mLimitBoundsTo target is null");
                return false;
            }
            WidgetFrame widgetFrame = widgetState.c;
            if (f >= widgetFrame.b && f < widgetFrame.d && f2 >= widgetFrame.c && f2 < widgetFrame.e) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        StopEngine stopEngine;
        OnSwipe onSwipe = this.g;
        return (onSwipe.j == 3 || (stopEngine = onSwipe.c) == null || stopEngine.b()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(float r18, float r19, float r20, long r21) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.Transition.k(float, float, float, long):void");
    }

    public final void l(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        float fMin;
        float fMax;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        this.o = z;
        this.o = (dimensionBehaviourArr[1] == dimensionBehaviour2) | z;
        if (i == 0) {
            int iV = constraintWidgetContainer.v();
            this.i = iV;
            this.m = iV;
            int iP = constraintWidgetContainer.p();
            this.j = iP;
            this.n = iP;
        } else {
            this.k = constraintWidgetContainer.v();
            this.l = constraintWidgetContainer.p();
        }
        ArrayList arrayList = constraintWidgetContainer.v0;
        int size = arrayList.size();
        WidgetState[] widgetStateArr = new WidgetState[size];
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i2);
            WidgetState widgetStateG = g(i, constraintWidget.k);
            Motion motion = widgetStateG.d;
            widgetStateArr[i2] = widgetStateG;
            Motion motion2 = widgetStateG.d;
            MotionWidget motionWidget = widgetStateG.f;
            if (i == 0) {
                WidgetFrame widgetFrame = widgetStateG.f2303a;
                if (constraintWidget == null) {
                    widgetFrame.getClass();
                } else {
                    widgetFrame.f2304a = constraintWidget;
                    widgetFrame.h();
                }
                TypedBundle typedBundle = motionWidget.f2271a.t;
                if (typedBundle != null) {
                    typedBundle.d(motionWidget);
                }
                motion2.m(motionWidget);
                widgetStateG.e = true;
            } else if (i == 1) {
                WidgetFrame widgetFrame2 = widgetStateG.b;
                if (constraintWidget == null) {
                    widgetFrame2.getClass();
                } else {
                    widgetFrame2.f2304a = constraintWidget;
                    widgetFrame2.h();
                }
                motion2.l(widgetStateG.g);
                widgetStateG.e = true;
            }
            String str = motion.c.m;
            if (str != null) {
                motion.D = g(i, str).d;
            }
        }
        float f = this.f;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        boolean z2 = ((double) f) < 0.0d;
        float fAbs = Math.abs(f);
        HashMap map = this.b;
        Iterator it = map.keySet().iterator();
        do {
            fMin = Float.MAX_VALUE;
            fMax = -3.4028235E38f;
            if (!it.hasNext()) {
                Iterator it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    MotionPaths motionPaths = ((WidgetState) map.get((String) it2.next())).d.d;
                    float f2 = motionPaths.g + motionPaths.h;
                    fMin = Math.min(fMin, f2);
                    fMax = Math.max(fMax, f2);
                }
                Iterator it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    Motion motion3 = ((WidgetState) map.get((String) it3.next())).d;
                    MotionPaths motionPaths2 = motion3.d;
                    float f3 = motionPaths2.g + motionPaths2.h;
                    float f4 = fMax - fMin;
                    float f5 = fAbs - (((f3 - fMin) * fAbs) / f4);
                    if (z2) {
                        f5 = fAbs - (((fMax - f3) / f4) * fAbs);
                    }
                    motion3.k = 1.0f / (1.0f - fAbs);
                    motion3.j = f5;
                }
                return;
            }
        } while (Float.isNaN(((WidgetState) map.get((String) it.next())).d.i));
        Iterator it4 = map.keySet().iterator();
        while (it4.hasNext()) {
            float f6 = ((WidgetState) map.get((String) it4.next())).d.i;
            if (!Float.isNaN(f6)) {
                fMin = Math.min(fMin, f6);
                fMax = Math.max(fMax, f6);
            }
        }
        Iterator it5 = map.keySet().iterator();
        while (it5.hasNext()) {
            Motion motion4 = ((WidgetState) map.get((String) it5.next())).d;
            float f7 = motion4.i;
            if (!Float.isNaN(f7)) {
                float f8 = 1.0f / (1.0f - fAbs);
                float f9 = fMax - fMin;
                float f10 = fAbs - (((f7 - fMin) * fAbs) / f9);
                if (z2) {
                    f10 = fAbs - (((fMax - f7) / f9) * fAbs);
                }
                motion4.k = f8;
                motion4.j = f10;
            }
        }
    }
}
