package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* loaded from: classes4.dex */
public abstract class DeserializerFactory {
    public abstract JsonDeserializer a(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription);

    public abstract JsonDeserializer b(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription);

    public abstract JsonDeserializer c(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class cls);

    public abstract JsonDeserializer d(DeserializationContext deserializationContext, CollectionType collectionType, BeanDescription beanDescription);

    public abstract JsonDeserializer e(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription);

    public abstract JsonDeserializer f(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription);

    public abstract KeyDeserializer g(DeserializationContext deserializationContext, JavaType javaType);

    public abstract JsonDeserializer h(DeserializationContext deserializationContext, MapType mapType, BeanDescription beanDescription);

    public abstract JsonDeserializer i(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription);

    public abstract JsonDeserializer j(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription);

    public abstract JsonDeserializer k(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription);

    public abstract TypeDeserializer l(DeserializationConfig deserializationConfig, JavaType javaType);

    public abstract JavaType m(DeserializationConfig deserializationConfig, JavaType javaType);

    public abstract DeserializerFactory n(Deserializers deserializers);
}
