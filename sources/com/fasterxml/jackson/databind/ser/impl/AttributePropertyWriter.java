package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;

/* loaded from: classes4.dex */
public class AttributePropertyWriter extends VirtualBeanPropertyWriter {
    public final String w;

    /* JADX WARN: Illegal instructions before constructor call */
    public AttributePropertyWriter(String str, SimpleBeanPropertyDefinition simpleBeanPropertyDefinition, Annotations annotations, JavaType javaType) {
        JsonInclude.Include include;
        Object obj;
        JsonInclude.Value value = simpleBeanPropertyDefinition.i;
        AnnotatedMember annotatedMember = simpleBeanPropertyDefinition.f;
        JsonInclude.Include include2 = JsonInclude.Include.h;
        JsonInclude.Include include3 = JsonInclude.Include.d;
        boolean z = false;
        if (value != null && (include = value.d) != include3 && include != include2) {
            z = true;
        }
        boolean z2 = z;
        if (value == null) {
            obj = Boolean.FALSE;
        } else {
            JsonInclude.Include include4 = value.d;
            obj = (include4 == include3 || include4 == JsonInclude.Include.e || include4 == include2) ? null : JsonInclude.Include.f;
        }
        super(simpleBeanPropertyDefinition, annotatedMember, annotations, javaType, null, null, null, z2, obj, null);
        this.w = str;
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public final Object m(SerializerProvider serializerProvider) {
        return serializerProvider.g.a(this.w);
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public final VirtualBeanPropertyWriter n() {
        throw new IllegalStateException("Should not be called on this type");
    }
}
