package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonIncludeProperties {

    public static class Value implements JacksonAnnotationValue<JsonIncludeProperties>, Serializable {
        public static final Value e = new Value(null);
        public final Set d;

        public Value(Set set) {
            this.d = set;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Set set = ((Value) obj).d;
                Set set2 = this.d;
                if (set2 == null ? set == null : set2.equals(set)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Set set = this.d;
            if (set == null) {
                return 0;
            }
            return set.size();
        }

        public final String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", this.d);
        }
    }

    String[] value() default {};
}
