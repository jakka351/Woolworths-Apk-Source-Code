package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class ObjectIdReader implements Serializable {
    public final JavaType d;
    public final PropertyName e;
    public final ObjectIdGenerator f;
    public final ObjectIdResolver g;
    public final JsonDeserializer h;
    public final SettableBeanProperty i;

    public ObjectIdReader(JavaType javaType, PropertyName propertyName, ObjectIdGenerator objectIdGenerator, JsonDeserializer jsonDeserializer, SettableBeanProperty settableBeanProperty, ObjectIdResolver objectIdResolver) {
        this.d = javaType;
        this.e = propertyName;
        this.f = objectIdGenerator;
        this.g = objectIdResolver;
        this.h = jsonDeserializer;
        this.i = settableBeanProperty;
    }
}
