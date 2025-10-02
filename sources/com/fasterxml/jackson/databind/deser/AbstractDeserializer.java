package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class AbstractDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer, Serializable {
    public final JavaType d;
    public final ObjectIdReader e;
    public final Map f;
    public final transient Map g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public AbstractDeserializer(BeanDescription beanDescription) {
        JavaType javaType = beanDescription.f14226a;
        this.d = javaType;
        this.e = null;
        this.f = null;
        Class cls = javaType.d;
        this.h = cls.isAssignableFrom(String.class);
        boolean z = true;
        this.i = cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class);
        this.j = cls == Integer.TYPE || cls.isAssignableFrom(Integer.class);
        if (cls != Double.TYPE && !cls.isAssignableFrom(Double.class)) {
            z = false;
        }
        this.k = z;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) throws InvalidDefinitionException {
        AnnotatedMember annotatedMemberA;
        ObjectIdInfo objectIdInfoZ;
        JavaType javaType;
        ObjectIdGenerator objectIdGeneratorG;
        SettableBeanProperty settableBeanProperty;
        AnnotationIntrospector annotationIntrospectorD = deserializationContext.f.d();
        Map map = this.g;
        if (beanProperty == null || (annotatedMemberA = beanProperty.a()) == null || (objectIdInfoZ = annotationIntrospectorD.z(annotatedMemberA)) == null) {
            return map == null ? this : new AbstractDeserializer(this, this.e);
        }
        ObjectIdResolver objectIdResolverH = deserializationContext.h(objectIdInfoZ);
        ObjectIdInfo objectIdInfoB = annotationIntrospectorD.B(annotatedMemberA, objectIdInfoZ);
        Class cls = objectIdInfoB.b;
        PropertyName propertyName = objectIdInfoB.f14277a;
        if (cls == ObjectIdGenerators.PropertyGenerator.class) {
            String str = propertyName.d;
            SettableBeanProperty settableBeanProperty2 = map == null ? null : (SettableBeanProperty) map.get(str);
            if (settableBeanProperty2 == null) {
                deserializationContext.j("Invalid Object Id definition for " + ClassUtil.B(this.d.d) + ": cannot find property with name " + ClassUtil.c(str));
                throw null;
            }
            javaType = settableBeanProperty2.g;
            objectIdGeneratorG = new PropertyBasedObjectIdGenerator(objectIdInfoB.d);
            settableBeanProperty = settableBeanProperty2;
        } else {
            objectIdResolverH = deserializationContext.h(objectIdInfoB);
            JavaType javaTypeL = deserializationContext.l(cls);
            deserializationContext.e().getClass();
            javaType = TypeFactory.m(javaTypeL, ObjectIdGenerator.class)[0];
            objectIdGeneratorG = deserializationContext.g(objectIdInfoB);
            settableBeanProperty = null;
        }
        JavaType javaType2 = javaType;
        return new AbstractDeserializer(this, new ObjectIdReader(javaType2, propertyName, objectIdGeneratorG, deserializationContext.u(javaType2), settableBeanProperty, objectIdResolverH));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        JavaType javaType = this.d;
        deserializationContext.z(javaType.d, new ValueInstantiator.Base(javaType), "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.fasterxml.jackson.core.JsonParser r4, com.fasterxml.jackson.databind.DeserializationContext r5, com.fasterxml.jackson.databind.jsontype.TypeDeserializer r6) throws com.fasterxml.jackson.databind.deser.UnresolvedForwardReference {
        /*
            r3 = this;
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r0 = r3.e
            if (r0 == 0) goto L4c
            com.fasterxml.jackson.core.JsonToken r1 = r4.e()
            if (r1 == 0) goto L4c
            boolean r2 = r1.k
            if (r2 == 0) goto L3b
            com.fasterxml.jackson.databind.JsonDeserializer r6 = r0.h
            java.lang.Object r6 = r6.e(r4, r5)
            com.fasterxml.jackson.annotation.ObjectIdGenerator r1 = r0.f
            com.fasterxml.jackson.annotation.ObjectIdResolver r0 = r0.g
            com.fasterxml.jackson.databind.deser.impl.ReadableObjectId r5 = r5.t(r6, r1, r0)
            com.fasterxml.jackson.annotation.ObjectIdResolver r0 = r5.d
            com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey r1 = r5.b
            java.lang.Object r0 = r0.b(r1)
            r5.f14252a = r0
            if (r0 == 0) goto L29
            return r0
        L29:
            com.fasterxml.jackson.databind.deser.UnresolvedForwardReference r0 = new com.fasterxml.jackson.databind.deser.UnresolvedForwardReference
            java.lang.String r1 = "Could not resolve Object Id ["
            java.lang.String r2 = "] -- unresolved forward-reference?"
            java.lang.String r6 = androidx.camera.core.impl.b.n(r6, r1, r2)
            com.fasterxml.jackson.core.JsonLocation r1 = r4.l()
            r0.<init>(r4, r6, r1, r5)
            throw r0
        L3b:
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r1 != r2) goto L43
            com.fasterxml.jackson.core.JsonToken r1 = r4.N1()
        L43:
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r1 != r2) goto L4c
            com.fasterxml.jackson.annotation.ObjectIdGenerator r0 = r0.f
            r0.getClass()
        L4c:
            int r0 = r4.f()
            boolean r1 = r3.i
            switch(r0) {
                case 6: goto L7a;
                case 7: goto L6d;
                case 8: goto L60;
                case 9: goto L5b;
                case 10: goto L56;
                default: goto L55;
            }
        L55:
            goto L83
        L56:
            if (r1 == 0) goto L83
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L84
        L5b:
            if (r1 == 0) goto L83
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L84
        L60:
            boolean r0 = r3.k
            if (r0 == 0) goto L83
            double r0 = r4.A()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L84
        L6d:
            boolean r0 = r3.j
            if (r0 == 0) goto L83
            int r0 = r4.H()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L84
        L7a:
            boolean r0 = r3.h
            if (r0 == 0) goto L83
            java.lang.String r0 = r4.k0()
            goto L84
        L83:
            r0 = 0
        L84:
            if (r0 == 0) goto L87
            return r0
        L87:
            java.lang.Object r4 = r6.d(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.g(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final SettableBeanProperty h(String str) {
        Map map = this.f;
        if (map == null) {
            return null;
        }
        return (SettableBeanProperty) map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final ObjectIdReader k() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Class l() {
        return this.d.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.g;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AbstractDeserializer(AbstractDeserializer abstractDeserializer, ObjectIdReader objectIdReader) {
        this.d = abstractDeserializer.d;
        this.f = abstractDeserializer.f;
        this.h = abstractDeserializer.h;
        this.i = abstractDeserializer.i;
        this.j = abstractDeserializer.j;
        this.k = abstractDeserializer.k;
        this.e = objectIdReader;
        this.g = null;
    }

    public AbstractDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, HashMap map, Map map2) {
        JavaType javaType = beanDescription.f14226a;
        this.d = javaType;
        this.e = beanDeserializerBuilder.j;
        this.f = map;
        this.g = map2;
        Class cls = javaType.d;
        this.h = cls.isAssignableFrom(String.class);
        boolean z = true;
        this.i = cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class);
        this.j = cls == Integer.TYPE || cls.isAssignableFrom(Integer.class);
        if (cls != Double.TYPE && !cls.isAssignableFrom(Double.class)) {
            z = false;
        }
        this.k = z;
    }
}
