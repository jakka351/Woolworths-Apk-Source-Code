package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* loaded from: classes4.dex */
public interface Deserializers {

    public static abstract class Base implements Deserializers {
        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer a(ReferenceType referenceType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer b(Class cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer c(JavaType javaType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer d(CollectionLikeType collectionLikeType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer e(MapType mapType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer f(ArrayType arrayType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer g(Class cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer h(CollectionType collectionType) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer i(MapLikeType mapLikeType) {
            return null;
        }
    }

    JsonDeserializer a(ReferenceType referenceType);

    JsonDeserializer b(Class cls);

    JsonDeserializer c(JavaType javaType);

    JsonDeserializer d(CollectionLikeType collectionLikeType);

    JsonDeserializer e(MapType mapType);

    JsonDeserializer f(ArrayType arrayType);

    JsonDeserializer g(Class cls);

    JsonDeserializer h(CollectionType collectionType);

    JsonDeserializer i(MapLikeType mapLikeType);
}
