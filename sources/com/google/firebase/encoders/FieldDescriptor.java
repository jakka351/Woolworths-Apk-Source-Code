package com.google.firebase.encoders;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class FieldDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final String f15408a;
    public final Map b;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f15409a;
        public HashMap b = null;

        public Builder(String str) {
            this.f15409a = str;
        }

        public final FieldDescriptor a() {
            return new FieldDescriptor(this.f15409a, this.b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.b)));
        }

        public final void b(Annotation annotation) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(annotation.annotationType(), annotation);
        }
    }

    public FieldDescriptor(String str, Map map) {
        this.f15408a = str;
        this.b = map;
    }

    public static FieldDescriptor b(String str) {
        return new FieldDescriptor(str, Collections.EMPTY_MAP);
    }

    public final Annotation a(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.f15408a.equals(fieldDescriptor.f15408a) && this.b.equals(fieldDescriptor.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15408a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f15408a + ", properties=" + this.b.values() + "}";
    }
}
