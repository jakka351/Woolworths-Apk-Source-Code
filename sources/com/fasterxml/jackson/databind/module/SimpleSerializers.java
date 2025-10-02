package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class SimpleSerializers extends Serializers.Base implements Serializable {
    public HashMap d;
    public HashMap e;
    public boolean f;

    @Override // com.fasterxml.jackson.databind.ser.Serializers.Base, com.fasterxml.jackson.databind.ser.Serializers
    public final JsonSerializer a(SerializationConfig serializationConfig, MapType mapType, BeanDescription beanDescription) {
        return c(mapType);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.Base, com.fasterxml.jackson.databind.ser.Serializers
    public final JsonSerializer b(SerializationConfig serializationConfig, CollectionType collectionType, BeanDescription beanDescription) {
        return c(collectionType);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.Base, com.fasterxml.jackson.databind.ser.Serializers
    public final JsonSerializer c(JavaType javaType) {
        JsonSerializer jsonSerializerH;
        JsonSerializer jsonSerializer;
        Class superclass = javaType.d;
        ClassKey classKey = new ClassKey(superclass);
        if (superclass.isInterface()) {
            HashMap map = this.e;
            if (map != null && (jsonSerializer = (JsonSerializer) map.get(classKey)) != null) {
                return jsonSerializer;
            }
        } else {
            HashMap map2 = this.d;
            if (map2 != null) {
                JsonSerializer jsonSerializer2 = (JsonSerializer) map2.get(classKey);
                if (jsonSerializer2 != null) {
                    return jsonSerializer2;
                }
                if (this.f && javaType.B()) {
                    classKey.e = Enum.class;
                    String name = Enum.class.getName();
                    classKey.d = name;
                    classKey.f = name.hashCode();
                    JsonSerializer jsonSerializer3 = (JsonSerializer) this.d.get(classKey);
                    if (jsonSerializer3 != null) {
                        return jsonSerializer3;
                    }
                }
                for (Class superclass2 = superclass; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    classKey.e = superclass2;
                    String name2 = superclass2.getName();
                    classKey.d = name2;
                    classKey.f = name2.hashCode();
                    JsonSerializer jsonSerializer4 = (JsonSerializer) this.d.get(classKey);
                    if (jsonSerializer4 != null) {
                        return jsonSerializer4;
                    }
                }
            }
        }
        if (this.e == null) {
            return null;
        }
        JsonSerializer jsonSerializerH2 = h(superclass, classKey);
        if (jsonSerializerH2 != null) {
            return jsonSerializerH2;
        }
        if (superclass.isInterface()) {
            return null;
        }
        do {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return null;
            }
            jsonSerializerH = h(superclass, classKey);
        } while (jsonSerializerH == null);
        return jsonSerializerH;
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.Base, com.fasterxml.jackson.databind.ser.Serializers
    public final JsonSerializer e(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, BeanDescription beanDescription) {
        return c(collectionLikeType);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.Base, com.fasterxml.jackson.databind.ser.Serializers
    public final JsonSerializer f(SerializationConfig serializationConfig, MapLikeType mapLikeType, BeanDescription beanDescription) {
        return c(mapLikeType);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.Base, com.fasterxml.jackson.databind.ser.Serializers
    public final JsonSerializer g(SerializationConfig serializationConfig, ArrayType arrayType, BeanDescription beanDescription) {
        return c(arrayType);
    }

    public final JsonSerializer h(Class cls, ClassKey classKey) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            classKey.e = cls2;
            String name = cls2.getName();
            classKey.d = name;
            classKey.f = name.hashCode();
            JsonSerializer jsonSerializer = (JsonSerializer) this.e.get(classKey);
            if (jsonSerializer != null) {
                return jsonSerializer;
            }
            JsonSerializer jsonSerializerH = h(cls2, classKey);
            if (jsonSerializerH != null) {
                return jsonSerializerH;
            }
        }
        return null;
    }
}
