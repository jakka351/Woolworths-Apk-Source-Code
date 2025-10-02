package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Named;
import java.io.Serializable;

/* loaded from: classes4.dex */
public interface BeanProperty extends Named {
    public static final JsonFormat.Value u3 = new JsonFormat.Value();

    public static class Bogus implements BeanProperty {
        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final AnnotatedMember a() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final PropertyName b() {
            return PropertyName.h;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final JsonFormat.Value c(MapperConfig mapperConfig, Class cls) {
            return JsonFormat.Value.k;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final JsonInclude.Value d(MapperConfig mapperConfig, Class cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final PropertyMetadata getMetadata() {
            return PropertyMetadata.m;
        }

        @Override // com.fasterxml.jackson.databind.util.Named
        public final String getName() {
            return "";
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final JavaType getType() {
            return TypeFactory.o();
        }
    }

    public static class Std implements BeanProperty, Serializable {
        public final PropertyName d;
        public final JavaType e;
        public final PropertyMetadata f;
        public final AnnotatedMember g;

        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this.d = propertyName;
            this.e = javaType;
            this.f = propertyMetadata;
            this.g = annotatedMember;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final AnnotatedMember a() {
            return this.g;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final PropertyName b() {
            return this.d;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final JsonFormat.Value c(MapperConfig mapperConfig, Class cls) {
            JsonFormat.Value valueN;
            JsonFormat.Value valueH = mapperConfig.h(cls);
            AnnotationIntrospector annotationIntrospectorD = mapperConfig.d();
            AnnotatedMember annotatedMember = this.g;
            return (annotatedMember == null || (valueN = annotationIntrospectorD.n(annotatedMember)) == null) ? valueH : valueH.e(valueN);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final JsonInclude.Value d(MapperConfig mapperConfig, Class cls) {
            JsonInclude.Value valueL;
            JsonInclude.Value valueF = mapperConfig.f(cls, this.e.d);
            AnnotationIntrospector annotationIntrospectorD = mapperConfig.d();
            AnnotatedMember annotatedMember = this.g;
            return (annotatedMember == null || (valueL = annotationIntrospectorD.L(annotatedMember)) == null) ? valueF : valueF.a(valueL);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final PropertyMetadata getMetadata() {
            return this.f;
        }

        @Override // com.fasterxml.jackson.databind.util.Named
        public final String getName() {
            return this.d.d;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public final JavaType getType() {
            return this.e;
        }
    }

    static {
        JsonInclude.Value value = JsonInclude.Value.h;
    }

    AnnotatedMember a();

    PropertyName b();

    JsonFormat.Value c(MapperConfig mapperConfig, Class cls);

    JsonInclude.Value d(MapperConfig mapperConfig, Class cls);

    PropertyMetadata getMetadata();

    JavaType getType();
}
