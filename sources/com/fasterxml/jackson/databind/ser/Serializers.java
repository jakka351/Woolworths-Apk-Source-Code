package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* loaded from: classes4.dex */
public interface Serializers {

    public static class Base implements Serializers {
        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer a(SerializationConfig serializationConfig, MapType mapType, BeanDescription beanDescription) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer b(SerializationConfig serializationConfig, CollectionType collectionType, BeanDescription beanDescription) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer c(JavaType javaType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public final JsonSerializer d(SerializationConfig serializationConfig, ReferenceType referenceType, BeanDescription beanDescription) {
            return c(referenceType);
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer e(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, BeanDescription beanDescription) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer f(SerializationConfig serializationConfig, MapLikeType mapLikeType, BeanDescription beanDescription) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer g(SerializationConfig serializationConfig, ArrayType arrayType, BeanDescription beanDescription) {
            return null;
        }
    }

    JsonSerializer a(SerializationConfig serializationConfig, MapType mapType, BeanDescription beanDescription);

    JsonSerializer b(SerializationConfig serializationConfig, CollectionType collectionType, BeanDescription beanDescription);

    JsonSerializer c(JavaType javaType);

    JsonSerializer d(SerializationConfig serializationConfig, ReferenceType referenceType, BeanDescription beanDescription);

    JsonSerializer e(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, BeanDescription beanDescription);

    JsonSerializer f(SerializationConfig serializationConfig, MapLikeType mapLikeType, BeanDescription beanDescription);

    JsonSerializer g(SerializationConfig serializationConfig, ArrayType arrayType, BeanDescription beanDescription);
}
