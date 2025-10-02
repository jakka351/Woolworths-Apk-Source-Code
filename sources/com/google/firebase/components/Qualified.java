package com.google.firebase.components;

/* loaded from: classes.dex */
public final class Qualified<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f15235a;
    public final Class b;

    public @interface Unqualified {
    }

    public Qualified(Class cls, Class cls2) {
        this.f15235a = cls;
        this.b = cls2;
    }

    public static Qualified a(Class cls) {
        return new Qualified(Unqualified.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (this.b.equals(qualified.b)) {
            return this.f15235a.equals(qualified.f15235a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15235a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.f15235a;
        if (cls2 == Unqualified.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
