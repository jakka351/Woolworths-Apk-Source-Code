package com.apollographql.apollo.api.json;

import androidx.camera.core.impl.b;
import com.apollographql.apollo.api.Upload;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonWriter;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "State", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MapJsonWriter implements JsonWriter {
    public Object d;
    public boolean e;
    public final ArrayList f = new ArrayList();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonWriter$State;", "", "List", "Map", "Lcom/apollographql/apollo/api/json/MapJsonWriter$State$List;", "Lcom/apollographql/apollo/api/json/MapJsonWriter$State$Map;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class State {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonWriter$State$List;", "Lcom/apollographql/apollo/api/json/MapJsonWriter$State;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class List extends State {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList f13535a;

            public List(ArrayList arrayList) {
                this.f13535a = arrayList;
            }

            public final String toString() {
                return "List (" + this.f13535a.size() + ')';
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/json/MapJsonWriter$State$Map;", "Lcom/apollographql/apollo/api/json/MapJsonWriter$State;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Map extends State {

            /* renamed from: a, reason: collision with root package name */
            public final LinkedHashMap f13536a;
            public String b = null;

            public Map(LinkedHashMap linkedHashMap) {
                this.f13536a = linkedHashMap;
            }

            public final String toString() {
                return b.r(new StringBuilder("Map ("), this.b, ')');
            }
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 != null) {
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() != list2.size()) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                IntRange intRangeH = CollectionsKt.H((Collection) obj);
                ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeH, 10));
                IntProgressionIterator it = intRangeH.iterator();
                while (it.f) {
                    int iNextInt = it.nextInt();
                    arrayList.add(a(list.get(iNextInt), list2.get(iNextInt)));
                }
                return arrayList;
            }
            if (obj instanceof Map) {
                if (!(obj2 instanceof Map)) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                LinkedHashSet<String> linkedHashSetG = SetsKt.g(map.keySet(), map2.keySet());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(linkedHashSetG, 10));
                for (String str : linkedHashSetG) {
                    arrayList2.add(new Pair(str, a(map.get(str), map2.get(str))));
                }
                return MapsKt.p(arrayList2);
            }
            if (!obj.equals(obj2)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
        }
        return obj;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter A1(JsonNumber value) {
        Intrinsics.h(value, "value");
        b(value);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter F1(String str) {
        State state = (State) CollectionsKt.O(this.f);
        if (!(state instanceof State.Map)) {
            throw new IllegalStateException("Check failed.");
        }
        State.Map map = (State.Map) state;
        if (map.b != null) {
            throw new IllegalStateException("Check failed.");
        }
        map.b = str;
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter G() {
        this.f.add(new State.Map(new LinkedHashMap()));
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter K() {
        State state = (State) this.f.remove(r0.size() - 1);
        if (!(state instanceof State.Map)) {
            throw new IllegalStateException("Check failed.");
        }
        b(((State.Map) state).f13536a);
        return this;
    }

    public final void b(Object obj) {
        State state = (State) CollectionsKt.P(this.f);
        if (!(state instanceof State.Map)) {
            if (state instanceof State.List) {
                ((State.List) state).f13535a.add(obj);
                return;
            } else {
                this.d = obj;
                this.e = true;
                return;
            }
        }
        State.Map map = (State.Map) state;
        LinkedHashMap linkedHashMap = map.f13536a;
        String str = map.b;
        if (str == null) {
            throw new IllegalStateException("Check failed.");
        }
        if (linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, a(linkedHashMap.get(str), obj));
        } else {
            linkedHashMap.put(str, obj);
        }
        map.b = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter d1(long j) {
        b(Long.valueOf(j));
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter e1(int i) {
        b(Integer.valueOf(i));
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final String getPath() {
        String strValueOf;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            State state = (State) it.next();
            if (state instanceof State.List) {
                strValueOf = String.valueOf(((State.List) state).f13535a.size());
            } else {
                if (!(state instanceof State.Map)) {
                    throw new NoWhenBranchMatchedException();
                }
                strValueOf = ((State.Map) state).b;
                if (strValueOf == null) {
                    strValueOf = "?";
                }
            }
            arrayList2.add(strValueOf);
        }
        return CollectionsKt.M(arrayList2, ".", null, null, null, 62);
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter h1(double d) {
        b(Double.valueOf(d));
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter q1(boolean z) {
        b(Boolean.valueOf(z));
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter s2() {
        b(null);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter v0(String value) {
        Intrinsics.h(value, "value");
        b(value);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter w() {
        State state = (State) this.f.remove(r0.size() - 1);
        if (!(state instanceof State.List)) {
            throw new IllegalStateException("Check failed.");
        }
        b(((State.List) state).f13535a);
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter y() {
        this.f.add(new State.List(new ArrayList()));
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonWriter
    public final JsonWriter z1(Upload value) {
        Intrinsics.h(value, "value");
        b(null);
        return this;
    }
}
