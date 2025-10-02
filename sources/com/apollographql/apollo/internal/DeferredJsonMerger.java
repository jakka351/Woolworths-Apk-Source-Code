package com.apollographql.apollo.internal;

import com.apollographql.apollo.annotations.ApolloInternal;
import com.apollographql.apollo.api.DeferredFragmentIdentifier;
import com.salesforce.marketingcloud.config.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@ApolloInternal
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/internal/DeferredJsonMerger;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DeferredJsonMerger {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13623a;
    public final LinkedHashMap b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;
    public boolean e;
    public boolean f;

    public DeferredJsonMerger() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f13623a = linkedHashMap;
        this.b = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.c = linkedHashSet;
        this.d = linkedHashSet;
        this.e = true;
    }

    public static void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(str)) {
                Object obj = map.get(str);
                if ((obj instanceof Map) && (!(obj instanceof KMappedMarker) || (obj instanceof KMutableMap))) {
                    Object obj2 = map.get(str);
                    Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    Map mapB = TypeIntrinsics.b(obj2);
                    Map map3 = value instanceof Map ? (Map) value : null;
                    if (map3 == null) {
                        throw new IllegalStateException(("'" + str + "' is an object in destination but not in map").toString());
                    }
                    a(mapB, map3);
                }
            }
            map.put(str, value);
        }
    }

    public final LinkedHashMap b(Map map) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Object obj;
        LinkedHashMap linkedHashMap3 = this.b;
        boolean zIsEmpty = linkedHashMap3.isEmpty();
        LinkedHashMap linkedHashMap4 = this.f13623a;
        if (zIsEmpty) {
            linkedHashMap4.putAll(map);
            return linkedHashMap3;
        }
        Object obj2 = map.get("incremental");
        List<Map> list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            this.f = true;
            linkedHashMap = linkedHashMap3;
        } else {
            this.f = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map map2 : list) {
                Map map3 = (Map) map2.get("data");
                Object obj3 = map2.get(a.j);
                Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj3;
                Object obj4 = linkedHashMap3.get("data");
                Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                Object obj5 = (Map) obj4;
                if (map3 != null) {
                    for (Object obj6 : list2) {
                        LinkedHashMap linkedHashMap5 = linkedHashMap3;
                        if (obj5 instanceof List) {
                            Intrinsics.f(obj6, "null cannot be cast to non-null type kotlin.Int");
                            obj = ((List) obj5).get(((Integer) obj6).intValue());
                        } else {
                            Intrinsics.f(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            obj = ((Map) obj5).get(obj6);
                        }
                        obj5 = obj;
                        linkedHashMap3 = linkedHashMap5;
                    }
                    linkedHashMap2 = linkedHashMap3;
                    Intrinsics.f(obj5, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    a(TypeIntrinsics.b(obj5), map3);
                    this.c.add(new DeferredFragmentIdentifier(list2, (String) map2.get(AnnotatedPrivateKey.LABEL)));
                } else {
                    linkedHashMap2 = linkedHashMap3;
                }
                Object obj7 = map2.get("errors");
                List list3 = obj7 instanceof List ? (List) obj7 : null;
                if (list3 != null) {
                    CollectionsKt.h(list3, arrayList);
                }
                Object obj8 = map2.get("extensions");
                Map map4 = obj8 instanceof Map ? (Map) obj8 : null;
                if (map4 != null) {
                    arrayList2.add(map4);
                }
                linkedHashMap3 = linkedHashMap2;
            }
            linkedHashMap = linkedHashMap3;
            if (arrayList.isEmpty()) {
                linkedHashMap4.remove("errors");
            } else {
                linkedHashMap4.put("errors", arrayList);
            }
            if (arrayList2.isEmpty()) {
                linkedHashMap4.remove("extensions");
            } else {
                linkedHashMap4.put("extensions", MapsKt.i(new Pair("incremental", arrayList2)));
            }
        }
        Boolean bool = (Boolean) map.get("hasNext");
        this.e = bool != null ? bool.booleanValue() : false;
        return linkedHashMap;
    }
}
