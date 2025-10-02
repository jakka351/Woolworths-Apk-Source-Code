package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class WireFormat {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15123a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f15123a = iArr;
            try {
                iArr[FieldType.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15123a[FieldType.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15123a[FieldType.h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15123a[FieldType.i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15123a[FieldType.j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15123a[FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15123a[FieldType.l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15123a[FieldType.m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15123a[FieldType.q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15123a[FieldType.r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15123a[FieldType.t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15123a[FieldType.u.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15123a[FieldType.v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15123a[FieldType.w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15123a[FieldType.n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15123a[FieldType.o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15123a[FieldType.p.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15123a[FieldType.s.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes6.dex */
    public static class FieldType {
        public static final FieldType f;
        public static final FieldType g;
        public static final FieldType h;
        public static final FieldType i;
        public static final FieldType j;
        public static final FieldType k;
        public static final FieldType l;
        public static final FieldType m;
        public static final FieldType n;
        public static final FieldType o;
        public static final FieldType p;
        public static final FieldType q;
        public static final FieldType r;
        public static final FieldType s;
        public static final FieldType t;
        public static final FieldType u;
        public static final FieldType v;
        public static final FieldType w;
        public static final /* synthetic */ FieldType[] x;
        public final JavaType d;
        public final int e;

        /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$1, reason: invalid class name */
        public enum AnonymousClass1 extends FieldType {
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$2, reason: invalid class name */
        public enum AnonymousClass2 extends FieldType {
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$3, reason: invalid class name */
        public enum AnonymousClass3 extends FieldType {
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$4, reason: invalid class name */
        public enum AnonymousClass4 extends FieldType {
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            f = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            g = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            h = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            i = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            j = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            k = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            l = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            m = fieldType8;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1("STRING", 8, JavaType.STRING, 2);
            n = anonymousClass1;
            JavaType javaType3 = JavaType.MESSAGE;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2("GROUP", 9, javaType3, 3);
            o = anonymousClass2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3("MESSAGE", 10, javaType3, 2);
            p = anonymousClass3;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4("BYTES", 11, JavaType.BYTE_STRING, 2);
            q = anonymousClass4;
            FieldType fieldType9 = new FieldType("UINT32", 12, javaType2, 0);
            r = fieldType9;
            FieldType fieldType10 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            s = fieldType10;
            FieldType fieldType11 = new FieldType("SFIXED32", 14, javaType2, 5);
            t = fieldType11;
            FieldType fieldType12 = new FieldType("SFIXED64", 15, javaType, 1);
            u = fieldType12;
            FieldType fieldType13 = new FieldType("SINT32", 16, javaType2, 0);
            v = fieldType13;
            FieldType fieldType14 = new FieldType("SINT64", 17, javaType, 0);
            w = fieldType14;
            x = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14};
        }

        public FieldType(String str, int i2, JavaType javaType, int i3) {
            this.d = javaType;
            this.e = i3;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) x.clone();
        }

        public boolean a() {
            return !(this instanceof AnonymousClass1);
        }
    }

    /* loaded from: classes6.dex */
    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.e),
        ENUM(null),
        MESSAGE(null);

        public final Object d;

        JavaType(Serializable serializable) {
            this.d = serializable;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public static abstract class Utf8Validation {
        public static final AnonymousClass1 d;
        public static final /* synthetic */ Utf8Validation[] e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$1] */
        static {
            ?? r0 = new Utf8Validation() { // from class: com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.1
                @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation
                public final Object a(CodedInputStream codedInputStream) {
                    return codedInputStream.B();
                }
            };
            d = r0;
            e = new Utf8Validation[]{r0, new Utf8Validation() { // from class: com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.2
                @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation
                public final Object a(CodedInputStream codedInputStream) {
                    return codedInputStream.C();
                }
            }, new Utf8Validation() { // from class: com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.3
                @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation
                public final Object a(CodedInputStream codedInputStream) {
                    return codedInputStream.m();
                }
            }};
        }

        public static Utf8Validation valueOf(String str) {
            return (Utf8Validation) Enum.valueOf(Utf8Validation.class, str);
        }

        public static Utf8Validation[] values() {
            return (Utf8Validation[]) e.clone();
        }

        public abstract Object a(CodedInputStream codedInputStream);
    }

    public static Object a(CodedInputStream codedInputStream, FieldType fieldType, Utf8Validation utf8Validation) {
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(codedInputStream.n());
            case 1:
                return Float.valueOf(codedInputStream.r());
            case 2:
                return Long.valueOf(codedInputStream.u());
            case 3:
                return Long.valueOf(codedInputStream.F());
            case 4:
                return Integer.valueOf(codedInputStream.t());
            case 5:
                return Long.valueOf(codedInputStream.q());
            case 6:
                return Integer.valueOf(codedInputStream.p());
            case 7:
                return Boolean.valueOf(codedInputStream.l());
            case 8:
                return utf8Validation.a(codedInputStream);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return codedInputStream.m();
            case 12:
                return Integer.valueOf(codedInputStream.E());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(codedInputStream.x());
            case 15:
                return Long.valueOf(codedInputStream.y());
            case 16:
                return Integer.valueOf(codedInputStream.z());
            case 17:
                return Long.valueOf(codedInputStream.A());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
