package com.fasterxml.jackson.databind.jsontype.impl;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class TypeDeserializerBase extends TypeDeserializer implements Serializable {
    public final TypeIdResolver d;
    public final JavaType e;
    public final BeanProperty f;
    public final JavaType g;
    public final String h;
    public final boolean i;
    public final ConcurrentHashMap j;
    public JsonDeserializer k;

    public TypeDeserializerBase(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        this.e = javaType;
        this.d = typeIdResolver;
        Annotation[] annotationArr = ClassUtil.f14330a;
        this.h = str == null ? "" : str;
        this.i = z;
        this.j = new ConcurrentHashMap(16, 0.75f, 2);
        this.g = javaType2;
        this.f = null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final Class g() {
        Annotation[] annotationArr = ClassUtil.f14330a;
        JavaType javaType = this.g;
        if (javaType == null) {
            return null;
        }
        return javaType.d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final String h() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final TypeIdResolver i() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final boolean k() {
        return this.g != null;
    }

    public final Object l(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return n(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj)).e(jsonParser, deserializationContext);
    }

    public final JsonDeserializer m(DeserializationContext deserializationContext) {
        JsonDeserializer jsonDeserializer;
        JavaType javaType = this.g;
        if (javaType == null) {
            if (deserializationContext.N(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return NullifyingDeserializer.g;
        }
        if (ClassUtil.v(javaType.d)) {
            return NullifyingDeserializer.g;
        }
        synchronized (this.g) {
            try {
                if (this.k == null) {
                    this.k = deserializationContext.p(this.g, this.f);
                }
                jsonDeserializer = this.k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jsonDeserializer;
    }

    public final JsonDeserializer n(DeserializationContext deserializationContext, String str) throws InvalidTypeIdException {
        JsonDeserializer jsonDeserializerP;
        ConcurrentHashMap concurrentHashMap = this.j;
        JsonDeserializer jsonDeserializer = (JsonDeserializer) concurrentHashMap.get(str);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        TypeIdResolver typeIdResolver = this.d;
        JavaType javaTypeC = typeIdResolver.c(deserializationContext, str);
        BeanProperty beanProperty = this.f;
        JavaType javaType = this.e;
        if (javaTypeC == null) {
            jsonDeserializerP = m(deserializationContext);
            if (jsonDeserializerP == null) {
                String strB = typeIdResolver.b();
                String strConcat = strB == null ? "type ids are not statically known" : "known type ids = ".concat(strB);
                if (beanProperty != null) {
                    strConcat = a.i(strConcat, " (for POJO property '", beanProperty.getName(), "')");
                }
                deserializationContext.G(javaType, str, strConcat);
                return NullifyingDeserializer.g;
            }
        } else {
            if (javaType != null && javaType.getClass() == javaTypeC.getClass() && !javaTypeC.s()) {
                try {
                    Class cls = javaTypeC.d;
                    deserializationContext.getClass();
                    javaTypeC = javaType.u(cls) ? javaType : deserializationContext.f.e.d.j(javaType, cls, false);
                } catch (IllegalArgumentException e) {
                    throw deserializationContext.f(javaType, str, e.getMessage());
                }
            }
            jsonDeserializerP = deserializationContext.p(javaTypeC, beanProperty);
        }
        concurrentHashMap.put(str, jsonDeserializerP);
        return jsonDeserializerP;
    }

    public final String toString() {
        return "[" + getClass().getName() + "; base-type:" + this.e + "; id-resolver: " + this.d + ']';
    }

    public TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this.e = typeDeserializerBase.e;
        this.d = typeDeserializerBase.d;
        this.h = typeDeserializerBase.h;
        this.i = typeDeserializerBase.i;
        this.j = typeDeserializerBase.j;
        this.g = typeDeserializerBase.g;
        this.k = typeDeserializerBase.k;
        this.f = beanProperty;
    }
}
