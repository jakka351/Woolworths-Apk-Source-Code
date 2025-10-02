package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class WireFormat {

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

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$1, reason: invalid class name */
        public enum AnonymousClass1 extends FieldType {
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$2, reason: invalid class name */
        public enum AnonymousClass2 extends FieldType {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$3, reason: invalid class name */
        public enum AnonymousClass3 extends FieldType {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public final boolean a() {
                return false;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$4, reason: invalid class name */
        public enum AnonymousClass4 extends FieldType {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
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

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.d),
        ENUM(null),
        MESSAGE(null);

        public final Object d;

        JavaType(Object obj) {
            this.d = obj;
        }
    }
}
