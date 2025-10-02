package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class PropertyBasedCreator {

    /* renamed from: a, reason: collision with root package name */
    public final int f14249a;
    public final ValueInstantiator b;
    public final HashMap c;
    public final SettableBeanProperty[] d;

    public static class CaseInsensitiveMap extends HashMap<String, SettableBeanProperty> {
        public final Locale d;

        public CaseInsensitiveMap(Locale locale) {
            this.d = locale;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            return (SettableBeanProperty) super.get(((String) obj).toLowerCase(this.d));
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            return (SettableBeanProperty) super.put(((String) obj).toLowerCase(this.d), (SettableBeanProperty) obj2);
        }
    }

    public PropertyBasedCreator(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z, boolean z2) {
        DeserializationConfig deserializationConfig = deserializationContext.f;
        this.b = valueInstantiator;
        if (z) {
            this.c = new CaseInsensitiveMap(deserializationConfig.e.i);
        } else {
            this.c = new HashMap();
        }
        int length = settableBeanPropertyArr.length;
        this.f14249a = length;
        this.d = new SettableBeanProperty[length];
        if (z2) {
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                if (!settableBeanProperty.w()) {
                    List listF = settableBeanProperty.e;
                    if (listF == null) {
                        AnnotationIntrospector annotationIntrospectorD = deserializationConfig.d();
                        AnnotatedMember annotatedMemberA = settableBeanProperty.a();
                        listF = annotatedMemberA != null ? annotationIntrospectorD.F(annotatedMemberA) : listF;
                        listF = listF == null ? Collections.EMPTY_LIST : listF;
                        settableBeanProperty.e = listF;
                    }
                    if (!listF.isEmpty()) {
                        Iterator it = listF.iterator();
                        while (it.hasNext()) {
                            this.c.put(((PropertyName) it.next()).d, settableBeanProperty);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i];
            this.d[i] = settableBeanProperty2;
            if (!settableBeanProperty2.w()) {
                this.c.put(settableBeanProperty2.f.d, settableBeanProperty2);
            }
        }
    }

    public static PropertyBasedCreator b(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z) {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanPropertyE = settableBeanPropertyArr[i];
            if (!settableBeanPropertyE.s()) {
                settableBeanPropertyE = settableBeanPropertyE.E(deserializationContext.p(settableBeanPropertyE.g, settableBeanPropertyE));
            }
            settableBeanPropertyArr2[i] = settableBeanPropertyE;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, z, false);
    }

    public final Object a(DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer) throws MismatchedInputException {
        Object objT = this.b.t(deserializationContext, this.d, propertyValueBuffer);
        if (objT != null) {
            ObjectIdReader objectIdReader = propertyValueBuffer.c;
            if (objectIdReader != null) {
                SettableBeanProperty settableBeanProperty = objectIdReader.i;
                Object obj = propertyValueBuffer.i;
                if (obj == null) {
                    deserializationContext.getClass();
                    deserializationContext.U(settableBeanProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", ClassUtil.f(objT), objectIdReader.e), new Object[0]);
                    throw null;
                }
                deserializationContext.t(obj, objectIdReader.f, objectIdReader.g).b(objT);
                if (settableBeanProperty != null) {
                    objT = settableBeanProperty.B(objT, propertyValueBuffer.i);
                }
            }
            for (PropertyValue propertyValue = propertyValueBuffer.h; propertyValue != null; propertyValue = propertyValue.f14250a) {
                propertyValue.a(objT);
            }
        }
        return objT;
    }

    public final SettableBeanProperty c(String str) {
        return (SettableBeanProperty) this.c.get(str);
    }

    public final PropertyValueBuffer d(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectIdReader objectIdReader) {
        return new PropertyValueBuffer(jsonParser, deserializationContext, this.f14249a, objectIdReader);
    }
}
