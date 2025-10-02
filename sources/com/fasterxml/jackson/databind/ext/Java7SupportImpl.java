package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.beans.ConstructorProperties;
import java.beans.Transient;

/* loaded from: classes4.dex */
public class Java7SupportImpl extends Java7Support {
    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public final PropertyName a(AnnotatedParameter annotatedParameter) {
        ConstructorProperties constructorPropertiesC;
        AnnotatedWithParams annotatedWithParams = annotatedParameter.f;
        if (annotatedWithParams == null || (constructorPropertiesC = annotatedWithParams.c(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] strArrValue = constructorPropertiesC.value();
        int i = annotatedParameter.h;
        if (i < strArrValue.length) {
            return PropertyName.a(strArrValue[i]);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public final Boolean b(AnnotatedMember annotatedMember) {
        Transient transientC = annotatedMember.c(Transient.class);
        if (transientC != null) {
            return Boolean.valueOf(transientC.value());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public final Boolean c(Annotated annotated) {
        if (annotated.c(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}
