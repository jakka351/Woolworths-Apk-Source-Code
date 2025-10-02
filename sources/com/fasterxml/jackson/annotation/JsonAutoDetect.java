package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonAutoDetect {

    /* renamed from: com.fasterxml.jackson.annotation.JsonAutoDetect$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14187a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PropertyAccessor.values().length];
            b = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[Visibility.values().length];
            f14187a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14187a[4] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14187a[1] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14187a[2] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14187a[3] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static class Value implements JacksonAnnotationValue<JsonAutoDetect>, Serializable {
        public static final Value i;
        public static final Value j;
        public final Visibility d;
        public final Visibility e;
        public final Visibility f;
        public final Visibility g;
        public final Visibility h;

        static {
            Visibility visibility = Visibility.d;
            Visibility visibility2 = Visibility.e;
            i = new Value(visibility2, visibility2, visibility2, visibility, visibility2);
            Visibility visibility3 = Visibility.g;
            j = new Value(visibility3, visibility3, visibility3, visibility3, visibility3);
        }

        public Value(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this.d = visibility;
            this.e = visibility2;
            this.f = visibility3;
            this.g = visibility4;
            this.h = visibility5;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                if (this.d == value.d && this.e == value.e && this.f == value.f && this.g == value.g && this.h == value.h) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.d.ordinal() + 1) ^ ((this.g.ordinal() * 11) + ((this.e.ordinal() * 3) - (this.f.ordinal() * 7)))) ^ (this.h.ordinal() * 13);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object readResolve() {
            /*
                r6 = this;
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r0 = r6.d
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r1 = r6.e
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r2 = r6.f
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r3 = r6.g
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r4 = r6.h
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.e
                if (r0 != r5) goto L1b
                if (r1 != r5) goto L2a
                if (r2 != r5) goto L2a
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.d
                if (r3 != r0) goto L2a
                if (r4 != r5) goto L2a
                com.fasterxml.jackson.annotation.JsonAutoDetect$Value r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.Value.i
                goto L2b
            L1b:
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r5 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.g
                if (r0 != r5) goto L2a
                if (r1 != r5) goto L2a
                if (r2 != r5) goto L2a
                if (r3 != r5) goto L2a
                if (r4 != r5) goto L2a
                com.fasterxml.jackson.annotation.JsonAutoDetect$Value r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.Value.j
                goto L2b
            L2a:
                r0 = 0
            L2b:
                if (r0 != 0) goto L2e
                return r6
            L2e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonAutoDetect.Value.readResolve():java.lang.Object");
        }

        public final String toString() {
            return "JsonAutoDetect.Value(fields=" + this.d + ",getters=" + this.e + ",isGetters=" + this.f + ",setters=" + this.g + ",creators=" + this.h + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Visibility {
        public static final Visibility d;
        public static final Visibility e;
        public static final Visibility f;
        public static final Visibility g;
        public static final /* synthetic */ Visibility[] h;

        static {
            Visibility visibility = new Visibility("ANY", 0);
            d = visibility;
            Visibility visibility2 = new Visibility("NON_PRIVATE", 1);
            Visibility visibility3 = new Visibility("PROTECTED_AND_PUBLIC", 2);
            Visibility visibility4 = new Visibility("PUBLIC_ONLY", 3);
            e = visibility4;
            Visibility visibility5 = new Visibility("NONE", 4);
            f = visibility5;
            Visibility visibility6 = new Visibility("DEFAULT", 5);
            g = visibility6;
            h = new Visibility[]{visibility, visibility2, visibility3, visibility4, visibility5, visibility6};
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) h.clone();
        }

        public final boolean a(Member member) {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return true;
            }
            if (iOrdinal == 1) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    Visibility creatorVisibility() default Visibility.g;

    Visibility fieldVisibility() default Visibility.g;

    Visibility getterVisibility() default Visibility.g;

    Visibility isGetterVisibility() default Visibility.g;

    Visibility setterVisibility() default Visibility.g;
}
