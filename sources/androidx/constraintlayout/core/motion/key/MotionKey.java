package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class MotionKey implements TypedValues {

    /* renamed from: a, reason: collision with root package name */
    public int f2274a = -1;
    public HashMap b;

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean a(int i, int i2) {
        if (i != 100) {
            return false;
        }
        this.f2274a = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean b(int i, boolean z) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean c(float f, int i) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean d(int i, String str) {
        return i == 101;
    }

    @Override // 
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract MotionKey clone();

    public abstract void f(HashSet hashSet);

    public void g(HashMap map) {
    }
}
