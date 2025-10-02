package androidx.constraintlayout.core.motion.key;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class MotionKeyCycle extends MotionKey {
    public int c;
    public String d;
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
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean a(int i, int i2) {
        if (i != 401) {
            if (i != 421) {
                if (c(i2, i)) {
                    return true;
                }
                return super.a(i, i2);
            }
            this.c = i2;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean c(float f, int i) {
        if (i == 315) {
            this.h = f;
            return true;
        }
        if (i == 403) {
            this.i = f;
            return true;
        }
        if (i == 416) {
            this.l = f;
            return true;
        }
        switch (i) {
            case 304:
                this.q = f;
                return true;
            case 305:
                this.r = f;
                return true;
            case 306:
                this.s = f;
                return true;
            case 307:
                this.j = f;
                return true;
            case 308:
                this.m = f;
                return true;
            case 309:
                this.n = f;
                return true;
            case 310:
                this.k = f;
                return true;
            case 311:
                this.o = f;
                return true;
            case 312:
                this.p = f;
                return true;
            default:
                switch (i) {
                    case 423:
                        this.e = f;
                        return true;
                    case 424:
                        this.f = f;
                        return true;
                    case 425:
                        this.g = f;
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final /* bridge */ /* synthetic */ Object clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean d(int i, String str) {
        if (i != 420) {
            if (i != 422) {
                return super.d(i, str);
            }
            this.d = str;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: e */
    public final MotionKey clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final void f(HashSet hashSet) {
        if (!Float.isNaN(this.i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.s)) {
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
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.HashMap r18) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.MotionKeyCycle.h(java.util.HashMap):void");
    }
}
