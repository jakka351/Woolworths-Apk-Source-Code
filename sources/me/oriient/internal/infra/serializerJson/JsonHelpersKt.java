package me.oriient.internal.infra.serializerJson;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0014\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0006H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\bH\u0007\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\tH\u0007\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\nH\u0007\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u000bH\u0007\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007\u001a\u0011\u0010\f\u001a\u00020\r*\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0018\u0010\u0010\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012H\u0007\u001a\f\u0010\u0014\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a\f\u0010\u0014\u001a\u00020\u0005*\u00020\u0015H\u0007\u001a\u0011\u0010\u0014\u001a\u00020\u0016*\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a\u0011\u0010\u0014\u001a\u00020\u0016*\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u001c*\u00020\u0013H\u0007¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"toDoubleJsonableArray", "Lme/oriient/internal/infra/serializerJson/JsonableArray;", "", "", "toJsonable", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "Lkotlinx/serialization/json/JsonElement;", "toJsonableArray", "", "", "", "", "toJsonableBoolean", "Lme/oriient/internal/infra/serializerJson/JsonableBoolean;", "", "(Z)Z", "toJsonableMap", "Lme/oriient/internal/infra/serializerJson/JsonableMap;", "", "", "toJsonableNumber", "", "Lme/oriient/internal/infra/serializerJson/JsonableNumber;", "", "(I)Ljava/lang/Number;", "", "(J)Ljava/lang/Number;", "toJsonableString", "Lme/oriient/internal/infra/serializerJson/JsonableString;", "(Ljava/lang/String;)Ljava/lang/String;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JsonHelpersKt {
    @Keep
    @NotNull
    public static final JsonableArray toDoubleJsonableArray(@NotNull List<Double> list) {
        Intrinsics.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toJsonableNumber(((Number) it.next()).doubleValue()));
        }
        return new JsonableArray(arrayList);
    }

    @Keep
    @Nullable
    public static final Jsonable toJsonable(@Nullable JsonElement jsonElement) {
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (jsonPrimitive.getD()) {
                return JsonableString.m385boximpl(toJsonableString(jsonPrimitive.getF()));
            }
            if (JsonElementKt.d(jsonPrimitive) != null) {
                Boolean boolD = JsonElementKt.d(jsonPrimitive);
                if (boolD != null) {
                    return JsonableBoolean.m369boximpl(toJsonableBoolean(boolD.booleanValue()));
                }
            } else if (JsonElementKt.h(jsonPrimitive) != null) {
                Integer numH = JsonElementKt.h(jsonPrimitive);
                Number jsonableNumber = numH != null ? toJsonableNumber(numH.intValue()) : null;
                if (jsonableNumber != null) {
                    return JsonableNumber.m377boximpl(jsonableNumber);
                }
            } else {
                if (StringsKt.h0(jsonPrimitive.getF()) == null) {
                    return JsonableString.m385boximpl(toJsonableString(jsonPrimitive.getF()));
                }
                Double dH0 = StringsKt.h0(jsonPrimitive.getF());
                if (dH0 != null) {
                    return toJsonableNumber(dH0.doubleValue());
                }
            }
        } else {
            if (jsonElement instanceof JsonArray) {
                JsonArray jsonArrayI = JsonElementKt.i(jsonElement);
                ArrayList arrayList = new ArrayList(CollectionsKt.s(jsonArrayI, 10));
                Iterator it = jsonArrayI.d.iterator();
                while (it.hasNext()) {
                    Jsonable jsonable = toJsonable((JsonElement) it.next());
                    Intrinsics.f(jsonable, "null cannot be cast to non-null type me.oriient.internal.infra.serializerJson.Jsonable");
                    arrayList.add(jsonable);
                }
                return new JsonableArray(arrayList);
            }
            if (jsonElement instanceof JsonObject) {
                Map map = JsonElementKt.j(jsonElement).d;
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Jsonable jsonable2 = toJsonable((JsonElement) entry.getValue());
                    Intrinsics.f(jsonable2, "null cannot be cast to non-null type me.oriient.internal.infra.serializerJson.Jsonable");
                    linkedHashMap.put(key, jsonable2);
                }
                return toJsonableMap(linkedHashMap);
            }
        }
        return null;
    }

    @Keep
    @NotNull
    public static final JsonableArray toJsonableArray(@NotNull double[] dArr) {
        Intrinsics.h(dArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            arrayList.add(toJsonableNumber(d));
        }
        return new JsonableArray(arrayList);
    }

    @Keep
    public static final boolean toJsonableBoolean(boolean z) {
        return JsonableBoolean.m370constructorimpl(z);
    }

    @Keep
    @NotNull
    public static final JsonableMap toJsonableMap(@NotNull Map<String, ? extends Jsonable> map) {
        Intrinsics.h(map, "<this>");
        return new JsonableMap(new HashMap(map));
    }

    @Keep
    @NotNull
    public static final Jsonable toJsonableNumber(double d) {
        return Double.isNaN(d) ? JsonableString.m385boximpl(JsonableString.m386constructorimpl("_NaN_")) : d == Double.POSITIVE_INFINITY ? JsonableString.m385boximpl(JsonableString.m386constructorimpl("inf")) : d == Double.NEGATIVE_INFINITY ? JsonableString.m385boximpl(JsonableString.m386constructorimpl("-inf")) : JsonableNumber.m377boximpl(JsonableNumber.m378constructorimpl(Double.valueOf(d)));
    }

    @Keep
    @NotNull
    public static final String toJsonableString(@NotNull String str) {
        Intrinsics.h(str, "<this>");
        return JsonableString.m386constructorimpl(str);
    }

    @Keep
    @NotNull
    public static final Number toJsonableNumber(int i) {
        return JsonableNumber.m378constructorimpl(Integer.valueOf(i));
    }

    @Keep
    @NotNull
    public static final JsonableArray toJsonableArray(@NotNull long[] jArr) {
        Intrinsics.h(jArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            arrayList.add(JsonableNumber.m377boximpl(toJsonableNumber(j)));
        }
        return new JsonableArray(arrayList);
    }

    @Keep
    @NotNull
    public static final Number toJsonableNumber(long j) {
        return JsonableNumber.m378constructorimpl(Long.valueOf(j));
    }

    @Keep
    @NotNull
    public static final Jsonable toJsonableNumber(float f) {
        if (Float.isNaN(f)) {
            return JsonableString.m385boximpl(JsonableString.m386constructorimpl("_NaN_"));
        }
        if (f == Float.POSITIVE_INFINITY) {
            return JsonableString.m385boximpl(JsonableString.m386constructorimpl("inf"));
        }
        if (f == Float.NEGATIVE_INFINITY) {
            return JsonableString.m385boximpl(JsonableString.m386constructorimpl("-inf"));
        }
        return JsonableNumber.m377boximpl(JsonableNumber.m378constructorimpl(Float.valueOf(f)));
    }

    @Keep
    @NotNull
    public static final JsonableArray toJsonableArray(@NotNull float[] fArr) {
        Intrinsics.h(fArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            arrayList.add(toJsonableNumber(f));
        }
        return new JsonableArray(arrayList);
    }

    @Keep
    @NotNull
    public static final JsonableArray toJsonableArray(@NotNull int[] iArr) {
        Intrinsics.h(iArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(JsonableNumber.m377boximpl(toJsonableNumber(i)));
        }
        return new JsonableArray(arrayList);
    }

    @Keep
    @NotNull
    public static final JsonableArray toJsonableArray(@NotNull List<? extends Jsonable> list) {
        Intrinsics.h(list, "<this>");
        return new JsonableArray(new ArrayList(list));
    }
}
