package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class PropertyValue {

    /* renamed from: a, reason: collision with root package name */
    public final PropertyValue f14250a;
    public final Object b;

    public static final class Any extends PropertyValue {
        public final SettableAnyProperty c;
        public final String d;

        public Any(PropertyValue propertyValue, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(propertyValue, obj);
            this.c = settableAnyProperty;
            this.d = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public final void a(Object obj) throws IOException {
            this.c.d(obj, this.d, this.b);
        }
    }

    public static final class Map extends PropertyValue {
        public final Object c;

        public Map(PropertyValue propertyValue, Object obj, Object obj2) {
            super(propertyValue, obj);
            this.c = obj2;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public final void a(Object obj) {
            ((java.util.Map) obj).put(this.c, this.b);
        }
    }

    public static final class Regular extends PropertyValue {
        public final SettableBeanProperty c;

        public Regular(PropertyValue propertyValue, Object obj, SettableBeanProperty settableBeanProperty) {
            super(propertyValue, obj);
            this.c = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public final void a(Object obj) {
            this.c.z(obj, this.b);
        }
    }

    public PropertyValue(PropertyValue propertyValue, Object obj) {
        this.f14250a = propertyValue;
        this.b = obj;
    }

    public abstract void a(Object obj);
}
