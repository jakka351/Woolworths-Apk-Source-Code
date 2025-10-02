package com.fasterxml.jackson.databind.type;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class ClassKey implements Comparable<ClassKey>, Serializable {
    public String d;
    public Class e;
    public int f;

    public ClassKey(Class cls) {
        this.e = cls;
        String name = cls.getName();
        this.d = name;
        this.f = name.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(ClassKey classKey) {
        return this.d.compareTo(classKey.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == ClassKey.class && ((ClassKey) obj).e == this.e;
    }

    public final int hashCode() {
        return this.f;
    }

    public final String toString() {
        return this.d;
    }
}
