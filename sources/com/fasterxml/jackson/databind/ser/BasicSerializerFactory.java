package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class BasicSerializerFactory extends SerializerFactory implements Serializable {
    public static final HashMap e;
    public static final HashMap f;
    public final SerializerFactoryConfig d;

    /* renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14302a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            b = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonFormat.Shape.values().length];
            f14302a = iArr2;
            try {
                iArr2[8] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14302a[4] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14302a[3] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(String.class.getName(), new StringSerializer(String.class));
        String name = StringBuffer.class.getName();
        ToStringSerializer toStringSerializer = ToStringSerializer.f;
        map2.put(name, toStringSerializer);
        map2.put(StringBuilder.class.getName(), toStringSerializer);
        map2.put(Character.class.getName(), toStringSerializer);
        map2.put(Character.TYPE.getName(), toStringSerializer);
        map2.put(Integer.class.getName(), new NumberSerializers.IntegerSerializer(Integer.class));
        Class cls = Integer.TYPE;
        map2.put(cls.getName(), new NumberSerializers.IntegerSerializer(cls));
        map2.put(Long.class.getName(), new NumberSerializers.LongSerializer(Long.class));
        Class cls2 = Long.TYPE;
        map2.put(cls2.getName(), new NumberSerializers.LongSerializer(cls2));
        String name2 = Byte.class.getName();
        NumberSerializers.IntLikeSerializer intLikeSerializer = NumberSerializers.IntLikeSerializer.f;
        map2.put(name2, intLikeSerializer);
        map2.put(Byte.TYPE.getName(), intLikeSerializer);
        String name3 = Short.class.getName();
        NumberSerializers.ShortSerializer shortSerializer = NumberSerializers.ShortSerializer.f;
        map2.put(name3, shortSerializer);
        map2.put(Short.TYPE.getName(), shortSerializer);
        map2.put(Double.class.getName(), new NumberSerializers.DoubleSerializer(Double.class));
        Class cls3 = Double.TYPE;
        map2.put(cls3.getName(), new NumberSerializers.DoubleSerializer(cls3));
        String name4 = Float.class.getName();
        NumberSerializers.FloatSerializer floatSerializer = NumberSerializers.FloatSerializer.f;
        map2.put(name4, floatSerializer);
        map2.put(Float.TYPE.getName(), floatSerializer);
        map2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        map2.put(Boolean.class.getName(), new BooleanSerializer(false));
        map2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        map2.put(Calendar.class.getName(), CalendarSerializer.i);
        map2.put(Date.class.getName(), DateSerializer.i);
        HashMap map3 = new HashMap();
        map3.put(URL.class, new ToStringSerializer(URL.class, 0));
        map3.put(URI.class, new ToStringSerializer(URI.class, 0));
        map3.put(Currency.class, new ToStringSerializer(Currency.class, 0));
        map3.put(UUID.class, new UUIDSerializer(null));
        map3.put(Pattern.class, new ToStringSerializer(Pattern.class, 0));
        map3.put(Locale.class, new ToStringSerializer(Locale.class, 0));
        map3.put(AtomicBoolean.class, StdJdkSerializers.AtomicBooleanSerializer.class);
        map3.put(AtomicInteger.class, StdJdkSerializers.AtomicIntegerSerializer.class);
        map3.put(AtomicLong.class, StdJdkSerializers.AtomicLongSerializer.class);
        map3.put(File.class, FileSerializer.class);
        map3.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.f;
        map3.put(Void.class, nullSerializer);
        map3.put(Void.TYPE, nullSerializer);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof JsonSerializer) {
                map2.put(((Class) entry.getKey()).getName(), (JsonSerializer) value);
            } else {
                map.put(((Class) entry.getKey()).getName(), (Class) value);
            }
        }
        map.put(TokenBuffer.class.getName(), TokenBufferSerializer.class);
        e = map2;
        f = map;
    }

    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this.d = serializerFactoryConfig == null ? new SerializerFactoryConfig(null, null, null) : serializerFactoryConfig;
    }

    public static JsonInclude.Value f(SerializerProvider serializerProvider, BeanDescription beanDescription, JavaType javaType, Class cls) {
        SerializationConfig serializationConfig = serializerProvider.d;
        JsonInclude.Value valueK = beanDescription.k(serializationConfig.j.d);
        serializationConfig.e(cls);
        serializationConfig.e(javaType.d);
        return valueK;
    }

    public static JsonSerializer h(SerializerProvider serializerProvider, Annotated annotated) {
        SerializationConfig serializationConfig = serializerProvider.d;
        Object objX = serializationConfig.d().X(annotated);
        if (objX == null) {
            return null;
        }
        JsonSerializer jsonSerializerI = serializerProvider.I(annotated, objX);
        Object objT = serializationConfig.d().T(annotated);
        Converter converterC = objT != null ? serializerProvider.c(objT) : null;
        return converterC == null ? jsonSerializerI : new StdDelegatingSerializer(converterC, converterC.c(serializerProvider.e()), jsonSerializerI);
    }

    public static boolean i(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        JsonSerialize.Typing typingW = serializationConfig.d().W(beanDescription.m());
        return (typingW == null || typingW == JsonSerialize.Typing.f) ? serializationConfig.m(MapperFeature.USE_STATIC_TYPING) : typingW == JsonSerialize.Typing.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public final JsonSerializer a(SerializationConfig serializationConfig, JavaType javaType) {
        serializationConfig.e.e.e(serializationConfig, javaType, serializationConfig);
        Class cls = javaType.d;
        SerializerFactoryConfig serializerFactoryConfig = this.d;
        Serializers[] serializersArr = serializerFactoryConfig.e;
        JsonSerializer jsonSerializerB = null;
        if (serializersArr.length > 0) {
            ArrayIterator arrayIterator = new ArrayIterator(serializersArr);
            while (arrayIterator.hasNext() && (jsonSerializerB = ((Serializers) arrayIterator.next()).c(javaType)) == null) {
            }
        }
        if (jsonSerializerB == null && (jsonSerializerB = StdKeySerializers.b(cls)) == null) {
            jsonSerializerB = StdKeySerializers.a(serializationConfig, cls);
        }
        if (serializerFactoryConfig.a()) {
            ArrayIterator arrayIteratorB = serializerFactoryConfig.b();
            while (arrayIteratorB.hasNext()) {
                ((BeanSerializerModifier) arrayIteratorB.next()).getClass();
            }
        }
        return jsonSerializerB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonSerializer b(com.fasterxml.jackson.databind.SerializerProvider r9, com.fasterxml.jackson.databind.JavaType r10) throws java.lang.SecurityException {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.SerializationConfig r0 = r9.d
            com.fasterxml.jackson.databind.cfg.BaseSettings r1 = r0.e
            com.fasterxml.jackson.databind.introspect.ClassIntrospector r1 = r1.e
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription r1 = r1.e(r0, r10, r0)
            java.lang.Class r2 = r10.d
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r3 = r8.d
            com.fasterxml.jackson.databind.ser.Serializers[] r4 = r3.e
            int r5 = r4.length
            r6 = 0
            if (r5 <= 0) goto L2d
            com.fasterxml.jackson.databind.util.ArrayIterator r5 = new com.fasterxml.jackson.databind.util.ArrayIterator
            r5.<init>(r4)
            r4 = r6
        L1a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L2e
            java.lang.Object r4 = r5.next()
            com.fasterxml.jackson.databind.ser.Serializers r4 = (com.fasterxml.jackson.databind.ser.Serializers) r4
            com.fasterxml.jackson.databind.JsonSerializer r4 = r4.c(r10)
            if (r4 == 0) goto L1a
            goto L2e
        L2d:
            r4 = r6
        L2e:
            if (r4 != 0) goto Lbb
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r10 = r1.e
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r0.d()
            java.lang.Object r4 = r4.s(r10)
            if (r4 == 0) goto L42
            com.fasterxml.jackson.databind.JsonSerializer r10 = r9.I(r10, r4)
            r4 = r10
            goto L43
        L42:
            r4 = r6
        L43:
            if (r4 != 0) goto Lbb
            com.fasterxml.jackson.databind.ser.std.StdSerializer r4 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.b(r2)
            if (r4 != 0) goto Lbb
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector r10 = r1.b
            if (r10 != 0) goto L50
            goto L8b
        L50:
            boolean r4 = r10.i
            if (r4 != 0) goto L57
            r10.h()
        L57:
            java.util.LinkedList r4 = r10.q
            if (r4 == 0) goto L8b
            int r4 = r4.size()
            r5 = 0
            r7 = 1
            if (r4 <= r7) goto L82
            java.util.LinkedList r4 = r10.q
            boolean r4 = com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.g(r4)
            if (r4 == 0) goto L6c
            goto L82
        L6c:
            java.util.LinkedList r9 = r10.q
            java.lang.Object r9 = r9.get(r5)
            java.util.LinkedList r0 = r10.q
            java.lang.Object r0 = r0.get(r7)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r0}
            java.lang.String r0 = "Multiple 'as-key' properties defined (%s vs %s)"
            r10.i(r0, r9)
            throw r6
        L82:
            java.util.LinkedList r10 = r10.q
            java.lang.Object r10 = r10.get(r5)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r10 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r10
            goto L8c
        L8b:
            r10 = r6
        L8c:
            if (r10 != 0) goto L92
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r10 = r1.h()
        L92:
            if (r10 == 0) goto Lb7
            com.fasterxml.jackson.databind.JavaType r1 = r10.f()
            com.fasterxml.jackson.databind.JsonSerializer r9 = r8.b(r9, r1)
            com.fasterxml.jackson.databind.MapperFeature r1 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r1 = r0.m(r1)
            if (r1 == 0) goto Lb1
            java.lang.reflect.Member r1 = r10.j()
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r0 = r0.m(r2)
            com.fasterxml.jackson.databind.util.ClassUtil.e(r1, r0)
        Lb1:
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r4 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r4.<init>(r10, r6, r9)
            goto Lbb
        Lb7:
            com.fasterxml.jackson.databind.ser.std.StdSerializer r4 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.a(r0, r2)
        Lbb:
            boolean r9 = r3.a()
            if (r9 == 0) goto Ld5
            com.fasterxml.jackson.databind.util.ArrayIterator r9 = r3.b()
        Lc5:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Ld5
            java.lang.Object r10 = r9.next()
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier r10 = (com.fasterxml.jackson.databind.ser.BeanSerializerModifier) r10
            r10.getClass()
            goto Lc5
        Ld5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.b(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public final TypeSerializer d(SerializationConfig serializationConfig, JavaType javaType) {
        ArrayList arrayList;
        AnnotatedClass annotatedClass = ((BasicBeanDescription) serializationConfig.l(javaType.d)).e;
        TypeResolverBuilder typeResolverBuilderB0 = serializationConfig.d().b0(javaType, serializationConfig, annotatedClass);
        if (typeResolverBuilderB0 == null) {
            serializationConfig.e.getClass();
            arrayList = null;
            typeResolverBuilderB0 = null;
        } else {
            serializationConfig.g.getClass();
            AnnotationIntrospector annotationIntrospectorD = serializationConfig.d();
            HashMap map = new HashMap();
            StdSubtypeResolver.a(annotatedClass, new NamedType(annotatedClass.e, null), serializationConfig, annotationIntrospectorD, map);
            arrayList = new ArrayList(map.values());
        }
        if (typeResolverBuilderB0 == null) {
            return null;
        }
        return typeResolverBuilderB0.d(serializationConfig, javaType, arrayList);
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public final SerializerFactory e(Serializers serializers) {
        if (serializers == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        SerializerFactoryConfig serializerFactoryConfig = this.d;
        return j(new SerializerFactoryConfig((Serializers[]) ArrayBuilders.b(serializerFactoryConfig.d, serializers), serializerFactoryConfig.e, serializerFactoryConfig.f));
    }

    public final StdSerializer g(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) {
        if (JsonSerializable.class.isAssignableFrom(javaType.d)) {
            return SerializableSerializer.f;
        }
        AnnotatedMember annotatedMemberH = beanDescription.h();
        if (annotatedMemberH == null) {
            return null;
        }
        SerializationConfig serializationConfig = serializerProvider.d;
        serializationConfig.getClass();
        if (serializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            ClassUtil.e(annotatedMemberH.j(), serializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        JavaType javaTypeF = annotatedMemberH.f();
        JsonSerializer jsonSerializerH = h(serializerProvider, annotatedMemberH);
        if (jsonSerializerH == null) {
            jsonSerializerH = (JsonSerializer) javaTypeF.f;
        }
        TypeSerializer typeSerializerD = (TypeSerializer) javaTypeF.g;
        if (typeSerializerD == null) {
            typeSerializerD = d(serializationConfig, javaTypeF);
        }
        return new JsonValueSerializer(annotatedMemberH, typeSerializerD, jsonSerializerH);
    }

    public abstract BeanSerializerFactory j(SerializerFactoryConfig serializerFactoryConfig);
}
