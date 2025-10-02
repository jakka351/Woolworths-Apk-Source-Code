package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class SimpleBeanPropertyDefinition extends BeanPropertyDefinition {
    public static final /* synthetic */ int j = 0;
    public final AnnotationIntrospector e;
    public final AnnotatedMember f;
    public final PropertyMetadata g;
    public final PropertyName h;
    public final JsonInclude.Value i;

    public SimpleBeanPropertyDefinition(AnnotationIntrospector annotationIntrospector, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        this.e = annotationIntrospector;
        this.f = annotatedMember;
        this.h = propertyName;
        this.g = propertyMetadata == null ? PropertyMetadata.l : propertyMetadata;
        this.i = value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean A(PropertyName propertyName) {
        return this.h.equals(propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean B() {
        return w() != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean C() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean D() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final PropertyName b() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final PropertyMetadata getMetadata() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.util.Named
    public final String getName() {
        return this.h.d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final JsonInclude.Value l() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final AnnotatedParameter q() {
        AnnotatedMember annotatedMember = this.f;
        if (annotatedMember instanceof AnnotatedParameter) {
            return (AnnotatedParameter) annotatedMember;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final Iterator r() {
        AnnotatedParameter annotatedParameterQ = q();
        return annotatedParameterQ == null ? ClassUtil.c : Collections.singleton(annotatedParameterQ).iterator();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final AnnotatedField s() {
        AnnotatedMember annotatedMember = this.f;
        if (annotatedMember instanceof AnnotatedField) {
            return (AnnotatedField) annotatedMember;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final AnnotatedMethod t() {
        AnnotatedMember annotatedMember = this.f;
        if ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).g.getParameterCount() == 0) {
            return (AnnotatedMethod) annotatedMember;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final JavaType u() {
        AnnotatedMember annotatedMember = this.f;
        return annotatedMember == null ? TypeFactory.o() : annotatedMember.f();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final Class v() {
        AnnotatedMember annotatedMember = this.f;
        return annotatedMember == null ? Object.class : annotatedMember.e();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final AnnotatedMethod w() {
        AnnotatedMember annotatedMember = this.f;
        if ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).g.getParameterCount() == 1) {
            return (AnnotatedMethod) annotatedMember;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final PropertyName x() {
        AnnotationIntrospector annotationIntrospector = this.e;
        if (annotationIntrospector == null || this.f == null) {
            return null;
        }
        return annotationIntrospector.f0();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean y() {
        return this.f instanceof AnnotatedParameter;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean z() {
        return this.f instanceof AnnotatedField;
    }
}
