package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class MethodProperty extends SettableBeanProperty {
    public final AnnotatedMethod q;
    public final transient Method r;
    public final boolean s;

    public MethodProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedMethod annotatedMethod) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this.q = annotatedMethod;
        this.r = annotatedMethod.g;
        this.s = NullsConstantProvider.a(this.k);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object B(Object obj, Object obj2) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.r.invoke(obj, obj2);
            return objInvoke == null ? obj : objInvoke;
        } catch (Exception e) {
            e(null, e, obj2);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty C(PropertyName propertyName) {
        return new MethodProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty D(NullValueProvider nullValueProvider) {
        return new MethodProperty(this, this.i, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final SettableBeanProperty E(JsonDeserializer jsonDeserializer) {
        JsonDeserializer jsonDeserializer2 = this.i;
        if (jsonDeserializer2 == jsonDeserializer) {
            return this;
        }
        NullValueProvider nullValueProvider = this.k;
        if (jsonDeserializer2 == nullValueProvider) {
            nullValueProvider = jsonDeserializer;
        }
        return new MethodProperty(this, jsonDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public final AnnotatedMember a() {
        return this.q;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void h(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        Object objG;
        boolean zA1 = jsonParser.a1(JsonToken.VALUE_NULL);
        NullValueProvider nullValueProvider = this.k;
        boolean z = this.s;
        if (!zA1) {
            JsonDeserializer jsonDeserializer = this.i;
            TypeDeserializer typeDeserializer = this.j;
            if (typeDeserializer == null) {
                Object objE = jsonDeserializer.e(jsonParser, deserializationContext);
                if (objE != null) {
                    objG = objE;
                } else if (z) {
                    return;
                } else {
                    objG = nullValueProvider.c(deserializationContext);
                }
            } else {
                objG = jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
            }
        } else if (z) {
            return;
        } else {
            objG = nullValueProvider.c(deserializationContext);
        }
        try {
            this.r.invoke(obj, objG);
        } catch (Exception e) {
            e(jsonParser, e, objG);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.Object r7) throws java.lang.IllegalAccessException, com.fasterxml.jackson.databind.JsonMappingException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            boolean r0 = r5.a1(r0)
            com.fasterxml.jackson.databind.deser.NullValueProvider r1 = r4.k
            boolean r2 = r4.s
            if (r0 == 0) goto L14
            if (r2 == 0) goto Lf
            goto L3a
        Lf:
            java.lang.Object r6 = r1.c(r6)
            goto L2e
        L14:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r4.i
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r3 = r4.j
            if (r3 != 0) goto L2a
            java.lang.Object r0 = r0.e(r5, r6)
            if (r0 != 0) goto L28
            if (r2 == 0) goto L23
            goto L3a
        L23:
            java.lang.Object r6 = r1.c(r6)
            goto L2e
        L28:
            r6 = r0
            goto L2e
        L2a:
            java.lang.Object r6 = r0.g(r5, r6, r3)
        L2e:
            java.lang.reflect.Method r0 = r4.r     // Catch: java.lang.Exception -> L3c
            java.lang.Object[] r1 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L3c
            java.lang.Object r5 = r0.invoke(r7, r1)     // Catch: java.lang.Exception -> L3c
            if (r5 != 0) goto L3b
        L3a:
            return r7
        L3b:
            return r5
        L3c:
            r7 = move-exception
            r4.e(r5, r7, r6)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.MethodProperty.i(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void k(DeserializationConfig deserializationConfig) throws SecurityException {
        this.q.g(deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public Object readResolve() {
        return new MethodProperty(this, this.q.g);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void z(Object obj, Object obj2) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        try {
            this.r.invoke(obj, obj2);
        } catch (Exception e) {
            e(null, e, obj2);
            throw null;
        }
    }

    public MethodProperty(MethodProperty methodProperty, JsonDeserializer jsonDeserializer, NullValueProvider nullValueProvider) {
        super(methodProperty, jsonDeserializer, nullValueProvider);
        this.q = methodProperty.q;
        this.r = methodProperty.r;
        this.s = NullsConstantProvider.a(nullValueProvider);
    }

    public MethodProperty(MethodProperty methodProperty, PropertyName propertyName) {
        super(methodProperty, propertyName);
        this.q = methodProperty.q;
        this.r = methodProperty.r;
        this.s = methodProperty.s;
    }

    public MethodProperty(MethodProperty methodProperty, Method method) {
        super(methodProperty);
        this.q = methodProperty.q;
        this.r = method;
        this.s = methodProperty.s;
    }
}
