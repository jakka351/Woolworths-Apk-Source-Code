package com.bumptech.glide.util;

/* loaded from: classes4.dex */
public class MultiClassKey {

    /* renamed from: a, reason: collision with root package name */
    public Class f13988a;
    public Class b;
    public Class c;

    public MultiClassKey(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.f13988a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiClassKey multiClassKey = (MultiClassKey) obj;
        return this.f13988a.equals(multiClassKey.f13988a) && this.b.equals(multiClassKey.b) && Util.b(this.c, multiClassKey.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f13988a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f13988a + ", second=" + this.b + '}';
    }
}
