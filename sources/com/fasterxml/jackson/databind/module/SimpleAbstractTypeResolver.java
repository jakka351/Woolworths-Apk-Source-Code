package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class SimpleAbstractTypeResolver extends AbstractTypeResolver implements Serializable {
    @Override // com.fasterxml.jackson.databind.AbstractTypeResolver
    public final JavaType a(JavaType javaType) {
        new ClassKey(javaType.d);
        throw null;
    }
}
