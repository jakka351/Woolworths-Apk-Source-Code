package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumValues;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class BeanSerializerBase extends StdSerializer<Object> implements ContextualSerializer, ResolvableSerializer, JsonFormatVisitable, SchemaAware {
    public static final BeanPropertyWriter[] n;
    public final JavaType f;
    public final BeanPropertyWriter[] g;
    public final BeanPropertyWriter[] h;
    public final AnyGetterWriter i;
    public final Object j;
    public final AnnotatedMember k;
    public final ObjectIdWriter l;
    public final JsonFormat.Shape m;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14318a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f14318a = iArr;
            try {
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14318a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14318a[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        new PropertyName("#object-ref", null);
        n = new BeanPropertyWriter[0];
    }

    public BeanSerializerBase(JavaType javaType, BeanSerializerBuilder beanSerializerBuilder, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType);
        this.f = javaType;
        this.g = beanPropertyWriterArr;
        this.h = beanPropertyWriterArr2;
        this.k = beanSerializerBuilder.g;
        this.i = beanSerializerBuilder.e;
        this.j = beanSerializerBuilder.f;
        this.l = beanSerializerBuilder.h;
        this.m = beanSerializerBuilder.f14303a.f().e;
    }

    public static final BeanPropertyWriter[] s(BeanPropertyWriter[] beanPropertyWriterArr, NameTransformer nameTransformer) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == 0 || nameTransformer == null || nameTransformer == NameTransformer.d) {
            return beanPropertyWriterArr;
        }
        int length = beanPropertyWriterArr.length;
        BeanPropertyWriter[] beanPropertyWriterArr2 = new BeanPropertyWriter[length];
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (beanPropertyWriter != null) {
                beanPropertyWriterArr2[i] = beanPropertyWriter.i(nameTransformer);
            }
        }
        return beanPropertyWriterArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    @Override // com.fasterxml.jackson.databind.ser.ResolvableSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fasterxml.jackson.databind.SerializerProvider r11) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r10 = this;
            r0 = 0
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r1 = r10.h
            if (r1 != 0) goto L7
            r2 = r0
            goto L8
        L7:
            int r2 = r1.length
        L8:
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r3 = r10.g
            int r4 = r3.length
        Lb:
            if (r0 >= r4) goto La8
            r5 = r3[r0]
            boolean r6 = r5.s
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r7 = r5.l
            if (r6 != 0) goto L2a
            com.fasterxml.jackson.databind.JsonSerializer r6 = r5.p
            if (r6 == 0) goto L1a
            goto L2a
        L1a:
            com.fasterxml.jackson.databind.ser.std.NullSerializer r6 = r11.i
            if (r6 == 0) goto L2a
            r5.g(r6)
            if (r0 >= r2) goto L2a
            r8 = r1[r0]
            if (r8 == 0) goto L2a
            r8.g(r6)
        L2a:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r5.o
            if (r6 == 0) goto L30
            goto La4
        L30:
            com.fasterxml.jackson.databind.SerializationConfig r6 = r11.d
            com.fasterxml.jackson.databind.AnnotationIntrospector r6 = r6.d()
            r8 = 0
            if (r7 == 0) goto L5c
            java.lang.Object r6 = r6.T(r7)
            if (r6 == 0) goto L5c
            com.fasterxml.jackson.databind.util.Converter r6 = r11.c(r6)
            com.fasterxml.jackson.databind.type.TypeFactory r7 = r11.e()
            com.fasterxml.jackson.databind.JavaType r7 = r6.c(r7)
            boolean r9 = r7.D()
            if (r9 == 0) goto L52
            goto L56
        L52:
            com.fasterxml.jackson.databind.JsonSerializer r8 = r11.x(r7, r5)
        L56:
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer r9 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer
            r9.<init>(r6, r7, r8)
            r8 = r9
        L5c:
            if (r8 != 0) goto L97
            com.fasterxml.jackson.databind.JavaType r6 = r5.i
            if (r6 != 0) goto L79
            com.fasterxml.jackson.databind.JavaType r6 = r5.h
            boolean r7 = r6.C()
            if (r7 != 0) goto L79
            boolean r7 = r6.z()
            if (r7 != 0) goto L76
            int r7 = r6.e()
            if (r7 <= 0) goto La4
        L76:
            r5.j = r6
            goto La4
        L79:
            com.fasterxml.jackson.databind.JsonSerializer r8 = r11.x(r6, r5)
            boolean r7 = r6.z()
            if (r7 == 0) goto L97
            com.fasterxml.jackson.databind.JavaType r6 = r6.k()
            java.lang.Object r6 = r6.g
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r6 = (com.fasterxml.jackson.databind.jsontype.TypeSerializer) r6
            if (r6 == 0) goto L97
            boolean r7 = r8 instanceof com.fasterxml.jackson.databind.ser.ContainerSerializer
            if (r7 == 0) goto L97
            com.fasterxml.jackson.databind.ser.ContainerSerializer r8 = (com.fasterxml.jackson.databind.ser.ContainerSerializer) r8
            com.fasterxml.jackson.databind.ser.ContainerSerializer r8 = r8.o(r6)
        L97:
            if (r0 >= r2) goto La1
            r6 = r1[r0]
            if (r6 == 0) goto La1
            r6.h(r8)
            goto La4
        La1:
            r5.h(r8)
        La4:
            int r0 = r0 + 1
            goto Lb
        La8:
            com.fasterxml.jackson.databind.ser.AnyGetterWriter r0 = r10.i
            if (r0 == 0) goto Lc2
            com.fasterxml.jackson.databind.JsonSerializer r1 = r0.c
            boolean r2 = r1 instanceof com.fasterxml.jackson.databind.ser.ContextualSerializer
            if (r2 == 0) goto Lc2
            com.fasterxml.jackson.databind.BeanProperty$Std r2 = r0.f14301a
            com.fasterxml.jackson.databind.JsonSerializer r11 = r11.C(r1, r2)
            r0.c = r11
            boolean r1 = r11 instanceof com.fasterxml.jackson.databind.ser.std.MapSerializer
            if (r1 == 0) goto Lc2
            com.fasterxml.jackson.databind.ser.std.MapSerializer r11 = (com.fasterxml.jackson.databind.ser.std.MapSerializer) r11
            r0.d = r11
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.a(com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) throws InvalidDefinitionException {
        JsonFormat.Shape shape;
        Object obj;
        JsonFormat.Shape shape2;
        int i;
        ObjectIdWriter objectIdWriterA;
        int i2;
        Set set;
        Set set2;
        BeanSerializerBase beanSerializerBaseX;
        BeanPropertyWriter[] beanPropertyWriterArr;
        Class cls;
        JavaType javaTypeK;
        Object obj2;
        ObjectIdInfo objectIdInfoB;
        JsonFormat.Shape shape3;
        SerializationConfig serializationConfig = serializerProvider.d;
        AnnotationIntrospector annotationIntrospectorD = serializationConfig.d();
        Object objM = null;
        AnnotatedMember annotatedMemberA = beanProperty != null ? beanProperty.a() : null;
        Class cls2 = this.d;
        JsonFormat.Value valueK = StdSerializer.k(serializerProvider, beanProperty, cls2);
        JsonFormat.Shape shape4 = this.m;
        if (valueK == null || (shape = valueK.e) == (shape3 = JsonFormat.Shape.d)) {
            shape = null;
        } else if (shape != shape3 && shape != shape4) {
            JavaType javaType = this.f;
            if (javaType.B()) {
                int iOrdinal = shape.ordinal();
                if (iOrdinal == 5 || iOrdinal == 7 || iOrdinal == 8) {
                    serializationConfig.e.e.a(serializationConfig, javaType, serializationConfig);
                    Class cls3 = javaType.d;
                    return serializerProvider.C(new EnumSerializer(EnumValues.a(serializationConfig, cls3), EnumSerializer.o(cls3, valueK, true, null)), beanProperty);
                }
            } else if (shape == JsonFormat.Shape.e && ((!javaType.E() || !Map.class.isAssignableFrom(cls2)) && Map.Entry.class.isAssignableFrom(cls2))) {
                JavaType javaTypeI = javaType.i(Map.Entry.class);
                return serializerProvider.C(new MapEntrySerializer(this.f, javaTypeI.f(0), javaTypeI.f(1), false, null, beanProperty), beanProperty);
            }
        }
        BeanPropertyWriter[] beanPropertyWriterArr2 = this.g;
        ObjectIdWriter objectIdWriter = this.l;
        if (annotatedMemberA != null) {
            JsonIgnoreProperties.Value valueJ = annotationIntrospectorD.J(annotatedMemberA);
            set = valueJ.f ? Collections.EMPTY_SET : valueJ.d;
            set2 = annotationIntrospectorD.M(annotatedMemberA).d;
            ObjectIdInfo objectIdInfoZ = annotationIntrospectorD.z(annotatedMemberA);
            if (objectIdInfoZ == null) {
                if (objectIdWriter == null || (objectIdInfoB = annotationIntrospectorD.B(annotatedMemberA, null)) == null) {
                    i = 0;
                    objectIdWriterA = objectIdWriter;
                } else {
                    boolean z = objectIdInfoB.e;
                    if (z == objectIdWriter.e) {
                        objectIdWriterA = objectIdWriter;
                        i = 0;
                    } else {
                        i = 0;
                        objectIdWriterA = new ObjectIdWriter(objectIdWriter.f14308a, objectIdWriter.b, objectIdWriter.c, objectIdWriter.d, z);
                    }
                }
                shape2 = shape4;
                i2 = i;
                obj = null;
            } else {
                i = 0;
                ObjectIdInfo objectIdInfoB2 = annotationIntrospectorD.B(annotatedMemberA, objectIdInfoZ);
                Class cls4 = objectIdInfoB2.b;
                boolean z2 = objectIdInfoB2.e;
                PropertyName propertyName = objectIdInfoB2.f14277a;
                if (cls4 == null) {
                    cls = cls2;
                    javaTypeK = null;
                } else {
                    cls = cls2;
                    javaTypeK = serializerProvider.e().k(cls4);
                }
                serializerProvider.e().getClass();
                shape2 = shape4;
                JavaType javaType2 = TypeFactory.m(javaTypeK, ObjectIdGenerator.class)[0];
                if (cls4 == ObjectIdGenerators.PropertyGenerator.class) {
                    String str = propertyName.d;
                    int length = beanPropertyWriterArr2.length;
                    i2 = 0;
                    while (i2 != length) {
                        BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr2[i2];
                        int i3 = length;
                        if (str.equals(beanPropertyWriter.f.d)) {
                            objectIdWriterA = ObjectIdWriter.a(beanPropertyWriter.h, null, new PropertyBasedObjectIdGenerator(beanPropertyWriter, objectIdInfoB2.d), z2);
                            obj = null;
                        } else {
                            i2++;
                            length = i3;
                        }
                    }
                    serializerProvider.j("Invalid Object Id definition for " + ClassUtil.B(cls) + ": cannot find property with name " + ClassUtil.A(str));
                    throw null;
                }
                obj = null;
                objectIdWriterA = ObjectIdWriter.a(javaType2, propertyName, serializerProvider.g(objectIdInfoB2), z2);
                i2 = 0;
            }
            objM = annotationIntrospectorD.m(annotatedMemberA);
            if (objM == null || ((obj2 = this.j) != null && objM.equals(obj2))) {
                objM = obj;
            }
        } else {
            obj = null;
            shape2 = shape4;
            i = 0;
            objectIdWriterA = objectIdWriter;
            i2 = 0;
            set = null;
            set2 = null;
        }
        if (i2 > 0) {
            BeanPropertyWriter[] beanPropertyWriterArr3 = (BeanPropertyWriter[]) Arrays.copyOf(beanPropertyWriterArr2, beanPropertyWriterArr2.length);
            BeanPropertyWriter beanPropertyWriter2 = beanPropertyWriterArr3[i2];
            int i4 = i;
            System.arraycopy(beanPropertyWriterArr3, i4, beanPropertyWriterArr3, 1, i2);
            beanPropertyWriterArr3[i4] = beanPropertyWriter2;
            BeanPropertyWriter[] beanPropertyWriterArr4 = this.h;
            if (beanPropertyWriterArr4 == null) {
                beanPropertyWriterArr = obj;
            } else {
                beanPropertyWriterArr = (BeanPropertyWriter[]) Arrays.copyOf(beanPropertyWriterArr4, beanPropertyWriterArr4.length);
                BeanPropertyWriter beanPropertyWriter3 = beanPropertyWriterArr[i2];
                System.arraycopy(beanPropertyWriterArr, i4, beanPropertyWriterArr, 1, i2);
                beanPropertyWriterArr[i4] = beanPropertyWriter3;
            }
            beanSerializerBaseX = z(beanPropertyWriterArr3, beanPropertyWriterArr);
        } else {
            beanSerializerBaseX = this;
        }
        if (objectIdWriterA != null) {
            ObjectIdWriter objectIdWriter2 = new ObjectIdWriter(objectIdWriterA.f14308a, objectIdWriterA.b, objectIdWriterA.c, serializerProvider.x(objectIdWriterA.f14308a, beanProperty), objectIdWriterA.e);
            if (objectIdWriter2 != objectIdWriter) {
                beanSerializerBaseX = beanSerializerBaseX.y(objectIdWriter2);
            }
        }
        if ((set != null && !set.isEmpty()) || set2 != null) {
            beanSerializerBaseX = beanSerializerBaseX.w(set, set2);
        }
        if (objM != null) {
            beanSerializerBaseX = beanSerializerBaseX.x(objM);
        }
        return (shape == null ? shape2 : shape) == JsonFormat.Shape.g ? beanSerializerBaseX.r() : beanSerializerBaseX;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        if (this.l != null) {
            o(obj, jsonGenerator, serializerProvider, typeSerializer);
            return;
        }
        WritableTypeId writableTypeIdQ = q(typeSerializer, obj, JsonToken.START_OBJECT);
        typeSerializer.e(jsonGenerator, writableTypeIdQ);
        jsonGenerator.i(obj);
        if (this.j != null) {
            u(obj, jsonGenerator, serializerProvider);
            throw null;
        }
        t(obj, jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeIdQ);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean i() {
        return this.l != null;
    }

    public final void o(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        ObjectIdWriter objectIdWriter = this.l;
        WritableObjectId writableObjectIdS = serializerProvider.s(obj, objectIdWriter.c);
        if (writableObjectIdS.b(jsonGenerator, serializerProvider, objectIdWriter)) {
            return;
        }
        if (writableObjectIdS.b == null) {
            writableObjectIdS.b = writableObjectIdS.f14317a.c(obj);
        }
        Object obj2 = writableObjectIdS.b;
        if (objectIdWriter.e) {
            objectIdWriter.d.f(obj2, jsonGenerator, serializerProvider);
            return;
        }
        WritableTypeId writableTypeIdQ = q(typeSerializer, obj, JsonToken.START_OBJECT);
        typeSerializer.e(jsonGenerator, writableTypeIdQ);
        jsonGenerator.i(obj);
        writableObjectIdS.a(jsonGenerator, serializerProvider, objectIdWriter);
        if (this.j != null) {
            u(obj, jsonGenerator, serializerProvider);
            throw null;
        }
        t(obj, jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeIdQ);
    }

    public final void p(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, boolean z) {
        ObjectIdWriter objectIdWriter = this.l;
        WritableObjectId writableObjectIdS = serializerProvider.s(obj, objectIdWriter.c);
        if (writableObjectIdS.b(jsonGenerator, serializerProvider, objectIdWriter)) {
            return;
        }
        if (writableObjectIdS.b == null) {
            writableObjectIdS.b = writableObjectIdS.f14317a.c(obj);
        }
        Object obj2 = writableObjectIdS.b;
        if (objectIdWriter.e) {
            objectIdWriter.d.f(obj2, jsonGenerator, serializerProvider);
            return;
        }
        if (z) {
            jsonGenerator.x1(obj);
        }
        writableObjectIdS.a(jsonGenerator, serializerProvider, objectIdWriter);
        if (this.j != null) {
            u(obj, jsonGenerator, serializerProvider);
            throw null;
        }
        t(obj, jsonGenerator, serializerProvider);
        if (z) {
            jsonGenerator.H();
        }
    }

    public final WritableTypeId q(TypeSerializer typeSerializer, Object obj, JsonToken jsonToken) {
        AnnotatedMember annotatedMember = this.k;
        if (annotatedMember == null) {
            return typeSerializer.d(jsonToken, obj);
        }
        Object objK = annotatedMember.k(obj);
        if (objK == null) {
            objK = "";
        }
        WritableTypeId writableTypeIdD = typeSerializer.d(jsonToken, obj);
        writableTypeIdD.c = objK;
        return writableTypeIdD;
    }

    public abstract BeanSerializerBase r();

    public final void t(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this.h != null) {
            serializerProvider.getClass();
        }
        BeanPropertyWriter[] beanPropertyWriterArr = this.g;
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.k(obj, jsonGenerator, serializerProvider);
                }
                i++;
            }
            AnyGetterWriter anyGetterWriter = this.i;
            if (anyGetterWriter != null) {
                anyGetterWriter.a(obj, jsonGenerator, serializerProvider);
            }
        } catch (Exception e) {
            StdSerializer.n(serializerProvider, e, obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].f.d : "[anySetter]");
            throw null;
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.e(obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].f.d : "[anySetter]");
            throw jsonMappingException;
        }
    }

    public final void u(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this.h != null) {
            serializerProvider.getClass();
        }
        l(serializerProvider, this.j, obj);
        throw null;
    }

    public abstract BeanSerializerBase w(Set set, Set set2);

    public abstract BeanSerializerBase x(Object obj);

    public abstract BeanSerializerBase y(ObjectIdWriter objectIdWriter);

    public abstract BeanSerializerBase z(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2);

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase.d);
        this.f = beanSerializerBase.f;
        this.g = beanPropertyWriterArr;
        this.h = beanPropertyWriterArr2;
        this.k = beanSerializerBase.k;
        this.i = beanSerializerBase.i;
        this.l = beanSerializerBase.l;
        this.j = beanSerializerBase.j;
        this.m = beanSerializerBase.m;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, ObjectIdWriter objectIdWriter, Object obj) {
        super(beanSerializerBase.d);
        this.f = beanSerializerBase.f;
        this.g = beanSerializerBase.g;
        this.h = beanSerializerBase.h;
        this.k = beanSerializerBase.k;
        this.i = beanSerializerBase.i;
        this.l = objectIdWriter;
        this.j = obj;
        this.m = beanSerializerBase.m;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set set, Set set2) {
        super(beanSerializerBase.d);
        this.f = beanSerializerBase.f;
        BeanPropertyWriter[] beanPropertyWriterArr = beanSerializerBase.g;
        BeanPropertyWriter[] beanPropertyWriterArr2 = beanSerializerBase.h;
        int length = beanPropertyWriterArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = beanPropertyWriterArr2 == null ? null : new ArrayList(length);
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (!IgnorePropertiesUtil.b(beanPropertyWriter.f.d, set, set2)) {
                arrayList.add(beanPropertyWriter);
                if (beanPropertyWriterArr2 != null) {
                    arrayList2.add(beanPropertyWriterArr2[i]);
                }
            }
        }
        this.g = (BeanPropertyWriter[]) arrayList.toArray(new BeanPropertyWriter[arrayList.size()]);
        this.h = arrayList2 != null ? (BeanPropertyWriter[]) arrayList2.toArray(new BeanPropertyWriter[arrayList2.size()]) : null;
        this.k = beanSerializerBase.k;
        this.i = beanSerializerBase.i;
        this.l = beanSerializerBase.l;
        this.j = beanSerializerBase.j;
        this.m = beanSerializerBase.m;
    }
}
