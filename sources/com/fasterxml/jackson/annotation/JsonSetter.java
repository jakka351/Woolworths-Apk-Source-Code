package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonSetter {

    public static class Value implements JacksonAnnotationValue<JsonSetter>, Serializable {
        public static final Value f;
        public final Nulls d;
        public final Nulls e;

        static {
            Nulls nulls = Nulls.g;
            f = new Value(nulls, nulls);
        }

        public Value(Nulls nulls, Nulls nulls2) {
            this.d = nulls;
            this.e = nulls2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                if (value.d == this.d && value.e == this.e) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.d.ordinal() + (this.e.ordinal() << 2);
        }

        public Object readResolve() {
            Nulls nulls = this.d;
            Nulls nulls2 = Nulls.g;
            return (nulls == nulls2 && this.e == nulls2) ? f : this;
        }

        public final String toString() {
            return "JsonSetter.Value(valueNulls=" + this.d + ",contentNulls=" + this.e + ")";
        }
    }

    Nulls contentNulls() default Nulls.g;

    Nulls nulls() default Nulls.g;

    String value() default "";
}
