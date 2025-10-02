package au.com.woolworths.base.shopapp.analytics;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/analytics/TealiumEventBundleManagerImpl;", "Lau/com/woolworths/android/onesite/analytics/tealium/TealiumEventBundleManager;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TealiumEventBundleManagerImpl implements TealiumEventBundleManager {

    /* renamed from: a, reason: collision with root package name */
    public Object f4611a = EmptyList.d;
    public LinkedHashMap b;
    public LinkedHashMap c;

    public static String f(Object obj) {
        String string;
        String strQ = (obj == null || (string = obj.toString()) == null) ? null : StringsKt.Q(string, ",", " ", false);
        return strQ == null ? "" : strQ;
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager
    public final void a() {
        this.f4611a = EmptyList.d;
        this.b = null;
        this.c = null;
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager
    public final void b(Map contextData) {
        Intrinsics.h(contextData, "contextData");
        if (this.b == null) {
            Set setKeySet = contextData.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator it = setKeySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (TealiumEventBundleManagerImplKt.f4612a.contains((String) it.next())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : contextData.entrySet()) {
                            if (TealiumEventBundleManagerImplKt.f4612a.contains((String) entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        this.b = linkedHashMap;
                    }
                }
            }
        }
        if (this.c == null) {
            Set setKeySet2 = contextData.keySet();
            if (!(setKeySet2 instanceof Collection) || !setKeySet2.isEmpty()) {
                Iterator it2 = setKeySet2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (TealiumEventBundleManagerImplKt.b.contains((String) it2.next())) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : contextData.entrySet()) {
                            if (TealiumEventBundleManagerImplKt.b.contains((String) entry2.getKey())) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        this.c = linkedHashMap2;
                    }
                }
            }
        }
        this.f4611a = CollectionsKt.d0(contextData, (Collection) this.f4611a);
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager
    public final boolean c(Map contextData) {
        Intrinsics.h(contextData, "contextData");
        if (this.b == null) {
            return true;
        }
        List list = TealiumEventBundleManagerImplKt.f4612a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (contextData.get((String) it.next()) != null) {
                List<String> list2 = TealiumEventBundleManagerImplKt.f4612a;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return true;
                }
                for (String str : list2) {
                    LinkedHashMap linkedHashMap = this.b;
                    if (!Intrinsics.c(linkedHashMap != null ? linkedHashMap.get(str) : null, contextData.get(str))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager
    public final Event d() {
        if (((Collection) this.f4611a).isEmpty()) {
            return null;
        }
        Pair pair = new Pair("event.Action", "impression");
        Pair pair2 = new Pair("event.Category", "combined_events");
        Pair pair3 = new Pair("event.Label", "combined impression data loaded");
        Iterable iterable = (Iterable) this.f4611a;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            String string = "";
            if (!it.hasNext()) {
                break;
            }
            Map map = (Map) it.next();
            String strF = f(map.get("event.Category"));
            String strF2 = f(map.get("event.Label"));
            Object obj = map.get("internal.Campaign");
            if (obj == null) {
                obj = map.get("event.Description");
            }
            String strF3 = f(obj);
            Object obj2 = map.get("event.Value");
            if (obj2 != null) {
                String string2 = obj2.toString();
                Intrinsics.h(string2, "<this>");
                String string3 = StringsKt.k0(string2).toString();
                if (!StringsKt.W(string3, "com.", false) && !StringsKt.W(string3, "http", false)) {
                    string = obj2.toString();
                }
            } else {
                string = null;
            }
            arrayList.add(strF + "<>" + strF2 + "<>" + strF3 + "<>" + f(string));
        }
        Pair pair4 = new Pair("event.Key", arrayList);
        Iterable iterable2 = (Iterable) this.f4611a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(iterable2, 10));
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            Object obj3 = ((Map) it2.next()).get("acs.StitchID");
            String string4 = obj3 != null ? obj3.toString() : null;
            if (string4 == null) {
                string4 = "";
            }
            arrayList2.add(string4);
        }
        Map mapJ = MapsKt.j(pair, pair2, pair3, pair4, new Pair("combined.StitchID", arrayList2));
        Map map2 = this.b;
        if (map2 == null) {
            map2 = EmptyMap.d;
        }
        LinkedHashMap linkedHashMapM = MapsKt.m(mapJ, map2);
        Map map3 = this.c;
        if (map3 == null) {
            map3 = EmptyMap.d;
        }
        return new BundleEvent(MapsKt.m(linkedHashMapM, map3));
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumEventBundleManager
    public final boolean e(String tealiumEventKey, Map contextData, boolean z) {
        Intrinsics.h(tealiumEventKey, "tealiumEventKey");
        Intrinsics.h(contextData, "contextData");
        if (Intrinsics.c(contextData.get("event.Action"), "click")) {
            return false;
        }
        return z || (StringsKt.o(tealiumEventKey, "impression", true) && contextData.get("product.ID") == null && contextData.get("component.Impressions") == null && contextData.get("offers.List") == null);
    }
}
