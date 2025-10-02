package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    public final PropertyMetadata d;
    public transient List e;

    public ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        this.d = propertyMetadata == null ? PropertyMetadata.m : propertyMetadata;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public final JsonFormat.Value c(MapperConfig mapperConfig, Class cls) {
        JsonFormat.Value valueH = mapperConfig.h(cls);
        AnnotationIntrospector annotationIntrospectorD = mapperConfig.d();
        AnnotatedMember annotatedMemberA = a();
        JsonFormat.Value valueN = annotatedMemberA != null ? annotationIntrospectorD.n(annotatedMemberA) : null;
        return valueH == null ? valueN == null ? BeanProperty.u3 : valueN : valueN == null ? valueH : valueH.e(valueN);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public final JsonInclude.Value d(MapperConfig mapperConfig, Class cls) {
        AnnotationIntrospector annotationIntrospectorD = mapperConfig.d();
        AnnotatedMember annotatedMemberA = a();
        if (annotatedMemberA == null) {
            return mapperConfig.i(cls);
        }
        JsonInclude.Value valueF = mapperConfig.f(cls, annotatedMemberA.e());
        JsonInclude.Value valueL = annotationIntrospectorD.L(annotatedMemberA);
        return valueF == null ? valueL : valueF.a(valueL);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyMetadata getMetadata() {
        return this.d;
    }

    public ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this.d = concreteBeanPropertyBase.d;
    }
}
