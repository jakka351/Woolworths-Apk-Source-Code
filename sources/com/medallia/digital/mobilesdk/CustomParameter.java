package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class CustomParameter implements Comparable {
    private static final int d = 89;

    /* renamed from: a, reason: collision with root package name */
    private String f16348a;
    private Object b;
    private CustomParameterType c;

    public enum CustomParameterType {
        TypeString,
        TypeInteger,
        TypeLong,
        TypeDouble,
        TypeFloat,
        TypeBoolean,
        TypeNull;

        public static CustomParameterType fromString(String str) {
            CustomParameterType customParameterType = TypeString;
            if (customParameterType.name().equals(str)) {
                return customParameterType;
            }
            CustomParameterType customParameterType2 = TypeInteger;
            if (customParameterType2.name().equals(str)) {
                return customParameterType2;
            }
            CustomParameterType customParameterType3 = TypeLong;
            if (customParameterType3.name().equals(str)) {
                return customParameterType3;
            }
            CustomParameterType customParameterType4 = TypeDouble;
            if (customParameterType4.name().equals(str)) {
                return customParameterType4;
            }
            CustomParameterType customParameterType5 = TypeFloat;
            if (customParameterType5.name().equals(str)) {
                return customParameterType5;
            }
            CustomParameterType customParameterType6 = TypeBoolean;
            if (customParameterType6.name().equals(str)) {
                return customParameterType6;
            }
            CustomParameterType customParameterType7 = TypeNull;
            if (customParameterType7.name().equals(str)) {
                return customParameterType7;
            }
            return null;
        }

        public static CustomParameterType parseType(Object obj) {
            if (obj == null) {
                return TypeNull;
            }
            if (obj instanceof String) {
                return TypeString;
            }
            if (obj instanceof Integer) {
                return TypeInteger;
            }
            if (obj instanceof Long) {
                return TypeLong;
            }
            if (obj instanceof Double) {
                return TypeDouble;
            }
            if (obj instanceof Float) {
                return TypeFloat;
            }
            if (obj instanceof Boolean) {
                return TypeBoolean;
            }
            return null;
        }

        public Object validateValueFromType(Object obj) {
            if (this == TypeNull) {
                return obj;
            }
            if (this == TypeString) {
                return obj.toString();
            }
            if (this == TypeInteger) {
                return Integer.valueOf((int) Double.valueOf(String.valueOf(obj)).longValue());
            }
            if (this == TypeLong) {
                return Long.valueOf(Double.valueOf(String.valueOf(obj)).longValue());
            }
            if (this == TypeDouble) {
                return Double.valueOf(String.valueOf(obj));
            }
            if (this == TypeFloat) {
                return Float.valueOf(String.valueOf(obj));
            }
            if (this != TypeBoolean) {
                return null;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.equalsIgnoreCase("true") || strValueOf.equalsIgnoreCase("1")) {
                return Boolean.TRUE;
            }
            if (strValueOf.equalsIgnoreCase("false") || strValueOf.equalsIgnoreCase("0")) {
                return Boolean.FALSE;
            }
            return null;
        }
    }

    public CustomParameter() {
    }

    public CustomParameterType a() {
        return this.c;
    }

    public String b() {
        return this.f16348a;
    }

    public Object c() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof CustomParameter)) {
            return 1;
        }
        CustomParameter customParameter = (CustomParameter) obj;
        String str = this.f16348a;
        if (str == null) {
            return -1;
        }
        String str2 = customParameter.f16348a;
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    public JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, l3.a((Object) this.f16348a));
            jSONObject.put(d7.c, l3.a(this.c));
            jSONObject.put("value", l3.a(this.b));
            return jSONObject;
        } catch (Exception e) {
            a4.c(e.getMessage());
            return jSONObject;
        }
    }

    public String e() {
        return "Name: " + this.f16348a + " Value: " + this.b;
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof CustomParameter)) {
            return false;
        }
        CustomParameter customParameter = (CustomParameter) obj;
        String str2 = this.f16348a;
        return (str2 == null || (str = customParameter.f16348a) == null || this.b == null || customParameter.b == null || !str2.equals(str) || !this.b.equals(customParameter.b)) ? false : true;
    }

    public CustomParameter f() {
        this.b = this.c.validateValueFromType(this.b);
        return this;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 89;
        String str = this.f16348a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 89;
        Object obj = this.b;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "Name: " + this.f16348a + " Value: " + this.b;
    }

    public CustomParameter(JSONObject jSONObject) {
        try {
            if (jSONObject.has(AppMeasurementSdk.ConditionalUserProperty.NAME) && !jSONObject.isNull(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                this.f16348a = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            }
            if (jSONObject.has(d7.c) && !jSONObject.isNull(d7.c)) {
                this.c = CustomParameterType.fromString(jSONObject.getString(d7.c));
            }
            if (!jSONObject.has("value") || jSONObject.isNull("value")) {
                return;
            }
            this.b = jSONObject.get("value");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public boolean a(Object obj) {
        CustomParameterType type = CustomParameterType.parseType(obj);
        if (type == null) {
            return false;
        }
        this.c = type;
        this.b = obj;
        return true;
    }

    public boolean a(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return false;
        }
        this.f16348a = str;
        return true;
    }
}
