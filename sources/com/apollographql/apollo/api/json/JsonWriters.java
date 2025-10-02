package com.apollographql.apollo.api.json;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: com.apollographql.apollo.api.json.-JsonWriters, reason: invalid class name */
/* loaded from: classes4.dex */
public final class JsonWriters {
    public static final void a(JsonWriter jsonWriter, Object obj) {
        Intrinsics.h(jsonWriter, "<this>");
        if (obj == null) {
            jsonWriter.s2();
            return;
        }
        if (obj instanceof Map) {
            jsonWriter.G();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                jsonWriter.F1(String.valueOf(key));
                a(jsonWriter, value);
            }
            jsonWriter.K();
            return;
        }
        if (obj instanceof List) {
            jsonWriter.y();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                a(jsonWriter, it.next());
            }
            jsonWriter.w();
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.q1(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            jsonWriter.e1(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            jsonWriter.d1(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            jsonWriter.h1(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof JsonNumber) {
            jsonWriter.A1((JsonNumber) obj);
            return;
        }
        if (obj instanceof String) {
            jsonWriter.v0((String) obj);
            return;
        }
        throw new IllegalStateException(("Cannot write " + obj + " of class '" + Reflection.f24268a.b(obj.getClass()) + "' to Json").toString());
    }
}
