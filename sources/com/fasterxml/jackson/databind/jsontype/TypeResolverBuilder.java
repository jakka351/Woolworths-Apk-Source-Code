package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase;
import com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase;
import java.util.Collection;

/* loaded from: classes4.dex */
public interface TypeResolverBuilder<T extends TypeResolverBuilder<T>> {
    TypeDeserializerBase a(DeserializationConfig deserializationConfig, JavaType javaType, Collection collection);

    StdTypeResolverBuilder b(JsonTypeInfo.Id id, TypeIdResolver typeIdResolver);

    StdTypeResolverBuilder c(Class cls);

    TypeSerializerBase d(SerializationConfig serializationConfig, JavaType javaType, Collection collection);

    default TypeResolverBuilder e(Class cls) {
        return c(cls);
    }

    Class f();
}
