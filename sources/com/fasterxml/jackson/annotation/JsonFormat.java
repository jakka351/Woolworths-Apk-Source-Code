package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonFormat {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Feature {
        public static final Feature d;
        public static final Feature e;
        public static final Feature f;
        public static final Feature g;
        public static final /* synthetic */ Feature[] h;

        static {
            Feature feature = new Feature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0);
            d = feature;
            Feature feature2 = new Feature("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 1);
            e = feature2;
            Feature feature3 = new Feature("ACCEPT_CASE_INSENSITIVE_VALUES", 2);
            Feature feature4 = new Feature("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 3);
            Feature feature5 = new Feature("WRITE_DATES_WITH_ZONE_ID", 4);
            Feature feature6 = new Feature("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 5);
            f = feature6;
            Feature feature7 = new Feature("WRITE_SORTED_MAP_ENTRIES", 6);
            g = feature7;
            h = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, new Feature("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 7)};
        }

        public static Feature valueOf(String str) {
            return (Feature) Enum.valueOf(Feature.class, str);
        }

        public static Feature[] values() {
            return (Feature[]) h.clone();
        }
    }

    public static class Features {
        public static final Features c = new Features(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f14188a;
        public final int b;

        public Features(int i, int i2) {
            this.f14188a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Features features = (Features) obj;
            return features.f14188a == this.f14188a && features.b == this.b;
        }

        public final int hashCode() {
            return this.b + this.f14188a;
        }

        public final String toString() {
            return this == c ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.f14188a), Integer.valueOf(this.b));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Shape {
        public static final Shape d;
        public static final Shape e;
        public static final Shape f;
        public static final Shape g;
        public static final Shape h;
        public static final Shape i;
        public static final Shape j;
        public static final Shape k;
        public static final Shape l;
        public static final Shape m;
        public static final /* synthetic */ Shape[] n;

        static {
            Shape shape = new Shape("ANY", 0);
            d = shape;
            Shape shape2 = new Shape("NATURAL", 1);
            e = shape2;
            Shape shape3 = new Shape("SCALAR", 2);
            f = shape3;
            Shape shape4 = new Shape("ARRAY", 3);
            g = shape4;
            Shape shape5 = new Shape("OBJECT", 4);
            h = shape5;
            Shape shape6 = new Shape("NUMBER", 5);
            i = shape6;
            Shape shape7 = new Shape("NUMBER_FLOAT", 6);
            j = shape7;
            Shape shape8 = new Shape("NUMBER_INT", 7);
            k = shape8;
            Shape shape9 = new Shape("STRING", 8);
            l = shape9;
            Shape shape10 = new Shape("BOOLEAN", 9);
            Shape shape11 = new Shape("BINARY", 10);
            m = shape11;
            n = new Shape[]{shape, shape2, shape3, shape4, shape5, shape6, shape7, shape8, shape9, shape10, shape11};
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) n.clone();
        }

        public final boolean a() {
            return this == i || this == k || this == j;
        }
    }

    public static class Value implements JacksonAnnotationValue<JsonFormat>, Serializable {
        public static final Value k = new Value();
        public final String d;
        public final Shape e;
        public final Locale f;
        public final String g;
        public final Boolean h;
        public final Features i;
        public transient TimeZone j;

        public Value() {
            this("", Shape.d, "", "", Features.c, null);
        }

        public static boolean a(Serializable serializable, Object obj) {
            if (obj == null) {
                return serializable == null;
            }
            if (serializable == null) {
                return false;
            }
            return obj.equals(serializable);
        }

        public final Boolean b(Feature feature) {
            Features features = this.i;
            features.getClass();
            int iOrdinal = 1 << feature.ordinal();
            if ((features.b & iOrdinal) != 0) {
                return Boolean.FALSE;
            }
            if ((iOrdinal & features.f14188a) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public final TimeZone c() {
            TimeZone timeZone = this.j;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this.g;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this.j = timeZone2;
            return timeZone2;
        }

        public final boolean d() {
            if (this.j != null) {
                return true;
            }
            String str = this.g;
            return (str == null || str.isEmpty()) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0054 A[PHI: r1
  0x0054: PHI (r1v9 com.fasterxml.jackson.annotation.JsonFormat$Features) = 
  (r1v8 com.fasterxml.jackson.annotation.JsonFormat$Features)
  (r1v10 com.fasterxml.jackson.annotation.JsonFormat$Features)
  (r1v8 com.fasterxml.jackson.annotation.JsonFormat$Features)
  (r1v8 com.fasterxml.jackson.annotation.JsonFormat$Features)
 binds: [B:26:0x0037, B:40:0x0056, B:38:0x0052, B:30:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.fasterxml.jackson.annotation.JsonFormat.Value e(com.fasterxml.jackson.annotation.JsonFormat.Value r11) {
            /*
                r10 = this;
                if (r11 == 0) goto L7e
                com.fasterxml.jackson.annotation.JsonFormat$Features r0 = r11.i
                com.fasterxml.jackson.annotation.JsonFormat$Value r1 = com.fasterxml.jackson.annotation.JsonFormat.Value.k
                if (r11 == r1) goto L7e
                if (r11 != r10) goto Lc
                goto L7e
            Lc:
                if (r10 != r1) goto Lf
                return r11
            Lf:
                java.lang.String r1 = r11.d
                if (r1 == 0) goto L1c
                boolean r2 = r1.isEmpty()
                if (r2 == 0) goto L1a
                goto L1c
            L1a:
                r3 = r1
                goto L1f
            L1c:
                java.lang.String r1 = r10.d
                goto L1a
            L1f:
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = r11.e
                com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = com.fasterxml.jackson.annotation.JsonFormat.Shape.d
                if (r1 != r2) goto L27
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = r10.e
            L27:
                r4 = r1
                java.util.Locale r1 = r11.f
                if (r1 != 0) goto L2e
                java.util.Locale r1 = r10.f
            L2e:
                r5 = r1
                com.fasterxml.jackson.annotation.JsonFormat$Features r1 = r10.i
                if (r1 != 0) goto L35
            L33:
                r8 = r0
                goto L5c
            L35:
                int r2 = r1.b
                if (r0 != 0) goto L3a
                goto L54
            L3a:
                int r6 = r0.b
                int r7 = r0.f14188a
                if (r6 != 0) goto L43
                if (r7 != 0) goto L43
                goto L54
            L43:
                int r8 = r1.f14188a
                if (r8 != 0) goto L4a
                if (r2 != 0) goto L4a
                goto L33
            L4a:
                int r0 = ~r6
                r0 = r0 & r8
                r0 = r0 | r7
                int r7 = ~r7
                r7 = r7 & r2
                r6 = r6 | r7
                if (r0 != r8) goto L56
                if (r6 != r2) goto L56
            L54:
                r0 = r1
                goto L33
            L56:
                com.fasterxml.jackson.annotation.JsonFormat$Features r1 = new com.fasterxml.jackson.annotation.JsonFormat$Features
                r1.<init>(r0, r6)
                goto L54
            L5c:
                java.lang.Boolean r0 = r11.h
                if (r0 != 0) goto L62
                java.lang.Boolean r0 = r10.h
            L62:
                r9 = r0
                java.lang.String r0 = r11.g
                if (r0 == 0) goto L73
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L6e
                goto L73
            L6e:
                java.util.TimeZone r11 = r11.j
            L70:
                r7 = r11
                r6 = r0
                goto L78
            L73:
                java.util.TimeZone r11 = r10.j
                java.lang.String r0 = r10.g
                goto L70
            L78:
                com.fasterxml.jackson.annotation.JsonFormat$Value r2 = new com.fasterxml.jackson.annotation.JsonFormat$Value
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return r2
            L7e:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonFormat.Value.e(com.fasterxml.jackson.annotation.JsonFormat$Value):com.fasterxml.jackson.annotation.JsonFormat$Value");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            if (this.e != value.e || !this.i.equals(value.i)) {
                return false;
            }
            if (!a(value.h, this.h)) {
                return false;
            }
            if (!a(value.g, this.g)) {
                return false;
            }
            if (!a(value.d, this.d)) {
                return false;
            }
            if (a(value.j, this.j)) {
                return a(value.f, this.f);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.g;
            int iHashCode = str == null ? 1 : str.hashCode();
            String str2 = this.d;
            if (str2 != null) {
                iHashCode ^= str2.hashCode();
            }
            int iHashCode2 = this.e.hashCode() + iHashCode;
            Boolean bool = this.h;
            if (bool != null) {
                iHashCode2 ^= bool.hashCode();
            }
            Locale locale = this.f;
            if (locale != null) {
                iHashCode2 += locale.hashCode();
            }
            return this.i.hashCode() ^ iHashCode2;
        }

        public final String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this.d, this.e, this.h, this.f, this.g, this.i);
        }

        public Value(String str, Shape shape, String str2, String str3, Features features, Boolean bool) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, features, bool);
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, Features features, Boolean bool) {
            this.d = str == null ? "" : str;
            this.e = shape == null ? Shape.d : shape;
            this.f = locale;
            this.j = timeZone;
            this.g = str2;
            this.i = features == null ? Features.c : features;
            this.h = bool;
        }
    }

    OptBoolean lenient() default OptBoolean.e;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.d;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};
}
