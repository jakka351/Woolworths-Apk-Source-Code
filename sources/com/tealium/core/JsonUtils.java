package com.tealium.core;

import com.tealium.core.DateUtils;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/JsonUtils;", "", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonUtils {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/JsonUtils$Companion;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static JSONObject a(Map payload) throws JSONException {
            JSONArray jSONArray;
            Intrinsics.h(payload, "payload");
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : payload.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Map) {
                    value = a((Map) value);
                } else {
                    if (value instanceof Collection) {
                        jSONArray = new JSONArray((Collection) value);
                    } else if (value instanceof Object[]) {
                        jSONArray = new JSONArray(value);
                    } else if (value instanceof Date) {
                        SimpleDateFormat simpleDateFormat = DateUtils.f19122a;
                        value = DateUtils.Companion.a((Date) value);
                    } else if (value instanceof ZonedDateTime) {
                        SimpleDateFormat simpleDateFormat2 = DateUtils.f19122a;
                        value = DateUtils.Companion.f((ZonedDateTime) value);
                    } else if (value instanceof LocalDateTime) {
                        SimpleDateFormat simpleDateFormat3 = DateUtils.f19122a;
                        value = DateUtils.Companion.d((LocalDateTime) value);
                    } else if (value instanceof LocalDate) {
                        SimpleDateFormat simpleDateFormat4 = DateUtils.f19122a;
                        value = DateUtils.Companion.c((LocalDate) value);
                    } else if (value instanceof LocalTime) {
                        SimpleDateFormat simpleDateFormat5 = DateUtils.f19122a;
                        value = DateUtils.Companion.e((LocalTime) value);
                    } else if (value instanceof Instant) {
                        SimpleDateFormat simpleDateFormat6 = DateUtils.f19122a;
                        value = DateUtils.Companion.b((Instant) value);
                    }
                    value = jSONArray;
                }
                jSONObject.put(str, value);
            }
            return jSONObject;
        }

        public static LinkedHashMap b(JSONObject json) throws JSONException {
            Intrinsics.h(json, "json");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = json.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Object value = json.get(key);
                Intrinsics.g(key, "key");
                Intrinsics.g(value, "value");
                linkedHashMap.put(key, value);
            }
            return linkedHashMap;
        }
    }
}
