package me.oriient.internal.services.remoteLog.utils;

import androidx.annotation.Keep;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0007\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0007\u001a\u000e\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0007H\u0002¨\u0006\b"}, d2 = {"nestedPrimitiveListToJsonElement", "Lkotlinx/serialization/json/JsonElement;", "from", "", "nestedPrimitiveMapToJsonElement", "", "toJsonElement", "", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapToJsonObjectUtilsKt {
    @Keep
    @NotNull
    public static final JsonElement nestedPrimitiveListToJsonElement(@NotNull List<?> from) {
        Intrinsics.h(from, "from");
        ArrayList arrayList = new ArrayList();
        for (Object obj : from) {
            if (obj != null) {
                if (obj instanceof Map) {
                    arrayList.add(nestedPrimitiveMapToJsonElement((Map) obj));
                } else if (obj instanceof List) {
                    arrayList.add(nestedPrimitiveListToJsonElement((List) obj));
                } else {
                    arrayList.add(toJsonElement(obj));
                }
            }
        }
        return new JsonArray(arrayList);
    }

    @Keep
    @NotNull
    public static final JsonElement nestedPrimitiveMapToJsonElement(@NotNull Map<?, ?> from) {
        Object value;
        Intrinsics.h(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : from.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null && (value = entry.getValue()) != null) {
                if (value instanceof Map) {
                    linkedHashMap.put(str, toJsonElement(value));
                } else if (value instanceof List) {
                    linkedHashMap.put(str, toJsonElement(value));
                } else {
                    linkedHashMap.put(str, toJsonElement(value));
                }
            }
        }
        return new JsonObject(linkedHashMap);
    }

    private static final JsonElement toJsonElement(Object obj) {
        if (obj instanceof Number) {
            return JsonElementKt.a((Number) obj);
        }
        if (obj instanceof Boolean) {
            InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f24841a;
            return new JsonLiteral((Boolean) obj, false, null);
        }
        if (obj instanceof String) {
            return JsonElementKt.b((String) obj);
        }
        if (obj instanceof URI) {
            return JsonElementKt.b(obj.toString());
        }
        if (obj instanceof List) {
            return nestedPrimitiveListToJsonElement((List) obj);
        }
        if (obj instanceof Map) {
            return nestedPrimitiveMapToJsonElement((Map) obj);
        }
        if (obj instanceof JsonElement) {
            return (JsonElement) obj;
        }
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        throw new IllegalStateException("Custom types cannot be serialized to JsonElement");
    }
}
