package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Set;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonIgnoreProperties {

    public static class Value implements JacksonAnnotationValue<JsonIgnoreProperties>, Serializable {
        public static final Value i = new Value(Collections.EMPTY_SET, false, false, false, true);
        public final Set d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public Value(Set set, boolean z, boolean z2, boolean z3, boolean z4) {
            if (set == null) {
                this.d = Collections.EMPTY_SET;
            } else {
                this.d = set;
            }
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
        }

        public static boolean a(Set set, boolean z, boolean z2, boolean z3, boolean z4) {
            Value value = i;
            if (z == value.e && z2 == value.f && z3 == value.g && z4 == value.h) {
                return set == null || set.size() == 0;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                if (this.e == value.e && this.h == value.h && this.f == value.f && this.g == value.g && this.d.equals(value.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.d.size() + (this.e ? 1 : -3) + (this.f ? 3 : -7) + (this.g ? 7 : -11) + (this.h ? 11 : -13);
        }

        public Object readResolve() {
            return a(this.d, this.e, this.f, this.g, this.h) ? i : this;
        }

        public final String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h));
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
