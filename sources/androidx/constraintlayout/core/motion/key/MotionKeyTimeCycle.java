package androidx.constraintlayout.core.motion.key;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class MotionKeyTimeCycle extends MotionKey {
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    public float p;
    public float q;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean a(int i, int i2) {
        if (i == 100) {
            this.f2274a = i2;
            return true;
        }
        if (i != 421) {
            return super.a(i, i2);
        }
        this.o = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean b(int i, boolean z) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean c(float f, int i) throws NumberFormatException {
        if (i == 315) {
            this.n = Float.valueOf(f).floatValue();
            return true;
        }
        if (i == 401) {
            Integer.parseInt(Float.valueOf(f).toString());
            return true;
        }
        if (i == 403) {
            this.c = f;
            return true;
        }
        if (i == 416) {
            this.h = Float.valueOf(f).floatValue();
            return true;
        }
        if (i == 423) {
            this.p = Float.valueOf(f).floatValue();
            return true;
        }
        if (i == 424) {
            this.q = Float.valueOf(f).floatValue();
            return true;
        }
        switch (i) {
            case 304:
                this.k = Float.valueOf(f).floatValue();
                return true;
            case 305:
                this.l = Float.valueOf(f).floatValue();
                return true;
            case 306:
                this.m = Float.valueOf(f).floatValue();
                return true;
            case 307:
                this.d = Float.valueOf(f).floatValue();
                return true;
            case 308:
                this.f = Float.valueOf(f).floatValue();
                return true;
            case 309:
                this.g = Float.valueOf(f).floatValue();
                return true;
            case 310:
                this.e = Float.valueOf(f).floatValue();
                return true;
            case 311:
                this.i = Float.valueOf(f).floatValue();
                return true;
            case 312:
                this.j = Float.valueOf(f).floatValue();
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean d(int i, String str) {
        if (i == 420) {
            return true;
        }
        if (i != 421) {
            return super.d(i, str);
        }
        this.o = 7;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: e */
    public final MotionKey clone() {
        MotionKeyTimeCycle motionKeyTimeCycle = new MotionKeyTimeCycle();
        motionKeyTimeCycle.c = Float.NaN;
        motionKeyTimeCycle.d = Float.NaN;
        motionKeyTimeCycle.e = Float.NaN;
        motionKeyTimeCycle.f = Float.NaN;
        motionKeyTimeCycle.g = Float.NaN;
        motionKeyTimeCycle.h = Float.NaN;
        motionKeyTimeCycle.i = Float.NaN;
        motionKeyTimeCycle.j = Float.NaN;
        motionKeyTimeCycle.k = Float.NaN;
        motionKeyTimeCycle.l = Float.NaN;
        motionKeyTimeCycle.m = Float.NaN;
        motionKeyTimeCycle.n = Float.NaN;
        motionKeyTimeCycle.o = 0;
        motionKeyTimeCycle.p = Float.NaN;
        motionKeyTimeCycle.q = BitmapDescriptorFactory.HUE_RED;
        motionKeyTimeCycle.b = new HashMap();
        motionKeyTimeCycle.f2274a = this.f2274a;
        motionKeyTimeCycle.o = this.o;
        motionKeyTimeCycle.p = this.p;
        motionKeyTimeCycle.q = this.q;
        motionKeyTimeCycle.n = this.n;
        motionKeyTimeCycle.c = this.c;
        motionKeyTimeCycle.d = this.d;
        motionKeyTimeCycle.e = this.e;
        motionKeyTimeCycle.h = this.h;
        motionKeyTimeCycle.f = this.f;
        motionKeyTimeCycle.g = this.g;
        motionKeyTimeCycle.i = this.i;
        motionKeyTimeCycle.j = this.j;
        motionKeyTimeCycle.k = this.k;
        motionKeyTimeCycle.l = this.l;
        motionKeyTimeCycle.m = this.m;
        return motionKeyTimeCycle;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final void f(HashSet hashSet) {
        if (!Float.isNaN(this.c)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.d)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.e)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("translationZ");
        }
        if (this.b.size() > 0) {
            Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.HashMap r10) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle.h(java.util.HashMap):void");
    }
}
