package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class JsonValueSerializer extends StdSerializer<Object> implements ContextualSerializer, JsonFormatVisitable, SchemaAware {
    public final AnnotatedMember f;
    public final TypeSerializer g;
    public final JsonSerializer h;
    public final BeanProperty i;
    public final JavaType j;
    public final boolean k;
    public transient PropertySerializerMap l;

    public static class TypeSerializerRerouter extends TypeSerializer {

        /* renamed from: a, reason: collision with root package name */
        public final TypeSerializer f14319a;
        public final Object b;

        public TypeSerializerRerouter(TypeSerializer typeSerializer, Object obj) {
            this.f14319a = typeSerializer;
            this.b = obj;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final TypeSerializer a(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final String b() {
            return this.f14319a.b();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final JsonTypeInfo.As c() {
            return this.f14319a.c();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final WritableTypeId e(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
            writableTypeId.f14217a = this.b;
            return this.f14319a.e(jsonGenerator, writableTypeId);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public final WritableTypeId f(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
            return this.f14319a.f(jsonGenerator, writableTypeId);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, boolean z) {
        Class cls = jsonValueSerializer.d;
        super(cls == null ? Object.class : cls);
        this.f = jsonValueSerializer.f;
        this.j = jsonValueSerializer.j;
        this.g = typeSerializer;
        this.h = jsonSerializer;
        this.i = beanProperty;
        this.k = z;
        this.l = PropertySerializerMap.a();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        TypeSerializer typeSerializerA = this.g;
        if (typeSerializerA != null) {
            typeSerializerA = typeSerializerA.a(beanProperty);
        }
        boolean z = this.k;
        JsonSerializer jsonSerializer = this.h;
        if (jsonSerializer != null) {
            return p(beanProperty, typeSerializerA, serializerProvider.C(jsonSerializer, beanProperty), z);
        }
        boolean zM = serializerProvider.d.m(MapperFeature.USE_STATIC_TYPING);
        JavaType javaType = this.j;
        if (!zM && !javaType.C()) {
            return beanProperty != this.i ? p(beanProperty, typeSerializerA, jsonSerializer, z) : this;
        }
        JsonSerializer jsonSerializerT = serializerProvider.t(javaType, beanProperty);
        Class cls = javaType.d;
        boolean zX = false;
        if (!cls.isPrimitive() ? cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class : cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE) {
            zX = ClassUtil.x(jsonSerializerT);
        }
        return p(beanProperty, typeSerializerA, jsonSerializerT, zX);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        Object objK = this.f.k(obj);
        if (objK == null) {
            return true;
        }
        JsonSerializer jsonSerializerO = this.h;
        if (jsonSerializerO == null) {
            try {
                jsonSerializerO = o(serializerProvider, objK.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        return jsonSerializerO.d(serializerProvider, objK);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        AnnotatedMember annotatedMember = this.f;
        try {
            Object objK = annotatedMember.k(obj);
            if (objK == null) {
                serializerProvider.o(jsonGenerator);
                return;
            }
            JsonSerializer jsonSerializerO = this.h;
            if (jsonSerializerO == null) {
                jsonSerializerO = o(serializerProvider, objK.getClass());
            }
            TypeSerializer typeSerializer = this.g;
            if (typeSerializer != null) {
                jsonSerializerO.g(objK, jsonGenerator, serializerProvider, typeSerializer);
            } else {
                jsonSerializerO.f(objK, jsonGenerator, serializerProvider);
            }
        } catch (Exception e) {
            StdSerializer.n(serializerProvider, e, obj, annotatedMember.d() + "()");
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        AnnotatedMember annotatedMember = this.f;
        try {
            Object objK = annotatedMember.k(obj);
            if (objK == null) {
                serializerProvider.o(jsonGenerator);
                return;
            }
            JsonSerializer jsonSerializerO = this.h;
            if (jsonSerializerO == null) {
                jsonSerializerO = o(serializerProvider, objK.getClass());
            } else if (this.k) {
                WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.VALUE_STRING, obj));
                jsonSerializerO.f(objK, jsonGenerator, serializerProvider);
                typeSerializer.f(jsonGenerator, writableTypeIdE);
                return;
            }
            jsonSerializerO.g(objK, jsonGenerator, serializerProvider, new TypeSerializerRerouter(typeSerializer, obj));
        } catch (Exception e) {
            StdSerializer.n(serializerProvider, e, obj, annotatedMember.d() + "()");
            throw null;
        }
    }

    public final JsonSerializer o(SerializerProvider serializerProvider, Class cls) {
        JsonSerializer jsonSerializerD = this.l.d(cls);
        if (jsonSerializerD != null) {
            return jsonSerializerD;
        }
        JavaType javaType = this.j;
        boolean zS = javaType.s();
        BeanProperty beanProperty = this.i;
        if (!zS) {
            JsonSerializer jsonSerializerU = serializerProvider.u(cls, beanProperty);
            this.l = this.l.c(cls, jsonSerializerU);
            return jsonSerializerU;
        }
        JavaType javaTypeN = serializerProvider.n(javaType, cls);
        JsonSerializer jsonSerializerT = serializerProvider.t(javaTypeN, beanProperty);
        PropertySerializerMap propertySerializerMap = this.l;
        propertySerializerMap.getClass();
        this.l = propertySerializerMap.c(javaTypeN.d, jsonSerializerT);
        return jsonSerializerT;
    }

    public final JsonValueSerializer p(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, boolean z) {
        return (this.i == beanProperty && this.g == typeSerializer && this.h == jsonSerializer && z == this.k) ? this : new JsonValueSerializer(this, beanProperty, typeSerializer, jsonSerializer, z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(@JsonValue serializer for method ");
        AnnotatedMember annotatedMember = this.f;
        sb.append(annotatedMember.h());
        sb.append("#");
        sb.append(annotatedMember.d());
        sb.append(")");
        return sb.toString();
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super(annotatedMember.f());
        this.f = annotatedMember;
        this.j = annotatedMember.f();
        this.g = typeSerializer;
        this.h = jsonSerializer;
        this.i = null;
        this.k = true;
        this.l = PropertySerializerMap.a();
    }
}
