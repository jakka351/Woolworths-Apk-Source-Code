package com.apollographql.apollo.api.json;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.internal.UtilsKt;
import com.apollographql.apollo.exception.JsonDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonReader;", "Lcom/apollographql/apollo/api/json/JsonReader;", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MapJsonReader implements JsonReader {
    public final Object d;
    public final List e;
    public JsonReader.Token f;
    public Object g;
    public Object[] h;
    public Map[] i;
    public Iterator[] j;
    public int[] k;
    public int l;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonReader$Companion;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JsonReader.Token token = JsonReader.Token.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                JsonReader.Token token2 = JsonReader.Token.d;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                JsonReader.Token token3 = JsonReader.Token.d;
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                JsonReader.Token token4 = JsonReader.Token.d;
                iArr[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MapJsonReader(List pathRoot, Map map) {
        Intrinsics.h(pathRoot, "pathRoot");
        this.d = map;
        this.e = pathRoot;
        this.h = new Object[64];
        this.i = new Map[64];
        this.j = new Iterator[64];
        this.k = new int[64];
        this.f = b(map);
        this.g = map;
    }

    public static JsonReader.Token b(Object obj) {
        if (obj == null) {
            return JsonReader.Token.m;
        }
        if (obj instanceof List) {
            return JsonReader.Token.d;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.f;
        }
        if (obj instanceof Integer) {
            return JsonReader.Token.j;
        }
        if (obj instanceof Long) {
            return JsonReader.Token.k;
        }
        if (!(obj instanceof Double) && !(obj instanceof JsonNumber)) {
            return obj instanceof String ? JsonReader.Token.i : obj instanceof Boolean ? JsonReader.Token.l : JsonReader.Token.o;
        }
        return JsonReader.Token.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.apollographql.apollo.api.json.JsonReader
    public final JsonReader G() {
        if (this.f != JsonReader.Token.f) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + this.f + " at path " + c());
        }
        d();
        Map[] mapArr = this.i;
        int i = this.l - 1;
        Object obj = this.g;
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        mapArr[i] = obj;
        o();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final JsonReader K() {
        int i = this.l - 1;
        this.l = i;
        this.j[i] = null;
        this.h[i] = null;
        this.i[i] = null;
        a();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final JsonNumber Q0() {
        JsonNumber jsonNumber;
        int iOrdinal = this.f.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            throw new JsonDataException("Expected a Number but was " + this.f + " at path " + c());
        }
        Object obj = this.g;
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double)) {
            jsonNumber = new JsonNumber(obj.toString());
        } else if (obj instanceof String) {
            jsonNumber = new JsonNumber((String) obj);
        } else {
            if (!(obj instanceof JsonNumber)) {
                throw new IllegalStateException(("Expected JsonNumber but got " + obj + " instead").toString());
            }
            jsonNumber = (JsonNumber) obj;
        }
        a();
        return jsonNumber;
    }

    public final void a() {
        int i = this.l;
        if (i == 0) {
            this.f = JsonReader.Token.n;
            return;
        }
        Iterator it = this.j[i - 1];
        Intrinsics.e(it);
        Object[] objArr = this.h;
        int i2 = this.l - 1;
        Object obj = objArr[i2];
        if (obj instanceof Integer) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Int");
            objArr[i2] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (!it.hasNext()) {
            this.f = this.h[this.l + (-1)] instanceof Integer ? JsonReader.Token.e : JsonReader.Token.g;
            return;
        }
        Object next = it.next();
        this.g = next;
        this.f = next instanceof Map.Entry ? JsonReader.Token.h : b(next);
    }

    public final String c() {
        return CollectionsKt.M(getPath(), ".", null, null, null, 62);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void d() {
        int i = this.l;
        Object[] objArr = this.h;
        if (i == objArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.h = objArrCopyOf;
            Map[] mapArr = this.i;
            Object[] objArrCopyOf2 = Arrays.copyOf(mapArr, mapArr.length * 2);
            Intrinsics.g(objArrCopyOf2, "copyOf(...)");
            this.i = (Map[]) objArrCopyOf2;
            int[] iArr = this.k;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.k = iArrCopyOf;
            Iterator[] itArr = this.j;
            Object[] objArrCopyOf3 = Arrays.copyOf(itArr, itArr.length * 2);
            Intrinsics.g(objArrCopyOf3, "copyOf(...)");
            this.j = (Iterator[]) objArrCopyOf3;
        }
        this.l++;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final ArrayList getPath() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.e);
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.h[i2];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final boolean hasNext() {
        int iOrdinal = this.f.ordinal();
        return (iOrdinal == 1 || iOrdinal == 3) ? false : true;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final boolean nextBoolean() {
        if (this.f == JsonReader.Token.l) {
            Object obj = this.g;
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
            a();
            return ((Boolean) obj).booleanValue();
        }
        throw new JsonDataException("Expected BOOLEAN but was " + this.f + " at path " + c());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final double nextDouble() throws NumberFormatException {
        double dDoubleValue;
        int iOrdinal = this.f.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            throw new JsonDataException("Expected a Double but was " + this.f + " at path " + c());
        }
        Object obj = this.g;
        if (obj instanceof Integer) {
            dDoubleValue = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            dDoubleValue = UtilsKt.c(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            dDoubleValue = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            dDoubleValue = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof JsonNumber)) {
                throw new IllegalStateException(("Expected a Double but got " + obj + " instead").toString());
            }
            dDoubleValue = Double.parseDouble(((JsonNumber) obj).f13534a);
        }
        a();
        return dDoubleValue;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final int nextInt() throws NumberFormatException {
        int iA;
        int iOrdinal = this.f.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            throw new JsonDataException("Expected an Int but was " + this.f + " at path " + c());
        }
        Object obj = this.g;
        if (obj instanceof Integer) {
            iA = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            iA = UtilsKt.d(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            iA = UtilsKt.a(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            iA = Integer.parseInt((String) obj);
        } else {
            if (!(obj instanceof JsonNumber)) {
                throw new IllegalStateException(("Expected an Int but got " + obj + " instead").toString());
            }
            iA = Integer.parseInt(((JsonNumber) obj).f13534a);
        }
        a();
        return iA;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final long nextLong() throws NumberFormatException {
        long jB;
        int iOrdinal = this.f.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            throw new JsonDataException("Expected a Long but was " + this.f + " at path " + c());
        }
        Object obj = this.g;
        if (obj instanceof Integer) {
            jB = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            jB = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            jB = UtilsKt.b(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            jB = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof JsonNumber)) {
                throw new IllegalStateException(("Expected Int but got " + obj + " instead").toString());
            }
            jB = Long.parseLong(((JsonNumber) obj).f13534a);
        }
        a();
        return jB;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final String nextName() {
        if (this.f != JsonReader.Token.h) {
            throw new JsonDataException("Expected NAME but was " + this.f + " at path " + c());
        }
        Object obj = this.g;
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
        Map.Entry entry = (Map.Entry) obj;
        this.h[this.l - 1] = entry.getKey();
        this.g = entry.getValue();
        this.f = b(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final void nextNull() {
        if (this.f == JsonReader.Token.m) {
            a();
            return;
        }
        throw new JsonDataException("Expected NULL but was " + this.f + " at path " + c());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final String nextString() {
        String strValueOf;
        Object obj = this.g;
        if (obj instanceof Integer) {
            strValueOf = String.valueOf(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            strValueOf = String.valueOf(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            strValueOf = String.valueOf(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            strValueOf = (String) obj;
        } else if (obj == null) {
            strValueOf = "null";
        } else {
            if (!(obj instanceof JsonNumber)) {
                throw new IllegalStateException(("Expected a String but got " + obj + " instead").toString());
            }
            strValueOf = ((JsonNumber) obj).f13534a;
        }
        a();
        return strValueOf;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final void o() {
        Map[] mapArr = this.i;
        int i = this.l;
        Map map = mapArr[i - 1];
        this.h[i - 1] = null;
        Intrinsics.e(map);
        this.j[i - 1] = map.entrySet().iterator();
        this.k[this.l - 1] = 0;
        a();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final int o2(List names) {
        Intrinsics.h(names, "names");
        while (hasNext()) {
            String strNextName = nextName();
            int iIndexOf = this.k[this.l - 1];
            if (iIndexOf >= names.size() || !Intrinsics.c(names.get(iIndexOf), strNextName)) {
                iIndexOf = names.indexOf(strNextName);
                if (iIndexOf != -1) {
                    this.k[this.l - 1] = iIndexOf + 1;
                }
            } else {
                int[] iArr = this.k;
                int i = this.l - 1;
                iArr[i] = iArr[i] + 1;
            }
            if (iIndexOf != -1) {
                return iIndexOf;
            }
            a();
        }
        return -1;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    /* renamed from: peek, reason: from getter */
    public final JsonReader.Token getF() {
        return this.f;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final void skipValue() {
        a();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final JsonReader w() {
        if (this.f != JsonReader.Token.e) {
            throw new JsonDataException("Expected END_ARRAY but was " + this.f + " at path " + c());
        }
        int i = this.l - 1;
        this.l = i;
        this.j[i] = null;
        this.h[i] = null;
        a();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final JsonReader y() {
        if (this.f != JsonReader.Token.d) {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + this.f + " at path " + c());
        }
        Object obj = this.g;
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        d();
        this.h[this.l - 1] = -1;
        this.j[this.l - 1] = ((List) obj).iterator();
        a();
        return this;
    }
}
