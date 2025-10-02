package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyValue;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class PropertyValueBuffer {

    /* renamed from: a, reason: collision with root package name */
    public final JsonParser f14251a;
    public final DeserializationContext b;
    public final ObjectIdReader c;
    public final Object[] d;
    public int e;
    public int f;
    public final BitSet g;
    public PropertyValue h;
    public Object i;

    public PropertyValueBuffer(JsonParser jsonParser, DeserializationContext deserializationContext, int i, ObjectIdReader objectIdReader) {
        this.f14251a = jsonParser;
        this.b = deserializationContext;
        this.e = i;
        this.c = objectIdReader;
        this.d = new Object[i];
        if (i < 32) {
            this.g = null;
        } else {
            this.g = new BitSet();
        }
    }

    public final Object a(SettableBeanProperty settableBeanProperty) throws DatabindException {
        Object objN = settableBeanProperty.n();
        PropertyName propertyName = settableBeanProperty.f;
        DeserializationContext deserializationContext = this.b;
        if (objN != null) {
            deserializationContext.q(settableBeanProperty.n(), settableBeanProperty, null);
            throw null;
        }
        Boolean bool = settableBeanProperty.d.d;
        if (bool != null && bool.booleanValue()) {
            deserializationContext.U(settableBeanProperty, "Missing required creator property '%s' (index %d)", propertyName.d, Integer.valueOf(settableBeanProperty.l()));
            throw null;
        }
        if (deserializationContext.N(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            deserializationContext.U(settableBeanProperty, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", propertyName.d, Integer.valueOf(settableBeanProperty.l()));
            throw null;
        }
        try {
            Object objD = settableBeanProperty.k.d(deserializationContext);
            return objD != null ? objD : settableBeanProperty.q().d(deserializationContext);
        } catch (DatabindException e) {
            AnnotatedMember annotatedMemberA = settableBeanProperty.a();
            if (annotatedMemberA != null) {
                e.e(annotatedMemberA.h(), propertyName.d);
            }
            throw e;
        }
    }

    public final boolean b(SettableBeanProperty settableBeanProperty, Object obj) {
        int iL = settableBeanProperty.l();
        this.d[iL] = obj;
        BitSet bitSet = this.g;
        if (bitSet == null) {
            int i = this.f;
            int i2 = (1 << iL) | i;
            if (i != i2) {
                this.f = i2;
                int i3 = this.e - 1;
                this.e = i3;
                if (i3 <= 0) {
                    return this.c == null || this.i != null;
                }
            }
        } else if (!bitSet.get(iL)) {
            bitSet.set(iL);
            this.e--;
        }
        return false;
    }

    public final void c(SettableAnyProperty settableAnyProperty, String str, Object obj) {
        this.h = new PropertyValue.Any(this.h, obj, settableAnyProperty, str);
    }

    public final void d(Object obj, Object obj2) {
        this.h = new PropertyValue.Map(this.h, obj2, obj);
    }

    public final void e(SettableBeanProperty settableBeanProperty, Object obj) {
        this.h = new PropertyValue.Regular(this.h, obj, settableBeanProperty);
    }

    public final boolean f(String str) {
        ObjectIdReader objectIdReader = this.c;
        if (objectIdReader == null || !str.equals(objectIdReader.e.d)) {
            return false;
        }
        this.i = objectIdReader.h.e(this.f14251a, this.b);
        return true;
    }
}
