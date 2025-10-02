package com.fasterxml.jackson.annotation;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class ObjectIdGenerator<T> implements Serializable {

    public static final class IdKey implements Serializable {
        public final Class d;
        public final Class e;
        public final Object f;
        public final int g;

        public IdKey(Class cls, Class cls2, Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("Can not construct IdKey for null key");
            }
            this.d = cls;
            this.e = cls2;
            this.f = obj;
            int iHashCode = cls.getName().hashCode() + obj.hashCode();
            this.g = cls2 != null ? iHashCode ^ cls2.getName().hashCode() : iHashCode;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != IdKey.class) {
                return false;
            }
            IdKey idKey = (IdKey) obj;
            return idKey.f.equals(this.f) && idKey.d == this.d && idKey.e == this.e;
        }

        public final int hashCode() {
            return this.g;
        }

        public final String toString() {
            Class cls = this.d;
            String name = cls == null ? "NONE" : cls.getName();
            Class cls2 = this.e;
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", this.f, name, cls2 != null ? cls2.getName() : "NONE");
        }
    }

    public abstract boolean a(ObjectIdGenerator objectIdGenerator);

    public abstract ObjectIdGenerator b(Class cls);

    public abstract Object c(Object obj);

    public abstract Class d();

    public abstract IdKey e(Object obj);

    public abstract ObjectIdGenerator f();
}
