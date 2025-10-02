package com.google.firebase.firestore.model;

import com.google.firebase.firestore.util.Assert;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ObjectValue implements Cloneable {
    public Value d;
    public final HashMap e;

    public ObjectValue(Value value) {
        this.e = new HashMap();
        Assert.b(value.h0() == Value.ValueTypeCase.n, "ObjectValues should be backed by a MapValue", new Object[0]);
        Assert.b(!ServerTimestamps.c(value), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.d = value;
    }

    public static Value c(FieldPath fieldPath, Value value) {
        if (fieldPath.l()) {
            return value;
        }
        for (int i = 0; i < fieldPath.d.size() - 1; i++) {
            value = value.d0().P(fieldPath.f(i));
            Value value2 = Values.f15537a;
            if (value == null || value.h0() != Value.ValueTypeCase.n) {
                return null;
            }
        }
        return value.d0().P(fieldPath.e());
    }

    public static ObjectValue d(Map map) {
        Value.Builder builderJ0 = Value.j0();
        MapValue.Builder builderR = MapValue.R();
        builderR.p();
        MapValue.L((MapValue) builderR.e).putAll(map);
        builderJ0.t(builderR);
        return new ObjectValue((Value) builderJ0.m());
    }

    public final MapValue a(FieldPath fieldPath, Map map) {
        Value valueC = c(fieldPath, this.d);
        Value value = Values.f15537a;
        MapValue.Builder builderR = (valueC == null || valueC.h0() != Value.ValueTypeCase.n) ? MapValue.R() : (MapValue.Builder) valueC.d0().toBuilder();
        boolean z = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value2 = entry.getValue();
            if (value2 instanceof Map) {
                MapValue mapValueA = a((FieldPath) fieldPath.a(str), (Map) value2);
                if (mapValueA != null) {
                    Value.Builder builderJ0 = Value.j0();
                    builderJ0.p();
                    Value.R((Value) builderJ0.e, mapValueA);
                    builderR.t((Value) builderJ0.m(), str);
                    z = true;
                }
            } else {
                if (value2 instanceof Value) {
                    builderR.t((Value) value2, str);
                } else {
                    builderR.getClass();
                    str.getClass();
                    if (((MapValue) builderR.e).O().containsKey(str)) {
                        Assert.b(value2 == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                        builderR.p();
                        MapValue.L((MapValue) builderR.e).remove(str);
                    }
                }
                z = true;
            }
        }
        if (z) {
            return (MapValue) builderR.m();
        }
        return null;
    }

    public final Value b() {
        synchronized (this.e) {
            try {
                MapValue mapValueA = a(FieldPath.f, this.e);
                if (mapValueA != null) {
                    Value.Builder builderJ0 = Value.j0();
                    builderJ0.p();
                    Value.R((Value) builderJ0.e, mapValueA);
                    this.d = (Value) builderJ0.m();
                    this.e.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.d;
    }

    public final Object clone() {
        return new ObjectValue(b());
    }

    public final Value e(FieldPath fieldPath) {
        return c(fieldPath, b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ObjectValue) {
            return Values.e(b(), ((ObjectValue) obj).b());
        }
        return false;
    }

    public final void f(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            FieldPath fieldPath = (FieldPath) entry.getKey();
            if (entry.getValue() == null) {
                Assert.b(!fieldPath.l(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
                g(fieldPath, null);
            } else {
                Value value = (Value) entry.getValue();
                Assert.b(!fieldPath.l(), "Cannot set field for empty path on ObjectValue", new Object[0]);
                g(fieldPath, value);
            }
        }
    }

    public final void g(FieldPath fieldPath, Value value) {
        Map map;
        Map map2 = this.e;
        for (int i = 0; i < fieldPath.d.size() - 1; i++) {
            String strF = fieldPath.f(i);
            Object obj = map2.get(strF);
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                if (obj instanceof Value) {
                    Value value2 = (Value) obj;
                    if (value2.h0() == Value.ValueTypeCase.n) {
                        HashMap map3 = new HashMap(value2.d0().O());
                        map2.put(strF, map3);
                        map2 = map3;
                    }
                }
                map = new HashMap();
                map2.put(strF, map);
            }
            map2 = map;
        }
        map2.put(fieldPath.e(), value);
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectValue{internalValue=");
        Value valueB = b();
        Value value = Values.f15537a;
        StringBuilder sb2 = new StringBuilder();
        Values.a(sb2, valueB);
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ObjectValue() {
        Value.Builder builderJ0 = Value.j0();
        MapValue mapValueM = MapValue.M();
        builderJ0.p();
        Value.R((Value) builderJ0.e, mapValueM);
        this((Value) builderJ0.m());
    }
}
