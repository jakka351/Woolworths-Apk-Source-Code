package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;

/* loaded from: classes4.dex */
public abstract class AsArraySerializerBase<T> extends ContainerSerializer<T> implements ContextualSerializer {
    public final JavaType f;
    public final BeanProperty g;
    public final boolean h;
    public final Boolean i;
    public final TypeSerializer j;
    public final JsonSerializer k;
    public PropertySerializerMap l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(Class cls, JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super(cls, 0);
        boolean z2 = false;
        this.f = javaType;
        if (z || (javaType != null && javaType.C())) {
            z2 = true;
        }
        this.h = z2;
        this.j = typeSerializer;
        this.g = null;
        this.k = jsonSerializer;
        this.l = PropertySerializerMap.a();
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonSerializer b(com.fasterxml.jackson.databind.SerializerProvider r8, com.fasterxml.jackson.databind.BeanProperty r9) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r7.j
            if (r0 == 0) goto L9
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r1 = r0.a(r9)
            goto La
        L9:
            r1 = r0
        La:
            r2 = 0
            if (r9 == 0) goto L24
            com.fasterxml.jackson.databind.SerializationConfig r3 = r8.d
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r3.d()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r4 = r9.a()
            if (r4 == 0) goto L24
            java.lang.Object r3 = r3.d(r4)
            if (r3 == 0) goto L24
            com.fasterxml.jackson.databind.JsonSerializer r3 = r8.I(r4, r3)
            goto L25
        L24:
            r3 = r2
        L25:
            java.lang.Class r4 = r7.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r4 = com.fasterxml.jackson.databind.ser.std.StdSerializer.k(r8, r9, r4)
            if (r4 == 0) goto L33
            com.fasterxml.jackson.annotation.JsonFormat$Feature r2 = com.fasterxml.jackson.annotation.JsonFormat.Feature.f
            java.lang.Boolean r2 = r4.b(r2)
        L33:
            com.fasterxml.jackson.databind.JsonSerializer r4 = r7.k
            if (r3 != 0) goto L38
            r3 = r4
        L38:
            com.fasterxml.jackson.databind.JsonSerializer r3 = com.fasterxml.jackson.databind.ser.std.StdSerializer.j(r8, r9, r3)
            if (r3 != 0) goto L50
            com.fasterxml.jackson.databind.JavaType r5 = r7.f
            if (r5 == 0) goto L50
            boolean r6 = r7.h
            if (r6 == 0) goto L50
            boolean r6 = r5.D()
            if (r6 != 0) goto L50
            com.fasterxml.jackson.databind.JsonSerializer r3 = r8.p(r5, r9)
        L50:
            if (r3 != r4) goto L62
            com.fasterxml.jackson.databind.BeanProperty r8 = r7.g
            if (r9 != r8) goto L62
            if (r0 != r1) goto L62
            java.lang.Boolean r8 = r7.i
            boolean r8 = java.util.Objects.equals(r8, r2)
            if (r8 != 0) goto L61
            goto L62
        L61:
            return r7
        L62:
            com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase r8 = r7.s(r9, r1, r3, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase.b(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (serializerProvider.d.r(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && p(obj)) {
            r(obj, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.b1(obj);
        r(obj, jsonGenerator, serializerProvider);
        jsonGenerator.F();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_ARRAY, obj));
        jsonGenerator.i(obj);
        r(obj, jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }

    public final JsonSerializer q(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) {
        PropertySerializerMap.SerializerAndMapResult serializerAndMapResultB = propertySerializerMap.b(javaType, serializerProvider, this.g);
        PropertySerializerMap propertySerializerMap2 = serializerAndMapResultB.b;
        if (propertySerializerMap != propertySerializerMap2) {
            this.l = propertySerializerMap2;
        }
        return serializerAndMapResultB.f14312a;
    }

    public abstract void r(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public abstract AsArraySerializerBase s(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool);

    public AsArraySerializerBase(AsArraySerializerBase asArraySerializerBase, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool) {
        super(asArraySerializerBase.d, 0);
        this.f = asArraySerializerBase.f;
        this.h = asArraySerializerBase.h;
        this.j = typeSerializer;
        this.g = beanProperty;
        this.k = jsonSerializer;
        this.l = PropertySerializerMap.a();
        this.i = bool;
    }
}
