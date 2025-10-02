package com.salesforce.marketingcloud.internal;

import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f16932a = com.salesforce.marketingcloud.g.a("GeneralUtils");

    @NotNull
    private static final String b = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    @NotNull
    private static final TimeZone c;

    @NotNull
    private static final Charset d;

    public static final class a extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16933a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f16933a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return YU.a.h("Unable to parse ", this.f16933a, " as a Date.");
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Intrinsics.g(timeZone, "getTimeZone(...)");
        c = timeZone;
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.g(charsetForName, "forName(...)");
        d = charsetForName;
    }

    @Nullable
    public static final Date a(@NotNull String str) {
        Intrinsics.h(str, "<this>");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(b, Locale.US);
            simpleDateFormat.setTimeZone(c);
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            com.salesforce.marketingcloud.g.f16896a.b(f16932a, e, new a(str));
            return null;
        }
    }

    @NotNull
    public static final Map<String, String> b(@NotNull JSONArray jSONArray) throws JSONException {
        Object string;
        JSONObject jSONObject;
        Intrinsics.h(jSONArray, "<this>");
        IntRange intRangeO = RangesKt.o(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
        IntProgressionIterator intProgressionIteratorD = intRangeO.iterator();
        while (intProgressionIteratorD.f) {
            int iNextInt = intProgressionIteratorD.nextInt();
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            KClass kClassB = reflectionFactory.b(JSONObject.class);
            if (kClassB.equals(reflectionFactory.b(JSONObject.class))) {
                jSONObject = jSONArray.getJSONObject(iNextInt);
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                if (kClassB.equals(reflectionFactory.b(Integer.TYPE))) {
                    string = Integer.valueOf(jSONArray.getInt(iNextInt));
                } else if (kClassB.equals(reflectionFactory.b(Double.TYPE))) {
                    string = Double.valueOf(jSONArray.getDouble(iNextInt));
                } else if (kClassB.equals(reflectionFactory.b(Long.TYPE))) {
                    string = Long.valueOf(jSONArray.getLong(iNextInt));
                } else if (kClassB.equals(reflectionFactory.b(Boolean.TYPE))) {
                    string = Boolean.valueOf(jSONArray.getBoolean(iNextInt));
                } else if (kClassB.equals(reflectionFactory.b(String.class))) {
                    string = jSONArray.getString(iNextInt);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    string = jSONArray.get(iNextInt);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
                jSONObject = (JSONObject) string;
            }
            arrayList.add(jSONObject);
        }
        int iH = MapsKt.h(CollectionsKt.s(arrayList, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = (JSONObject) it.next();
            linkedHashMap.put(jSONObject2.optString("key"), jSONObject2.optString("value"));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final String a(@NotNull Date date) {
        Intrinsics.h(date, "<this>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(b, Locale.US);
        simpleDateFormat.setTimeZone(c);
        String str = simpleDateFormat.format(date);
        Intrinsics.g(str, "format(...)");
        return str;
    }

    @NotNull
    public static final JSONArray a(@NotNull Map<String, String> map) throws JSONException {
        Intrinsics.h(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", key);
            jSONObject.put("value", value);
            arrayList.add(jSONObject);
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final <T> List<T> a(JSONArray jSONArray) {
        Intrinsics.h(jSONArray, "<this>");
        IntRange intRangeO = RangesKt.o(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
        IntProgressionIterator intProgressionIteratorD = intRangeO.iterator();
        if (!intProgressionIteratorD.f) {
            return arrayList;
        }
        intProgressionIteratorD.nextInt();
        Intrinsics.o();
        throw null;
    }

    public static final <T extends Enum<T>> T a(JSONObject jSONObject, String name) throws JSONException {
        Intrinsics.h(jSONObject, "<this>");
        Intrinsics.h(name, "name");
        Intrinsics.g(jSONObject.getString(name), "getString(...)");
        Intrinsics.o();
        throw null;
    }

    @NotNull
    public static final TimeZone a() {
        return c;
    }

    public static final <T extends Enum<T>> T a(JSONObject jSONObject, String name, T t) {
        Intrinsics.h(jSONObject, "<this>");
        Intrinsics.h(name, "name");
        Intrinsics.h(t, "default");
        String strOptString = jSONObject.optString(name);
        Intrinsics.g(strOptString, "optString(...)");
        if (b(strOptString) == null) {
            return t;
        }
        Intrinsics.o();
        throw null;
    }

    @NotNull
    public static final Charset b() {
        return d;
    }

    @Nullable
    public static final String b(@NotNull String str) {
        Intrinsics.h(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        return str;
    }
}
