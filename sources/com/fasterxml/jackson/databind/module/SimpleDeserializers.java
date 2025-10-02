package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class SimpleDeserializers extends Deserializers.Base implements Serializable {
    public HashMap d;
    public boolean e;

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer a(ReferenceType referenceType) {
        return j(referenceType);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer b(Class cls) {
        HashMap map = this.d;
        if (map == null) {
            return null;
        }
        JsonDeserializer jsonDeserializer = (JsonDeserializer) map.get(new ClassKey(cls));
        return (jsonDeserializer == null && this.e && cls.isEnum()) ? (JsonDeserializer) this.d.get(new ClassKey(Enum.class)) : jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer c(JavaType javaType) {
        return j(javaType);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer d(CollectionLikeType collectionLikeType) {
        return j(collectionLikeType);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer e(MapType mapType) {
        return j(mapType);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer f(ArrayType arrayType) {
        return j(arrayType);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer g(Class cls) {
        HashMap map = this.d;
        if (map == null) {
            return null;
        }
        return (JsonDeserializer) map.get(new ClassKey(cls));
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer h(CollectionType collectionType) {
        return j(collectionType);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer i(MapLikeType mapLikeType) {
        return j(mapLikeType);
    }

    public final JsonDeserializer j(JavaType javaType) {
        HashMap map = this.d;
        if (map == null) {
            return null;
        }
        return (JsonDeserializer) map.get(new ClassKey(javaType.d));
    }
}
