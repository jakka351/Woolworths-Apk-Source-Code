package com.fasterxml.jackson.annotation;

import androidx.constraintlayout.core.state.a;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonInclude {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Include {
        public static final Include d;
        public static final Include e;
        public static final Include f;
        public static final Include g;
        public static final Include h;
        public static final /* synthetic */ Include[] i;

        static {
            Include include = new Include("ALWAYS", 0);
            d = include;
            Include include2 = new Include("NON_NULL", 1);
            e = include2;
            Include include3 = new Include("NON_ABSENT", 2);
            Include include4 = new Include("NON_EMPTY", 3);
            f = include4;
            Include include5 = new Include("NON_DEFAULT", 4);
            g = include5;
            Include include6 = new Include("CUSTOM", 5);
            Include include7 = new Include("USE_DEFAULTS", 6);
            h = include7;
            i = new Include[]{include, include2, include3, include4, include5, include6, include7};
        }

        public static Include valueOf(String str) {
            return (Include) Enum.valueOf(Include.class, str);
        }

        public static Include[] values() {
            return (Include[]) i.clone();
        }
    }

    public static class Value implements JacksonAnnotationValue<JsonInclude>, Serializable {
        public static final Value h;
        public final Include d;
        public final Include e;
        public final Class f;
        public final Class g;

        static {
            Include include = Include.h;
            h = new Value(include, include, null, null);
        }

        public Value(Include include, Include include2, Class cls, Class cls2) {
            Include include3 = Include.h;
            this.d = include == null ? include3 : include;
            this.e = include2 == null ? include3 : include2;
            this.f = cls == Void.class ? null : cls;
            this.g = cls2 == Void.class ? null : cls2;
        }

        public final Value a(Value value) {
            if (value != null && value != h) {
                Include include = value.d;
                Include include2 = value.e;
                Class cls = value.f;
                Class cls2 = value.g;
                Include include3 = Include.h;
                Include include4 = this.d;
                boolean z = (include == include4 || include == include3) ? false : true;
                Include include5 = this.e;
                boolean z2 = (include2 == include5 || include2 == include3) ? false : true;
                Class cls3 = this.f;
                boolean z3 = (cls == cls3 && cls2 == cls3) ? false : true;
                if (z) {
                    return z2 ? new Value(include, include2, cls, cls2) : new Value(include, include5, cls, cls2);
                }
                if (z2) {
                    return new Value(include4, include2, cls, cls2);
                }
                if (z3) {
                    return new Value(include4, include5, cls, cls2);
                }
            }
            return this;
        }

        public final Value b(Include include) {
            if (include == this.d) {
                return this;
            }
            return new Value(include, this.e, this.f, this.g);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            return value.d == this.d && value.e == this.e && value.f == this.f && value.g == this.g;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() << 2);
        }

        public Object readResolve() {
            Include include = this.d;
            Include include2 = Include.h;
            return (include == include2 && this.e == include2 && this.f == null && this.g == null) ? h : this;
        }

        public final String toString() {
            StringBuilder sbO = a.o(80, "JsonInclude.Value(value=");
            sbO.append(this.d);
            sbO.append(",content=");
            sbO.append(this.e);
            Class cls = this.f;
            if (cls != null) {
                sbO.append(",valueFilter=");
                sbO.append(cls.getName());
                sbO.append(".class");
            }
            Class cls2 = this.g;
            if (cls2 != null) {
                sbO.append(",contentFilter=");
                sbO.append(cls2.getName());
                sbO.append(".class");
            }
            sbO.append(')');
            return sbO.toString();
        }
    }

    Include content() default Include.d;

    Class contentFilter() default Void.class;

    Include value() default Include.d;

    Class valueFilter() default Void.class;
}
