package com.scandit.datacapture.core.internal.sdk.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"", "json", "", "objectFromJson", "obj", "jsonFromObject", "scandit-capture-core"}, k = 2, mv = {1, 8, 0})
@JvmName
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class JsonUtils {
    private static final Object a(Object obj) throws JSONException {
        if (obj == null) {
            Object NULL = JSONObject.NULL;
            Intrinsics.g(NULL, "NULL");
            return NULL;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key == null) {
                    throw new JSONException("Maps with null keys cannot be serialized to json");
                }
                if (!(key instanceof String)) {
                    throw new JSONException("Maps with keys of type " + key.getClass().getSimpleName() + " cannot be serialized to json");
                }
                jSONObject.put((String) key, a(value));
            }
            return jSONObject;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(a(it.next()));
            }
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                jSONArray2.put(a(obj2));
            }
            return jSONArray2;
        }
        if (obj instanceof String ? true : obj instanceof Boolean ? true : obj instanceof Integer ? true : obj instanceof Long) {
            return obj;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Number) obj).doubleValue();
            if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                throw new JSONException("JSON prohibits infinities or NaNs");
            }
            return Double.valueOf(dDoubleValue);
        }
        if (!(obj instanceof Float)) {
            throw new JSONException(obj.getClass().getSimpleName().concat(" cannot be serialized to json"));
        }
        float fFloatValue = ((Number) obj).floatValue();
        if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue)) {
            throw new JSONException("JSON prohibits infinities or NaNs");
        }
        return Double.valueOf(fFloatValue);
    }

    private static final Object b(Object obj) throws JSONException {
        if (Intrinsics.c(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.g(itKeys, "json.keys()");
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Intrinsics.g(key, "key");
                Object obj2 = jSONObject.get(key);
                Intrinsics.g(obj2, "json.get(key)");
                linkedHashMap.put(key, b(obj2));
            }
            return linkedHashMap;
        }
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof String ? true : obj instanceof Boolean ? true : obj instanceof Integer ? true : obj instanceof Double) {
                return obj;
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Number) obj).floatValue());
            }
            throw new JSONException(obj.getClass().getSimpleName().concat(" is not a json type"));
        }
        JSONArray jSONArray = (JSONArray) obj;
        Object[] objArr = new Object[jSONArray.length()];
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj3 = jSONArray.get(i);
            Intrinsics.g(obj3, "json.get(i)");
            objArr[i] = b(obj3);
        }
        return objArr;
    }

    @NotNull
    public static final String jsonFromObject(@Nullable Object obj) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL.toString();
        }
        if (obj instanceof Map) {
            Object objA = a(obj);
            Intrinsics.f(objA, "null cannot be cast to non-null type org.json.JSONObject");
            String string = ((JSONObject) objA).toString(0);
            Intrinsics.g(string, "jsonObjectFromObject(obj…s JSONObject).toString(0)");
            return string;
        }
        if (obj instanceof Collection) {
            Object objA2 = a(obj);
            Intrinsics.f(objA2, "null cannot be cast to non-null type org.json.JSONArray");
            String string2 = ((JSONArray) objA2).toString(0);
            Intrinsics.g(string2, "jsonObjectFromObject(obj…as JSONArray).toString(0)");
            return string2;
        }
        if (obj instanceof Object[]) {
            Object objA3 = a(obj);
            Intrinsics.f(objA3, "null cannot be cast to non-null type org.json.JSONArray");
            String string3 = ((JSONArray) objA3).toString(0);
            Intrinsics.g(string3, "jsonObjectFromObject(obj…as JSONArray).toString(0)");
            return string3;
        }
        if (obj instanceof String ? true : obj instanceof Boolean ? true : obj instanceof Integer) {
            return obj.toString();
        }
        if (obj instanceof Double) {
            Number number = (Number) obj;
            if (Double.isInfinite(number.doubleValue()) || Double.isNaN(number.doubleValue())) {
                throw new JSONException("JSON prohibits infinities or NaNs");
            }
            return String.valueOf(number.doubleValue());
        }
        if (!(obj instanceof Float)) {
            throw new JSONException(obj.getClass().getSimpleName().concat(" cannot be serialized to json"));
        }
        Number number2 = (Number) obj;
        if (Float.isInfinite(number2.floatValue()) || Float.isNaN(number2.floatValue())) {
            throw new JSONException("JSON prohibits infinities or NaNs");
        }
        return String.valueOf(number2.floatValue());
    }

    @Nullable
    public static final Object objectFromJson(@NotNull String json) throws JSONException {
        Intrinsics.h(json, "json");
        try {
            Object objB = b(new JSONArray("[" + json + ']'));
            Intrinsics.f(objB, "null cannot be cast to non-null type kotlin.Array<*>");
            return ((Object[]) objB)[0];
        } catch (Exception unused) {
            throw new JSONException("JSON Parsing failed due to unknown reason");
        }
    }
}
