package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;

/* loaded from: classes4.dex */
public abstract class ClassIntrospector {

    public interface MixInResolver {
        Class a(Class cls);
    }

    public abstract BasicBeanDescription a(MapperConfig mapperConfig, JavaType javaType, MapperConfig mapperConfig2);

    public abstract BasicBeanDescription b(DeserializationConfig deserializationConfig, JavaType javaType, DeserializationConfig deserializationConfig2);

    public abstract BasicBeanDescription c(DeserializationConfig deserializationConfig, JavaType javaType, DeserializationConfig deserializationConfig2);

    public abstract BasicBeanDescription d(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver, BeanDescription beanDescription);

    public abstract BasicBeanDescription e(SerializationConfig serializationConfig, JavaType javaType, SerializationConfig serializationConfig2);
}
