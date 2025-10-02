package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class StringArraySerializer extends ArraySerializerBase<String[]> implements ContextualSerializer {
    public static final StringArraySerializer i;
    public final JsonSerializer h;

    static {
        TypeFactory.g.getClass();
        TypeFactory.n(String.class);
        i = new StringArraySerializer();
    }

    public StringArraySerializer() {
        super(String[].class);
        this.h = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonSerializer b(com.fasterxml.jackson.databind.SerializerProvider r5, com.fasterxml.jackson.databind.BeanProperty r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L1a
            com.fasterxml.jackson.databind.SerializationConfig r1 = r5.d
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r1.d()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r2 = r6.a()
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r1.d(r2)
            if (r1 == 0) goto L1a
            com.fasterxml.jackson.databind.JsonSerializer r1 = r5.I(r2, r1)
            goto L1b
        L1a:
            r1 = r0
        L1b:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = com.fasterxml.jackson.databind.ser.std.StdSerializer.k(r5, r6, r2)
            if (r2 == 0) goto L2a
            com.fasterxml.jackson.annotation.JsonFormat$Feature r3 = com.fasterxml.jackson.annotation.JsonFormat.Feature.f
            java.lang.Boolean r2 = r2.b(r3)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r4.h
            if (r1 != 0) goto L30
            r1 = r3
        L30:
            com.fasterxml.jackson.databind.JsonSerializer r1 = com.fasterxml.jackson.databind.ser.std.StdSerializer.j(r5, r6, r1)
            if (r1 != 0) goto L3c
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.fasterxml.jackson.databind.JsonSerializer r1 = r5.q(r1, r6)
        L3c:
            boolean r5 = com.fasterxml.jackson.databind.util.ClassUtil.x(r1)
            if (r5 == 0) goto L43
            goto L44
        L43:
            r0 = r1
        L44:
            if (r0 != r3) goto L4f
            java.lang.Boolean r5 = r4.g
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L4f
            return r4
        L4f:
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r5 = new com.fasterxml.jackson.databind.ser.impl.StringArraySerializer
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.b(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        return ((String[]) obj).length == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r5, com.fasterxml.jackson.core.JsonGenerator r6, com.fasterxml.jackson.databind.SerializerProvider r7) {
        /*
            r4 = this;
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r0 = r5.length
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.Boolean r1 = r4.g
            if (r1 != 0) goto L14
            com.fasterxml.jackson.databind.SerializationFeature r2 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            com.fasterxml.jackson.databind.SerializationConfig r3 = r7.d
            boolean r2 = r3.r(r2)
            if (r2 != 0) goto L18
        L14:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            if (r1 != r2) goto L1c
        L18:
            r4.s(r5, r6, r7)
            return
        L1c:
            r6.a1(r0, r5)
            r4.s(r5, r6, r7)
            r6.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.f(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final ContainerSerializer o(TypeSerializer typeSerializer) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final boolean p(Object obj) {
        return ((String[]) obj).length == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public final JsonSerializer r(BeanProperty beanProperty, Boolean bool) {
        return new StringArraySerializer(this, beanProperty, this.h, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void s(String[] strArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int length = strArr.length;
        if (length == 0) {
            return;
        }
        int i2 = 0;
        JsonSerializer jsonSerializer = this.h;
        if (jsonSerializer == null) {
            while (i2 < length) {
                String str = strArr[i2];
                if (str == null) {
                    jsonGenerator.Y();
                } else {
                    jsonGenerator.J1(str);
                }
                i2++;
            }
            return;
        }
        int length2 = strArr.length;
        while (i2 < length2) {
            String str2 = strArr[i2];
            if (str2 == null) {
                serializerProvider.o(jsonGenerator);
            } else {
                jsonSerializer.f(str2, jsonGenerator, serializerProvider);
            }
            i2++;
        }
    }

    public StringArraySerializer(StringArraySerializer stringArraySerializer, BeanProperty beanProperty, JsonSerializer jsonSerializer, Boolean bool) {
        super(stringArraySerializer, beanProperty, bool);
        this.h = jsonSerializer;
    }
}
