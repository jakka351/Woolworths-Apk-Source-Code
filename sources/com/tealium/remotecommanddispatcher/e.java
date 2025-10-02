package com.tealium.remotecommanddispatcher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/remotecommanddispatcher/e;", "", "a", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class e {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/remotecommanddispatcher/e$a;", "", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        public static String a(Map map, Map payload, b delimiters) {
            String str;
            String str2;
            Intrinsics.h(payload, "payload");
            Intrinsics.h(delimiters, "delimiters");
            Object obj = payload.get("tealium_event_type");
            String str3 = obj instanceof String ? (String) obj : null;
            ArrayList arrayList = new ArrayList();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    String str5 = (String) entry.getValue();
                    if (f(d(str4, delimiters), payload)) {
                        arrayList.addAll(b(str5, ","));
                    }
                }
            }
            if (map != null && (str2 = (String) map.get("all_events")) != null && Intrinsics.c(str3, "event")) {
                arrayList.add(str2);
            }
            if (map != null && (str = (String) map.get("all_views")) != null && Intrinsics.c(str3, "view")) {
                arrayList.add(str);
            }
            return CollectionsKt.M(arrayList, ",", null, null, null, 62);
        }

        public static ArrayList b(String str, String str2) {
            List listT = StringsKt.T(str, new String[]{str2}, 6);
            ArrayList arrayList = new ArrayList(CollectionsKt.s(listT, 10));
            Iterator it = listT.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.k0((String) it.next()).toString());
            }
            return arrayList;
        }

        public static LinkedHashMap c(Map map, Map map2) {
            String str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                Object obj = map.get(str2);
                if (obj != null) {
                    Iterator it = b(str3, ",").iterator();
                    while (it.hasNext()) {
                        String str4 = (String) it.next();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Unit unit = null;
                        if (StringsKt.o(str4, ".", false)) {
                            ArrayList arrayListB = b(str4, ".");
                            linkedHashMap2.put(CollectionsKt.D(arrayListB), MapsKt.l(new Pair(CollectionsKt.O(arrayListB), obj)));
                            str = (String) CollectionsKt.D(arrayListB);
                        } else {
                            linkedHashMap2.put(str4, obj);
                            str = null;
                        }
                        if (str != null) {
                            boolean zContainsKey = linkedHashMap.containsKey(str);
                            Unit unit2 = Unit.f24250a;
                            if (zContainsKey) {
                                Object obj2 = linkedHashMap.get(str);
                                Map map3 = (!(obj2 instanceof Map) || ((obj2 instanceof KMappedMarker) && !(obj2 instanceof KMutableMap))) ? null : (Map) obj2;
                                if (map3 != null) {
                                    Set<Map.Entry> setEntrySet = map3.entrySet();
                                    int iH = MapsKt.h(CollectionsKt.s(setEntrySet, 10));
                                    if (iH < 16) {
                                        iH = 16;
                                    }
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iH);
                                    for (Map.Entry entry2 : setEntrySet) {
                                        linkedHashMap3.put(String.valueOf(entry2.getKey()), entry2.getValue());
                                    }
                                    LinkedHashMap linkedHashMapS = MapsKt.s(linkedHashMap3);
                                    Object obj3 = linkedHashMap2.get(str);
                                    Map map4 = obj3 instanceof Map ? (Map) obj3 : null;
                                    if (map4 != null) {
                                        Set<Map.Entry> setEntrySet2 = map4.entrySet();
                                        int iH2 = MapsKt.h(CollectionsKt.s(setEntrySet2, 10));
                                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iH2 >= 16 ? iH2 : 16);
                                        for (Map.Entry entry3 : setEntrySet2) {
                                            linkedHashMap4.put(String.valueOf(entry3.getKey()), entry3.getValue());
                                        }
                                        for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                            linkedHashMapS.put((String) entry4.getKey(), entry4.getValue());
                                            linkedHashMap.put(str, linkedHashMapS);
                                        }
                                    }
                                }
                            } else {
                                linkedHashMap.putAll(linkedHashMap2);
                            }
                            unit = unit2;
                        }
                        if (unit == null) {
                            linkedHashMap.putAll(linkedHashMap2);
                        }
                    }
                }
            }
            return linkedHashMap;
        }

        public static Map d(String str, b bVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = b(str, bVar.b).iterator();
            while (it.hasNext()) {
                ArrayList arrayListB = b((String) it.next(), bVar.f19195a);
                if (arrayListB.size() == 1) {
                    linkedHashMap.put("tealium_event", CollectionsKt.D(arrayListB));
                } else {
                    linkedHashMap.put(CollectionsKt.D(arrayListB), CollectionsKt.O(arrayListB));
                }
            }
            return MapsKt.q(linkedHashMap);
        }

        public static Map e(Map map, Map payload, b delimiters) {
            Intrinsics.h(payload, "payload");
            Intrinsics.h(delimiters, "delimiters");
            LinkedHashMap linkedHashMapS = MapsKt.s(payload);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (f(d(str, delimiters), payload)) {
                        Set<Map.Entry> setEntrySet = ((Map) value).entrySet();
                        int iH = MapsKt.h(CollectionsKt.s(setEntrySet, 10));
                        if (iH < 16) {
                            iH = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                        for (Map.Entry entry2 : setEntrySet) {
                            String strValueOf = String.valueOf(entry2.getKey());
                            Object value2 = entry2.getValue();
                            if (value2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            linkedHashMap.put(strValueOf, value2);
                        }
                        linkedHashMapS.putAll(linkedHashMap);
                    }
                }
            }
            return MapsKt.q(linkedHashMapS);
        }

        public static boolean f(Map map, Map map2) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!map2.containsKey(str) || !String.valueOf(map2.get(str)).equals(str2)) {
                    return false;
                }
            }
            return true;
        }
    }
}
