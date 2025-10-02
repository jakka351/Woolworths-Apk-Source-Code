package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class JDKValueInstantiators {

    public static class ArrayListInstantiator extends ValueInstantiator.Base implements Serializable {
        public static final ArrayListInstantiator e = new ArrayListInstantiator(ArrayList.class);

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean j() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean l() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object y(DeserializationContext deserializationContext) {
            return new ArrayList();
        }
    }

    public static class ConstantValueInstantiator extends ValueInstantiator.Base implements Serializable {
        public final Object e;

        public ConstantValueInstantiator(Object obj) {
            super(obj.getClass());
            this.e = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean j() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean l() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object y(DeserializationContext deserializationContext) {
            return this.e;
        }
    }

    public static class HashMapInstantiator extends ValueInstantiator.Base implements Serializable {
        public static final HashMapInstantiator e = new HashMapInstantiator(HashMap.class);

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean j() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean l() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object y(DeserializationContext deserializationContext) {
            return new HashMap();
        }
    }

    public static class LinkedHashMapInstantiator extends ValueInstantiator.Base implements Serializable {
        public static final LinkedHashMapInstantiator e = new LinkedHashMapInstantiator(LinkedHashMap.class);

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean j() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final boolean l() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public final Object y(DeserializationContext deserializationContext) {
            return new LinkedHashMap();
        }
    }

    public static ValueInstantiator.Base a(Class cls) {
        if (cls == JsonLocation.class) {
            return new JsonLocationInstantiator(JsonLocation.class);
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return ArrayListInstantiator.e;
            }
            Set set = Collections.EMPTY_SET;
            if (set.getClass() == cls) {
                return new ConstantValueInstantiator(set);
            }
            List list = Collections.EMPTY_LIST;
            if (list.getClass() == cls) {
                return new ConstantValueInstantiator(list);
            }
            return null;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (cls == LinkedHashMap.class) {
            return LinkedHashMapInstantiator.e;
        }
        if (cls == HashMap.class) {
            return HashMapInstantiator.e;
        }
        Map map = Collections.EMPTY_MAP;
        if (map.getClass() == cls) {
            return new ConstantValueInstantiator(map);
        }
        return null;
    }
}
