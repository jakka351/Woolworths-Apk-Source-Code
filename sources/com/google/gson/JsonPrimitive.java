package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class JsonPrimitive extends JsonElement {
    public final Serializable d;

    public JsonPrimitive(Boolean bool) {
        this.d = bool;
    }

    public static boolean k(JsonPrimitive jsonPrimitive) {
        Serializable serializable = jsonPrimitive.d;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.JsonElement
    public final long d() {
        return this.d instanceof Number ? i().longValue() : Long.parseLong(g());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        Serializable serializable = jsonPrimitive.d;
        Serializable serializable2 = this.d;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (k(this) && k(jsonPrimitive)) {
            return i().longValue() == jsonPrimitive.i().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        double dDoubleValue = i().doubleValue();
        double dDoubleValue2 = jsonPrimitive.i().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // com.google.gson.JsonElement
    public final String g() {
        Serializable serializable = this.d;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return i().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean h() {
        Serializable serializable = this.d;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(g());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.d;
        if (serializable == null) {
            return 31;
        }
        if (k(this)) {
            jDoubleToLongBits = i().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(i().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final Number i() {
        Serializable serializable = this.d;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean j() {
        return this.d instanceof Boolean;
    }

    public final boolean l() {
        return this.d instanceof Number;
    }

    public JsonPrimitive(Number number) {
        this.d = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.d = str;
    }
}
