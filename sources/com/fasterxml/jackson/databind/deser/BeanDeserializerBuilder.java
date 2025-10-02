package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class BeanDeserializerBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final DeserializationConfig f14239a;
    public final DeserializationContext b;
    public final BeanDescription c;
    public final LinkedHashMap d = new LinkedHashMap();
    public ArrayList e;
    public HashMap f;
    public HashSet g;
    public HashSet h;
    public ValueInstantiator i;
    public ObjectIdReader j;
    public SettableAnyProperty k;
    public boolean l;
    public AnnotatedMethod m;

    public BeanDeserializerBuilder(BeanDescription beanDescription, DeserializationContext deserializationContext) {
        this.c = beanDescription;
        this.b = deserializationContext;
        this.f14239a = deserializationContext.f;
    }

    public final Map a(Collection collection) {
        AnnotationIntrospector annotationIntrospectorD = this.f14239a.d();
        Iterator it = collection.iterator();
        HashMap map = null;
        while (it.hasNext()) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) it.next();
            List listF = annotationIntrospectorD.F(settableBeanProperty.a());
            if (listF != null && !listF.isEmpty()) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(settableBeanProperty.f.d, listF);
            }
        }
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final void b(Collection collection) {
        DeserializationConfig deserializationConfig = this.f14239a;
        deserializationConfig.getClass();
        if (deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    ((SettableBeanProperty) it.next()).k(deserializationConfig);
                } catch (IllegalArgumentException e) {
                    c(e);
                    throw null;
                }
            }
        }
        SettableAnyProperty settableAnyProperty = this.k;
        if (settableAnyProperty != null) {
            try {
                settableAnyProperty.e.g(deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e2) {
                c(e2);
                throw null;
            }
        }
        AnnotatedMethod annotatedMethod = this.m;
        if (annotatedMethod != null) {
            try {
                annotatedMethod.g(deserializationConfig.m(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e3) {
                c(e3);
                throw null;
            }
        }
    }

    public final void c(IllegalArgumentException illegalArgumentException) {
        try {
            this.b.T(this.c, illegalArgumentException.getMessage(), new Object[0]);
            throw null;
        } catch (DatabindException e) {
            if (e.getCause() == null) {
                e.initCause(illegalArgumentException);
            }
            throw e;
        }
    }

    public final void d(String str) {
        if (this.g == null) {
            this.g = new HashSet();
        }
        this.g.add(str);
    }

    public final void e(SettableBeanProperty settableBeanProperty) {
        PropertyName propertyName = settableBeanProperty.f;
        SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this.d.put(propertyName.d, settableBeanProperty);
        if (settableBeanProperty2 == null || settableBeanProperty2 == settableBeanProperty) {
            return;
        }
        throw new IllegalArgumentException("Duplicate property '" + propertyName.d + "' for " + this.c.f14226a);
    }

    public final BeanDeserializer f() {
        boolean z;
        Collection collectionValues = this.d.values();
        b(collectionValues);
        Map mapA = a(collectionValues);
        Boolean boolB = this.c.f().b(JsonFormat.Feature.e);
        DeserializationConfig deserializationConfig = this.f14239a;
        BeanPropertyMap beanPropertyMap = new BeanPropertyMap(boolB == null ? deserializationConfig.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : boolB.booleanValue(), collectionValues, mapA, deserializationConfig.e.i);
        int length = beanPropertyMap.h.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) beanPropertyMap.h[i2];
            if (settableBeanProperty != null) {
                settableBeanProperty.f(i);
                i++;
            }
        }
        boolean zM = deserializationConfig.m(MapperFeature.DEFAULT_VIEW_INCLUSION);
        boolean z2 = !zM;
        if (zM) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((SettableBeanProperty) it.next()).u()) {
                    z = true;
                    break;
                }
            }
            z = z2;
        } else {
            z = z2;
        }
        if (this.j != null) {
            beanPropertyMap = beanPropertyMap.k(new ObjectIdValueProperty(this.j, PropertyMetadata.k));
        }
        return new BeanDeserializer(this, this.c, beanPropertyMap, this.f, this.g, this.l, this.h, z);
    }
}
