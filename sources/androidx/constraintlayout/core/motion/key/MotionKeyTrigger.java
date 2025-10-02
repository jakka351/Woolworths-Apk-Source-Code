package androidx.constraintlayout.core.motion.key;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class MotionKeyTrigger extends MotionKey {
    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean a(int i, int i2) {
        if (i == 307 || i == 308 || i == 311) {
            return true;
        }
        switch (i) {
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return super.a(i, i2);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean b(int i, boolean z) {
        return i == 304;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean c(float f, int i) {
        return i == 305;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean d(int i, String str) {
        if (i == 309 || i == 310 || i == 312) {
            return true;
        }
        return super.d(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: e */
    public final MotionKey clone() {
        MotionKeyTrigger motionKeyTrigger = new MotionKeyTrigger();
        motionKeyTrigger.b = new HashMap();
        motionKeyTrigger.f2274a = this.f2274a;
        return motionKeyTrigger;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final void f(HashSet hashSet) {
    }
}
