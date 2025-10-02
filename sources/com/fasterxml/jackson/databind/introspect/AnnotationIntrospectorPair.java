package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AnnotationIntrospectorPair extends AnnotationIntrospector implements Serializable {
    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final ObjectIdInfo B(Annotated annotated, ObjectIdInfo objectIdInfo) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Class C(AnnotatedClass annotatedClass) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonPOJOBuilder.Value D(AnnotatedClass annotatedClass) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonProperty.Access E(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final List F(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final TypeResolverBuilder G(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String H(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String I(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonIgnoreProperties.Value J(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonIgnoreProperties.Value K(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonInclude.Value L(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonIncludeProperties.Value M(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Integer N(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final TypeResolverBuilder O(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final AnnotationIntrospector.ReferenceProperty P(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final PropertyName Q() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final PropertyName R(AnnotatedClass annotatedClass) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object S(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object T(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String[] U(AnnotatedClass annotatedClass) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean V(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonSerialize.Typing W(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object X(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonSetter.Value Y(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final List Z(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final void a(MapperConfig mapperConfig, AnnotatedClass annotatedClass, ArrayList arrayList) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String a0(AnnotatedClass annotatedClass) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final VisibilityChecker b(AnnotatedClass annotatedClass, VisibilityChecker visibilityChecker) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final TypeResolverBuilder b0(JavaType javaType, MapperConfig mapperConfig, AnnotatedClass annotatedClass) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object c(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final NameTransformer c0(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object d(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object d0(AnnotatedClass annotatedClass) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonCreator.Mode e(MapperConfig mapperConfig, Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Class[] e0(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonCreator.Mode f(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final PropertyName f0() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Enum g(Class cls) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean g0(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object h(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean h0(AnnotatedMethod annotatedMethod) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object i(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean i0(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object j(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean j0(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final void k(Class cls, Enum[] enumArr, String[][] strArr) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String[] l(Class cls, Enum[] enumArr, String[] strArr) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean l0(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object m(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean m0(AnnotatedMethod annotatedMethod) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonFormat.Value n(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean n0(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String o(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean o0(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JacksonInject.Value p(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean p0(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object q(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean q0(Annotation annotation) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object r(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean r0(AnnotatedClass annotatedClass) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object s(Annotated annotated) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean s0(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean t(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JavaType t0(MapperConfig mapperConfig, Annotated annotated, JavaType javaType) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final PropertyName u(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JavaType u0(MapperConfig mapperConfig, Annotated annotated, JavaType javaType) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final AnnotatedMethod v0(AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final PropertyName w(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object x(AnnotatedClass annotatedClass) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object y(AnnotatedMember annotatedMember) {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final ObjectIdInfo z(Annotated annotated) {
        throw null;
    }
}
