package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes4.dex */
public class TypeKey {

    /* renamed from: a, reason: collision with root package name */
    public final int f14341a;
    public final Class b;
    public final JavaType c;
    public final boolean d;

    public TypeKey(Class cls, boolean z) {
        this.b = cls;
        this.c = null;
        this.d = z;
        this.f14341a = z ? cls.getName().hashCode() + 1 : cls.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        TypeKey typeKey = (TypeKey) obj;
        if (typeKey.d != this.d) {
            return false;
        }
        Class cls = this.b;
        return cls != null ? typeKey.b == cls : this.c.equals(typeKey.c);
    }

    public final int hashCode() {
        return this.f14341a;
    }

    public final String toString() {
        boolean z = this.d;
        Class cls = this.b;
        if (cls != null) {
            return "{class: " + cls.getName() + ", typed? " + z + "}";
        }
        return "{type: " + this.c + ", typed? " + z + "}";
    }

    public TypeKey(JavaType javaType, boolean z) {
        int i;
        this.c = javaType;
        this.b = null;
        this.d = z;
        if (z) {
            i = javaType.e - 2;
        } else {
            i = javaType.e - 1;
        }
        this.f14341a = i;
    }
}
