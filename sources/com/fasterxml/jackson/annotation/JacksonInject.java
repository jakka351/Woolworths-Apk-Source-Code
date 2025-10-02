package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JacksonInject {

    public static class Value implements JacksonAnnotationValue<JacksonInject>, Serializable {
        public static final Value f = new Value(null, null);
        public final Object d;
        public final Boolean e;

        public Value(Object obj, Boolean bool) {
            this.d = obj;
            this.e = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                Object obj2 = value.d;
                Boolean bool = value.e;
                Boolean bool2 = this.e;
                if (bool2 == null ? bool == null : bool2.equals(bool)) {
                    Object obj3 = this.d;
                    return obj3 == null ? obj2 == null : obj3.equals(obj2);
                }
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.d;
            int iHashCode = obj != null ? 1 + obj.hashCode() : 1;
            Boolean bool = this.e;
            return bool != null ? bool.hashCode() + iHashCode : iHashCode;
        }

        public final String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.d, this.e);
        }
    }

    OptBoolean useInput() default OptBoolean.e;

    String value() default "";
}
