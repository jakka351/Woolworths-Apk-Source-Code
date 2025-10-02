package androidx.constraintlayout.core.motion.key;

import YU.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class MotionKeyAttributes extends MotionKey {
    public int c;
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
    public float o;
    public float p;
    public float q;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean a(int i, int i2) {
        if (i == 100) {
            this.f2274a = i2;
            return true;
        }
        if (i == 301) {
            this.c = i2;
            return true;
        }
        if (i == 302 || a(i, i2)) {
            return true;
        }
        return super.a(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean c(float f, int i) {
        if (i == 100) {
            this.k = f;
            return true;
        }
        switch (i) {
            case 303:
                this.d = f;
                return true;
            case 304:
                this.n = f;
                return true;
            case 305:
                this.o = f;
                return true;
            case 306:
                this.p = f;
                return true;
            case 307:
                this.e = f;
                return true;
            case 308:
                this.g = f;
                return true;
            case 309:
                this.h = f;
                return true;
            case 310:
                this.f = f;
                return true;
            case 311:
                this.l = f;
                return true;
            case 312:
                this.m = f;
                return true;
            case 313:
                this.i = f;
                return true;
            case 314:
                this.j = f;
                return true;
            case 315:
                this.q = f;
                return true;
            case 316:
                this.k = f;
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final /* bridge */ /* synthetic */ Object clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean d(int i, String str) {
        if (i == 101 || i == 317) {
            return true;
        }
        return super.d(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: e */
    public final MotionKey clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final void f(HashSet hashSet) {
        if (!Float.isNaN(this.d)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.e)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("progress");
        }
        if (this.b.size() > 0) {
            Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final void g(HashMap map) {
        if (!Float.isNaN(this.d)) {
            map.put("alpha", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.e)) {
            map.put("elevation", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.f)) {
            map.put("rotationZ", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.g)) {
            map.put("rotationX", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.h)) {
            map.put("rotationY", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.i)) {
            map.put("pivotX", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.j)) {
            map.put("pivotY", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.n)) {
            map.put("translationX", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.o)) {
            map.put("translationY", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.p)) {
            map.put("translationZ", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.k)) {
            map.put("pathRotate", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.l)) {
            map.put("scaleX", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.m)) {
            map.put("scaleY", Integer.valueOf(this.c));
        }
        if (!Float.isNaN(this.q)) {
            map.put("progress", Integer.valueOf(this.c));
        }
        if (this.b.size() > 0) {
            Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                map.put(a.A("CUSTOM,", (String) it.next()), Integer.valueOf(this.c));
            }
        }
    }
}
