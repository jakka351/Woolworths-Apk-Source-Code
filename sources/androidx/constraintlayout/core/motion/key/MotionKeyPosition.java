package androidx.constraintlayout.core.motion.key;

import java.util.HashSet;

/* loaded from: classes2.dex */
public class MotionKeyPosition extends MotionKey {
    public int c = -1;
    public String d = null;
    public float e = Float.NaN;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public int i = 0;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean a(int i, int i2) {
        if (i == 100) {
            this.f2274a = i2;
            return true;
        }
        if (i == 508) {
            this.c = i2;
            return true;
        }
        if (i != 510) {
            return super.a(i, i2);
        }
        this.i = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean c(float f, int i) {
        switch (i) {
            case 503:
                this.e = f;
                return true;
            case 504:
                this.f = f;
                return true;
            case 505:
                this.e = f;
                this.f = f;
                return true;
            case 506:
                this.g = f;
                return true;
            case 507:
                this.h = f;
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean d(int i, String str) {
        if (i != 501) {
            return super.d(i, str);
        }
        this.d = str.toString();
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: e */
    public final MotionKey clone() {
        MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
        motionKeyPosition.f2274a = this.f2274a;
        motionKeyPosition.d = this.d;
        motionKeyPosition.e = this.e;
        motionKeyPosition.f = Float.NaN;
        motionKeyPosition.g = this.g;
        motionKeyPosition.h = this.h;
        return motionKeyPosition;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final void f(HashSet hashSet) {
    }
}
